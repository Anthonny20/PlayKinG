package br.ufrpe.PlayKing.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import br.ufrpe.PlayKing.beans.Usuario;
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
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

public class TelaUsuarioADMController implements Initializable{

	IFachada fachada = Fachada.getInstance();

	@FXML
	private ListView <Usuario> listViewUsuarios;
	@FXML
	private Button btnRemoverUsuario;
	@FXML
	private Button btnSairListarUsuario;


	private List<Usuario> usuarios = new ArrayList<>();
	private ObservableList<Usuario> listaUsuarios;

	@FXML
	public void usuariosLista() {
		usuarios.addAll(fachada.listarUsuarios());
		listaUsuarios = FXCollections.observableArrayList(usuarios);
		listViewUsuarios.getItems().addAll(listaUsuarios);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		usuariosLista();

	}
	@FXML
	public void btnRemoverUsuarioAcao(ActionEvent event)throws IOException,ElementoNaoExisteException {
		Usuario usuario = listViewUsuarios.getSelectionModel().getSelectedItem();
		try {
			if (usuario.getLoginUsuario().equals("ADM")) {
				Alert alerta =  new Alert(AlertType.ERROR,"Usuário ADM não pode ser removido");
				alerta.show();
			}
			else if (usuario.equals(null)) {
				Alert alert = new Alert(AlertType.ERROR,"Você não selecionou um usuário.");
				alert.show();
			} else {

				listViewUsuarios.getItems().remove(usuario);
				fachada.removerElemento(usuario);
				Alert alert = new Alert(AlertType.INFORMATION,"Usuario removido com sucesso");
				alert.show();
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
			Alert alert =  new Alert(AlertType.ERROR,"Usuario não existe");
			alert.show();
		}
	}
	public void btnSairAcao(ActionEvent event) throws IOException {


		Parent telaLogin = FXMLLoader.load(getClass().getResource("TelaADM.fxml"));
		Scene telaLoginUsuario = new Scene(telaLogin);

		Stage janelaLogin = (Stage)((Node) event.getSource()).getScene().getWindow();
		janelaLogin.setScene(telaLoginUsuario);
		janelaLogin.show();


	}

}
