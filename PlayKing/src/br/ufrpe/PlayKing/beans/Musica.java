package br.ufrpe.PlayKing.beans;

import java.io.File;
import java.io.Serializable;

import javafx.stage.FileChooser;

public class Musica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8787985677751117131L;
	private String nomeMusica;
	private String tempoMusica;
	private Album albumMusica;

	private File musicFile;
	


	public Musica(String nomeMusica, String tempoMusica,Album albumMusica,File musicFile) {
		super();
		this.nomeMusica = nomeMusica;
		this.tempoMusica = tempoMusica;
		this.albumMusica = albumMusica;
		
		this.musicFile = musicFile;
	}
	public Musica() {}
	public String getNomeMusica() {
		return nomeMusica;
	}
	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}
	public String getTempoMusica() {
		return tempoMusica;
	}
	public void setTempoMusica(String tempoMusica) {
		this.tempoMusica = tempoMusica;
	}


	
	

	public Album getAlbumMusica() {
		return albumMusica;
	}
	public void setAlbumMusica(Album albumMusica) {
		this.albumMusica = albumMusica;
	}
	public File getMusicFile() {
		return musicFile;
	}
	public void setMusicFile(File musicFile) {
		this.musicFile = musicFile;
	}
	
	@Override
	public String toString() {
		
		
		return "Nome da Música : "+this.getNomeMusica()+
			   "/Duração da Música : "+this.getTempoMusica()+
			   "/Album: "+this.getAlbumMusica();
			   

	}
	

	public boolean equals(Object obj) {
		boolean resultado = false;
				if (obj instanceof Musica && ((Musica)obj).getNomeMusica().equals(nomeMusica)) {
					resultado = true;
					
				}return resultado;
	}
	
}
