package JavaInicial;

import java.util.Scanner;

public class Ex2_par_impar {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int n1, positivo;
		
		positivo = 1;
		
		System.out.println("\nDigite o número: ");
		n1 = read.nextInt();
		
		if(n1 >= positivo && n1 % 2 == 0) {
			System.out.println("\nNúmero "+n1+" é par e positivo!");
		} else if (n1 >= positivo && n1 % 2 != 0){
			System.out.println("\nNúmero "+n1+" é impar e positivo!");
		} else if (n1 < positivo && n1 % 2 == 0) {
			System.out.println("\nNúmero "+n1+" é par e negativo!");
		} else if (n1 < positivo && n1 % 2 != 0) {
			System.out.println("\nNúmero "+n1+" é impar e negativo!");
		} else {
			System.out.println("\nValor inválido!");
		}

	}

}
