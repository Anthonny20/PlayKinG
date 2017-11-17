package br.ufrpe.PlayKing.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Usuario {
	
	private String nomeUsuario;
	private String loginUsuario;
	private String senhaUsuario;
	private Musica [] playListUsuario;
	private int proxima;
	private String historicoComprasUsuario;//Será usado mais pra frente.
	private double gastosUsuario;//Será usado mais pra frente.
	
	// FAZER TIPOS DE USARIOS 
	public Usuario(String nomeUsuario, String loginUsuario, String senhaUsuario, Musica[] playListUsuario) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
		this.playListUsuario = new Musica[10];//LIMITANDO TAMANHO DE PLAYLIST
	}
	public void adicionarMusicaPlay(Musica musicaPlay) {//METODO CRIADO SÓ PRA TESTE
	
			this.playListUsuario[this.proxima] = musicaPlay;
			this.proxima = this.proxima +1;
		}
	/*public void setPlayListUsuario(ArrayList<Musica> playListUsuario) {
		this.playListUsuario = playListUsuario;
	}*/
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
	public Musica[] getPlayListUsuario() {
		return playListUsuario;
	}
	public void setPlayListUsuario(Musica[] playListUsuario) {
		this.playListUsuario = playListUsuario;
	}
	@Override
	public String toString() {
		return "Usuario [nomeUsuario=" + nomeUsuario + ", playListUsuario=" + Arrays.toString(playListUsuario);
	}
	

}
