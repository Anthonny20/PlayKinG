package br.ufrpe.PlayKing.negocio;
//TODO CRIAR REGRAS DE NEGOCIO
import java.util.List;

import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.dados.IRepositorioGenerico;
import br.ufrpe.PlayKing.dados.RepositorioMusica;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

public class ControladorMusica implements IControladorMusica {
	
	private IRepositorioGenerico<Musica> repoMusica;
	private RepositorioMusica repo;
	

	public ControladorMusica(IRepositorioGenerico<Musica> instancia) {
		this.repoMusica = instancia;
		this.repo = RepositorioMusica.getInstance();
	}

	@Override
	public void removerElemento(Musica musica) throws ElementoNaoExisteException {
		try {

			if (musica!= null && this.repoMusica.existeElemento(musica)) {
				this.repoMusica.removerElemento(musica);
			}
			else {
				throw new ElementoNaoExisteException(musica);
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}
	}


	public List<Musica> buscarMusica(String nome)throws ElementoNaoExisteException{
		List<Musica> buscaLista = null;
		try {
			if (nome!= null ) {
				buscaLista =  this.repo.buscarNome(nome);
			}

			else {
				throw new ElementoNaoExisteException(nome);
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}
		return buscaLista;
	} 



	public List<Musica> listarTodasMusicas() {
		return repo.listarTodasMusicas();
	}
	@Override
	public List<Musica> listarElemento() {
		return repoMusica.listarElementos();
	}

	@Override
	public void cadastrarElemento (Musica musica) throws ElementoJaExisteException{
		try {
			if (musica!= null && !repoMusica.existeElemento(musica)) {
				this.repoMusica.cadastrarElemento(musica);
				
			}else {
				throw new ElementoJaExisteException(musica);
			}
			}
			catch (ElementoJaExisteException e) {
				e.printStackTrace();
			}
			catch (NullPointerException e) {
					throw new NullPointerException("Argumento inválido");
					
			}


		}
	@Override
	public void atualizarElemento(Musica musica) throws ElementoNaoExisteException{
		try {
			if(musica !=null && this.repoMusica.existeElemento(musica)) {
				this.repoMusica.atualizarElemento(musica);
			}else {
				throw new ElementoNaoExisteException(musica);
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			 throw new NullPointerException("Argumento nulo");
		}

	}
	
	@Override
	public boolean existeElemento(Musica musica) {
		return this.repoMusica.existeElemento(musica);
	}
}
