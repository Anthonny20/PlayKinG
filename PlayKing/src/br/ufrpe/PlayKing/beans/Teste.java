package br.ufrpe.PlayKing.beans;

public class Teste {
	public static void main(String[] args) {
		
		Artista artista1 = new Artista("Eminem");
		Artista artista2 = new Artista("Slim Shady");
		
		Album album1 = new Album("Marshall Matters LP",artista1);
		Album album2 = new Album("Encode",artista2);
		
		
		Musica musica1 = new Musica("Stan", "8:05", 4.50, album1, artista1);
		Musica musica2 = new Musica("Till I Colpase","4:30",3.50,album1,artista1);
		
		Musica musica3 = new Musica("Not Afraid","4:00",5.00 , album2 ,artista2);
		Musica musica4 = new Musica("Lose YourSelf", "5:00",8.00,album2, artista2);

		
		
		
	}
}
