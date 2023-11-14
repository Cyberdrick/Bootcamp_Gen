package Collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class L1_Ex2_Stack_retirarLivros {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Stack<String> pilhaLivros = new Stack<>();
		int comand;
		
		do {
			
			System.out.println("\n\t\tMenu da Pilha de Livros");
			System.out.println("\n-------------------------------------------------------");
			System.out.println("\n(1) Adicionar Livro na Pilha");
			System.out.println("\n(2) Listar Todos os Livros");
			System.out.println("\n(3) Retirar Livro da Pilha");
			System.out.println("\n(0) Sair");
			System.out.println("\n-------------------------------------------------------");
			System.out.println("\nDigite sua opção: ");
			comand = read.nextInt();
			
			switch(comand) {
			case 1:
				read.nextLine();
				System.out.println("\nAdicionar Livro na Fila: ");
				String livro = read.nextLine();
				pilhaLivros.push(livro);
				System.out.println("Livro Adicionado.");
				break;
				
			case 2:
				System.out.println("\nListar todos os Livros: ");
				System.out.println(pilhaLivros);
				break;
				
			case 3:
				Iterator<String> iterator = pilhaLivros.iterator();
				if(iterator.hasNext()) {
					pilhaLivros.pop();
					System.out.println("O Livro foi Removido");
				}else {
					System.out.println("\nNão há Livros.");
				}
				System.out.println(pilhaLivros);
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
