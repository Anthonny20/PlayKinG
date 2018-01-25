package br.ufrpe.PlayKing.negocio;


import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

public interface IControladorAlbum {


	
	public void removerElemento(Album elemento)throws ElementoNaoExisteException;
	

	public List<Album> listarElemento();
	

	public void cadastrarElemento(Album elemento)throws ElementoJaExisteException;
	

	public void atualizarElemento(Album elemento) throws ElementoNaoExisteException;

	public boolean existeElemento(Album elemento);

	public List<Musica> listarMusicasAlbum(Album album);

	public void adicionarMusicaAlbum(Album album, Musica musica) throws ElementoJaExisteException,ElementoNaoExisteException;
	
}
