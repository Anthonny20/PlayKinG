package br.ufrpe.PlayKing.dados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Usuario;

public class RepositorioUsuario extends RepositorioGenerico<Usuario>  {

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



	public Usuario procurarUsuario(String login) {
		Usuario achado = null;
		for (int i = 0; i < usuarios.size(); i++) {
			if (this.usuarios.get(i).getLoginUsuario().equals(login)) {
				achado= this.usuarios.get(i);
			}
		}return achado;
		
		}
	
	public List<Usuario> listarUsuarios(){
		return usuarios;
	}
	
	public boolean existeUsuarioLogin(String login) {
		boolean resultado = false;
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getLoginUsuario().equals(login)) {
				resultado = true;
			}
		}
		return resultado;
	}
	


		
			

	}

