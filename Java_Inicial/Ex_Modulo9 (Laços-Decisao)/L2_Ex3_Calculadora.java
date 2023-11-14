package JavaInicial;

import java.util.Scanner;

public class L2_Ex3_Calculadora {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int codMath;
		float n1, n2, result;
		
		System.out.println("Digite o 1º número: ");
		n1 = read.nextFloat();
		
		System.out.println("Digite o 2º número: ");
		n2 = read.nextFloat();
		
		System.out.println("Digite o número da operação: ");
		codMath = read.nextInt();
		
		switch(codMath) {
		case 1:
			result = n1+n2;
			System.out.println(n1+" + "+n2+" = "+result);
			break;
		case 2:
			result = n1-n2;
			System.out.println(n1+" - "+n2+" = "+result);
			break;
		case 3:
			result = n1*n2;
			System.out.println(n1+" * "+n2+" = "+result);
			break;
		case 4:
			result = n1/n2;
			System.out.println(n1+" / "+n2+" = "+result);
			break;
			default:
				System.out.println("Operação Inválida!");
		}

	}

}