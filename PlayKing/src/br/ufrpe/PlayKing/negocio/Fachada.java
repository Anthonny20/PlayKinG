package br.ufrpe.PlayKing.negocio;

import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.beans.PlayList;
import br.ufrpe.PlayKing.beans.Usuario;

public class Fachada {
	
	private static Fachada instance;
	
	private ControladorAlbum controlAlbum;
	private ControladorArtista controlArtista;
	private ControladorMusica controlMusica;
	private ControladorPlayList controlPlayList;
	private ControladorUsuario controlUsuario;
	
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
	public void adicionarAlbum(Album album) {
		controlAlbum.adicionarAlbum(album);
	}
	public void removerAlbum(Album album) {
		controlAlbum.removerAlbum(album);
	}
	public void adicionarArtista(Artista artista) {
		controlArtista.adicionarArtista(artista);
	}
	public void removerArtista(Artista artista) {
		controlArtista.removerArtista(artista);
	}
	public void adicionarMusica(Musica musica) {
		controlMusica.adicionarMusica(musica);
	}
	public void removerMusica(Musica musica) {
		controlMusica.removerMusica(musica);
	}
	public void adicionarPlaylist(PlayList playList) {
		controlPlayList.adicionarPlaylist(playList);
	}
	public void removerPlayList(PlayList playList) {
		controlPlayList.removerPlayList(playList);
	}
	public void adicionarUsuario(Usuario usuario) {
		controlUsuario.adicionarUsuario(usuario);
	}
	public void removerUsuario(Usuario usuario) {
		controlUsuario.removerUsuario(usuario);
	}
	public void atualizarUsuario(Usuario usuario) {
		controlUsuario.atualizarUsuario(usuario);
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
	
}
