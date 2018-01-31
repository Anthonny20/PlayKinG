package br.ufrpe.PlayKing.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.ufrpe.PlayKing.beans.Album;
import br.ufrpe.PlayKing.beans.Usuario;

public class RepositorioUsuario<T> extends RepositorioGenerico<Usuario>  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7179081346017521884L;
	private static RepositorioUsuario<Usuario> instance;
	private List<Usuario> usuarios ;

	public static RepositorioUsuario<Usuario> getInstance(){
		if (instance==null) {
			instance = lerArquivo();	

		}return instance;
	}

	private RepositorioUsuario() {
		this.usuarios = this.elementos;
	}



	public boolean procurarUsuario(String login,String senha) {
		boolean resultado = false;
		for (Usuario usuario : usuarios) {
			if (login.equals(usuario.getLoginUsuario())&& senha.equals(usuario.getSenhaUsuario())) {
				resultado = true;
			}
		}
		return resultado;
		}
	
	public List<Usuario> listarUsuarios(){
		return usuarios;
	}
	
	public boolean existeUsuarioLogin(String login) {
		boolean resultado = false;
			for (Usuario usuario : this.elementos) {
				if (usuario.getLoginUsuario().equals(login)) {
					resultado = true;
				}
			}
			return resultado;
	
	}
	public static RepositorioUsuario<Usuario> lerArquivo(){
		RepositorioUsuario<Usuario> instance = null;
		File in = new File("Usuarios.txt");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			
			
			Object o = ois.readObject();
			instance = (RepositorioUsuario<Usuario>) o;
			
		} catch (Exception e) {
				instance = new RepositorioUsuario<Usuario>();
				
		}finally {
			if (ois!=null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return instance;
		
	}
	public void salvarArquivo(){
		File out = new File("Usuarios.txt");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(out);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(instance);
		} catch (Exception e) {
				e.printStackTrace();
		}
		finally {
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException io) {
					io.printStackTrace();
				}
			}
		}
	}
	


		
			

	}

