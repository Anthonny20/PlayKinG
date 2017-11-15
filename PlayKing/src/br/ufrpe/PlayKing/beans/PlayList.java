package br.ufrpe.PlayKing.beans;

import java.util.ArrayList;

public class PlayList {

	private Usuario usuarioPlaylist;
	private ArrayList<Musica> usuarioMusicas;
	
	
	
	public PlayList(Usuario usuarioPlaylist, ArrayList<Musica> usuarioMusicas) {
		super();
		this.usuarioPlaylist = usuarioPlaylist;
		this.usuarioMusicas = usuarioMusicas;
	}
	public Usuario getUsuarioPlaylist() {
		return usuarioPlaylist;
	}
	public void setUsuarioPlaylist(Usuario usuarioPlaylist) {
		this.usuarioPlaylist = usuarioPlaylist;
	}
	public ArrayList<Musica> getUsuarioMusicas() {
		return usuarioMusicas;
	}
	public void setUsuarioMusicas(ArrayList<Musica> usuarioMusicas) {
		this.usuarioMusicas = usuarioMusicas;
	}
	
}
