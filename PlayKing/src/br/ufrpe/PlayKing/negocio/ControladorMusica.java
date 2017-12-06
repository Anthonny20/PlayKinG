package br.ufrpe.PlayKing.negocio;
//TODO CRIAR REGRAS DE NEGOCIO
import java.util.List;

import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.dados.RepositorioMusica;

public class ControladorMusica {

	private RepositorioMusica repoMusica;

	public ControladorMusica() {
		this.repoMusica = RepositorioMusica.getInstance();
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
