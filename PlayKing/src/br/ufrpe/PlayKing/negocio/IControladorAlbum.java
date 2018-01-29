package br.ufrpe.PlayKing.negocio;


import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;
import br.ufrpe.PlayKing.exception.UsuarioJaCadastradoException;

public interface IControladorAlbum {



	void removerElemento(Album elemento)throws ElementoNaoExisteException;


	List<Album> listarElemento();


	void cadastrarElemento(Album elemento)throws ElementoJaExisteException;


	void atualizarElemento(Album elemento) throws ElementoNaoExisteException;

	boolean existeElemento(Album elemento);

	List<Musica> listarMusicasAlbum(Album album);

	void adicionarMusicaAlbum(Album album, Musica musica) throws ElementoJaExisteException,ElementoNaoExisteException;

}
