package br.ufrpe.PlayKing.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Usuario {

	private String nomeUsuario;
	private String loginUsuario;
	private String senhaUsuario;
	private ArrayList<Musica> musicasUsuario;
	private ArrayList<Usuario> usuarios;
	private double creditoUsuario;
	 
	
	
	public Usuario(String nomeUsuario, String loginUsuario, String senhaUsuario) {
		
		this.nomeUsuario = nomeUsuario;
		
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
		this.musicasUsuario = new ArrayList<>();
		this.usuarios = new ArrayList<>();
		this.creditoUsuario = 0;
		
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getLoginUsuario() {
		return loginUsuario;
	}
	
	/*public boolean usuarioNomeExiste(String loginNome) {
		boolean existe = false;
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getLoginUsuario().equals(loginNome)) {
				existe = true;
			}
			
		}return existe
	}*/
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
	public ArrayList<Musica> getMusicasUsuario() {
		return musicasUsuario;
	}
	public void setMusicasUsuario(ArrayList<Musica> musicasUsuario) {
		this.musicasUsuario = musicasUsuario;
	}
	

	
	public double getCreditoUsuario() {
		return creditoUsuario;
	}
	public void creditarUsuario(double credito) {
		if(usuarios!= null) {
			for (int i = 0; i < usuarios.size(); i++) {
				
			}
		}
	}
	
	@Override
	public String toString() {
		
		return "\nNome Usuario : "+this.getNomeUsuario()+"\n"+
				"Todas Musicas : "+this.getMusicasUsuario()+"\n";
				
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (loginUsuario == null) {
			if (other.loginUsuario != null)
				return false;
		} else if (!loginUsuario.equals(other.loginUsuario))
			return false;
		if (nomeUsuario == null) {
			if (other.nomeUsuario != null)
				return false;
		} else if (!nomeUsuario.equals(other.nomeUsuario))
			return false;
		
		if (senhaUsuario == null) {
			if (other.senhaUsuario != null)
				return false;
		} else if (!senhaUsuario.equals(other.senhaUsuario))
			return false;
		return true;
	}


}
