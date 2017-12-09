package br.ufrpe.PlayKing.dados;

import java.util.ArrayList;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.beans.PlayList;

public class RepositorioPlayList {
	
	private static RepositorioPlayList instance;
	private ArrayList<PlayList> playLists;
	
	public static RepositorioPlayList getInstance() {
		if (instance == null) {
			instance = new RepositorioPlayList();
		}return instance;
	}
	
	private RepositorioPlayList() {
		this.playLists = new ArrayList<>();
	}
	
	public void adicionarPlayList(PlayList playList) {
		this.playLists.add(playList);
	}
	public void removerPlayList(PlayList playList) {
		for (int i = 0; i < playLists.size(); i++) {
			if (this.playLists.get(i).equals(playList)) {
				this.playLists.remove(i);
			}
		}
	}
	public void adicionarMusicaPlayList(PlayList playList,	Musica musica) {
		 
			for (int i = 0; i < playLists.size(); i++) {
					if (playLists.get(i).equals(playList)) {
						playLists.get(i).adicionarMusicaPlayList(musica);
					}
			}
		
	}
	public void removerMusicaPlayList(PlayList playList,Musica musica) {
		for (int i = 0; i < playLists.size(); i++) {
			if (playLists.get(i).equals(playList)) {
				playLists.get(i).removerMusicaPlayList(musica);
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
	
	public boolean existePlayList(PlayList playList) {
		boolean existe = false;
		for (int i = 0; i < playLists.size(); i++) {
			if (playLists.get(i).equals(playList)) {
				existe = true;
			}
		}return existe;
	}
	//public atualizarPlayList
	
		
}	

