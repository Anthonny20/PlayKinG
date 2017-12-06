package br.ufrpe.PlayKing.negocio;

import br.ufrpe.PlayKing.beans.Usuario;
import br.ufrpe.PlayKing.dados.RepositorioUsuario;

public class ControladorUsuario {
	private RepositorioUsuario repoUsuario;

	public ControladorUsuario() {
		this.repoUsuario = RepositorioUsuario.getInstance();
	}

	public void adicionarUsuario(Usuario usuario) {
		this.repoUsuario.adicionarUsuario(usuario);
	}
	public void removerUsuario(Usuario usuario) {
		this.repoUsuario.removerUsuario(usuario);
	}
	public void atualizarUsuario(Usuario usuario) {
		this.repoUsuario.atualizarUsuario(usuario);
	}
	public Usuario procurarUsuario(String login) {
		Usuario usuarioProcurado = null;
		usuarioProcurado = this.repoUsuario.procurarUsuario(login);
		if(usuarioProcurado == null) {
			System.out.println("Usuario não encontrado\n");
		}
		return usuarioProcurado;
	}
	public boolean loginUsuario(String login,String senha) {
		boolean loginEfetuado = false;
		if(login!=null && senha!= null) {
			Usuario auxiliar = this.repoUsuario.procurarUsuario(login);
				if(auxiliar!=null) {
					if(auxiliar.getSenhaUsuario().equals(senha)) {
						loginEfetuado = true;
					}
					else {
						System.out.println("Senha incorreta\n");
					}
				}
		
		}return loginEfetuado;
		
			

	}
}
