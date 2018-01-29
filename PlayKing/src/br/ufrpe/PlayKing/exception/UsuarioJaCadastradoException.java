package br.ufrpe.PlayKing.exception;

public class UsuarioJaCadastradoException extends Exception{
	
	
	
	private static final long serialVersionUID = 6096724266089431371L;
	private String loginUsuario;
	
	public UsuarioJaCadastradoException(String message) {
		super(message);
	}
	
	public String getLoginUsuario() {
		return loginUsuario;
	}
}
