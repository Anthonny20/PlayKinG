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
import br.ufrpe.PlayKing.beans.Musica;

public class RepositorioAlbum<T> extends RepositorioGenerico<Album> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2649883385086383975L;
	
	private static RepositorioAlbum<Album> instance;
	private List<Album> albuns;

	public static RepositorioAlbum<Album> getInstance() {
		if (instance == null) {
			instance = new RepositorioAlbum<Album>();

		}return instance;
	}

	private RepositorioAlbum() {
		this.albuns = this.elementos;
	}

	
	public void adicionarMusicaAlbum(Album album,Musica musica) {
	
			for (int i = 0; i < albuns.size(); i++) {
					if (albuns.get(i).equals(album)) {
						albuns.get(i).adicionarMusica(musica);
					}
					
			}
	}

	public List<Musica> listarMusicasAlbum(Album album){
		List<Musica> musicasDoAlbum = new ArrayList<Musica>();
		for (int i = 0; i < albuns.size(); i++) {
				if (albuns.get(i).equals(album)) {
					musicasDoAlbum.addAll(albuns.get(i).getMusicasAlbum());
				}
		}
		return musicasDoAlbum;
	}	
	
	public static RepositorioAlbum<Album> lerArquivo(){
		RepositorioAlbum<Album> instance = null;
		File in = new File("Albuns.txt");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			
			
			Object o = ois.readObject();
			instance = (RepositorioAlbum<Album>) o;
			
		} catch (Exception e) {
				instance = new RepositorioAlbum<Album>();
				
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
		File out = new File("Albuns.txt");
		
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

	
}

