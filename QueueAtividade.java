package EstruturaDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueAtividade {

	public static void main(String[] args) {
		/*
		 * Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da
		 * Classe String, para organizar a ordem de chegada dos Clientes de um Banco. O
		 * programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3: 1: Adicionar
		 * um novo Cliente na fila. Deve solicitar o nome do Cliente. 2: Listar todos os
		 * Clientes na fila 3: Chamar (retirar) uma pessoa da fila 0: O programa deve
		 * ser finalizado. Caso a fila esteja vazia, o programa deverá informar que a
		 * fila está vazia ao tentar retirar (chamar) um cliente da fila
		 * 
		 */

		Queue<String> clients = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		int opcao = 1;

		while (opcao != 0) {
			System.out.println("\n**************************************************************************");
			System.out.println("\n                   " + "1 - Adicionar Cliente na Fila");
			System.out.println("                   " + "2 - Listar todos os Clientes");
			System.out.println("                   " + "3 - Retirar Cliente da Fila");
			System.out.println("                   " + "0 - Sair\n");
			System.out.println("**************************************************************************");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Fila:");
				for (Iterator<String> iterator = clients.iterator(); iterator.hasNext();) {
					System.out.println(iterator.next());
				}
				System.out.println("\nAdicione o nome de um novo cliente.");
				scanner.nextLine();
				String cliente = scanner.nextLine();
				clients.add(cliente);
				System.out.println("\nCiente Adicionado!");
				break;
			case 2:
				System.out.println("Fila:");
				for (Iterator<String> iterator = clients.iterator(); iterator.hasNext();) {
					System.out.println(iterator.next());
				}
				break;
			case 3:
				String vazio = clients.poll();

				if (vazio == null) {
					System.out.println("Fila vazia!");
				} else {
					System.out.println("Fila:");
					for (Iterator<String> iterator = clients.iterator(); iterator.hasNext();) {
						System.out.println(iterator.next());
					}
					System.out.println("\nCliente chamado!");
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
