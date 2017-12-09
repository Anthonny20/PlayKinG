package br.ufrpe.PlayKing.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Album {

	private String nomeAlbum;
	private Artista artistaAlbum;
	private ArrayList<Musica> musicasAlbum;
	private double precoAlbum;
	private LocalDateTime dataAlbum;



	public Album(String nomeAlbum, Artista artistaAlbum,LocalDateTime dataAlbum) {

		this.nomeAlbum = nomeAlbum;
		this.artistaAlbum = artistaAlbum;
		this.musicasAlbum = new ArrayList<>();
		this.dataAlbum = dataAlbum;
		this.precoAlbum = 0;
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

	public double getPrecoAlbum() {
		
		double total =0;
		for (int i = 0; i < musicasAlbum.size(); i++) {
			total = total + musicasAlbum.get(i).getPrecoMusica();
			
		}return total;
	}

	
	public ArrayList<Musica> getMusicasAlbum() {
		return musicasAlbum;
	}


	public void setMusicasAlbum(ArrayList<Musica> musicasAlbum) {
		this.musicasAlbum = musicasAlbum;
	}
		public LocalDateTime getDataAlbum() {
		return dataAlbum;
	}
	public void setDataAlbum(LocalDateTime dataAlbum) {
		this.dataAlbum = dataAlbum;
	}


	public void adicionarMusica(Musica musica) {
		this.musicasAlbum.add(musica);
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
		if (musicasAlbum == null) {
			if (other.musicasAlbum != null)
				return false;
		} else if (!musicasAlbum.equals(other.musicasAlbum))
			return false;
		if (nomeAlbum == null) {
			if (other.nomeAlbum != null)
				return false;
		} else if (!nomeAlbum.equals(other.nomeAlbum))
			return false;
		if (Double.doubleToLongBits(precoAlbum) != Double.doubleToLongBits(other.precoAlbum))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Album [nomeAlbum=" + nomeAlbum + ", artistaAlbum=" + artistaAlbum + ", musicasAlbum=" + musicasAlbum
				+ ", precoAlbum=" + precoAlbum + ", dataAlbum=" + dataAlbum + "]";
	}
	



}
