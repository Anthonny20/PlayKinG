package br.ufrpe.PlayKing.negocio;

import java.util.List;

import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.dados.RepositorioArtista;

public class ControladorArtista {
	
	private RepositorioArtista repoArtista;
	
	public ControladorArtista() {
		this.repoArtista = RepositorioArtista.getInstance();
	}
	
	public void adicionarArtista(Artista artista) {
		this.repoArtista.adicionarArtista(artista);
	}
	
	public void removerArtista(String nomeArtista) {
		this.repoArtista.removerArtista(nomeArtista);
	}

	public List<Artista> listarArtista() {
		return repoArtista.listarArtista();
	}

}
