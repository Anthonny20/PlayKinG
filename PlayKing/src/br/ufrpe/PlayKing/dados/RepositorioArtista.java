package br.ufrpe.PlayKing.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.negocio.Fachada;

public class RepositorioArtista<T> extends RepositorioGenerico<Artista> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2693512802260625571L;
	private static RepositorioArtista<Artista> instance;
	private ArrayList<Artista> artistas;
	private ArrayList<Musica> musicasArtista;
	


	public static RepositorioArtista<Artista> getInstance() {
		if(instance == null) {
			instance = new RepositorioArtista<Artista>();
		}return instance;
	}

	private RepositorioArtista() {
		this.artistas = new ArrayList<>();
		this.musicasArtista = new ArrayList<>();
	}

	
	public void adicionarMusicaArtista(Artista artista, Musica musica) {
		for (int i = 0; i <artistas.size(); i++) {
			if (this.artistas.get(i).getNomeArtista().equals(artista.getNomeArtista())) {
				this.musicasArtista.add(musica);
			}
			
		}
	}
	public static RepositorioArtista<Artista> lerArquivo(){
		RepositorioArtista<Artista> instance = null;
		File in = new File("Artista.txt");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			
			
			Object o = ois.readObject();
			instance = (RepositorioArtista<Artista>) o;
			
		} catch (Exception e) {
				instance = new RepositorioArtista<Artista>();
				
		}finally {
			if (ois!=null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return instance;
		
	}
	public void salvarArquivo(){
		File out = new File("Artista.txt");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(out);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(instance);
		} catch (Exception e) {
				e.printStackTrace();
		}
		finally {
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException io) {
					io.printStackTrace();
				}
			}
		}
	}


	
	
	//public listarMusicasArtista
	//public listarAlbunsArtista


}
