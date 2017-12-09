package br.ufrpe.PlayKing.beans;
//CLASSE FICOU OBSOLETA? JÁ QUE ESTOU CRINADO A PLAYSLIST , COMO UM ARRAY DE MUSICAS NA CLASSE USUARIO.
import java.util.ArrayList;

public class PlayList {

	private String namePlayList;
	private ArrayList<Musica> usuarioMusicasPlayList;
	private Usuario usuarioPlayList;



	public PlayList(String namePlayList,Usuario usuarioPlayList) {

		this.namePlayList = namePlayList;
		this.usuarioMusicasPlayList = new ArrayList<>();
		this.usuarioPlayList =  usuarioPlayList;
	}
	
	public Usuario getUsuarioPlayList() {
		return usuarioPlayList;
	}

	public void setUsuarioPlayList(Usuario usuarioPlayList) {
		this.usuarioPlayList = usuarioPlayList;
	}

	public ArrayList<Musica> getUsuarioMusicas() {
		return usuarioMusicasPlayList;
	}
	public String getNamePlayList() {
		return namePlayList;
	}
	public void setNamePlayList(String namePlayList) {
		this.namePlayList = namePlayList;
	}
	public void setUsuarioMusicas(ArrayList<Musica> usuarioMusicas) {
		this.usuarioMusicasPlayList = usuarioMusicas;
	}
	
	public void adicionarMusicaPlayList(Musica musica) {
		this.usuarioMusicasPlayList.add(musica);
	}
	public void removerMusicaPlayList(Musica musica) {
		this.usuarioMusicasPlayList.remove(musica);
	}

	public ArrayList<Musica> getUsuarioMusicasPlayList() {
		return usuarioMusicasPlayList;
	}

	public void setUsuarioMusicasPlayList(ArrayList<Musica> usuarioMusicasPlayList) {
		this.usuarioMusicasPlayList = usuarioMusicasPlayList;
	}

	@Override
	public String toString() {
		
		return "\nNome PlayList : "+this.getNamePlayList()+"\n"+
				"Usuario PlayList : "+this.getUsuarioPlayList()+"\n"+
				"Musicas da PlayList : "+this.getUsuarioMusicas();
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayList other = (PlayList) obj;
		if (namePlayList == null) {
			if (other.namePlayList != null)
				return false;
		} else if (!namePlayList.equals(other.namePlayList))
			return false;
		if (usuarioMusicasPlayList == null) {
			if (other.usuarioMusicasPlayList != null)
				return false;
		} else if (!usuarioMusicasPlayList.equals(other.usuarioMusicasPlayList))
			return false;
		if (usuarioPlayList == null) {
			if (other.usuarioPlayList != null)
				return false;
		} else if (!usuarioPlayList.equals(other.usuarioPlayList))
			return false;
		return true;
	}
	


}
