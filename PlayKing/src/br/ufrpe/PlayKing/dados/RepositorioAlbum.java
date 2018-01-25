package br.ufrpe.PlayKing.dados;

import java.util.ArrayList;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Musica;

public class RepositorioAlbum extends RepositorioGenerico<Album> {

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

	
	public void adicionarMusicaAlbum(Album album,Musica musica) {
	
			for (int i = 0; i < albuns.size(); i++) {
					if (albuns.get(i).equals(album)) {
						albuns.get(i).adicionarMusica(musica);
					}
					
			}
	}

	public List<Musica> listarMusicasAlbum(Album album){
		List<Musica> musicasDoAlbum = new ArrayList<Musica>();
		for (int i = 0; i < albuns.size(); i++) {
				if (albuns.get(i).equals(album)) {
					musicasDoAlbum.addAll(albuns.get(i).getMusicasAlbum());
				}
		}
		return musicasDoAlbum;
	}

	
}

