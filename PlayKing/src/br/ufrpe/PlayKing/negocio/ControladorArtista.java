package br.ufrpe.PlayKing.negocio;


import java.util.List;


import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.dados.IRepositorioGenerico;
import br.ufrpe.PlayKing.dados.RepositorioArtista;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

public class ControladorArtista implements IControladorArtista {

	private IRepositorioGenerico<Artista> repoArtista;
	private RepositorioArtista repo;

	public ControladorArtista(IRepositorioGenerico<Artista> instancia) {

		this.repoArtista = instancia;
		this.repo = RepositorioArtista.getInstance();

	}

	@Override
	public void removerElemento(Artista elemento)throws ElementoNaoExisteException{
		try {
			if(elemento !=null && this.repoArtista.existeElemento(elemento)) {

				this.repoArtista.removerElemento(elemento);

			}else {
				throw new ElementoNaoExisteException(elemento);
			}

		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}


	}

	@Override
	public List<Artista> listarElemento() {
		return repoArtista.listarElementos();
	}
	public List<Artista> listarArtista() {
		return this.repoArtista.listarElementos();
	}


	@Override
	public void cadastrarElemento(Artista elemento)throws ElementoJaExisteException{
		try {
			if (elemento!=null && !this.repoArtista.existeElemento(elemento)) {

				this.repoArtista.cadastrarElemento(elemento);

			}else {
				throw new ElementoJaExisteException(elemento);
			}
		} catch (ElementoJaExisteException e) {
			e.printStackTrace();
		}


	}

	@Override
	public void atualizarElemento(Artista elemento) throws ElementoNaoExisteException{
		try {
			if(elemento !=null && this.repoArtista.existeElemento(elemento)) {
				this.repoArtista.atualizarElemento(elemento);
			}else {
				throw new ElementoNaoExisteException(elemento);
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}


	}

	@Override
	public boolean existeElemento(Artista elemento) {
		return this.repoArtista.existeElemento(elemento);
	}

	public void adicionarMusicaArtista(Artista artista, Musica musica) throws ElementoJaExisteException, ElementoNaoExisteException{

		try {

			if (artista!=null&& musica!=null) {
				repo.adicionarMusicaArtista(artista, musica);
			}else {
				throw new ElementoNaoExisteException(artista);
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}
	}

}
