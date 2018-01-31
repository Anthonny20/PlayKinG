package br.ufrpe.PlayKing.gui;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;
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
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class TelaMusicaADMController implements Initializable{

	IFachada fachada = Fachada.getInstance();

	@FXML
	private Button btnSairVoltar;
	@FXML
	private TextField tempoMusicaTxtField;
	@FXML
	private TextField nomeMusicaTxtField;

	@FXML
	private Button btnCadastrarMusica;
//	@FXML
//	private ComboBox<Artista> artistaMusicaComboBox;

	@FXML
	private Button btnRemoverMusica;
	@FXML
	private Button btnSairListarMusica;
	

	@FXML
	private ComboBox<Album> albumMusicaComboBox;




	@FXML
	public void btnRemoverMusicaAcao(ActionEvent event)throws IOException,ElementoNaoExisteException {
		Musica musica = listViewTodasMusicas.getSelectionModel().getSelectedItem();
		try {
			if(musica.equals(null)) {
				Alert alert =  new Alert(AlertType.ERROR,"Você não selecionou nenheuma musica");
				alert.show();
			}else {
				listViewTodasMusicas.getItems().remove(musica);
				fachada.removerElemento(musica);
				Alert alert = new Alert(AlertType.INFORMATION,"Musica removido com sucesso");
				alert.show();
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
			Alert alert = new Alert(AlertType.ERROR,"Música não existe.");
			alert.show();
		}
	}


	@FXML
	public void btnCadastrarMusica(ActionEvent event) throws IOException,ElementoJaExisteException {


		try {

			String nomeMusica = nomeMusicaTxtField.getText().toString();
			String tempoMusica = tempoMusicaTxtField.getText().toString();


			Album albumMusica = albumMusicaComboBox.getValue();
			File musicFile = null;

			if ((nomeMusica.equals("")|| tempoMusica.equals("")|| albumMusica.equals(null) )) {

				Alert alert = new Alert(AlertType.ERROR,"Preencha todos os campos");
				alert.show();
			}
			else {
				Musica musica = new Musica(nomeMusica, tempoMusica, albumMusica, musicFile);
				//					Parent musicaADM = FXMLLoader.load(getClass().getResource("TelaArquivoMusica.fxml"));
				//					Scene telaADM = new Scene(musicaADM);
				//
				//					Stage janelaMusica = new Stage();
				//					janelaMusica.setScene(telaADM);
				//					janelaMusica.show();

				fachada.cadastrarElemento(musica);



				Alert alert = new Alert(AlertType.INFORMATION,"Música cadastrada com sucesso!");
				alert.showAndWait();


			}}catch (ElementoJaExisteException e) {
				Alert alert = new Alert(AlertType.ERROR,"Login já em uso.");
				alert.show();
			}
		finally {

			nomeMusicaTxtField.clear();
			tempoMusicaTxtField.clear();
		

		}

	}

	public void btnSairAcao(ActionEvent event) throws IOException {


		Parent telaLogin = FXMLLoader.load(getClass().getResource("TelaADM.fxml"));
		Scene telaLoginUsuario = new Scene(telaLogin);

		Stage janelaLogin = (Stage)((Node) event.getSource()).getScene().getWindow();
		janelaLogin.setScene(telaLoginUsuario);
		janelaLogin.show();


	}
	private List<Musica> musicas = new ArrayList<>();
	private ObservableList<Musica> listaMusicas;
	@FXML
	private ListView<Musica> listViewTodasMusicas;

	@FXML
	public void listViewMusicas() {
		musicas.addAll(fachada.listarMusicas());
		listaMusicas = FXCollections.observableArrayList(musicas);
		listViewTodasMusicas.getItems().addAll(listaMusicas);
	}

//	private List<Artista> artistaMusica = new ArrayList<>();
//	private ObservableList<Artista> listarArtistaMusica;
//	@FXML 
//	public void artistaMusica() {
//		artistaMusica.addAll(fachada.listarArtistas());
//		listarArtistaMusica  = FXCollections.observableArrayList(artistaMusica);
//		artistaMusicaComboBox.getItems().addAll(listarArtistaMusica);
//	}
	private List<Album> albumMusica = new ArrayList<>();
	private ObservableList<Album> listarAlbumMusica;

	@FXML
	public void albumMusica() {
		albumMusica.addAll(fachada.listarAlbuns());
		listarAlbumMusica = FXCollections.observableArrayList(albumMusica);
		albumMusicaComboBox.getItems().addAll(listarAlbumMusica);
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listViewMusicas();
		//artistaMusica();
		albumMusica();
	}
}
