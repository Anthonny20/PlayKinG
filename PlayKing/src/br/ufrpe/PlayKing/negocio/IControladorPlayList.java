package br.ufrpe.PlayKing.negocio;

import java.util.List;

import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.beans.PlayList;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

public interface IControladorPlayList {

	void removerElemento(PlayList elemento) throws ElementoNaoExisteException;

	List<PlayList> listarElementos();

	boolean existeElemento(PlayList elemento);

	void cadastrarElemento(PlayList elemento) throws ElementoJaExisteException;

	void atualizarElemento(PlayList elemento) throws ElementoNaoExisteException;
	

	

	public void adicionarMusicaPlayList(PlayList playList, Musica musica)throws ElementoJaExisteException,ElementoNaoExisteException;

	public void removerMusicaPlayList(PlayList playList, Musica musica)throws ElementoNaoExisteException;
	public List<PlayList> listarTodasPlayLists();

	public List<Musica> listarTodasMusicasDaPlayList(PlayList playList);


}