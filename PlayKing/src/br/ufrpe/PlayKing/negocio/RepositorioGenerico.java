package br.ufrpe.PlayKing.negocio;

import java.util.ArrayList;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.beans.Usuario;

public class RepositorioGenerico <T>{
	
	protected ArrayList<T> elementos;
	
	
	public RepositorioGenerico() {
		this.elementos = new ArrayList<>();
	}
	
	public void  cadastrar(T elemento) {
		this.elementos.add(elemento);
	}
	public void remover (T elemento) {
		
	}

}
