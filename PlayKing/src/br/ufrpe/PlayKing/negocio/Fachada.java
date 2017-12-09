package br.ufrpe.PlayKing.negocio;

import java.time.LocalDateTime;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.beans.PlayList;
import br.ufrpe.PlayKing.beans.Usuario;
import br.ufrpe.PlayKing.beans.Vendas;

public class Fachada {
	
	private static Fachada instance;
	
	private ControladorAlbum controlAlbum;
	private ControladorArtista controlArtista;
	private ControladorMusica controlMusica;
	private ControladorPlayList controlPlayList;
	private ControladorUsuario controlUsuario;
	private ControladorVendas controlVendas;
	
	private Fachada() {
		this.controlAlbum = new ControladorAlbum();
		this.controlArtista = new ControladorArtista();
		this.controlMusica = new ControladorMusica();
		this.controlPlayList = new ControladorPlayList();
		this.controlUsuario = new ControladorUsuario();
	}
	public static Fachada getInstance() {
		if (instance == null) {
			instance = new Fachada();
			
		}return instance;
	}
	
	//ALBUM
	public void adicionarAlbum(Album album) {
		controlAlbum.adicionarAlbum(album);
	}
	public void removerAlbum(Album album) {
		controlAlbum.removerAlbum(album);
	}
	public List<Album> listarAlbuns() {
		return controlAlbum.listarAlbuns();
	}
	public void atualizarAlbum(Album album) {
		controlAlbum.atualizarAlbum(album);
	}
	public void adicionarMusicaAlbum(Album album, Musica musica) {
		controlAlbum.adicionarMusicaAlbum(album, musica);
	}
	public boolean existeAlbum(Album album) {
		return controlAlbum.existeAlbum(album);
	}
	
	
	public List<Musica> listarMusicasAlbum(Album album) {
		return controlAlbum.listarMusicasAlbum(album);
	}
	//ARTISTA
	
	
	public void adicionarArtista(Artista artista) {
		controlArtista.adicionarArtista(artista);
	}
	public void removerArtista(Artista nomeArtista) {
		controlArtista.removerArtista(nomeArtista);
	}
	
	public List<Artista> listarArtista() {
		return controlArtista.listarArtista();
	}
	
	public void adicionarMusicaArtista(Artista artista, Musica musica) {
		controlArtista.adicionarMusicaArtista(artista, musica);
	}
	
	public boolean existeArtista(Artista artista) {
		return controlArtista.existeArtista(artista);
	}
	//MUSICA
	
	public void removerMusica(Musica musica) {
		controlMusica.removerMusica(musica);
	}
	public List<Musica> buscarMusica(String nome) {
		return controlMusica.buscarMusica(nome);
	} 
	
	public List<Musica> buscarNome(String nomeMusica) {
		return controlMusica.buscarNome(nomeMusica);
	}
	public List<Musica> listarTodasMusicas() {
		return controlMusica.listarTodasMusicas();
	}
	
	public void adicionarMusica(Musica musica) {
		controlMusica.adicionarMusica(musica);
	}
	public boolean existeMusica(Musica musica) {
		return controlMusica.existeMusica(musica);
	}
	//PLAYLIST
	
	public void removerPlayList(PlayList playList) {
		controlPlayList.removerPlayList(playList);
	}
	public void adicionarPlayList(PlayList playList) {
		controlPlayList.adicionarPlayList(playList);
	}
	public void adicionarMusicaPlayList(PlayList playList, Musica musica) {
		controlPlayList.adicionarMusicaPlayList(playList, musica);
	}
	
	
	
	public void removerMusicaPlayList(PlayList playList, Musica musica) {
		controlPlayList.removerMusicaPlayList(playList, musica);
	}
	public List<PlayList> listarTodasPlayLists() {
		return controlPlayList.listarTodasPlayLists();
	}
	public List<Musica> listarTodasMusicasDaPlayList(PlayList playList) {
		return controlPlayList.listarTodasMusicasDaPlayList(playList);
	}
	public boolean existePlayList(PlayList playList) {
		return controlPlayList.existePlayList(playList);
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
