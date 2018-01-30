package br.ufrpe.PlayKing.gui;

import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.beans.Usuario;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.negocio.Fachada;
import br.ufrpe.PlayKing.negocio.IFachada;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;

import javafx.scene.control.ComboBox;

import javafx.scene.control.TableView;

public class TelaMusicaADMController {
	IFachada fachada = Fachada.getInstance();
	
	@FXML
	private Button btnSairVoltar;
	@FXML
	private Label tempoMusicaTxtField;
	@FXML
	private TextField nomeMusicaTxtField;
	@FXML
	private TextField precoMusicaTxtField;
	@FXML
	private Button btnCadastrarMusica;
	@FXML
	private ComboBox<Artista> artistaMusicaComboBox;
	@FXML
	private TableView<Musica> tableViewMusica;
	@FXML
	private Button btnRemoverMusica;
	@FXML
	private Button btnSairListarMusica;
	@FXML
	private Button btnAtualizarMusica;
	
	
	
	/*public void btnCadastrarMusica(ActionEvent event) {
		try {
			String nomeMusica = nomeMusicaTxtField.getText().toString();
			String tempoMusica = tempoMusicaTxtField.getText().toString();
			double precoMusica = precoMusicaTxtField.computeAreaInScreen();
			Artista
				if (!(nomeUsuario.equals("")|| loginUsuario.equals("")|| senhaUsuario.equals(""))) {
						Usuario usuario = new Usuario(nomeUsuario, loginUsuario, senhaUsuario);
						fachada.cadastrarElemento(usuario);
				
		
		
			
			Alert alert = new Alert(AlertType.INFORMATION,"Usuário cadastrado com sucesso!");
			alert.showAndWait();
			
				}else {
					Alert alert =  new Alert(AlertType.ERROR,"Campos preenchidos incorretamente");
					alert.show();
				}
		}catch (ElementoJaExisteException e) {
				Alert alert = new Alert(AlertType.ERROR,"Login já em uso.");
				alert.show();
		}
		finally {
			
			nomeUsuarioTxtField.clear();
			senhaUsuarioPassWordField.clear();
			loginUsuarioTxtField.clear();
		}
		
	}
		
	}*/
	

}
