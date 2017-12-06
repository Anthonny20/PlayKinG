package br.ufrpe.PlayKing.negocio;

import java.util.List;

import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.dados.RepositorioMusica;

public class ControladorMusica {

	private RepositorioMusica repoMusica;

	public ControladorMusica(RepositorioMusica instanciaRepositorio) {
		this.repoMusica = instanciaRepositorio;
	}
	
	public void adicionarMusica(Musica musica) {
		this.repoMusica.adicionarMusica(musica);
	}
	
	public void removerMusica(Musica musica) {
		this.repoMusica.removerMusica(musica);
	}
	
	public List<Musica> buscarMusica(String nome) {
		return this.repoMusica.buscarNome(nome);
	}
}