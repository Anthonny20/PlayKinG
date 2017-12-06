package br.ufrpe.PlayKing.negocio;
//TODO CRIAR REGRAS DE NEGOCIO
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.dados.RepositorioAlbum;

public class ControladorAlbum {

	private RepositorioAlbum repoAlbum;

	public ControladorAlbum() {
		this.repoAlbum = RepositorioAlbum.getInstance();
	}

	public void adicionarAlbum(Album album) {
		this.repoAlbum.adicionarAlbum(album);
	}
	public void removerAlbum(Album album) {
		this.repoAlbum.removerAlbum(album);
	}

	public List<Album> listarAlbuns() {
		return repoAlbum.listarAlbuns();
	}

	public void atualizarAlbum(Album album) {
		repoAlbum.atualizarAlbum(album);
	}

	public void adicionarMusicaAlbum(Album album, Musica musica) {
		repoAlbum.adicionarMusicaAlbum(album, musica);
	}
	
	
}
