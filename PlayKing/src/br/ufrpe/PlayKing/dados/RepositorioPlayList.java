package br.ufrpe.PlayKing.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.beans.PlayList;

public class RepositorioPlayList<T> extends RepositorioGenerico<PlayList> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8327607843928901049L;
	private static RepositorioPlayList<PlayList> instance;
	private ArrayList<PlayList> playLists;
	
	public static RepositorioPlayList<PlayList> getInstance() {
		if (instance == null) {
			instance = lerArquivo();
		}return instance;
	}
	
	private RepositorioPlayList() {
		this.playLists = new ArrayList<>();
	}
	

	public void adicionarMusicaPlayList(PlayList playList,	Musica musica) {
		 
			for (int i = 0; i < playLists.size(); i++) {
					if (playLists.get(i).equals(playList)) {
						playLists.get(i).adicionarMusicaPlayList(musica);
						this.salvarArquivo();
					}
			}
		
	}
	public void removerMusicaPlayList(PlayList playList,Musica musica) {
		for (int i = 0; i < playLists.size(); i++) {
			if (playLists.get(i).equals(playList)) {
				playLists.get(i).removerMusicaPlayList(musica);
				this.salvarArquivo();
			}
		}
	}
	
	
	public List<PlayList> listarTodasPlayLists(){
		return playLists;
	}
	
	public List<Musica> listarTodasMusicasDaPlayList(PlayList playList){
		List<Musica> musicasDeterminasPlayList = new ArrayList<>();
		for (int i = 0; i < playLists.size(); i++) {
			if (this.playLists.get(i).equals(playList)) {
				musicasDeterminasPlayList.addAll(this.playLists.get(i).getUsuarioMusicasPlayList());
			}
		}return musicasDeterminasPlayList;
	}
	public static RepositorioPlayList<PlayList> lerArquivo(){
		RepositorioPlayList<PlayList> instance = null;
		File in = new File("PlayLists.arq");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			
			
			Object o = ois.readObject();
			instance = (RepositorioPlayList<PlayList>) o;
			
		} catch (Exception e) {
				instance = new RepositorioPlayList<PlayList>();
				
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
		File out = new File("PlayLists.arq");
		
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

