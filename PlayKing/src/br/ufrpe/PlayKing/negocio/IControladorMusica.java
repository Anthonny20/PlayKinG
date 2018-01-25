package br.ufrpe.PlayKing.negocio;

import java.util.List;

import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

public interface IControladorMusica {

	void removerElemento(Musica musica) throws ElementoNaoExisteException;

	void cadastrarElemento(Musica musica) throws ElementoJaExisteException;

	void atualizarElemento(Musica musica) throws ElementoNaoExisteException;

	boolean existeElemento(Musica musica);

	List<Musica> listarElemento();

}
