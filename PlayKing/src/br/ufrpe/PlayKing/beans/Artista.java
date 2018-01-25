package br.ufrpe.PlayKing.beans;

import java.io.Serializable;

public class Artista implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 691821013640635966L;
	private String nomeArtista;
	private int idadeArtista;


	public Artista(String nomeArtista,int idadeArtista) {	
		this.nomeArtista = nomeArtista;
		this.idadeArtista = idadeArtista;
	} 
	public Artista() {}

	public String getNomeArtista() {
		return nomeArtista;
	}
	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}


	public int getIdadeArtista() {
		return idadeArtista;
	}

	public void setIdadeArtista(int idadeArtista) {
		this.idadeArtista = idadeArtista;
	}

	@Override
	public String toString() {
		return "\nNome do artista : "+this.getNomeArtista()+"\n"+
				"Idade artista : "+this.getIdadeArtista();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artista other = (Artista) obj;
		if (idadeArtista != other.idadeArtista)
			return false;
		if (nomeArtista == null) {
			if (other.nomeArtista != null)
				return false;
		} else if (!nomeArtista.equals(other.nomeArtista))
			return false;
		return true;
	}






}
