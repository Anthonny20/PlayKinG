package br.ufrpe.PlayKing.negocio;

import java.time.LocalDateTime;
import java.util.List;

import br.ufrpe.PlayKing.beans.Vendas;
import br.ufrpe.PlayKing.dados.IRepositorioGenerico;
import br.ufrpe.PlayKing.dados.RepositorioVendas;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

public class ControladorVendas  {

	private IRepositorioGenerico<Vendas> repositorio;
	private RepositorioVendas<Vendas> repoVendas;


	public ControladorVendas(IRepositorioGenerico<Vendas> instancia) {
		this.repositorio = instancia;
		this.repoVendas = RepositorioVendas.getInstance();
	}

	
	



}
