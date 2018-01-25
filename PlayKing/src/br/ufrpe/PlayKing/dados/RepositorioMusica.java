package br.ufrpe.PlayKing.dados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;

public class RepositorioMusica extends RepositorioGenerico<Musica>{

	private static RepositorioMusica instance;
	private ArrayList<Musica> musicas ;


	public static RepositorioMusica getInstance() {
		if (instance == null){
			instance = new RepositorioMusica();
		}
		return instance;
	}
	private RepositorioMusica() {
		this.musicas = new ArrayList<Musica>();
	}
	

	public List<Musica> buscarNome(String nomeMusica){
		List<Musica> buscaMusicas = new ArrayList<Musica>();
		for (int i = 0; i < musicas.size(); i++) {
			if(musicas.get(i).getNomeMusica().equals(nomeMusica)) {
				buscaMusicas.add(musicas.get(i));
			}

		}
		return buscaMusicas;
	}
	public List<Musica> listarTodasMusicas(){
	
		return musicas;		
	}

}









