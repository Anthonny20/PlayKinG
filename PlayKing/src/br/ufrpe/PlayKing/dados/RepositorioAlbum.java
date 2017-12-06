package br.ufrpe.PlayKing.dados;

import java.util.ArrayList;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Musica;

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
	
	public List<Album>  listarAlbuns() {
		List <Album>todosAlbuns = new ArrayList<>();
		for (int i = 0; i < albuns.size(); i++) {
			 	todosAlbuns.addAll(albuns);
		}
		return todosAlbuns;
	}
	public void atualizarAlbum (Album album) {
		if(album != null && albuns.contains(album)) {
			for (int i = 0; i < albuns.size(); i++) {
				if(albuns.get(i).equals(album)) {
					albuns.set(i, album);
				}
			}
		}
	}
	public void adicionarMusicaAlbum(Album album,Musica musica) {
		if(album !=null && musica!= null && !this.albuns.contains(musica) ) {
			for (int i = 0; i < albuns.size(); i++) {
					if (albuns.get(i).equals(album)) {
						albuns.get(i).adicionarMusica(musica);
					}
					
			}
		}
	}
	
}

