package br.ufrpe.PlayKing.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaLoginController implements Initializable{
	
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
	    
	    //TODO FAZER METODO DE LOGIN DO USUARIO
	    
	    
	    

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	

	

}
