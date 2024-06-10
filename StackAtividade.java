package EstruturaDados;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackAtividade {

	public static void main(String[] args) {
		/*
		 * Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da
		 * Classe String, para organizar a retirada de livros em uma pilha. O programa
		 * deverá ter um Menu que aceitará as opções 0, 1, 2 e 3: 1: Adicionar um novo
		 * livro na pilha. Deve solicitar o nome do livro. 2: Listar todos os livros da
		 * Pilha 3: Retirar um livro da pilha 0: O programa deve ser finalizado. Caso a
		 * pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá
		 * informar que a pilha está vazia.
		 * 
		 */

		Stack<String> livros = new Stack<String>();
		Scanner scanner = new Scanner(System.in);
		int opcao = 1;

		while (opcao != 0) {
			System.out.println("\n**************************************************************************");
			System.out.println("\n                   " + "1 - Adicionar livro na pilha");
			System.out.println("                   " + "2 - Listar todos os Livros");
			System.out.println("                   " + "3 - Retirar Livro da Pilha");
			System.out.println("                   " + "0 - Sair\n");
			System.out.println("**************************************************************************");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Pilha:");
				for (Iterator<String> iterator = livros.iterator(); iterator.hasNext();) {
					System.out.println(iterator.next());
				}
				System.out.println("Adicione o nome de um novo livro.");
				scanner.nextLine();
				String livro = scanner.nextLine();
				livros.push(livro);
				System.out.println("\nLivro Adicionado!");
				break;
			case 2:
				System.out.println("\nLista de Livros na Pilha:");
				for (Iterator<String> iterator = livros.iterator(); iterator.hasNext();) {
					System.out.println(iterator.next());
				}
				break;
			case 3:
				try {
					livros.pop();

					System.out.println("Pilha:");
					for (Iterator<String> iterator = livros.iterator(); iterator.hasNext();) {
						System.out.println(iterator.next());
					}
					System.out.println("\nUm Livro foi retirado da pilha!!");
				} catch (EmptyStackException e) {
					System.out.println("Pilha vazia!");

				}

				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				scanner.close();
				break;
			default:
				System.out.println("\nOpção Inválida.");
				break;
			}
		}
	}
}
