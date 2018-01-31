package br.ufrpe.PlayKing.negocio;

import java.util.List;

import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.dados.IRepositorioGenerico;
import br.ufrpe.PlayKing.dados.RepositorioArtista;
import br.ufrpe.PlayKing.exception.ArtistaJaCadastradoException;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;
import br.ufrpe.PlayKing.exception.UsuarioJaCadastradoException;

public class ControladorArtista {

	private IRepositorioGenerico<Artista> repositorio;
	private RepositorioArtista<Artista> repoArtista;

	
	public ControladorArtista(IRepositorioGenerico<Artista> instancia) {
		
		this.repositorio = instancia;
		this.repoArtista = RepositorioArtista.getInstance();
	}
	
	
	public void removerElemento(Artista elemento)throws ElementoNaoExisteException{
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


	public List<Artista> listarArtistas() {
		return repositorio.listarElementos();
	}
	



	public void cadastrarElemento(Artista elemento)throws ElementoJaExisteException, ArtistaJaCadastradoException{
		
			if (elemento==null ) {
				throw new IllegalArgumentException("Arguemnto inválido");
				
			}else if(!this.repositorio.existeElemento(elemento)) {

				this.repositorio.cadastrarElemento(elemento);
				this.repositorio.salvarArquivo();

			}else {
				throw new ArtistaJaCadastradoException("Nome de Artista "+elemento.getNomeArtista()+" já cadastrado");
			}
		} 


	
	public void atualizarElemento(Artista elemento) throws ElementoNaoExisteException{
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


	public boolean existeElemento(Artista elemento) {
		return this.repositorio.existeElemento(elemento);
	}

	public void adicionarMusicaArtista(Artista artista, Musica musica) throws ElementoJaExisteException, ElementoNaoExisteException{

		try {

			if (artista!=null&& musica!=null) {
				repoArtista.adicionarMusicaArtista(artista, musica);
				repoArtista.salvarArquivo();
			}else {
				throw new ElementoNaoExisteException(artista);
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}
	}
}
