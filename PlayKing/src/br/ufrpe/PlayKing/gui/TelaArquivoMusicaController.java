package br.ufrpe.PlayKing.gui;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

import javafx.scene.control.ListView;
import javafx.stage.FileChooser;

public class TelaArquivoMusicaController {
	@FXML
	private Button btnSelecionarArquivo;
	@FXML
	private ListView listViewArquivoMusica;

	public void btnSelecionar(ActionEvent event) throws IOException{
		FileChooser fc = new FileChooser();
		File selectedFile = fc.showOpenDialog(null);
		
		if (selectedFile != null) {
			listViewArquivoMusica.getItems().add(selectedFile.getParentFile());
		} else {
			Alert alerta = new Alert(AlertType.ERROR,"Arquivo não é valido ");
			alerta.show();
		}
		
	}
}
