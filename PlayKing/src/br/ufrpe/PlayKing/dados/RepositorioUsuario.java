package br.ufrpe.PlayKing.dados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
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
	public boolean existeUsuario(Usuario usuario) {
		boolean existe = false;
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).equals(usuario)) {
				existe = true;
			}
		}return existe;
	}

	public boolean loginUsuario(String login,String senha) {
		boolean loginEfetuado = false;
		
			Usuario auxiliar = this.procurarUsuario(login);
			
					if(auxiliar.getSenhaUsuario().equals(senha)) {
						loginEfetuado = true;
						System.out.println("Login efetuado com sucesso\n");
					}
					else {
						System.out.println("Senha incorreta\n");
					}return loginEfetuado;
				}
		
		
		
			

	}

