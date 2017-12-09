package br.ufrpe.PlayKing.beans;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.omg.SendingContext.RunTime;

import br.ufrpe.PlayKing.negocio.Fachada;

public class Menu {//NÃO TERMINADO
	static Scanner ler = new Scanner(System.in);
	static Scanner ler2 = new Scanner(System.in);
	static Scanner ler3 = new Scanner(System.in);
	
	public static void main(String[] args) {
		Fachada fachada =  Fachada.getInstance();
		Scanner ler = new Scanner(System.in);

		int op = 0;
		boolean parada = false;
		do {
			System.out.println("1- ENTRAR COMO ADM\n");
			System.out.println("2- Já sou cadastrado\n!");
			System.out.println("3- Não possuo cadastro\n");
			System.out.println("0- Sair\n");
			int teclado = ler.nextInt();

			switch (teclado) {
			case 1: do {


				System.out.println("1-Adicionar nova musica\n");
				System.out.println("2-Adicionar novo album\n");
				System.out.println("3-Listar todas as musicas\n");
				System.out.println("4-Listar todos albuns\n");
				System.out.println("5-Aicionar um artista\n");
				System.out.println("6-Remover um artista\n");
				System.out.println("7-Listar todos os artistas\n");
				System.out.println("8- Adicionar musicas ao album");
				System.out.println("0- SAIR\n");
			   
				int teclado1 = ler.nextInt();

				if (teclado1==1) {
					System.out.println("Digite os dados da musica\n");
					Musica musica =  new Musica();

					System.out.println("Nome: \n");
					musica.setNomeMusica(ler.next());
					System.out.println("Tempo : \n");
					musica.setTempoMusica(ler.next());
					System.out.println("Preço : \n");
					musica.setPrecoMusica(ler.nextDouble());
					//System.out.println("Artista : \n");
					//	musica.getArtistaMusica();
					//fachada.adicionarMusica(musica);

					parada = false;

				}else if(teclado1 ==2) {
					System.out.println("Informe os dados album\n");
					Album album = new Album();
					System.out.println("Digite o nome do album : \n");
					album.setNomeAlbum(ler.next());
					//System.out.println("Qual é o artista:\n"); se o artista pertence ao array de artista adicionar o album a ele pelo nome
					System.out.println("Data que o album foi lancado:");
					album.setDataAlbum(LocalDateTime.now());
					fachada.adicionarAlbum(album);
					
					parada = false;
				}
				else if (teclado1 == 3) {
					System.out.println("Segue todas as musicas\n");
					System.out.println(fachada.listarTodasMusicas());
					
					parada = false;
				}
				else if (teclado1 ==4 ) {
					System.out.println("Segue todas os albuns\n");
					System.out.println(fachada.listarAlbuns());
				
					parada = false;
				}
				else if (teclado1== 5) {
					System.out.println("Adicione os dados do Artista\n");
					Artista artista = new Artista();
					System.out.println("Nome : \n");
					artista.setNomeArtista(ler.next());
					System.out.println("Idade : \n");
					artista.setIdadeArtista(ler.nextInt());
					fachada.getInstance().adicionarArtista(artista);
					
					parada = false;
				}
				else if (teclado1==6) {
					System.out.println("Qual nome do artista que desejar remover");
					String remover = ler.nextLine();
				//	fachada.removerArtista(remover);
					
					parada = false;
			}
				else if (teclado1 == 7) {
					System.out.println("Segue todos os artistas");
					System.out.println(fachada.listarArtista());
				}else if (teclado1==8) {
					System.out.println("Digite o nome da música e do al");
					String resultado = ler.nextLine();
					
				}
				
				else if (teclado1 ==0){
					parada = true;
				}
				else {
					System.out.println("Opcão invalida, tente novamente");
				}
			}while(!parada);
			break;


			case 2:
				do {
					System.out.println("Comprar uma  nova musica\n");
					System.out.println("Listar todas as minhas musicas\n");
					System.out.println("Comprar um novo Album\n");
					System.out.println("Listar todos  os meus Albuns\n");
					System.out.println("Menu PlayLists\n");
					int teclado1 = ler.nextInt();

					if (teclado1 ==1) {

					}
				} while (parada);

				break;

			default:
				break;
			}
		} while (parada);
	}
	public static void menuAlbumAdm() {
	
		
		System.out.println("O que deseja fazer \n ?");
		System.out.println("1-Listar Albuns\n");
		System.out.println("2-Remover Album\n");
		System.out.println("3-Adicinonar Musicas a Album\n");
		System.out.println("4-Listar Musicas Album\n");
		System.out.println("5- Menu principal\n");
			int op = ler.nextInt();
		
		switch (op) {
		case 1:
			System.out.println(Fachada.getInstance().listarAlbuns());
			
			break;
		case 2:
			System.out.println("Digite o nome do album que deseja remover:\n");
			ler.nextLine();
			//Fachada.getInstance().removerAlbum(ler.nextLine());
			break;
		case 3:
			System.out.println("Digite os dados da música que deseja adicionar\n");
			Musica musica = new Musica();
			System.out.println("Preço : \n ");
			musica.setPrecoMusica(ler.nextDouble());
			System.out.println("Tempo da musica :\n");
			musica.setTempoMusica(ler.nextLine());
			System.out.println("Nome :\n");
			musica.setNomeMusica(ler2.nextLine());
			System.out.println("Artista : \n");
		//	musica.setArtistaMusica(ler3.nextLine());
			
		//	Fachada.getInstance().adicionarMusicaArtista(ler3.nextLine(), musica);
			
		case 4:
			System.out.println(Fachada.getInstance().listarAlbuns());
			
			
			
			

		default:
			System.out.println("Opcão invalida, tente novamente.");
			menuAlbumAdm();
			break;
		}
	}
}
