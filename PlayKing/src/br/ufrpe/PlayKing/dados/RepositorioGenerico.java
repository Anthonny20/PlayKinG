package br.ufrpe.PlayKing.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Artista;


public abstract class RepositorioGenerico <T> implements IRepositorioGenerico<T>,Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1373934370615586771L;
	protected ArrayList<T> elementos;
	private static RepositorioGenerico<?> instance;
	
	public static RepositorioGenerico<?> getInstance(){
		if (instance == null) {
			instance = lerArquivo();
		}
		return instance;
	}
	
	
	public RepositorioGenerico() {
		this.elementos = new ArrayList<>();
	}
	
	public void  cadastrarElemento(T elemento) {
		this.elementos.add(elemento);
	}
	public List<T> listarElementos(){
		return Collections.unmodifiableList(this.elementos);
	}
	public void removerElemento (T elemento) {
		int index = this.elementos.indexOf(elemento);
		if(index >=0)
		this.elementos.remove(elemento);
	}
	public void atualizarElemento(T elemento) {
		int index = this.elementos.indexOf(elemento);
		if(index >=0)
			this.elementos.set(index, elemento);
	}
	public boolean existeElemento(T elemento) {
		boolean existe = false;
		for (int i = 0; i < elementos.size(); i++) {
			if (elementos.contains(elemento)) {
				existe = true;
			}
		}return existe;
	}
	
	public static RepositorioGenerico<?> lerArquivo(){
		RepositorioGenerico<?> instance = null;
		File in = new File("Genericos.txt");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			
			
			Object o = ois.readObject();
			instance = (RepositorioGenerico<?>) o;
			
		} catch (Exception e) {
				instance = RepositorioGenerico.getInstance();
				
				
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
		File out = new File("Genericos.txt");
		
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
