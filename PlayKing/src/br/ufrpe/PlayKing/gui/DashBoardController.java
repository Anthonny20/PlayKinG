package br.ufrpe.PlayKing.gui;

import java.io.IOException;

import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.negocio.Fachada;
import br.ufrpe.PlayKing.negocio.IFachada;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DashBoardController {

	IFachada fachada = Fachada.getInstance();


	@FXML
	private ListView<Musica> musicPlayerListView;



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
	public void playMusicaSelecionada(MouseEvent event) {

	}
	@FXML
	public void musicControl(ActionEvent event) {

	}
	@FXML
	public void btnPlayDashBoard(ActionEvent event) throws IOException {

		Parent musicPlayer = FXMLLoader.load(getClass().getResource("PlayerKinG.fxml"));
		Scene player = new Scene(musicPlayer);

		Stage janelaPlayer = (Stage)((Node) event.getSource()).getScene().getWindow();
		janelaPlayer.setScene(player);
		janelaPlayer.show();
	}
	
	

}
