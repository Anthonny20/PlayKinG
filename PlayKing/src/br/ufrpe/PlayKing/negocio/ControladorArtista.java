package br.ufrpe.PlayKing.negocio;

import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.dados.RepositorioArtista;

public class ControladorArtista {
	
	private RepositorioArtista repoArtista;
	
	public ControladorArtista(RepositorioArtista instanciaRepositorio) {
		this.repoArtista = instanciaRepositorio;
	}
	
	public void adicionarArtista(Artista artista) {
		this.repoArtista.adicionarArtista(artista);
	}
	
	public void removerArtista(Artista artista) {
		this.repoArtista.removerArtista(artista);
	}

}
