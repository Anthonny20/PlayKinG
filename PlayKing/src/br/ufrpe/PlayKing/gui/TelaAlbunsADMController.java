package br.ufrpe.PlayKing.gui;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.exception.AlbumJaCadastradoException;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class TelaAlbunsADMController implements Initializable {

	IFachada fachada = Fachada.getInstance();


	@FXML
	private Button btnSairVoltar;

	@FXML
	private TextField nomeAlbumTxtField;

	@FXML
	private Button btnCadastrarAlbum;

	@FXML
	private DatePicker datePickerCriacaoAlbum;



	@FXML
	private Button btnRemoverAlbum;

	@FXML
	private Button btnSairListarAlbum;

	@FXML
	private Button btnAtualizarAlbum;

	@FXML
	private ListView<Album> listViewAlbuns;

	@FXML
	private TextField novoNomeAlbumTxtField;


    @FXML
    private Button btnRemoverMusicaAlbum;

    @FXML
    private Button btnSairVoltarRemoverMusicaAlbum;


	@FXML
	private ListView<Musica> listViewTodasMusicas;



	@FXML
	private ListView<Musica> listViewRemoverMusicaAlbum;




	private List<Album> albuns = new ArrayList<>();

	private ObservableList<Album> listaDeAlbunsTelaListar;



	private List<Musica> musicas = new ArrayList<>();

	private ObservableList<Musica> listarMusicas;




	private List<Artista> artistasAlbum = new ArrayList<>();

	private ObservableList<Artista> listaDeArtistasAlbum;


	@FXML
	private ComboBox<Artista> albumArtistaComboBox;

	@FXML
	private ComboBox<Album> listarAlbunsComboBox;

	@FXML
	public void listarArtistas() {
		artistasAlbum.addAll(fachada.listarArtistas());
		listaDeArtistasAlbum = FXCollections.observableArrayList(artistasAlbum);

		albumArtistaComboBox.getItems().addAll(listaDeArtistasAlbum);

	}
	@FXML
	public void listarViewAlbuns(){
		albuns.addAll(fachada.listarAlbuns());
		listaDeAlbunsTelaListar = FXCollections.observableArrayList(albuns);
		listViewAlbuns.getItems().addAll(listaDeAlbunsTelaListar);
		albumComboBox.getItems().addAll(listaDeAlbunsTelaListar);
		
		
	}

	@FXML
	public void listarViewTodasMusicas(){
		musicas.addAll(fachada.listarMusicas());
		listarMusicas = FXCollections.observableArrayList(musicas);

		listViewTodasMusicas.getItems().addAll(listarMusicas);
		

	}

	private List<Musica> musicasAlbum = new ArrayList<>();

	private ObservableList<Musica> viewMusicasAlbum;
	
	private ListView<Musica> listViewMusica;
	@FXML
	private ComboBox<Album> albumComboBox;
	@FXML
	public void pegarComboAlbum() {
		
	Album album = albumComboBox.getSelectionModel().getSelectedItem();
	
	musicasAlbum.addAll(album.getMusicasAlbum());
	
		viewMusicasAlbum = FXCollections.observableArrayList(musicasAlbum);
		listViewMusica.getItems().addAll(viewMusicasAlbum);
		
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		listarArtistas();

		listarViewAlbuns();
		
		//pegarComboAlbum();

	
		
		


	}

	public void btnCadastrarAlbumAcao(ActionEvent event) throws ElementoJaExisteException, AlbumJaCadastradoException{
		try {

			String nomeAlbum = nomeAlbumTxtField.getText().toString();
			Artista artistaAlbum = albumArtistaComboBox.getSelectionModel().getSelectedItem();
			LocalDate dataAlbum = datePickerCriacaoAlbum.getValue();

			if (dataAlbum.isAfter(LocalDate.now()) || datePickerCriacaoAlbum.getValue().equals(null)) {
				Alert alerta = new Alert(AlertType.ERROR,"Data inválida");
				alerta.show();
			} else if(nomeAlbum.equals("")||artistaAlbum.equals(null)||dataAlbum.equals(null)) {
				Alert alerta = new Alert(AlertType.ERROR,"Preencha todos os dados");
				alerta.show();
			}

			else {
				Album album = new Album(nomeAlbum, artistaAlbum, dataAlbum);
				fachada.cadastrarElemento(album);
				Alert alert = new Alert(AlertType.INFORMATION,"Album "+nomeAlbum+" cadastrado com sucesso");
				alert.showAndWait();
			}
		} catch (AlbumJaCadastradoException e) {
			Alert  alert = new Alert(AlertType.ERROR,"Album"+nomeAlbumTxtField.getText().toString()+" já cadastrado");
			alert.showAndWait();
			e.printStackTrace();
		}finally {
			nomeAlbumTxtField.clear();

		}
	}

	public void btnRemoverAlbumAcao(ActionEvent event)throws IOException, ElementoNaoExisteException{
		Album album = listViewAlbuns.getSelectionModel().getSelectedItem();
		try {
			if (album.equals(null)) {
				Alert alerta = new Alert(AlertType.ERROR,"Você não selecionou nenhum album.");
				alerta.show();
			} 
			else {
				listViewAlbuns.getItems().remove(album);
				fachada.removerElemento(album);
				Alert alerta = new Alert(AlertType.INFORMATION,"Album removido com sucesso.");
				alerta.show();
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
			Alert alerta = new  Alert(AlertType.ERROR,"Album não existe.");
			alerta.show();
		}
	}

	public void btnSairAcao(ActionEvent event) throws IOException {


		Parent telaLogin = FXMLLoader.load(getClass().getResource("TelaADM.fxml"));
		Scene telaLoginUsuario = new Scene(telaLogin);

		Stage janelaLogin = (Stage)((Node) event.getSource()).getScene().getWindow();
		janelaLogin.setScene(telaLoginUsuario);
		janelaLogin.show();


	}

	public void btnAtulizarAcao(ActionEvent event) throws IOException{
		Album album = listViewAlbuns.getSelectionModel().getSelectedItem();
		try {
			String novoNomeAlbum = novoNomeAlbumTxtField.getText().toString();
			if (novoNomeAlbum.equals("")||!(this.fachada.existeElemento(album))) {
				Alert alerta = new Alert(AlertType.ERROR,"Novo nome inválido");
				alerta.show();
			} else {
				album.setNomeAlbum(novoNomeAlbum);
				fachada.atualizarElemento(album);
				Alert alerta = new Alert(AlertType.INFORMATION, "Novo nome atualizado com sucesso");
				alerta.show();
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
			Alert alerta = new Alert(AlertType.ERROR,"Albúm não existe");
			alerta.show();

		}
	}



  



  



}
