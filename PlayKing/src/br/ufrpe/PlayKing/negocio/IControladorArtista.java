package br.ufrpe.PlayKing.negocio;

import java.util.List;


import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

public interface IControladorArtista {

	void removerElemento(Artista elemento) throws ElementoNaoExisteException;

	void cadastrarElemento(Artista elemento) throws ElementoJaExisteException;

	List<Artista> listarElemento();

	void atualizarElemento(Artista elemento) throws ElementoNaoExisteException;

	boolean existeElemento(Artista elemento);

}
