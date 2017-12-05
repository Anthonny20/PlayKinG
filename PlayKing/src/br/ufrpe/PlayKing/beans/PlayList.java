package br.ufrpe.PlayKing.beans;
//CLASSE FICOU OBSOLETA? JÁ QUE ESTOU CRINADO A PLAYSLIST , COMO UM ARRAY DE MUSICAS NA CLASSE USUARIO.
import java.util.ArrayList;

public class PlayList {

	private String namePlayList;
	private ArrayList<Musica> usuarioMusicas;
	private Usuario usuarioPlayList;



	public PlayList(String namePlayList, ArrayList<Musica> usuarioMusicas) {

		this.namePlayList = namePlayList;
		this.usuarioMusicas = usuarioMusicas;
	}
	
	public Usuario getUsuarioPlayList() {
		return usuarioPlayList;
	}

	public void setUsuarioPlayList(Usuario usuarioPlayList) {
		this.usuarioPlayList = usuarioPlayList;
	}

	public ArrayList<Musica> getUsuarioMusicas() {
		return usuarioMusicas;
	}
	public String getNamePlayList() {
		return namePlayList;
	}
	public void setNamePlayList(String namePlayList) {
		this.namePlayList = namePlayList;
	}
	public void setUsuarioMusicas(ArrayList<Musica> usuarioMusicas) {
		this.usuarioMusicas = usuarioMusicas;
	}


}
