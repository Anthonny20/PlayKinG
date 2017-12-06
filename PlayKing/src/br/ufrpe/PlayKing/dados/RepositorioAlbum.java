package br.ufrpe.PlayKing.dados;

import java.util.ArrayList;

import br.ufrpe.PlayKing.beans.Album;

public class RepositorioAlbum  {

	private static RepositorioAlbum instance;
	private ArrayList<Album> albuns;

	public static RepositorioAlbum getInstance() {
		if (instance == null) {
			instance = new RepositorioAlbum();

		}return instance;
	}

	private RepositorioAlbum() {
		this.albuns = new ArrayList<>();
	}

	public void adicionarAlbum(Album album) {
		this.albuns.add(album);
	}
	public void removerAlbum(Album album) {
		for (int i = 0; i < albuns.size(); i++) {
			if (this.albuns.get(i).equals(album)) {
				this.albuns.remove(i);
			}
		}
	}
	//public  listarAlbuns() {}
	//public void atualizarAlbum

}

