package br.ufrpe.PlayKing.negocio;

import java.util.List;

import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.dados.RepositorioMusica;

public class ControladorMusica {

	private RepositorioMusica repoMusica;

	public ControladorMusica() {
		this.repoMusica = RepositorioMusica.getInstance();
	}


	public void removerMusica(Musica musica) {
		if (musica!= null && repoMusica.existeMusica(musica)) {


			this.repoMusica.removerMusica(musica);
		}
	}

	public List<Musica> buscarMusica(String nome) {

		return this.repoMusica.buscarNome(nome);
	} 

	public List<Musica> buscarNome(String nomeMusica) {
		return repoMusica.buscarNome(nomeMusica);
	}

	public List<Musica> listarTodasMusicas() {
		return repoMusica.listarTodasMusicas();
	}


	public void adicionarMusica(Musica musica) {
		if (musica!= null && !repoMusica.existeMusica(musica)) {

		}
		repoMusica.adicionarMusica(musica);
	}


	public boolean existeMusica(Musica musica) {
		return repoMusica.existeMusica(musica);
	}
}
