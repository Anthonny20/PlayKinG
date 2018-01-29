package br.ufrpe.PlayKing.negocio;

import java.util.List;

import br.ufrpe.PlayKing.beans.Vendas;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

public interface IControladorVendas {

	void removerElemento(Vendas elemento) throws ElementoNaoExisteException;

	List<Vendas> listarElementos();

	boolean existeElemento(Vendas elemento);

	void cadastrarElemento(Vendas elemento) throws ElementoJaExisteException;

	void atualizarElemento(Vendas elemento) throws ElementoNaoExisteException;

}
