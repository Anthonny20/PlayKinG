package br.ufrpe.PlayKing.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.beans.PlayList;
import br.ufrpe.PlayKing.beans.Usuario;
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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DashBoardController implements Initializable {

	IFachada fachada = Fachada.getInstance();
	private MainScreenController mc;

	@FXML
    private Button btnSairVolar;



    @FXML
    private TextField musicNowPlaying;

    @FXML
    private Button btnStop;

    @FXML
    private Button btnBrowse;

    @FXML
    private Button btnLoadList;

    @FXML
    private Button btnPlayer;

    @FXML
    private TextField nomePlayListTxtField;

    @FXML
    private ComboBox<PlayList> comboBoxPlayLists;

    


	@FXML
	public void playMusicaSelecionada(MouseEvent event) {

	}
	@FXML
	public void musicControl(ActionEvent event) {

	}
	@FXML
	public void btnPlayDashBoard(ActionEvent event) throws IOException {

		Parent musicPlayer = FXMLLoader.load(getClass().getResource("PlayerKinG.fxml"));
		Scene player = new Scene(musicPlayer);

		Stage janelaPlayer = new Stage();
		janelaPlayer.setScene(player);
		janelaPlayer.show();
	}
	@FXML
	public void voltarUsuarioLogin(ActionEvent event) throws IOException {

		Parent telaLogin = FXMLLoader.load(getClass().getResource("TelaLogin.fxml"));
		Scene telaLoginUsuario = new Scene(telaLogin);

		Stage janelaLogin = (Stage)((Node) event.getSource()).getScene().getWindow();
		janelaLogin.setScene(telaLoginUsuario);
		janelaLogin.show();

	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listarMusicasDashBoard();
		listarMusicasDaPlayList();
		
	}
    @FXML
    private ListView<Musica> musicPlayerListView;
    
    private List<Musica> musicasDashBoard = new ArrayList<>(); 
    private ObservableList<Musica> observableMusicas;
    @FXML
	public void listarMusicasDashBoard() {
		musicasDashBoard.addAll(fachada.listarMusicas());
		observableMusicas = FXCollections.observableArrayList(musicasDashBoard);
		musicPlayerListView.getItems().addAll(observableMusicas);
	}
//    @FXML
//    public void btnCriarPlayListAcao(ActionEvent event)throws IOException,ElementoJaExisteException{
//    	String namePlayList = nomePlayListTxtField.getText().toString();
//    	PlayList playList = new PlayList(namePlayList);
//    	
//    	
//    	for (Usuario usuario : ) {
//			
//		}
//    	Usuario usarioPlayList = 
//    	try {
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//    }

    @FXML
    public void btnRemoverPlayList(ActionEvent event) throws IOException, ElementoNaoExisteException{
    	PlayList playlist = comboBoxPlayLists.getSelectionModel().getSelectedItem();
    	try {
			if (comboBoxPlayLists.getValue().equals(null)) {
				Alert alert = new Alert(AlertType.ERROR,"Você não selecionou uma playlist");
				alert.show();
			} else {
				comboBoxPlayLists.getItems().remove(playlist);
				fachada.removerElemento(playlist);
				Alert alert = new Alert(AlertType.INFORMATION,"PlayList removida com sucesso");
				alert.show();
			}
		} catch (ElementoNaoExisteException e) {
				e.printStackTrace();
				Alert alert = new Alert(AlertType.ERROR,"PlayList não existe");
				alert.show();
		}
    }
    private ComboBox<PlayList>comboBoxPlayListsRemoverMusica;
    private ListView <Musica>todasMusicasDaPlayList;
    private List<Musica> playListMusicas = new ArrayList<>();
    private ObservableList<Musica> obsMusicasPlayList;
    @FXML 
    
    
    public void listarMusicasDaPlayList() {
//    	comboBoxPlayListsRemoverMusica.getItems().addAll(fachada.listarPlayLists());
//    	playListMusicas.addAll(fachada.listarTodasMusicasDaPlayList(comboBoxPlayListsRemoverMusica.getSelectionModel().getSelectedItem()));
//    	obsMusicasPlayList = FXCollections.observableArrayList(playListMusicas);
//    	todasMusicasDaPlayList.getItems().addAll(obsMusicasPlayList);
//    
    }
    public void btnRemoverMusicaPlayList(ActionEvent event) throws IOException, ElementoNaoExisteException{
    	
    }

}
