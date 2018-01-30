package br.ufrpe.PlayKing.dados;

import java.util.List;

import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

public interface IRepositorioGenerico<T> {
	
	void cadastrarElemento(T elemento)throws ElementoJaExisteException;
	List<T> listarElementos();
	void atualizarElemento(T elemento)throws ElementoNaoExisteException;
	void removerElemento(T elemento) throws ElementoNaoExisteException;
	boolean existeElemento(T elemento);

}
