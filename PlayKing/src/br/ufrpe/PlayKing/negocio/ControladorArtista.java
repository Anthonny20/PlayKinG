package br.ufrpe.PlayKing.negocio;
<<<<<<< HEAD

import java.util.List;

=======
//TODO CRIAR REGRAS DE NEGOCIO
>>>>>>> branch 'master' of https://github.com/Anthonny20/PlayKinG
import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.dados.RepositorioArtista;

public class ControladorArtista {
	
	private RepositorioArtista repoArtista;
	
	public ControladorArtista() {
		this.repoArtista = RepositorioArtista.getInstance();
	}
	
	public void adicionarArtista(Artista artista) {
		if (artista !=null && !repoArtista.existeArtista(artista)) {
			
		
		this.repoArtista.adicionarArtista(artista);
	}}
	
	public void removerArtista(Artista artista) {
		if(artista!=null && repoArtista.existeArtista(artista))
		this.repoArtista.removerArtista(artista);
	}

	public List<Artista> listarArtista() {
		return repoArtista.listarArtista();
	}

	public void adicionarMusicaArtista(Artista artista, Musica musica) {
		if (artista!=null&& musica!=null) {
			
		
		repoArtista.adicionarMusicaArtista(artista, musica);
	}}

	public boolean existeArtista(Artista artista) {
		return repoArtista.existeArtista(artista);
	}

}
