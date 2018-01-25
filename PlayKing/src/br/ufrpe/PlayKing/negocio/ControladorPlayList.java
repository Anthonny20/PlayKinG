package br.ufrpe.PlayKing.negocio;


import java.util.List;

import br.ufrpe.PlayKing.beans.Musica;

import br.ufrpe.PlayKing.beans.PlayList;
import br.ufrpe.PlayKing.dados.IRepositorioGenerico;
import br.ufrpe.PlayKing.dados.RepositorioPlayList;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

public class ControladorPlayList implements IControladorPlayList {

	private RepositorioPlayList repo;
	private IRepositorioGenerico<PlayList> repoPlayList;

	public ControladorPlayList(IRepositorioGenerico<PlayList> instancia) {
		this.repo = RepositorioPlayList.getInstance();
		this.repoPlayList = instancia;
	}

	@Override
	public void removerElemento(PlayList elemento) throws ElementoNaoExisteException {
		try {
			if (elemento != null && this.existeElemento(elemento)) {
				this.repo.removerElemento(elemento);
			}else {
				throw new ElementoNaoExisteException(elemento);
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<PlayList> listarElementos() {

		return repo.listarElementos();
	}

	@Override
	public boolean existeElemento(PlayList elemento) {
		return this.repo.existeElemento(elemento);

	}

	@Override
	public void cadastrarElemento(PlayList elemento) throws ElementoJaExisteException {
		try {
			if (elemento!=null && !this.existeElemento(elemento)) {
				this.repo.cadastrarElemento(elemento);
			}else {
				throw new ElementoJaExisteException(elemento);
			}
		} catch (ElementoJaExisteException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void atualizarElemento(PlayList elemento) throws ElementoNaoExisteException {
		try {
			if (elemento!= null && this.existeElemento(elemento)) {
				this.repo.atualizarElemento(elemento);
			} else {
				throw new ElementoNaoExisteException(elemento);
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}

	}

	public void adicionarMusicaPlayList(PlayList playList, Musica musica)throws ElementoJaExisteException,ElementoNaoExisteException {

		try {
			if (playList!=null && !repo.existeElemento(playList)&& musica!=null&& !playList.getUsuarioMusicasPlayList().contains(musica)) {
				repo.adicionarMusicaPlayList(playList, musica);
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

			if (playList!=null && repo.existeElemento(playList)&& musica!=null&& playList.getUsuarioMusicasPlayList().contains(musica)) {
				repo.removerMusicaPlayList(playList, musica);
			}

			else 
				throw new ElementoNaoExisteException(musica);
		}	catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}

	}
	public List<PlayList> listarTodasPlayLists() {
		return repo.listarElementos();
	}

	public List<Musica> listarTodasMusicasDaPlayList(PlayList playList) {
		return repo.listarTodasMusicasDaPlayList(playList);
	}



}
