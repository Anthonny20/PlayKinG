package br.ufrpe.PlayKing.dados;

import java.util.ArrayList;
import java.util.List;

import br.ufrpe.PlayKing.beans.Usuario;

public class RepositorioUsuario  {

	private static RepositorioUsuario instance;
	private ArrayList<Usuario> usuarios;

	public static RepositorioUsuario getInstance(){
		if (instance==null) {
			instance = new RepositorioUsuario();	

		}return instance;
	}

	private RepositorioUsuario() {
		this.usuarios = new ArrayList<>();
	}


	public void adicionarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	public void removerUsuario(Usuario usuario) {
		for (int i = 0; i <usuarios.size(); i++) {
			if(this.usuarios.get(i).equals(usuario)) {
				this.usuarios.remove(i);
			}
		}
	}
	public void atualizarUsuario(Usuario usuario) {
		for (int i = 0; i < usuarios.size(); i++) {
			if(this.usuarios.get(i).equals(usuario)) {
				this.usuarios.set(i, usuario);
			}
		}
	}
	
}
