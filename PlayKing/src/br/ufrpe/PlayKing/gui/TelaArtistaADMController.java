package br.ufrpe.PlayKing.gui;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;

import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.dados.RepositorioArtista;
import br.ufrpe.PlayKing.exception.ArtistaJaCadastradoException;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;
import br.ufrpe.PlayKing.negocio.ControladorArtista;
import br.ufrpe.PlayKing.negocio.Fachada;
import br.ufrpe.PlayKing.negocio.IFachada;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.TableView;

public class TelaArtistaADMController implements Initializable {

	IFachada fachada = Fachada.getInstance();


	@FXML
	private Button btnSairVoltar;
	@FXML
	private TextField nomeArtistaTxtField;
	@FXML
	private Button btnCadastrarArtista;
	@FXML
	private ListView<Artista> listViewArtistas;
	@FXML
	private Button btnRemoverArtista;
	@FXML
	private Button btnSairListarArtista;
	@FXML
	private Button btnAtualizarArtista;
	@FXML
	private DatePicker datePickerIdade;

	@FXML
	private DatePicker novaDataDatePicker;

	@FXML
	private TextField novoNomeTxtField;




	private List<Artista> artistas = new ArrayList<>();
	public ObservableList<Artista> listaArtistas;


	public void btnCadastrarArtistaAcao(ActionEvent event)throws ElementoJaExisteException, ArtistaJaCadastradoException {

		try {
			LocalDate data1 = LocalDate.now(); 
			LocalDate data2 = datePickerIdade.getValue();


			Period periodo = Period.between(data2,data1);
			String nomeArtista = nomeArtistaTxtField.getText().toString();
			int idadeArtista = periodo.getYears();
			if (idadeArtista < 10) {
				Alert alerta = new Alert(AlertType.ERROR,"Data inválida, Artista tem que ter pelo menos 10 anos  ");
				alerta.show();
			}

			else if (nomeArtista.equals("") || datePickerIdade.equals(null)) {

				Alert alerta = new Alert(AlertType.INFORMATION,"Preencha todos os campos");
				alerta.show();


			} else {
				Artista artista = new Artista(nomeArtista, idadeArtista);
				fachada.cadastrarElemento(artista);
				Alert alert1 = new Alert(AlertType.INFORMATION,"Artista de nome:"+this.nomeArtistaTxtField.getText()+" foi cadastrado com sucesso!");
				alert1.showAndWait();
			}
		} catch (ArtistaJaCadastradoException e) {
			Alert alert2 = new Alert(AlertType.ERROR,"Artista com nome"+this.nomeArtistaTxtField.getText()+" já cadastrado");
			alert2.showAndWait();
			e.printStackTrace();
		}
		finally {
			nomeArtistaTxtField.clear();

		}

	}
	public void btnSairAcao(ActionEvent event) throws IOException {


		Parent telaLogin = FXMLLoader.load(getClass().getResource("TelaADM.fxml"));
		Scene telaLoginUsuario = new Scene(telaLogin);

		Stage janelaLogin = (Stage)((Node) event.getSource()).getScene().getWindow();
		janelaLogin.setScene(telaLoginUsuario);
		janelaLogin.show();


	}
	public void btnRemoverArtistaAcao(ActionEvent event)throws IOException, ElementoNaoExisteException {
		Artista artista = listViewArtistas.getSelectionModel().getSelectedItem();
		try {

			if (artista.equals(null)) {
				Alert alerta = new Alert(AlertType.ERROR,"Você não selecionou um Artista.");
				alerta.show();

			}else {
				listViewArtistas.getItems().remove(artista);
				fachada.removerElemento(artista);


				Alert alerta = new Alert(AlertType.INFORMATION,"Artista "+artista.getNomeArtista()+" removido com sucesso");
				alerta.show();
			}}catch(ElementoNaoExisteException e) {
				e.printStackTrace();
				Alert alerta = new Alert(AlertType.ERROR,"Artista não cadastrado.");
				alerta.show();
			}
	}

	public void btnAtualizarAcao(ActionEvent event)throws IOException, ElementoNaoExisteException{
		Artista artista = listViewArtistas.getSelectionModel().getSelectedItem();
		LocalDate data1 = LocalDate.now(); 
		LocalDate data2 = novaDataDatePicker.getValue();
		Period periodo = Period.between(data2,data1);
		try {
			String novoNomeArtista =novoNomeTxtField.getText().toString();
			int novaIdadeArtista = periodo.getYears();

			if (novaIdadeArtista <10) {
				Alert alerta = new Alert(AlertType.ERROR,"Artista tem que ter mais de 10 anos");
				alerta.show();

			} else if (novoNomeArtista.equals("") ||data2.equals(null)) {
				Alert alerta = new Alert(AlertType.ERROR,"Você não preenchou todos os campos corretamente");
				alerta.show();
			}

			else {
				artista.setNomeArtista(novoNomeTxtField.getText());
				artista.setIdadeArtista(periodo.getYears());
				fachada.atualizarElemento(artista);
				Alert alerta = new Alert(AlertType.INFORMATION,"Atualização relizada com sucesso, novo nome do artista é "+novoNomeArtista+" e sua idade"+novaIdadeArtista+" .");
				alerta.show();
			}
		}catch(ElementoNaoExisteException e) {
			e.printStackTrace();
			Alert alerta = new Alert(AlertType.ERROR,"Artita não existe");
			alerta.show();
		}

		finally {
			novoNomeTxtField.clear();
		}
	}


	public void listarArtistas() {
		artistas.addAll(fachada.listarArtistas());
		listaArtistas = FXCollections.observableArrayList(artistas);
		listViewArtistas.getItems().addAll(listaArtistas);
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listarArtistas();
	}

}
