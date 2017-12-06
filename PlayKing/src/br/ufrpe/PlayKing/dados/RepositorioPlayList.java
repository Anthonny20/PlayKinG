package br.ufrpe.PlayKing.dados;

import java.util.ArrayList;

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
	
	//public  listarTodasPlayLists
	//public listarTodasMusicasDaPlayList
	//public atualizarPlayList
	//public adicioanarMusicaPlayList
	//public removerMusicaPlaylist
		
}	

