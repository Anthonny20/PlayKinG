package br.ufrpe.PlayKing.negocio;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.dados.RepositorioAlbum;

public class ControladorAlbum {
	
	private RepositorioAlbum repoAlbum;
	
	public ControladorAlbum(RepositorioAlbum instanciaRepositorio) {
		this.repoAlbum = instanciaRepositorio;
	}
	
	public void adicionarAlbum(Album album) {
			this.repoAlbum.adicionarAlbum(album);
	}
	public void removerAlbum(Album album) {
		this.repoAlbum.removerAlbum(album);
	}
}
