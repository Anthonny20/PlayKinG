package br.ufrpe.PlayKing.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import br.ufrpe.PlayKing.dados.RepositorioAlbum;
import br.ufrpe.PlayKing.dados.RepositorioArtista;
import br.ufrpe.PlayKing.negocio.ControladorAlbum;
import br.ufrpe.PlayKing.negocio.ControladorArtista;
import br.ufrpe.PlayKing.negocio.Fachada;

public class Teste {


	public static void main(String[] args) {
		//Artista
		Artista artista1 = new Artista("Eminem",20);
		Artista artista2 = new Artista("Slim Shady",30);
		
		Fachada.getInstance().adicionarArtista(artista1);
		Fachada.getInstance().adicionarArtista(artista2);
		
		System.out.println(Fachada.getInstance().listarArtista());
		
		Fachada.getInstance().removerArtista(artista1);
		
		System.out.println(Fachada.getInstance().listarArtista());
		
		
		//Album
		Album album1 = new Album("PRIMEIRO", artista1, LocalDateTime.now());
		Album album2 = new Album("Segundo", artista2, LocalDateTime.now());
		
		Fachada.getInstance().adicionarAlbum(album1);
		Fachada.getInstance().adicionarAlbum(album2);
		
		System.out.println(Fachada.getInstance().listarAlbuns());
		
		Fachada.getInstance().removerAlbum(album1);
		
		System.out.println(Fachada.getInstance().listarAlbuns());
		
		
		//Musica
		Musica musica1 = new Musica("Stan", "8:05", 4.50, artista1);
		Musica musica2 = new Musica("Till I Colpase","4:30",3.50,artista1);
		
		Fachada.getInstance().adicionarMusica(musica1);
		Fachada.getInstance().adicionarMusica(musica2);
		Fachada.getInstance().adicionarMusicaArtista(artista1, musica1);
		Fachada.getInstance().adicionarMusicaArtista(artista2, musica2);
		Fachada.getInstance().adicionarMusicaAlbum(album1, musica1);
		Fachada.getInstance().adicionarMusicaAlbum(album2, musica2);
		 
		
	
		
	}
}

















