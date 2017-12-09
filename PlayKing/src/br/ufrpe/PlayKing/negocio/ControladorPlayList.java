package br.ufrpe.PlayKing.negocio;

import java.util.List;

import br.ufrpe.PlayKing.beans.Musica;
import br.ufrpe.PlayKing.beans.PlayList;
import br.ufrpe.PlayKing.dados.RepositorioPlayList;

public class ControladorPlayList {

	private RepositorioPlayList repoPlayList;

	public ControladorPlayList() {
		this.repoPlayList = RepositorioPlayList.getInstance();
	}

	public void adicionarPlayList(PlayList playList) {
		if (playList != null && !repoPlayList.existePlayList(playList)) {


			this.repoPlayList.adicionarPlayList(playList);
		}
	}
	public void removerPlayList(PlayList playList) {
		if (playList!=null && repoPlayList.existePlayList(playList)) {


			this.repoPlayList.removerPlayList(playList);
		}
	}

	
	public void adicionarMusicaPlayList(PlayList playList, Musica musica) {
		if (playList!=null && !repoPlayList.existePlayList(playList)&& musica!=null&& !playList.getUsuarioMusicasPlayList().contains(musica)) {
			
		
		repoPlayList.adicionarMusicaPlayList(playList, musica);
	}}

	public void removerMusicaPlayList(PlayList playList, Musica musica) {
		if (playList!=null && repoPlayList.existePlayList(playList)&& musica!=null&& playList.getUsuarioMusicasPlayList().contains(musica)) {
			
		repoPlayList.removerMusicaPlayList(playList, musica);
	}
	}
	public List<PlayList> listarTodasPlayLists() {
		return repoPlayList.listarTodasPlayLists();
	}

	public List<Musica> listarTodasMusicasDaPlayList(PlayList playList) {
		return repoPlayList.listarTodasMusicasDaPlayList(playList);
	}

	public boolean existePlayList(PlayList playList) {
		return repoPlayList.existePlayList(playList);
	}

}
