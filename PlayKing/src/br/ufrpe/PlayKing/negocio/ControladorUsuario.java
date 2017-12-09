package br.ufrpe.PlayKing.negocio;
<<<<<<< HEAD

import java.util.List;

=======
//TODO CRIAR REGRAS DE NEGOCIO
>>>>>>> branch 'master' of https://github.com/Anthonny20/PlayKinG
import br.ufrpe.PlayKing.beans.Usuario;
import br.ufrpe.PlayKing.dados.RepositorioUsuario;

public class ControladorUsuario {
	private RepositorioUsuario repoUsuario;

	public ControladorUsuario() {
		this.repoUsuario = RepositorioUsuario.getInstance();
	}

	public void adicionarUsuario(Usuario usuario) {
		if(usuario!= null && !repoUsuario.existeUsuario(usuario))
		this.repoUsuario.adicionarUsuario(usuario);
	}
	public void removerUsuario(Usuario usuario) {
		if(usuario!= null && repoUsuario.existeUsuario(usuario))
		this.repoUsuario.removerUsuario(usuario);
	}
	public void atualizarUsuario(Usuario usuario) {
		if(usuario!= null && repoUsuario.existeUsuario(usuario))
		this.repoUsuario.atualizarUsuario(usuario);
	}

	public Usuario procurarUsuario(String login) {
		Usuario resultado = null;
		if(login!=null) {
		 resultado = repoUsuario.procurarUsuario(login);
		}return resultado;
	}

	public List<Usuario> listarUsuarios() {
		return repoUsuario.listarUsuarios();
	}

	public boolean existeUsuario(Usuario usuario) {
		
		return repoUsuario.existeUsuario(usuario);
	}

	public boolean loginUsuario(String login, String senha) {
		boolean resultado = false;
		if (login!= null && senha!=null) {
			
		resultado = repoUsuario.loginUsuario(login, senha);
		
		
	}return resultado;
		}

}
