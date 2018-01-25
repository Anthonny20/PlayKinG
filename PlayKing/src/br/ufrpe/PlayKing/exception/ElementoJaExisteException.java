package br.ufrpe.PlayKing.exception;

public class ElementoJaExisteException extends Exception {


	private static final long serialVersionUID = -6438051395607093650L;
	private Object obj;
	
	public ElementoJaExisteException(Object obj) {
		super("O Elemento "+ obj+"já está cadastrado e não pode ser castrado novamente. ");
	}
	
	public Object getObj() {
		return obj;
	}


}
