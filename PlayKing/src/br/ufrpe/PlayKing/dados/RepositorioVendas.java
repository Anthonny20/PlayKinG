package br.ufrpe.PlayKing.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.beans.Usuario;
import br.ufrpe.PlayKing.beans.Vendas;


public class RepositorioVendas<T> extends RepositorioGenerico<Vendas>{
 /**
	 * 
	 */
	private static final long serialVersionUID = 6648862637612711057L;
//TODO IMPLEMENTAR
	private static RepositorioVendas<Vendas> instance;
	private ArrayList<Vendas> vendas;
	

	public static RepositorioVendas<Vendas> getInstance() {
		if (instance == null) {
			instance = new RepositorioVendas<Vendas>();

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
	
	/*public void registrarVenda(Usuario usuario,Musica musica) {
		for (int i = 0; i < usuarios.size(); i++) {
			
		}*/
	
		
	
	
	//public void musicaVenda(Usuario usuario, Musica musica) {}
	
//	public void albumVenda(Usuario usuario,Album album) {}
	
	
public static RepositorioVendas<Vendas> lerArquivo(){
	RepositorioVendas<Vendas> instance = null;
	File in = new File("Vendas.txt");
	FileInputStream fis = null;
	ObjectInputStream ois = null;
	
	try {
		fis = new FileInputStream(in);
		ois = new ObjectInputStream(fis);
		
		
		Object o = ois.readObject();
		instance = (RepositorioVendas<Vendas>) o;
		
	} catch (Exception e) {
			instance = new RepositorioVendas<Vendas>();
			
	}finally {
		if (ois!=null) {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	return instance;
	
}
public void salvarArquivo(){
	File out = new File("Vendas.txt");
	
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	try {
		fos = new FileOutputStream(out);
		oos = new ObjectOutputStream(fos);
		
		oos.writeObject(instance);
	} catch (Exception e) {
			e.printStackTrace();
	}
	finally {
		if(oos != null) {
			try {
				oos.close();
			} catch (IOException io) {
				io.printStackTrace();
			}
		}
	}
}
}
	

