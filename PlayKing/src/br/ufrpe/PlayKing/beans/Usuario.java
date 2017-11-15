package br.ufrpe.PlayKing.beans;

import java.util.ArrayList;

public class Usuario {
	
	private String nomeUsuario;
	private String loginUsuario;
	private String senhaUsuario;
	private int musicasUsuario;
	private double totalUsuario;
	
	public Usuario() {}
	public Usuario(String nomeUsuario, String loginUsuario, String senhaUsuario, int musicasUsuario,
			double totalUsuario) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
		this.musicasUsuario = musicasUsuario;
		this.totalUsuario = totalUsuario;
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
	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	public int getMusicasUsuario() {
		return musicasUsuario;
	}
	public void setMusicasUsuario(int musicasUsuario) {
		this.musicasUsuario = musicasUsuario;
	}
	public double getTotalUsuario() {
		return totalUsuario;
	}
	public void setTotalUsuario(double totalUsuario) {
		this.totalUsuario = totalUsuario;
	}
	
}
