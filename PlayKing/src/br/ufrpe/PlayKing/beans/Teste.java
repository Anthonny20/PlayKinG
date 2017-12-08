package br.ufrpe.PlayKing.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import br.ufrpe.PlayKing.dados.RepositorioAlbum;
import br.ufrpe.PlayKing.dados.RepositorioArtista;
import br.ufrpe.PlayKing.negocio.ControladorAlbum;
import br.ufrpe.PlayKing.negocio.ControladorArtista;
import br.ufrpe.PlayKing.negocio.Fachada;

public class Teste {


	private static Scanner lerTeclado;
	private static Scanner lerTeclado2;



	public static void main(String[] args) {
		Fachada fachada = Fachada.getInstance();
		lerTeclado2 = new Scanner(System.in);
		int opcao;
		boolean parar = false;
		do {

			System.out.println("-------------------Bem Vindo ao PlayKing!-----------------\n");
			System.out.println("Entrar como ADM ou USU�RIO?\n");
			System.out.println("1- ADM\n");
			System.out.println("2- USU�RIO\n");
			System.out.println("Insira sua op��o --> :"+"\n");
			opcao = lerTeclado2.nextInt();
			parar = true;

		} while (!parar);
		switch (opcao) {
		case 1:
			menuAdm();

			break;
		case 2:
			menuEntradaUsuario();
			break;
		default:
			break;
		}

	}
	public static void menuEntradaUsuario() {
		lerTeclado = new Scanner(System.in);
		int opcao;
		boolean parar = false;
		do {
			System.out.println("Bem vindo ao MENU usu�rio!!\n");
			System.out.println("1- J� possuo cadastro\n");
			System.out.println("2- N�o sou cadastrado\n");
			System.out.println("Insira sua op��o --> :"+"\n");
			opcao = lerTeclado.nextInt();
			parar =true;
		} while (!parar);

		switch (opcao) {
		case 1:
			menuUsuario();
			break;

		default:
			break;
		}
	}
	public static void menuUsuario() {
		int op;
		System.out.println("Por favor digite seu login\n");
		
		
		lerTeclado = new Scanner(System.in);
		do {
			
		
		System.out.println("Bem vindo ao seu Menu usuario, oque deseja fazer?\n");
		System.out.println("1-Criar Playlist\n");
		System.out.println("2-Remover Playlist\n");
		System.out.println("3-Comprar Musica\n");
		System.out.println("4-Comprar Album\n");
		System.out.println("5-Remover musica da PlayList\n");
		System.out.println("6-Adicionar musica a PlayList\n");
		System.out.println("7-Lista todas suas musicas\n");
		System.out.println("8-Lista todas as suas playLists\n");
		System.out.println("0-Voltar ao menu inicia\n");
		System.out.println("Insira sua op��o aqui -->\n");
		op = lerTeclado.nextInt();
	}while(op !=0);
	
	
	}
	
	
	public static void menuAdm() {}
}

















