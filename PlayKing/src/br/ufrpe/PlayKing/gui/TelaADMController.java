package br.ufrpe.PlayKing.gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaADMController {
	
	@FXML
    private Button btnMusicas;

    @FXML
    private Button btnAlbuns;

    @FXML
    private Button btnArtistas;

    @FXML
    private Button btnUsuarios;

    @FXML
    private Button btnSair;
    
    
	@FXML
	public void voltarLoginScreen(ActionEvent event) throws IOException {

		Parent telaLogin = FXMLLoader.load(getClass().getResource("TelaLogin.fxml"));
		Scene telaLoginUsuario = new Scene(telaLogin);

		Stage janelaLogin = (Stage)((Node) event.getSource()).getScene().getWindow();
		janelaLogin.setScene(telaLoginUsuario);
		janelaLogin.show();

	}
	
	@FXML
	public void btnMusicaADM(ActionEvent event) throws IOException {

		Parent musicaADM = FXMLLoader.load(getClass().getResource("TelaMusicaADM.fxml"));
		Scene telaADM = new Scene(musicaADM);

		Stage janelaMusica = new Stage();
		janelaMusica.setScene(telaADM);
		janelaMusica.show();
	}
	@FXML
	public void btnAlbumADM(ActionEvent event) throws IOException {

		Parent albumADM = FXMLLoader.load(getClass().getResource("TelaAlbunsADM.fxml"));
		Scene telaADM = new Scene(albumADM);

		Stage janelaAlbum = new Stage();
		janelaAlbum.setScene(telaADM);
		janelaAlbum.show();
	}
	@FXML
	public void btnArtistaADM(ActionEvent event) throws IOException {

		Parent artistaADM = FXMLLoader.load(getClass().getResource("TelaArtistaADM.fxml"));
		Scene telaADM = new Scene(artistaADM);

		Stage janelaArtista = new Stage();
		janelaArtista.setScene(telaADM);
		janelaArtista.showAndWait();
		
	}
	@FXML
	public void btnUsuariosADM(ActionEvent event) throws IOException {

		Parent usuarioADM = FXMLLoader.load(getClass().getResource("TelaUsuarioADM.fxml"));
		Scene telaADM = new Scene(usuarioADM);

		Stage janelaUsuario = new Stage();
		janelaUsuario.setScene(telaADM);
		janelaUsuario.show();
	}
	
	

}
