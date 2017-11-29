package br.ufrpe.PlayKing.beans;

import java.util.ArrayList;
import java.util.Arrays;

public class Album {
	
	private String nomeAlbum;
	private Artista artistaAlbum;
	private Musica[] musicasAlbum;
	private double precoAlbum;
	int proxima = 0;//TESTE
	//private String historicoAlbuns;//Mostrará quais usuarios compraram o album
	//private int albunsVendidos;//
	// double ganhosAlbum;//UMA CERTA PORCENTAGEM DO LUCRO DA VENDA DOS ALBUNS IRÁ PARA O SETOR DE VENDAS E OUTRA PARTE FICARÁ PARA O ARTISTA.
	
	public Album(String nomeAlbum, Artista artistaAlbum,int tamanho) {
		
		this.nomeAlbum = nomeAlbum;
		this.artistaAlbum = artistaAlbum;
		this.musicasAlbum = new Musica[tamanho];//TESTE
		}
	
	public void adicionarMusica(Musica musica) {//METODO CRIADO PRA TESTE
		this.musicasAlbum[proxima] = musica;
		this.proxima = this.proxima+1;	
		}

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

	public Musica[] getMusicasAlbum() {
		return musicasAlbum;
	}

	public void setMusicasAlbum(Musica[] musicasAlbum) {
		this.musicasAlbum = musicasAlbum;
	}

	public double getPrecoAlbum() {
		return precoAlbum;
	}

	public void setPrecoAlbum(double precoAlbum) {
		this.precoAlbum = precoAlbum;
	}

	@Override
	public String toString() {
		return "Nome do Album: "+this.getNomeAlbum()+"\nNome do artista:"+this.artistaAlbum.getNomeArtista()+"\nMusicas do album"+ Arrays.toString(musicasAlbum);
		
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Album other = (Album) obj;
		if (artistaAlbum == null) {
			if (other.artistaAlbum != null)
				return false;
		} else if (!artistaAlbum.equals(other.artistaAlbum))
			return false;
		if (!Arrays.equals(musicasAlbum, other.musicasAlbum))
			return false;
		if (nomeAlbum == null) {
			if (other.nomeAlbum != null)
				return false;
		} else if (!nomeAlbum.equals(other.nomeAlbum))
			return false;
		if (Double.doubleToLongBits(precoAlbum) != Double.doubleToLongBits(other.precoAlbum))
			return false;
		if (proxima != other.proxima)
			return false;
		return true;
	}
	

}
