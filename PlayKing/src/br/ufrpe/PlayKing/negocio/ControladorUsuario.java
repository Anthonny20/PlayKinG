package br.ufrpe.PlayKing.negocio;

import br.ufrpe.PlayKing.beans.Usuario;
import br.ufrpe.PlayKing.dados.RepositorioUsuario;

public class ControladorUsuario {
	private RepositorioUsuario repoUsuario;

	public ControladorUsuario(RepositorioUsuario instanciaRepositorio) {
		this.repoUsuario = instanciaRepositorio;
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
}
