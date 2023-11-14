package JavaInicial;

import java.util.Scanner;

public class L1_Ex1_LacoCondIF {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int A, B, C, soma;
		
		System.out.println("\nDigite o primeiro número: ");
		A = read.nextInt();
		System.out.println("\nDigite o primeiro número: ");
		B = read.nextInt();
		System.out.println("\nDigite o primeiro número: ");
		C = read.nextInt();
		
		soma = A + B;
		
		if (soma > C) {
			System.out.println("\nA Soma de A + B é Maior do que C");
		} else if (soma < C) {
			System.out.println("\nA Soma de A + B é Menor do que C");
		} else if (soma == C) {
			System.out.println("\nA Soma de A + B é Igual a C");
		} else {
			System.out.println("\nValor Inválido");
		}
		

	}

}
