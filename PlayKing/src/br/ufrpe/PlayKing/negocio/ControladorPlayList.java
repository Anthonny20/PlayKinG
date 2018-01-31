package br.ufrpe.PlayKing.negocio;


import java.util.List;

import br.ufrpe.PlayKing.beans.Musica;

import br.ufrpe.PlayKing.beans.PlayList;
import br.ufrpe.PlayKing.dados.IRepositorioGenerico;
import br.ufrpe.PlayKing.dados.RepositorioPlayList;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

public class ControladorPlayList  {
	
	private IRepositorioGenerico<PlayList> repositorio;
	private RepositorioPlayList<PlayList> repoPlayList;
	

	public ControladorPlayList(IRepositorioGenerico<PlayList> instancia) {
		this.repositorio = instancia;
		this.repoPlayList = RepositorioPlayList.getInstance();
	}

	
	public void removerElemento(PlayList elemento) throws ElementoNaoExisteException {
		try {
			if (elemento != null && this.existeElemento(elemento)) {
				this.repositorio.removerElemento(elemento);
				this.repositorio.salvarArquivo();
			}else {
				throw new ElementoNaoExisteException(elemento);
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}

	}


	public List<PlayList> listarPlayLists() {

		return repositorio.listarElementos();
	}

	
	public boolean existeElemento(PlayList elemento) {
		return this.repositorio.existeElemento(elemento);

	}


	public void cadastrarElemento(PlayList elemento) throws ElementoJaExisteException {
		try {
			if (elemento!=null && !this.existeElemento(elemento)) {
				this.repositorio.cadastrarElemento(elemento);
				this.repositorio.salvarArquivo();
			}else {
				throw new ElementoJaExisteException(elemento);
			}
		} catch (ElementoJaExisteException e) {
			e.printStackTrace();
		}

	}


	public void atualizarElemento(PlayList elemento) throws ElementoNaoExisteException {
		try {
			if (elemento!= null && this.existeElemento(elemento)) {
				this.repositorio.atualizarElemento(elemento);
				this.repositorio.salvarArquivo();
			} else {
				throw new ElementoNaoExisteException(elemento);
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}

	}

	public void adicionarMusicaPlayList(PlayList playList, Musica musica)throws ElementoJaExisteException,ElementoNaoExisteException {

		try {
			if (playList!=null && !this.repoPlayList.existeElemento(playList)&& musica!=null&& !playList.getUsuarioMusicasPlayList().contains(musica)) {
				this.repoPlayList.adicionarMusicaPlayList(playList, musica);
				this.repoPlayList.salvarArquivo();
			}
			else 
				throw new ElementoJaExisteException(musica);

		}catch (ElementoJaExisteException e) {
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			throw new NullPointerException("Argumneto inválido");
		}
	}

	public void removerMusicaPlayList(PlayList playList, Musica musica)throws ElementoNaoExisteException {
		try {

			if (playList!=null && this.repoPlayList.existeElemento(playList)&& musica!=null&& playList.getUsuarioMusicasPlayList().contains(musica)) {
				this.repoPlayList.removerMusicaPlayList(playList, musica);
				this.repoPlayList.salvarArquivo();
			}

			else 
				throw new ElementoNaoExisteException(musica);
		}	catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}

	}
	

	public List<Musica> listarTodasMusicasDaPlayList(PlayList playList) {
		return repoPlayList.listarTodasMusicasDaPlayList(playList);
	}



}
