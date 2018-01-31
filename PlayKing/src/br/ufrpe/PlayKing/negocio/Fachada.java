package br.ufrpe.PlayKing.negocio;

import java.time.LocalDateTime;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.beans.PlayList;
import br.ufrpe.PlayKing.beans.Usuario;
import br.ufrpe.PlayKing.beans.Vendas;
import br.ufrpe.PlayKing.dados.IRepositorioGenerico;
import br.ufrpe.PlayKing.dados.RepositorioAlbum;
import br.ufrpe.PlayKing.dados.RepositorioArtista;
import br.ufrpe.PlayKing.dados.RepositorioGenerico;
import br.ufrpe.PlayKing.dados.RepositorioMusica;
import br.ufrpe.PlayKing.dados.RepositorioPlayList;
import br.ufrpe.PlayKing.dados.RepositorioUsuario;
import br.ufrpe.PlayKing.dados.RepositorioVendas;
import br.ufrpe.PlayKing.exception.AlbumJaCadastradoException;
import br.ufrpe.PlayKing.exception.ArtistaJaCadastradoException;
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;
import br.ufrpe.PlayKing.exception.UsuarioJaCadastradoException;

public class Fachada implements IFachada {



	private ControladorAlbum controlAlbum;
	private ControladorArtista controlArtista;
	private ControladorMusica controlMusica;
	private ControladorPlayList controlPlayList;
	private ControladorUsuario controlUsuario;
	private ControladorVendas controlVendas;

	private static IFachada instance;

	private Fachada() {
		this.controlAlbum = new ControladorAlbum(RepositorioAlbum.getInstance());
		this.controlArtista = new ControladorArtista(RepositorioArtista.getInstance());
		this.controlMusica = new ControladorMusica(RepositorioMusica.getInstance());
		this.controlPlayList = new ControladorPlayList(RepositorioPlayList.getInstance());
		this.controlUsuario = new ControladorUsuario(RepositorioUsuario.getInstance());
		this.controlVendas = new ControladorVendas(RepositorioVendas.getInstance());
	}
	public static IFachada getInstance() {
		if (instance == null) {
			instance = new Fachada();

		}return instance;
	}
	
	//Album
	
	public void removerElemento(Album elemento) throws ElementoNaoExisteException {
		controlAlbum.removerElemento(elemento);
	}
	public void cadastrarElemento(Album elemento) throws ElementoJaExisteException, AlbumJaCadastradoException {
		controlAlbum.cadastrarElemento(elemento);
	}
	public void atualizarElemento(Album elemento) throws ElementoNaoExisteException {
		controlAlbum.atualizarElemento(elemento);
	}
	public List<Album> listarAlbuns() {
		return controlAlbum.listarAlbuns();
	}
	public Album buscarElemento(Album elemento) {
		return controlAlbum.buscarElemento(elemento);
	}
	public boolean existeElemento(Album elemento) {
		return controlAlbum.existeElemento(elemento);
	}
	public List<Musica> listarMusicasAlbum(Album album) {
		return controlAlbum.listarMusicasAlbum(album);
	}
	
	
	
	
	
	//Artista
	
	
	public void removerElemento(Artista elemento) throws ElementoNaoExisteException {
		controlArtista.removerElemento(elemento);
	}
	public void cadastrarElemento(Artista elemento) throws ElementoJaExisteException, ArtistaJaCadastradoException {
		controlArtista.cadastrarElemento(elemento);
	}
	public void atualizarElemento(Artista elemento) throws ElementoNaoExisteException {
		controlArtista.atualizarElemento(elemento);
	}
	public boolean existeElemento(Artista elemento) {
		return controlArtista.existeElemento(elemento);
	}
	public void adicionarMusicaArtista(Artista artista, Musica musica)
			throws ElementoJaExisteException, ElementoNaoExisteException {
		controlArtista.adicionarMusicaArtista(artista, musica);
	}
	public List<Artista> listarArtistas() {
		return controlArtista.listarArtistas();
	}

	
	
	
	//MUSICA
	
	
	public void removerElemento(Musica musica) throws ElementoNaoExisteException {
		controlMusica.removerElemento(musica);
	}
	public List<Musica> buscarMusica(String nome) throws ElementoNaoExisteException {
		return controlMusica.buscarMusica(nome);
	}
	public List<Musica> listarMusicas() {
		return controlMusica.listarMusicas();
	}
	public void cadastrarElemento(Musica musica) throws ElementoJaExisteException {
		controlMusica.cadastrarElemento(musica);
	}
	public void atualizarElemento(Musica musica) throws ElementoNaoExisteException {
		controlMusica.atualizarElemento(musica);
	}
	public boolean existeElemento(Musica musica) {
		return controlMusica.existeElemento(musica);
		
		
		
		
	//PlayList
		
		
	}
	public void removerElemento(PlayList elemento) throws ElementoNaoExisteException {
		controlPlayList.removerElemento(elemento);
	}
	public boolean existeElemento(PlayList elemento) {
		return controlPlayList.existeElemento(elemento);
	}
	public void cadastrarElemento(PlayList elemento) throws ElementoJaExisteException {
		controlPlayList.cadastrarElemento(elemento);
	}
	public void atualizarElemento(PlayList elemento) throws ElementoNaoExisteException {
		controlPlayList.atualizarElemento(elemento);
	}
	public void adicionarMusicaPlayList(PlayList playList, Musica musica)
			throws ElementoJaExisteException, ElementoNaoExisteException {
		controlPlayList.adicionarMusicaPlayList(playList, musica);
	}
	public void removerMusicaPlayList(PlayList playList, Musica musica) throws ElementoNaoExisteException {
		controlPlayList.removerMusicaPlayList(playList, musica);
	}
	public List<Musica> listarTodasMusicasDaPlayList(PlayList playList) {
		return controlPlayList.listarTodasMusicasDaPlayList(playList);
	}

	public List<PlayList> listarPlayLists() {

		return controlPlayList.listarPlayLists();
	}
	

	
	
	
	//Usuários
	
	public void removerElemento(Usuario elemento) throws ElementoNaoExisteException {
		controlUsuario.removerElemento(elemento);
	}
	public boolean existeElemento(Usuario elemento) {
		return controlUsuario.existeElemento(elemento);
	}
	public void cadastrarElemento(Usuario elemento) throws ElementoJaExisteException, UsuarioJaCadastradoException {
		controlUsuario.cadastrarElemento(elemento);
	}
	public void atualizarElemento(Usuario elemento) throws ElementoNaoExisteException {
		controlUsuario.atualizarElemento(elemento);
	}
	public boolean procurarUsuario(String login, String senha) throws ElementoNaoExisteException {
		return controlUsuario.procurarUsuario(login, senha);
	}
	public boolean loginUsuario(String login, String senha) throws ElementoNaoExisteException {
		return controlUsuario.loginUsuario(login, senha);
	}
	public boolean existeUsuarioLogin(String login) {
		return controlUsuario.existeUsuarioLogin(login);
	}
	public List<Usuario> listarUsuarios() {

		return controlUsuario.listarUsuarios();
	}
	
	
	
	

	





}
