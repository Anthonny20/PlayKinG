package br.ufrpe.PlayKing.beans;

public class Musica {
	
	private String nomeMusica;
	private String tempoMusica;
	private double precoMusica;
	private Album albumMusica;
	private Artista artistaMusica;
	
	
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
	public double getPrecoMusica() {
		return precoMusica;
	}
	public void setPrecoMusica(double precoMusica) {
		this.precoMusica = precoMusica;
	}
	public Album getAlbumMusica() {
		return albumMusica;
	}
	public void setAlbumMusica(Album albumMusica) {
		this.albumMusica = albumMusica;
	}
	public Artista getArtistaMusica() {
		return artistaMusica;
	}
	public void setArtistaMusica(Artista artistaMusica) {
		this.artistaMusica = artistaMusica;
	}

	
}
