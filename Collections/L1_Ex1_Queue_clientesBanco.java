package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class L1_Ex1_Queue_clientesBanco {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Queue<String> filaCliente = new LinkedList<>();
		int comand;
		
		do {
			
			System.out.println("\n\t\tMenu da Fila do Banco");
			System.out.println("\n-------------------------------------------------------");
			System.out.println("\n(1) Adicionar Cliente na Fila");
			System.out.println("\n(2) Listar todos os Clientes");
			System.out.println("\n(3) Retirar Cliente da Fila");
			System.out.println("\n(0) Sair");
			System.out.println("\n-------------------------------------------------------");
			System.out.println("\nDigite sua opção: ");
			comand = read.nextInt();
			
			switch(comand) {
			case 1:
				read.nextLine();
				System.out.println("\nAdicionar Cliente na Fila: ");
				String produto = read.nextLine();
				filaCliente.add(produto);
				System.out.println("Cliente Adicionado.");
				break;
				
			case 2:
				System.out.println("\nListar todos os Clientes");
				System.out.println(filaCliente);
				break;
				
			case 3:
				Iterator<String> iterator = filaCliente.iterator();
				if(iterator.hasNext()) {
					filaCliente.remove();
					System.out.println("O Cliente foi Chamado.");
				}else {
					System.out.println("\nA Fila está vazia.");
				}
				System.out.println(filaCliente);
				break;
				
			case 0:
				System.out.println("\nPrograma Finalizado.");
				break;
				default:
					System.out.println("\nOpção inválida.");
			}
			
		}while(comand !=0);

	}
}
