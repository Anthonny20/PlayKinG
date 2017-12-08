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
	public void removerAlbum(String nomeAlbum) {
		for (int i = 0; i < albuns.size(); i++) {
			if (this.albuns.get(i).getNomeAlbum().equals(nomeAlbum)) {
				this.albuns.remove(i);
			}
		}
	}
	
	public List<Album>  listarAlbuns() {
		List todosAlbuns = new ArrayList<>();
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
	
			for (int i = 0; i < albuns.size(); i++) {
					if (albuns.get(i).equals(album)) {
						albuns.get(i).adicionarMusica(musica);
					}
					
			}
	}
	
	public boolean existeAlbum(Album album) {
		boolean existe = false;
		for (int i = 0; i < albuns.size(); i++) {
			if (albuns.get(i).equals(album)) {
				existe = true;
			}
		}return existe;
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

