package br.ufrpe.PlayKing.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.ufrpe.PlayKing.beans.Usuario;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;
import br.ufrpe.PlayKing.negocio.ControladorUsuario;
import br.ufrpe.PlayKing.negocio.Fachada;
import br.ufrpe.PlayKing.negocio.IControladorUsuario;
import br.ufrpe.PlayKing.negocio.IFachada;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaLoginController implements Initializable{
	
	IFachada fachada = Fachada.getInstance();
	
		@FXML
	    private TextField loginTxtField;

	    @FXML
	    private PasswordField senhaPassWordField;

	    @FXML
	    private Button btnEntrarUsuario;

	    @FXML
	    private Button btnVoltarUsuario;
	    
	    
	    
	    @FXML
	    public void voltarUsuario(ActionEvent event) throws IOException {
	    	
	    	Parent telaLogin = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
	    	Scene telaLoginUsuario = new Scene(telaLogin);
	    	
	    	Stage janelaLogin = (Stage)((Node) event.getSource()).getScene().getWindow();
	    	janelaLogin.setScene(telaLoginUsuario);
	    	janelaLogin.show();
	    	
	    }
	    
	    @FXML
	    private void loginUsuario(ActionEvent event)throws IOException ,ElementoNaoExisteException, ElementoJaExisteException{
	    	String loginADM= "ADM";
	    	String senhaADM = "1";
	    	String loginUsuario = loginTxtField.getText().toString();
	    	String senhaUsuario = senhaPassWordField.getText().toString();
	    	
	    	Usuario u = new Usuario("1", "1", "1");
	    	
	    	
	    	try {
				if (loginADM.equals(loginTxtField.getText()) && senhaADM.equalsIgnoreCase(senhaPassWordField.getText())) {
					Parent telaLoginADM = FXMLLoader.load(getClass().getResource("TelaADM.fxml"));
					Scene telaADM = new Scene(telaLoginADM);

					Stage janelaADM = (Stage)((Node) event.getSource()).getScene().getWindow();
					janelaADM.setScene(telaADM);
					janelaADM.show();
					
					Alert alerta = new Alert(AlertType.INFORMATION,"Bem-Vindo ADM");
					alerta.setTitle("Bem-Vindo");
					alerta.showAndWait();
				}else if(fachada.loginUsuario(loginUsuario,senhaUsuario)){
							
							Parent telaUsuarioDash = FXMLLoader.load(getClass().getResource("DashBoard.fxml"));
							Scene telaUsuario = new Scene(telaUsuarioDash);
							
							Stage janelaUsuario = (Stage)((Node)event.getSource()).getScene().getWindow();
							janelaUsuario.setScene(telaUsuario);
							janelaUsuario.show();
							Alert alert = new Alert(AlertType.INFORMATION,"Usuário "+loginTxtField+" logado com sucesso ao PlayKinG");
							alert.setTitle("Bem-vindo");
							alert.showAndWait();
				}
				else {
					Alert alert =  new Alert(AlertType.ERROR,"Login e senha informados estão errados");
					alert.setTitle("Erro ao conectar");
					alert.showAndWait();
				}
				
			} catch (ElementoNaoExisteException e) {
					e.printStackTrace();
			}
	    }
	    
	    
	    

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	

	

}
