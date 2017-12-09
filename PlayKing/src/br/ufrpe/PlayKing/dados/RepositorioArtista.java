package br.ufrpe.PlayKing.dados;

import java.util.ArrayList;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.negocio.Fachada;

public class RepositorioArtista  {

	private static RepositorioArtista instance;
	private ArrayList<Artista> artistas;
	private ArrayList<Musica> musicasArtista;
	


	public static RepositorioArtista getInstance() {
		if(instance == null) {
			instance = new RepositorioArtista();
		}return instance;
	}

	private RepositorioArtista() {
		this.artistas = new ArrayList<>();
		this.musicasArtista = new ArrayList<>();
	}

	public void adicionarArtista(Artista artista) {
		this.artistas.add(artista);
	}
	public void removerArtista(Artista artista) {
		for (int i = 0; i <artistas.size(); i++) {
			if(this.artistas.contains(artista)) {
				this.artistas.remove(i);
			}
		}
	}
	public List<Artista> listarArtista(){
		
		return artistas;
	}
	public void adicionarMusicaArtista(Artista artista, Musica musica) {
		for (int i = 0; i <artistas.size(); i++) {
			if (this.artistas.get(i).getNomeArtista().equals(artista.getNomeArtista())) {
				this.musicasArtista.add(musica);
			}
			
		}
	}
	public boolean existeArtista(Artista artista) {
		boolean existe = false;
		for (int i = 0; i < artistas.size(); i++) {
			if (artistas.contains(artista)) {
				existe = true;
			}
		}return existe;
	}
	
	//public listarMusicasArtista
	//public listarAlbunsArtista


}
