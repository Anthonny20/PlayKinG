package br.ufrpe.PlayKing.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.ufrpe.PlayKing.beans.Usuario;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;
import br.ufrpe.PlayKing.exception.UsuarioJaCadastradoException;
import br.ufrpe.PlayKing.negocio.Fachada;
import br.ufrpe.PlayKing.negocio.IFachada;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class MainScreenController implements Initializable{
	
	private IFachada fachada  = Fachada.getInstance();

	@FXML
	private PasswordField senhaUsuarioPassWordField;

	@FXML
	private Button btnInscrever;

	@FXML
	private Button btnInscrito;

	@FXML
	private TextField nomeUsuarioTxtField;

	@FXML
	private TextField loginUsuarioTxtField;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	@FXML
	public void btnInscricao (ActionEvent event)throws ElementoJaExisteException, UsuarioJaCadastradoException{
		
		try {
			String nomeUsuario = nomeUsuarioTxtField.getText().toString();
			String loginUsuario = loginUsuarioTxtField.getText().toString();
			String senhaUsuario = senhaUsuarioPassWordField.getText().toString();
				if (nomeUsuario.equals("")|| loginUsuario.equals("")|| senhaUsuario.equals("")) {
					
					Alert alerta = new Alert(AlertType.INFORMATION,"Preencha todos os campos.");
					alerta.show();
			
				}else {
					Usuario usuario = new Usuario(nomeUsuario, loginUsuario, senhaUsuario);
					fachada.cadastrarElemento(usuario);
					Alert alerta1 = new Alert(AlertType.INFORMATION,"Usuário de Login: "+nomeUsuario+" ,cadastrado com sucesso!");
					alerta1.showAndWait();
				}
		}catch (UsuarioJaCadastradoException e) {
			Alert alert = new Alert(AlertType.ERROR,"Login : "+this.loginUsuarioTxtField.getText()+" já em uso, preencha seus dados novamente com um login diferente.");
			alert.showAndWait();	
			e.printStackTrace();
		}
		finally {
			
			nomeUsuarioTxtField.clear();
			senhaUsuarioPassWordField.clear();
			loginUsuarioTxtField.clear();
		}
		
	}
	
	@FXML
	public void btnInscritoAcao(ActionEvent event) throws IOException {
		

			Parent telaLogin = FXMLLoader.load(getClass().getResource("TelaLogin.fxml"));
			Scene telaUsuario = new Scene(telaLogin);

			Stage janelaUsuario = (Stage)((Node) event.getSource()).getScene().getWindow();
			janelaUsuario.setScene(telaUsuario);
			janelaUsuario.show();
		}
	}


