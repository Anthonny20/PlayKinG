package br.ufrpe.PlayKing.dados;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.beans.Usuario;
import br.ufrpe.PlayKing.beans.Vendas;


public class RepositorioVendas {
 //TODO IMPLEMENTAR
	private static RepositorioVendas instance;
	private ArrayList<Vendas> vendas;

	public static RepositorioVendas getInstance() {
		if (instance == null) {
			instance = new RepositorioVendas();

		}return instance;
	}

	private RepositorioVendas() {
		this.vendas = new ArrayList<>();
	}
	
	public List<Vendas> listarVendas(){
		List <Vendas> todasVendas = new ArrayList<>();
		todasVendas.addAll(vendas);
		return todasVendas;
	}
	public List<Vendas> listarVendasPorData(LocalDateTime dataVenda){
		List<Vendas> dataDeterminadaVendas = new ArrayList<>();
		
		for (int i = 0; i < vendas.size(); i++) {
			if (vendas.get(i).getDataVenda().isEqual(dataVenda)) {
					dataDeterminadaVendas.add(vendas.get(i));
			}
			
		}return dataDeterminadaVendas;
	}
	
	//public void registrarVenda(Usuario usuario,Musica musica) {
		
	
	
	//public void musicaVenda(Usuario usuario, Musica musica) {}
	
//	public void albumVenda(Usuario usuario,Album album) {}
	
	
	
	
}
