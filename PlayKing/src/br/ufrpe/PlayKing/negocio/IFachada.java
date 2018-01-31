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
import br.ufrpe.PlayKing.exception.AlbumJaCadastradoException;
import br.ufrpe.PlayKing.exception.ArtistaJaCadastradoException;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;
import br.ufrpe.PlayKing.exception.UsuarioJaCadastradoException;

public interface IFachada {

	//Album
	void removerElemento(Album elemento) throws ElementoNaoExisteException;
	void cadastrarElemento(Album elemento) throws ElementoJaExisteException, AlbumJaCadastradoException;
	void atualizarElemento(Album elemento) throws ElementoNaoExisteException;
	List<Album> listarAlbuns();
	Album buscarElemento(Album elemento);
	boolean existeElemento(Album elemento);
	List<Musica> listarMusicasAlbum(Album album);
	


	//Artista


	void removerElemento(Artista elemento) throws ElementoNaoExisteException;
	void cadastrarElemento(Artista elemento) throws ElementoJaExisteException, ArtistaJaCadastradoException;
	void atualizarElemento(Artista elemento) throws ElementoNaoExisteException;
	boolean existeElemento(Artista elemento);
	void adicionarMusicaArtista(Artista artista, Musica musica)
			throws ElementoJaExisteException, ElementoNaoExisteException;
	List<Artista> listarArtistas();

	//MUSICA


	void removerElemento(Musica musica) throws ElementoNaoExisteException;
	List<Musica> buscarMusica(String nome) throws ElementoNaoExisteException;
	List<Musica> listarMusicas();
	void cadastrarElemento(Musica musica) throws ElementoJaExisteException;
	void atualizarElemento(Musica musica) throws ElementoNaoExisteException;
	boolean existeElemento(Musica musica);


	//PlayLists
	void removerElemento(PlayList elemento) throws ElementoNaoExisteException;
	boolean existeElemento(PlayList elemento);
	void cadastrarElemento(PlayList elemento) throws ElementoJaExisteException;
	void atualizarElemento(PlayList elemento) throws ElementoNaoExisteException;
	void adicionarMusicaPlayList(PlayList playList, Musica musica)
			throws ElementoJaExisteException, ElementoNaoExisteException;
	void removerMusicaPlayList(PlayList playList, Musica musica) throws ElementoNaoExisteException;
	List<Musica> listarTodasMusicasDaPlayList(PlayList playList);

	List<PlayList> listarPlayLists();


	//Usuários

	void removerElemento(Usuario elemento) throws ElementoNaoExisteException;
	boolean existeElemento(Usuario elemento);
	void cadastrarElemento(Usuario elemento) throws ElementoJaExisteException, UsuarioJaCadastradoException;
	void atualizarElemento(Usuario elemento) throws ElementoNaoExisteException;
	boolean procurarUsuario(String login, String senha) throws ElementoNaoExisteException;
	boolean loginUsuario(String login, String senha) throws ElementoNaoExisteException;
	boolean existeUsuarioLogin(String login);
	List<Usuario> listarUsuarios();



}
