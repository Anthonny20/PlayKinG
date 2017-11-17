package br.ufrpe.PlayKing.beans;

public class Artista {
	
	private String nomeArtista;
	private Album albunsArtista;
	private Musica musicasArtista;
	private String artistaVendas;//MOSTRARA AS VENDAS DO ARTISTA SENDO O ALBÚM COMPLETO OU SÓ UMA MÚSICA
	private double ganhosArtista;//
	
	public Artista(String nomeArtista) {	
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
	public Musica getMusicasArtista() {
		return musicasArtista;
	}
	public void setMusicasArtista(Musica musicasArtista) {
		this.musicasArtista = musicasArtista;
	}
	
	public void setAlbunsArtista(Album albunsArtista) {
		this.albunsArtista = albunsArtista;
	}

	@Override
	public String toString() {
		return "Nome do artista:\n"+this.nomeArtista;
	}
	
	
	

}
