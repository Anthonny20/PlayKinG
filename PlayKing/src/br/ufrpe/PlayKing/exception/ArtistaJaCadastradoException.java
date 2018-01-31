package br.ufrpe.PlayKing.exception;

public class ArtistaJaCadastradoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6419530241821206776L;
	private String artistaNome;

	public ArtistaJaCadastradoException(String message) {
	super(message);	
	}
	
	public String getNomeArtista() {
		return artistaNome;
	}
}
