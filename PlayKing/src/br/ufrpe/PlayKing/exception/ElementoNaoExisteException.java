package br.ufrpe.PlayKing.exception;

public class ElementoNaoExisteException extends Exception {


	private static final long serialVersionUID = 5678930791386441367L;
	private Object obj;
	
	public ElementoNaoExisteException(Object obj) {
		super("O Elemento"+obj+" não está cadastrado.");
	}
	
	public Object getObj() {
		return obj;
	}
}

