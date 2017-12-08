package br.ufrpe.PlayKing.dados;

import java.util.ArrayList;
import java.util.List;

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
	public void removerArtista(String nomeArtista) {
		for (int i = 0; i <artistas.size(); i++) {
			if(this.artistas.get(i).getNomeArtista().equals(nomeArtista)) {
				this.artistas.remove(i);
			}
		}
	}
	public List<Artista> listarArtista(){
		List <Artista> todosArtistas = new ArrayList();
		
		for (Artista artista : todosArtistas) {
			todosArtistas.addAll(artistas);
		}return todosArtistas;
	}
	//public listarMusicasArtista
	//public listarAlbunsArtista


}
