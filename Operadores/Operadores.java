package JavaInicial;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		float n1, n2, n3, media;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\n Entre com a primeira nota: ");
		n1 = read.nextFloat();
		System.out.println("\n Entre com a segunda nota: ");
		n2 = read.nextFloat();
		System.out.println("\n Entre com a terceira nota: ");
		n3 = read.nextFloat();
		
		media = (n1*2+n2*3+n3*5)/10;
		System.out.println("\n Média ponderada: "+media);
		
		// Operadores relacionais: <,>,<=,>=,!=,==
		// Operadores lógicos: E --> && e OU --> ||
		// Módulos % --> resto da divisão por inteiros
		
	}

}
