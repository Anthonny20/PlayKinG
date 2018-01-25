package br.ufrpe.PlayKing.dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.ufrpe.PlayKing.beans.Artista;


public abstract class RepositorioGenerico <T> implements IRepositorioGenerico<T>{
	
	protected ArrayList<T> elementos;
	
	
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

}
