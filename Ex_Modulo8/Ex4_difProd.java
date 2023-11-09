package JavaInicial;

import java.util.Scanner;

public class Ex4_difProd {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		float n1, n2, n3, n4, calculo;
		
		System.out.println("Digite o primeiro número: ");
		n1 = read.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = read.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		n3 = read.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		n4 = read.nextFloat();
		
		calculo = (n1*n2) - (n3*n4);
		
		System.out.println("O a diferença do produto é: "+calculo);
	}

}
