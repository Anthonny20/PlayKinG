package br.ufrpe.PlayKing.negocio;

import java.util.ArrayList;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;

public class RepositorioMusica extends RepositorioGenerico<Musica>{

	private static RepositorioMusica instance;
	private ArrayList<Musica> musicas ;
	
	private RepositorioMusica() {
		this.musicas = new ArrayList<>();
	}
	public static synchronized RepositorioMusica getInstance() {
		if (instance == null){
			instance = new RepositorioMusica();
		}
		return instance;
			
		
	}
	
	public void adicionarMusica(Musica musica,Artista artista) {
		if (musica!= null && musicas.contains(musica)==false) {
			musicas.add(musica);
			}
	}
	public void remover
	
	
	
		
	
}
	


