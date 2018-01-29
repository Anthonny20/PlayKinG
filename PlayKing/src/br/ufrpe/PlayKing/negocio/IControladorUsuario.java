package br.ufrpe.PlayKing.negocio;

import java.util.List;

import br.ufrpe.PlayKing.beans.Usuario;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;
import br.ufrpe.PlayKing.exception.UsuarioJaCadastradoException;

public interface IControladorUsuario {

	void removerElemento(Usuario elemento) throws ElementoNaoExisteException;

	List<Usuario> listarElementos();

	boolean existeElemento(Usuario elemento);

	void cadastrarElemento(Usuario elemento) throws ElementoJaExisteException, UsuarioJaCadastradoException;

	void atualizarElemento(Usuario elemento) throws ElementoNaoExisteException;


	Usuario procurarUsuario(String login) throws ElementoNaoExisteException;

	List<Usuario> listarUsuarios();



	boolean loginUsuario(String login,String senha)throws ElementoNaoExisteException;

	boolean existeUsuarioLogin(String login);

}
