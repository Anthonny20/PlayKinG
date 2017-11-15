package br.ufrpe.PlayKing.beans;

public class Artista {
	
	private String nomeArtista;
	private Album albunsArtista;
	private Musica musicasArtista;
	
	public Artista() {}
	public Artista(String nomeArtista) {
		super();
		this.nomeArtista = nomeArtista;
		
		
	}
	public String getNomeArtista() {
		return nomeArtista;
	}
	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}
	public Album getAlbunsArtista() {
		return albunsArtista;
	}
	public void setAlbunsArtista(Album albunsArtista) {
		this.albunsArtista = albunsArtista;
	}
	public Musica getMusicasArtista() {
		return musicasArtista;
	}
	public void setMusicasArtista(Musica musicasArtista) {
		this.musicasArtista = musicasArtista;
	}
	
	
	

}
