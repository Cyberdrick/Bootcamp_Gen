package JavaInicial;

import java.util.Scanner;

public class mostrarNumParImpar {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int numPar = 0;
		int numImpar = 0;
		
		for(int i = 0; i <= 9; i++) {
			
			System.out.println("Digite um número: ");
			int num = read.nextInt();
			
			if(num % 2 == 0) {
				numPar++;
			} else {
				numImpar++;
			}
			
		}
		
		System.out.println("Total de números pares: "+numPar);
		System.out.println("Total de números impares: "+numImpar);

	}

}
