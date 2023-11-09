package JavaInicial;

import java.util.Scanner;

public class Ex1_Abono {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\n Digite o Salário: ");
		salario = read.nextFloat();
		System.out.println("\n Digite o Abono: ");
		abono = read.nextFloat();
		
		novoSalario = salario+abono;
		
		System.out.println("\n Novo salário: "+novoSalario);

	}

}
