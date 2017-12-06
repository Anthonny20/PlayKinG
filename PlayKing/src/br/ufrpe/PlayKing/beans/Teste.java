package br.ufrpe.PlayKing.beans;

public class Teste {
	public static void main(String[] args) {
		
		Artista artista1 = new Artista("Eminem");
		Artista artista2 = new Artista("Slim Shady");
		
		Album album1 = new Album("Marshall Matters LP",artista1,10);
		Album album2 = new Album("Encode",artista2,10);
		
		
		Musica musica1 = new Musica("Stan", "8:05", 4.50, artista1);
		Musica musica2 = new Musica("Till I Colpase","4:30",3.50,artista1);
		
		Musica musica3 = new Musica("Not Afraid","4:00",5.00 ,artista2);
		Musica musica4 = new Musica("Lose YourSelf", "5:00",8.00, artista2);
		album1.adicionarMusica(musica1);
		album1.adicionarMusica(musica2);
		
		album2.adicionarMusica(musica3);
		album2.adicionarMusica(musica4);

		System.out.println(album1);
		
		Usuario u1 = new Usuario("Anthonny","1","1",null);
		
		u1.adicionarMusicaPlay(musica1);
		System.out.println("\n"+u1);
		
		
		
	}
}
