package br.ufrpe.PlayKing.negocio;

import java.util.ArrayList;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.dados.IRepositorioGenerico;
import br.ufrpe.PlayKing.dados.RepositorioAlbum;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

public class ControladorAlbum implements IControladorAlbum {

	private IRepositorioGenerico<Album> repoAlbum;
	private RepositorioAlbum repo;

	public ControladorAlbum(IRepositorioGenerico<Album> instancia) {

		this.repoAlbum = instancia; 
		this.repo = RepositorioAlbum.getInstance();
		
	}

	@Override
	public void removerElemento(Album elemento)throws ElementoNaoExisteException{
		try {
			if(elemento !=null && this.repoAlbum.existeElemento(elemento)) {

				this.repoAlbum.removerElemento(elemento);

			}else {
				throw new ElementoNaoExisteException(elemento);
			}

		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}


	}

	@Override
	public List<Album> listarElemento() {
		return this.repoAlbum.listarElementos();
	}

	public List<Album> listarAlbum(){
		return this.repoAlbum.listarElementos();
	}

	@Override
	public void cadastrarElemento(Album elemento)throws ElementoJaExisteException{
		try {
			if (elemento!=null && !this.repoAlbum.existeElemento(elemento)) {

				this.repoAlbum.cadastrarElemento(elemento);

			}else {
				throw new ElementoJaExisteException(elemento);
			}
		} catch (ElementoJaExisteException e) {
			e.printStackTrace();
		}


	}

	@Override
	public void atualizarElemento(Album elemento) throws ElementoNaoExisteException{
		try {
			if(elemento !=null && this.repoAlbum.existeElemento(elemento)) {
				this.repoAlbum.atualizarElemento(elemento);
			}else {
				throw new ElementoNaoExisteException(elemento);
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}


	}

	@Override
	public boolean existeElemento(Album elemento) {
		return this.repoAlbum.existeElemento(elemento);
	}



public List<Musica> listarMusicasAlbum(Album album) {
		List<Musica> todasMusicasAlbum = new ArrayList<>();
		if(repo != null&& album!= null) 
		{		
			todasMusicasAlbum =repo.listarMusicasAlbum(album);
		}return todasMusicasAlbum;

	}

	public void adicionarMusicaAlbum(Album album, Musica musica) throws ElementoJaExisteException,ElementoNaoExisteException {
		
		try {
			if (this.repo.existeElemento(album) && musica!=null) {

				repo.adicionarMusicaAlbum(album, musica);

			}
			else {
				throw new ElementoNaoExisteException(album);
				
			}
		} catch (ElementoNaoExisteException e) {
				e.printStackTrace();
		}


	}
	}




