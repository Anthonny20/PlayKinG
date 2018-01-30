package br.ufrpe.PlayKing.gui;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class PlayerKinGController implements Initializable{

	@FXML
	private MediaView playerMediaView;
	private MediaPlayer mp;
	private Media me;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		String path = new File("C:\\Users\\Anthonny\\Desktop\\Musicas\\2016.2\\2Pac - Hit 'Em Up (Dirty) (Official Video) HD.mp3").getAbsolutePath();
		me = new Media(new File(path).toURI().toString());
		mp = new MediaPlayer(me);
		playerMediaView.setMediaPlayer(mp);
	//	mp.setAutoPlay(true);
	}
	

    @FXML
    private Button btnPlayPlayer;

    @FXML
    private Button btnPausePlayer;

    @FXML
    private Button btnStopPlayer;
    
  
    
	public void playMusica(ActionEvent event) {
		
		mp.play();

	}
	
	public void pauseMusica(ActionEvent event) {

		mp.pause();
	}
	
	public void stopMusica(ActionEvent event) {
		mp.stop();
	}
	
	
	
	
	
}
