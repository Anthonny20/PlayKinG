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
import br.ufrpe.PlayKing.exception.ElementoJaExisteException;
import br.ufrpe.PlayKing.exception.ElementoNaoExisteException;

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
		this.controlUsuario = new ControladorUsuario();
	}
	public static IFachada getInstance() {
		if (instance == null) {
			instance = new Fachada();
			
		}return instance;
	}
	
	//ALBUM
	
	
	
	
	
	/*public void adicionarMusicaAlbum(Album album, Musica musica) {
		controlAlbum.adicionarMusicaAlbum(album, musica);
	}
	
	public List<Musica> listarMusicasAlbum(Album album) {
		return controlAlbum.listarMusicasAlbum(album);
	}*/

	
	
	
	public void removerElemento(Album elemento) throws ElementoNaoExisteException {
		this.controlAlbum.removerElemento(elemento);
	}
	public List<Album> listarAlbum() {
		return controlAlbum.listarAlbum();
	}
	public void cadastrarElemento(Album elemento) throws ElementoJaExisteException {
		controlAlbum.cadastrarElemento(elemento);
	}
	public void atualizarElemento(Album elemento) throws ElementoNaoExisteException {
		controlAlbum.atualizarElemento(elemento);
	}
	public boolean existeElemento(Album elemento) {
		return controlAlbum.existeElemento(elemento);
	}
	
	public List<Musica> listarMusicasAlbum(Album album) {
		return controlAlbum.listarMusicasAlbum(album);
	}
	public void adicionarMusicaAlbum(Album album, Musica musica)
			throws ElementoJaExisteException, ElementoNaoExisteException {
		controlAlbum.adicionarMusicaAlbum(album, musica);
	}
	//ARTISTA
	public void removerElemento(Artista elemento) throws ElementoNaoExisteException {
		controlArtista.removerElemento(elemento);
	}
	public void cadastrarElemento(Artista elemento) throws ElementoJaExisteException {
		controlArtista.cadastrarElemento(elemento);
	}
	public void atualizarElemento(Artista elemento) throws ElementoNaoExisteException {
		controlArtista.atualizarElemento(elemento);
	}
	public boolean existeElemento(Artista elemento) {
		return controlArtista.existeElemento(elemento);
	}
	public List<Artista> listarArtista() {
		return controlArtista.listarArtista();
	}
	public void adicionarMusicaArtista(Artista artista, Musica musica) throws ElementoJaExisteException, ElementoNaoExisteException {
		controlArtista.adicionarMusicaArtista(artista, musica);
	}
	

	

	
	//MUSICA
	

	public List<Musica> listarTodasMusicas() {
		return controlMusica.listarTodasMusicas();
	}
	
	
	public void removerElemento(Musica musica) throws ElementoNaoExisteException {
		controlMusica.removerElemento(musica);
	}
	public List<Musica> buscarMusica(String nome) throws ElementoNaoExisteException {
		return controlMusica.buscarMusica(nome);
	}
	public void cadastrarElemento(Musica musica) throws ElementoJaExisteException {
		controlMusica.cadastrarElemento(musica);
	}
	public void atualizarElemento(Musica musica) throws ElementoNaoExisteException {
		controlMusica.atualizarElemento(musica);
	}
	public boolean existeElemento(Musica musica) {
		return controlMusica.existeElemento(musica);
	}
	public List<Musica> listarElemento() {
		return controlMusica.listarElemento();
	}
	
	
	
	
	//PLAYLIST
	
	
	public void adicionarMusicaPlayList(PlayList playList, Musica musica) throws ElementoJaExisteException, ElementoNaoExisteException {
		controlPlayList.adicionarMusicaPlayList(playList, musica);
	}

	public void removerElemento(PlayList elemento) throws ElementoNaoExisteException {
		controlPlayList.removerElemento(elemento);
	}
	public List<PlayList> listarElementos() {
		return controlPlayList.listarElementos();
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
	public void removerMusicaPlayList(PlayList playList, Musica musica) throws ElementoNaoExisteException {
		controlPlayList.removerMusicaPlayList(playList, musica);
	}
	public List<PlayList> listarTodasPlayLists() {
		return controlPlayList.listarTodasPlayLists();
	}
	public List<Musica> listarTodasMusicasDaPlayList(PlayList playList) {
		return controlPlayList.listarTodasMusicasDaPlayList(playList);
	}
	
	
	
	
	
	
	//USUARIO
	public void adicionarUsuario(Usuario usuario) {
		controlUsuario.adicionarUsuario(usuario);
	}
	public void removerUsuario(Usuario usuario) {
		controlUsuario.removerUsuario(usuario);
	}
	public void atualizarUsuario(Usuario usuario) {
		controlUsuario.atualizarUsuario(usuario);
	}

	public Usuario procurarUsuario(String login) {
		return controlUsuario.procurarUsuario(login);
	}
	public boolean loginUsuario(String login, String senha) {
		return controlUsuario.loginUsuario(login, senha);
	}
	
	public List<Usuario> listarUsuarios() {
		return controlUsuario.listarUsuarios();
	}
	public boolean existeUsuario(Usuario usuario) {
		return controlUsuario.existeUsuario(usuario);
	}
	//VENDAS
	public List<Vendas> listarVendas() {
		return controlVendas.listarVendas();
	}
	public List<Vendas> listarVendasPorData(LocalDateTime dataVenda) {
		return controlVendas.listarVendasPorData(dataVenda);
	}
	
	

	
	
	
	
}
