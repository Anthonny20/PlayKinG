package br.ufrpe.PlayKing.dados;

import java.util.ArrayList;

import br.ufrpe.PlayKing.beans.Artista;

public class RepositorioArtista  {

	private static RepositorioArtista instance;
	private ArrayList<Artista> artistas;


	public static RepositorioArtista getInstance() {
		if(instance == null) {
			instance = new RepositorioArtista();
		}return instance;
	}

	private RepositorioArtista() {
		this.artistas = new ArrayList<>();
	}

	public void adicionarArtista(Artista artista) {
		this.artistas.add(artista);
	}
	public void removerArtista(Artista artista) {
		for (int i = 0; i <artistas.size(); i++) {
			if(this.artistas.get(i).equals(artista)) {
				this.artistas.remove(i);
			}
		}
	}
	//public listarArtista
	//public listarMusicasArtista
	//public listarAlbunsArtista


}
