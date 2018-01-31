package br.ufrpe.PlayKing.beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Album implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6130573867205424765L;
	private String nomeAlbum;
	private Artista artistaAlbum;
	private ArrayList<Musica> musicasAlbum;

	private LocalDate dataAlbum;



	public Album(String nomeAlbum, Artista artistaAlbum,LocalDate dataAlbum) {

		this.nomeAlbum = nomeAlbum;
		this.artistaAlbum = artistaAlbum;
		this.musicasAlbum = new ArrayList<>();
		this.dataAlbum = dataAlbum;
	
	}
	public Album() {}
	
	
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
		public LocalDate getDataAlbum() {
		return dataAlbum;
	}
	public void setDataAlbum(LocalDate dataAlbum) {
		this.dataAlbum = dataAlbum;
	}


	public void adicionarMusica(Musica musica) {
		this.musicasAlbum.add(musica);
	}


	


	@Override
	public boolean equals(Object obj) {
	boolean resultado = false;
	if(obj instanceof Album && ((Album)obj).getArtistaAlbum().equals(artistaAlbum)&& ((Album)obj).getNomeAlbum().equals(nomeAlbum)) {
		resultado = true;
	}
	return resultado;
	}
	@Override
	public String toString() {
		return 
				 "Nome : "+this.getNomeAlbum()+
				"\nData : "+this.getDataAlbum()+
				"\nArtista : "+this.getArtistaAlbum();
	}
	



}
