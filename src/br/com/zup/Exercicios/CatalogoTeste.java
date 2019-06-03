package br.com.zup.Exercicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CatalogoTeste {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite :");
		System.out.println("1 para adicionar um filme ");
		System.out.println("2 para adicionar um livro ");
		System.out.println("3 para dicionar uma musica");
		int escolha = scan.nextInt();

		if(escolha == 1) {
			Scanner scanFilme = new Scanner(System.in);
			System.out.println("Qual o nome do filme ?");
			String nome = scanFilme.nextLine();

			System.out.println("Qual a categoria ?");
			String categoria = scanFilme.nextLine();

			System.out.println("Qual o genero?");
			String genero = scanFilme.nextLine(); 

			System.out.println("Qual a duração ?");
			String duracao = scanFilme.nextLine();

			int controle = 1;
			List<String> atores = new ArrayList<String>();

			while(controle == 1) {
				Scanner scanAtor = new Scanner (System.in);
				System.out.println("Qual o nome de ator? ");
				String novoAtor = scanAtor.nextLine();
				atores.add(novoAtor);

				Scanner controleAdicionar = new Scanner(System.in);
				System.out.println("Para adicionar outro ator digite 1, para parar digite 0 ");
				controle = controleAdicionar.nextInt();
			}
			Filme filmes = new Filme(nome,categoria,genero,duracao,atores);
			System.out.println(filmes);

			scanFilme.close();
		}else if(escolha == 2 ) {
			Scanner scanLivro = new Scanner (System.in);

			System.out.println("Qual o título? ");
			String nome = scanLivro.nextLine();

			System.out.println("Qual a categoria?");
			String categoria = scanLivro.nextLine();

			System.out.println("Qual é o autor ?");
			String autor = scanLivro.nextLine();

			System.out.println("Quantas paginas contem o livro ? ");
			int paginas = scanLivro.nextInt();
			System.out.println("Qual é o genero ?");
			String genero = scan.nextLine();
			
			Livros livro = new Livros (nome , categoria , autor , paginas );
			System.out.println(livro);
			scanLivro.close();
			
		}else if(escolha == 3) {
			Scanner scanMusica = new Scanner(System.in);

			System.out.println("Qual o nome da musica? ");
			String nome = scanMusica.nextLine();

			System.out.println("Qual a categoria? ");
			String categoria = scanMusica.nextLine();

			System.out.println("Qual banda ele é ?");
			String banda = scanMusica.nextLine();

			System.out.println("Qual o gênero ?");
			String genero = scanMusica.nextLine();
			
			System.out.println("Qual o nome do cantor?");
			String cantor = scanMusica.nextLine();
			
			Musicas musicas = new Musicas(nome, categoria, cantor, banda, genero) ;
			System.out.println(musicas);
			
			List<Musicas> musica = new ArrayList<Musicas>();
			musica.add(musicas);
			System.out.println(musica);
			
			scanMusica.close();
		}else {
			System.out.println("Opção invalida!");
			scan.close();
		}

	}
}


