package br.ufrpe.PlayKing.negocio;

import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.beans.PlayList;
import br.ufrpe.PlayKing.dados.RepositorioPlayList;

public class ControladorPlayList {
	
	private RepositorioPlayList repoPlayList;
	
	public ControladorPlayList() {
		this.repoPlayList = RepositorioPlayList.getInstance();
	}
	
	public void adicionarPlaylist(PlayList playList) {
		this.repoPlayList.adicionarPlayList(playList);
	}
	public void removerPlayList(PlayList playList) {
		this.repoPlayList.removerPlayList(playList);
	}

	public void adicionarPlayList(PlayList playList) {
		repoPlayList.adicionarPlayList(playList);
	}

	public void adicionarMusicaPlayList(PlayList playList, Musica musica) {
		repoPlayList.adicionarMusicaPlayList(playList, musica);
	}
	
}
