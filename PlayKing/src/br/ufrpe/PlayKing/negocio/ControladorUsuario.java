package br.ufrpe.PlayKing.negocio;


import java.util.List;


import br.ufrpe.PlayKing.beans.Usuario;
import br.ufrpe.PlayKing.dados.IRepositorioGenerico;
import br.ufrpe.PlayKing.dados.RepositorioUsuario;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;
import br.ufrpe.PlayKing.exception.UsuarioJaCadastradoException;

public class ControladorUsuario {
	private RepositorioUsuario<Usuario> repoUsuario;
	private IRepositorioGenerico<Usuario> repositorio;

	public ControladorUsuario(IRepositorioGenerico<Usuario> instancia) {
		this.repoUsuario = RepositorioUsuario.getInstance();
		this.repositorio = instancia;
	}

	public void removerElemento(Usuario elemento) throws ElementoNaoExisteException {
		try {
			if (elemento!= null && this.repositorio.existeElemento(elemento)) {
				this.repositorio.removerElemento(elemento);
				this.repositorio.salvarArquivo();
			} else {
				throw new ElementoNaoExisteException(elemento);
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}

	}


	public List<Usuario> listarUsuarios() {

		return repositorio.listarElementos();
	}


	public boolean existeElemento(Usuario elemento) {

		return repositorio.existeElemento(elemento);

	}


	public void cadastrarElemento(Usuario elemento) throws ElementoJaExisteException,UsuarioJaCadastradoException{

		if (elemento == null) {
			throw new IllegalArgumentException("Argumento inválido");
		}
		else if ( !this.repositorio.existeElemento(elemento)&& !this.repoUsuario.existeUsuarioLogin(elemento.getLoginUsuario()))
		{	this.repositorio.cadastrarElemento(elemento);
		this.repositorio.salvarArquivo();
		}
		else {
			throw new UsuarioJaCadastradoException("Login de usuario "+elemento.getLoginUsuario()+" já cadastrado");
		}


	}


	public void atualizarElemento(Usuario elemento) throws ElementoNaoExisteException {
		try {
			if (elemento!=null && this.repositorio.existeElemento(elemento)) {
				this.repositorio.atualizarElemento(elemento);
				this.repositorio.salvarArquivo();
			} else {
				throw new ElementoNaoExisteException(elemento);
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}

	}




	public boolean procurarUsuario(String login,String senha) throws ElementoNaoExisteException {
		return this.repoUsuario.procurarUsuario(login, senha);
	}

	public boolean loginUsuario(String login,String senha)throws ElementoNaoExisteException {
		return procurarUsuario(login, senha);
	}

	public boolean existeUsuarioLogin(String login) {

		return repoUsuario.existeUsuarioLogin(login);
	}



}
