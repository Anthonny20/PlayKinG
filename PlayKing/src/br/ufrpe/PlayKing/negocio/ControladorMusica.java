package br.ufrpe.PlayKing.negocio;

import java.util.List;

import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.dados.IRepositorioGenerico;
import br.ufrpe.PlayKing.dados.RepositorioMusica;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

public class ControladorMusica {
	
	private IRepositorioGenerico<Musica> repositorio;
	private RepositorioMusica<Musica> repoMusica;
	

	public ControladorMusica(IRepositorioGenerico<Musica> instancia) {
		this.repositorio = instancia;
		this.repoMusica = RepositorioMusica.getInstance();
	}

	
	public void removerElemento(Musica musica) throws ElementoNaoExisteException {
		try {

			if (musica!= null && this.repositorio.existeElemento(musica)) {
				this.repositorio.removerElemento(musica);
				this.repositorio.salvarArquivo();
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
				buscaLista =  this.repoMusica.buscarNome(nome);
			}

			else {
				throw new ElementoNaoExisteException(nome);
			}
		} catch (ElementoNaoExisteException e) {
			e.printStackTrace();
		}
		return buscaLista;
	} 



	
	
	public List<Musica> listarMusicas() {
		return repositorio.listarElementos();
	}

	
	public void cadastrarElemento (Musica musica) throws ElementoJaExisteException{
		try {
			if (musica!= null && !repositorio.existeElemento(musica)) {
				this.repositorio.cadastrarElemento(musica);
				
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
	
	public void atualizarElemento(Musica musica) throws ElementoNaoExisteException{
		try {
			if(musica !=null && this.repositorio.existeElemento(musica)) {
				this.repositorio.atualizarElemento(musica);
				this.repositorio.salvarArquivo();
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
	

	public boolean existeElemento(Musica musica) {
		return this.repositorio.existeElemento(musica);
	}
}
