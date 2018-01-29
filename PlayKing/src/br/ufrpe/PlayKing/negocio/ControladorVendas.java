package br.ufrpe.PlayKing.negocio;

import java.time.LocalDateTime;
import java.util.List;

import br.ufrpe.PlayKing.beans.Vendas;
import br.ufrpe.PlayKing.dados.IRepositorioGenerico;
import br.ufrpe.PlayKing.dados.RepositorioVendas;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

public class ControladorVendas implements IControladorVendas {

	private IRepositorioGenerico<Vendas> repoVendas;
	private RepositorioVendas repo;


	public ControladorVendas(IRepositorioGenerico<Vendas> instancia) {
		this.repoVendas = instancia;
		this.repo = RepositorioVendas.getInstance();
	}

	@Override
	public void removerElemento(Vendas elemento) throws ElementoNaoExisteException {
		try {

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public List<Vendas> listarElementos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existeElemento(Vendas elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void cadastrarElemento(Vendas elemento) throws ElementoJaExisteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarElemento(Vendas elemento) throws ElementoNaoExisteException {
		// TODO Auto-generated method stub

	}








	public List<Vendas> listarVendas() {
		return repo.listarVendas();
	}

	public List<Vendas> listarVendasPorData(LocalDateTime dataVenda) {
		return repo.listarVendasPorData(dataVenda);
	}



}
