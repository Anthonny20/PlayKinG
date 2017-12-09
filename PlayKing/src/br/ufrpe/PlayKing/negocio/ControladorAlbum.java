package br.ufrpe.PlayKing.negocio;

import java.util.ArrayList;

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
		if(album!= null && !this.existeAlbum(album)) {
			this.repoAlbum.adicionarAlbum(album);
			System.out.println("\nAlbum adicionado\n");
		}
		else {
			System.out.println("\nAlbum já existente ou nulo\n");
		}
	}
	public void removerAlbum(Album album) {
		if (album!=null &&this.existeAlbum(album) ) {
			this.repoAlbum.removerAlbum(album);
			System.out.println("\n Album removido com sucesso!");
		}
		else {
			System.out.println("\n Album nulo ou não pertence a lista de album cadastrados\n");
		}
	}

	public List<Musica> listarMusicasAlbum(Album album) {
		List<Musica> todasMusicasAlbum = new ArrayList<>();
		if(repoAlbum != null&& album!= null) 
		{		
			todasMusicasAlbum =repoAlbum.listarMusicasAlbum(album);
		}return todasMusicasAlbum;

	}


	public List<Album> listarAlbuns() {

		return repoAlbum.listarAlbuns();
	}

	public void atualizarAlbum(Album album) {
		if(album!= null && this.existeAlbum(album)) {
			repoAlbum.atualizarAlbum(album);
			System.out.println("\nAlbum atualizado com sucesso.\n");
		}
		else {
			System.out.println("\nAlbum não cadastrado.\n");
		}
	}

	public void adicionarMusicaAlbum(Album album, Musica musica) {
		if (repoAlbum.existeAlbum(album) && musica!=null) {

			repoAlbum.adicionarMusicaAlbum(album, musica);
			System.out.println("Album musica adicionada a album com sucesso\n");
		}

	}

	public boolean existeAlbum(Album album) {

		return repoAlbum.existeAlbum(album);
	}


}
