package br.ufrpe.PlayKing.negocio;

import java.util.ArrayList;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.dados.IRepositorioGenerico;
import br.ufrpe.PlayKing.dados.RepositorioAlbum;
import br.ufrpe.PlayKing.exception.AlbumJaCadastradoException;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;
import br.ufrpe.PlayKing.exception.UsuarioJaCadastradoException;

public class ControladorAlbum {

	
	private IRepositorioGenerico<Album> repositorio;
	private RepositorioAlbum<Album> repoAlbum;

	public ControladorAlbum(IRepositorioGenerico<Album> instancia) {


		this.repositorio = instancia;
		this.repoAlbum = RepositorioAlbum.getInstance();
	}

	public void removerElemento(Album elemento)throws ElementoNaoExisteException{
		try {
			if(elemento !=null && this.repositorio.existeElemento(elemento)) {

				this.repositorio.removerElemento(elemento);
				this.repositorio.salvarArquivo();

			}else {
				throw new ElementoNaoExisteException(elemento);
			}

		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}


	}



	


	public void cadastrarElemento(Album elemento)throws ElementoJaExisteException,AlbumJaCadastradoException{
		
			if (elemento==null) {
				throw new IllegalArgumentException("Arguemto inválido");
				
			}
			else if (!this.repositorio.existeElemento(elemento)) {

				this.repositorio.cadastrarElemento(elemento);
				this.repositorio.salvarArquivo();

			}else {
				throw new AlbumJaCadastradoException(elemento.getNomeAlbum());
			}
		} 
		


	

	public void atualizarElemento(Album elemento) throws ElementoNaoExisteException{
		try {
			if(elemento !=null && this.repositorio.existeElemento(elemento)) {
				this.repositorio.atualizarElemento(elemento);
				this.repositorio.salvarArquivo();
			}else {
				throw new ElementoNaoExisteException(elemento);
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}


	}

	public List<Album> listarAlbuns() {
		return repositorio.listarElementos();
	}

	public Album buscarElemento(Album elemento) {
		return repositorio.buscarElemento(elemento);
	}

	public boolean existeElemento(Album elemento) {
		return this.repositorio.existeElemento(elemento);
	}



public List<Musica> listarMusicasAlbum(Album album) {
		List<Musica> todasMusicasAlbum = new ArrayList<>();
		if(repositorio != null&& album!= null) 
		{		
			todasMusicasAlbum =repoAlbum.listarMusicasAlbum(album);
		}return todasMusicasAlbum;

	}

	


	}

	
	




