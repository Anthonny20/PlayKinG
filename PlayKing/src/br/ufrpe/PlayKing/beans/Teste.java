package br.ufrpe.PlayKing.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.plaf.synth.SynthSeparatorUI;

import br.ufrpe.PlayKing.dados.RepositorioAlbum;
import br.ufrpe.PlayKing.dados.RepositorioArtista;
import br.ufrpe.PlayKing.negocio.ControladorAlbum;
import br.ufrpe.PlayKing.negocio.ControladorArtista;
import br.ufrpe.PlayKing.negocio.Fachada;

public class Teste {
	public static void main(String[] args) {
		
		Artista artista1 = new Artista("Eminem",20);
		Artista artista2 = new Artista("Slim Shady",30);
		
		Fachada.getInstance().adicionarArtista(artista1);
		
		Album album1 = new Album("PRIMEIRO", artista1, LocalDateTime.now());
		Fachada.getInstance().adicionarAlbum(album1);
		
		Musica musica1 = new Musica("Stan", "8:05", 4.50, artista1);
		Musica musica2 = new Musica("Till I Colpase","4:30",3.50,artista1);
		Fachada.getInstance().adicionarMusica(musica1);
		Musica musica3 = new Musica("Not Afraid","4:00",5.00 ,artista2);
		Musica musica4 = new Musica("Lose YourSelf", "5:00",8.00, artista2);
		
		Usuario u1 = new Usuario("Anthonny", "thonny","123");
		Fachada.getInstance().adicionarUsuario(u1);
		Usuario u2 = new Usuario("Anth","thonny","123");
		Fachada.getInstance().adicionarUsuario(u2);
		
		Fachada.getInstance().adicionarMusicaAlbum(album1, musica1);
		System.out.println("\n"+Fachada.getInstance().listarAlbuns());
		Fachada.getInstance().removerAlbum(album1);
		System.out.println("\n"+Fachada.getInstance().listarAlbuns());
		
	}
}
