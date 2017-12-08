package br.ufrpe.PlayKing.negocio;

import java.time.LocalDateTime;
import java.util.List;

import br.ufrpe.PlayKing.beans.Vendas;
import br.ufrpe.PlayKing.dados.RepositorioVendas;

public class ControladorVendas {
	
	private RepositorioVendas repoVendas;

	public List<Vendas> listarVendas() {
		return repoVendas.listarVendas();
	}

	public List<Vendas> listarVendasPorData(LocalDateTime dataVenda) {
		return repoVendas.listarVendasPorData(dataVenda);
	}
	
	
 
}
