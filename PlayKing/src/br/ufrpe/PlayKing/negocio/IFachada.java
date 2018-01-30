package br.ufrpe.PlayKing.negocio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.beans.PlayList;
import br.ufrpe.PlayKing.beans.Usuario;
import br.ufrpe.PlayKing.beans.Vendas;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;
import br.ufrpe.PlayKing.exception.UsuarioJaCadastradoException;

public interface IFachada {


	public void removerElemento(Album elemento)throws ElementoNaoExisteException;

	public void cadastrarElemento(Album elemento)throws ElementoJaExisteException;

	public void atualizarElemento(Album elemento) throws ElementoNaoExisteException;

	public boolean existeElemento(Album elemento);

	public List<Album> listarAlbum();

	public List<Musica> listarMusicasAlbum(Album album);

	public void adicionarMusicaAlbum(Album album, Musica musica) throws ElementoJaExisteException,ElementoNaoExisteException;






	public void removerElemento(Artista elemento)throws ElementoNaoExisteException;

	public void cadastrarElemento(Artista elemento)throws ElementoJaExisteException;

	public void atualizarElemento(Artista elemento) throws ElementoNaoExisteException;

	public boolean existeElemento(Artista elemento);

	public List<Artista> listarArtista();

	public void adicionarMusicaArtista(Artista artista, Musica musica) throws ElementoJaExisteException, ElementoNaoExisteException;



	public void removerElemento(Musica musica) throws ElementoNaoExisteException;

	public 	void cadastrarElemento(Musica musica) throws ElementoJaExisteException;

	public 	void atualizarElemento(Musica musica) throws ElementoNaoExisteException;

	public 	boolean existeElemento(Musica musica);

	public 	List<Musica> listarElemento();



	public void adicionarMusicaPlayList(PlayList playList, Musica musica) throws ElementoJaExisteException, ElementoNaoExisteException;

	public void removerElemento(PlayList elemento) throws ElementoNaoExisteException;

	public List<PlayList> listarElementos();

	public boolean existeElemento(PlayList elemento);

	public void cadastrarElemento(PlayList elemento) throws ElementoJaExisteException;

	public void atualizarElemento(PlayList elemento) throws ElementoNaoExisteException;

	public void removerMusicaPlayList(PlayList playList, Musica musica) throws ElementoNaoExisteException;

	public List<Musica> listarTodasMusicasDaPlayList(PlayList playList);

	
	
	
	
	public boolean procurarUsuario(String login,String senha) throws ElementoNaoExisteException;
	public void removerElemento(Usuario elemento) throws ElementoNaoExisteException;
	public boolean existeElemento(Usuario elemento);
	public void cadastrarElemento(Usuario elemento) throws ElementoJaExisteException;
	public void atualizarElemento(Usuario elemento) throws ElementoNaoExisteException;
	public boolean loginUsuario(String login, String senha) throws ElementoNaoExisteException;
	
	public List<Usuario> listarUsuarios();
	public boolean existeUsuario(Usuario usuario);
	public boolean existeUsuarioLogin(String login);
	
	
	
	
	
	public List<Vendas> listarVendas();
	public List<Vendas> listarVendasPorData(LocalDateTime dataVenda);
	public void removerElemento(Vendas elemento) throws ElementoNaoExisteException;
	public boolean existeElemento(Vendas elemento);
	public void cadastrarElemento(Vendas elemento) throws ElementoJaExisteException;
	public void atualizarElemento(Vendas elemento) throws ElementoNaoExisteException;
	
	
	
	


}
