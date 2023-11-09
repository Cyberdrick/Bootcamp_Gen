package JavaInicial;

import java.util.Scanner;

public class L2_Ex1_preços {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num, qtd;
		float valor;
		
		System.out.println("Digite o Código do Produto: ");
		num = read.nextInt();
		
		System.out.println("Digite a Quantidade do Item: ");
		qtd = read.nextInt();
		
		switch(num) {
		case 1:
			valor = qtd*10;
			System.out.printf("\nProduto: Cachorro Quente \nValor Total: %.2f", valor);
			break;
		case 2:
			valor = qtd*15;
			System.out.printf("\nProduto: X-Salada \nValor Total: %.2f", valor);
			break;
		case 3:
			valor = qtd*18;
			System.out.printf("\nProduto: X-Bacon \nValor Total: %.2f", valor);
			break;
		case 4:
			valor = qtd*12;
			System.out.printf("\nProduto: Bauru \nValor Total: %.2f", valor);
			break;
		case 5:
			valor = qtd*8;
			System.out.printf("\nProduto: Refrigerante \nValor Total: %.2f", valor);
			break;
		case 6:
			valor = qtd*13;
			System.out.printf("\nProduto: Suco de laranja \nValor Total: %.2f", valor);
			break;
			default: 
				System.out.println("\nOpção inválida.");
		}
		

	}

}
