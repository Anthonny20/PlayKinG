package br.ufrpe.PlayKing.beans;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Vendas implements Serializable {


	private LocalDateTime dataVenda;
	private Album albumVenda;
	private Usuario usuarioVenda;
	public Vendas(Usuario usuarioVenda,Album albumVenda,
			int quantidadeAlbunsVendidos, LocalDateTime dataVenda) {
		super();
		
		this.albumVenda = albumVenda;
		this.usuarioVenda = usuarioVenda;
		this.dataVenda = dataVenda;
	}



	

	public Album getAlbumVenda() {
		return albumVenda;
	}



	public void setAlbumVenda(Album albumVenda) {
		this.albumVenda = albumVenda;
	}



	public Usuario getUsuarioVenda() {
		return usuarioVenda;
	}



	public void setUsuarioVenda(Usuario usuarioVenda) {
		this.usuarioVenda = usuarioVenda;
	}



	public LocalDateTime getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDateTime dataVenda) {
		this.dataVenda = dataVenda;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendas other = (Vendas) obj;
		if (albumVenda == null) {
			if (other.albumVenda != null)
				return false;
		} else if (!albumVenda.equals(other.albumVenda))
			return false;
		if (dataVenda == null) {
			if (other.dataVenda != null)
				return false;
		} else if (!dataVenda.equals(other.dataVenda))
			return false;
		if (usuarioVenda == null) {
			if (other.usuarioVenda != null)
				return false;
		} else if (!usuarioVenda.equals(other.usuarioVenda))
			return false;
		return true;
	}





	@Override
	public String toString() {
		return "Vendas [dataVenda=" + dataVenda + ", albumVenda=" + albumVenda + ", usuarioVenda=" + usuarioVenda + "]";
	}


	





}
