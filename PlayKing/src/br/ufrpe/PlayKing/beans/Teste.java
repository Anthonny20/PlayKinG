package br.ufrpe.PlayKing.beans;


import java.time.LocalDateTime;

import br.ufrpe.PlayKing.dados.RepositorioAlbum;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.negocio.Fachada;
import br.ufrpe.PlayKing.negocio.IFachada;

public class Teste {
	

	public static void main(String []args) throws ElementoJaExisteException {
		IFachada fachada = Fachada.getInstance();
		
		
		RepositorioAlbum repo = RepositorioAlbum.getInstance();
		Artista a1 = new Artista("an", 10);
		
		fachada.cadastrarElemento(a1);	
			repo.listarElementos();
			
			
			
			

	
		
}}
