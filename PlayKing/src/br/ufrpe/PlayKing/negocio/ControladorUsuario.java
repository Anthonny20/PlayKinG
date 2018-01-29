package br.ufrpe.PlayKing.negocio;


import java.util.List;


import br.ufrpe.PlayKing.beans.Usuario;
import br.ufrpe.PlayKing.dados.IRepositorioGenerico;
import br.ufrpe.PlayKing.dados.RepositorioUsuario;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;
import br.ufrpe.PlayKing.exception.UsuarioJaCadastradoException;

public class ControladorUsuario implements IControladorUsuario {
	private RepositorioUsuario repo;
	private IRepositorioGenerico<Usuario> repoUsuario;

	public ControladorUsuario(IRepositorioGenerico<Usuario> instancia) {
		this.repo = RepositorioUsuario.getInstance();
		this.repoUsuario = instancia;
	}
			@Override
			public void removerElemento(Usuario elemento) throws ElementoNaoExisteException {
				try {
					if (elemento!= null && this.repoUsuario.existeElemento(elemento)) {
						this.repoUsuario.existeElemento(elemento);
					} else {
						throw new ElementoNaoExisteException(elemento);
					}
				} catch (ElementoNaoExisteException e) {
						e.printStackTrace();
				}
				
			}
			
			@Override
			public List<Usuario> listarElementos() {
				
				return this.repoUsuario.listarElementos();
			}
			
			@Override
			public boolean existeElemento(Usuario elemento) {
				
				return this.repoUsuario.existeElemento(elemento);
			
			}
			
			@Override
			public void cadastrarElemento(Usuario elemento) throws ElementoJaExisteException{
				try {
					if (elemento != null && !this.repoUsuario.existeElemento(elemento)&& !this.repo.existeUsuarioLogin(elemento.getLoginUsuario())) {
						this.repoUsuario.cadastrarElemento(elemento);
					} else {
						throw new UsuarioJaCadastradoException("Login de usuario"+elemento.getLoginUsuario()+"já cadastrado");
					}
				} catch (UsuarioJaCadastradoException u) {
						u.printStackTrace();
				}
				
			}
			
			@Override
			public void atualizarElemento(Usuario elemento) throws ElementoNaoExisteException {
					try {
						if (elemento!=null && this.repoUsuario.existeElemento(elemento)) {
							this.repoUsuario.atualizarElemento(elemento);
						} else {
							throw new ElementoNaoExisteException(elemento);
						}
					} catch (ElementoNaoExisteException e) {
							e.printStackTrace();
					}
				
			}
		
	


	public Usuario procurarUsuario(String login) throws ElementoNaoExisteException {
		Usuario resultado = null;
		
		try {
			if(login!=null) {
				 resultado = repo.procurarUsuario(login);	
		}else {
			throw new ElementoNaoExisteException(login);
		} 
		}	catch (ElementoNaoExisteException e) {
				e.printStackTrace();
		}
		return resultado;
		}
	
	public List<Usuario> listarUsuarios() {
		return repo.listarUsuarios();
	}



	public boolean loginUsuario(String login,String senha)throws ElementoNaoExisteException {
		boolean loginEfetuado = false;
		
		try { 
			if(login!= null && senha !=null ) {
		
			Usuario auxiliar = this.procurarUsuario(login);
			
			if(auxiliar.getSenhaUsuario().equals(senha)) {
				loginEfetuado = true;
				
		}
			else {
				throw new ElementoNaoExisteException(login);
			}}} catch (ElementoNaoExisteException e) {
					e.printStackTrace();
		}
					return loginEfetuado;
				}

	public boolean existeUsuarioLogin(String login) {
		
		return repo.existeUsuarioLogin(login);
	}
		
		

}
