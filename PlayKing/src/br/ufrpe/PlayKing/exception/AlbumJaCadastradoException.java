package br.ufrpe.PlayKing.exception;

public class AlbumJaCadastradoException extends Exception {

	/**
	 * 
	 */

	private static final long serialVersionUID = -885139335420827568L;
	private String nomeAlbum;
	
	public AlbumJaCadastradoException(String message) {
		super(message);
	}
	
	public String getNomeAlbum() {
		return nomeAlbum;
	}
}
