package br.ufrpe.PlayKing.negocio;

import java.util.ArrayList;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

public interface IFachada {


	public void removerElemento(Album elemento)throws ElementoNaoExisteException;

	public void cadastrarElemento(Album elemento)throws ElementoJaExisteException;

	public void atualizarElemento(Album elemento) throws ElementoNaoExisteException;
	
	public boolean existeElemento(Album elemento);
	
	public List<Album> listarAlbum();
	
	public List<Musica> listarMusicasAlbum(Album album);

	public void adicionarMusicaAlbum(Album album, Musica musica) throws ElementoJaExisteException,ElementoNaoExisteException;


	
		
	

	public void removerElemento(Artista elemento)throws ElementoNaoExisteException;

	public void cadastrarElemento(Artista elemento)throws ElementoJaExisteException;

	public void atualizarElemento(Artista elemento) throws ElementoNaoExisteException;

	public boolean existeElemento(Artista elemento);
	
	public List<Artista> listarArtista();
	
	public void adicionarMusicaArtista(Artista artista, Musica musica) throws ElementoJaExisteException, ElementoNaoExisteException;
	
	
	
	public void removerElemento(Musica musica) throws ElementoNaoExisteException;

	public 	void cadastrarElemento(Musica musica) throws ElementoJaExisteException;

	public 	void atualizarElemento(Musica musica) throws ElementoNaoExisteException;

	public 	boolean existeElemento(Musica musica);

	public 	List<Musica> listarElemento();


	

}
