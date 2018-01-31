package br.ufrpe.PlayKing.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Artista;
import br.ufrpe.PlayKing.beans.Musica;

public class RepositorioMusica <T>extends RepositorioGenerico<Musica>{

	private static RepositorioMusica<Musica> instance;
	private ArrayList<Musica> musicas ;


	public static RepositorioMusica<Musica> getInstance() {
		if (instance == null){
			instance = lerArquivo();
		}
		return instance;
	}
	private RepositorioMusica() {
		this.musicas = new ArrayList<Musica>();
	}
	

	public List<Musica> buscarNome(String nomeMusica){
		List<Musica> buscaMusicas = new ArrayList<Musica>();
		for (int i = 0; i < musicas.size(); i++) {
			if(musicas.get(i).getNomeMusica().equals(nomeMusica)) {
				buscaMusicas.add(musicas.get(i));
			}

		}
		return buscaMusicas;
	}
	
	public static RepositorioMusica<Musica> lerArquivo(){
		RepositorioMusica<Musica> instance = null;
		File in = new File("Musicas.arq");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			
			
			Object o = ois.readObject();
			instance = (RepositorioMusica<Musica>) o;
			
		} catch (Exception e) {
				instance = new RepositorioMusica<Musica>();
				
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
		File out = new File("Musicas.arq");
		
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









