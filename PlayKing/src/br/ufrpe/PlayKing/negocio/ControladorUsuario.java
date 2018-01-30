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
		
	


	public boolean procurarUsuario(String login,String senha) throws ElementoNaoExisteException {
		return this.repo.procurarUsuario(login, senha);
	}
	public List<Usuario> listarUsuarios() {
		return repo.listarUsuarios();
	}



	public boolean loginUsuario(String login,String senha)throws ElementoNaoExisteException {
		return procurarUsuario(login, senha);
				}

	public boolean existeUsuarioLogin(String login) {
		
		return repo.existeUsuarioLogin(login);
	}

		

}
