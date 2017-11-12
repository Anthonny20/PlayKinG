package br.ufrpe.PlayKing.beans;

import java.util.ArrayList;

public class Album {
	
	private String nomeAlbum;
	private Artista artistaAlbum;
	private ArrayList<Musica> musicasAlbum;
	
	public String getNomeAlbum() {
		return nomeAlbum;
	}
	public void setNomeAlbum(String nomeAlbum) {
		this.nomeAlbum = nomeAlbum;
	}
	public Artista getArtistaAlbum() {
		return artistaAlbum;
	}
	public void setArtistaAlbum(Artista artistaAlbum) {
		this.artistaAlbum = artistaAlbum;
	}
	public ArrayList<Musica> getMusicasAlbum() {
		return musicasAlbum;
	}
	public void setMusicasAlbum(ArrayList<Musica> musicasAlbum) {
		this.musicasAlbum = musicasAlbum;
	}
	

}
