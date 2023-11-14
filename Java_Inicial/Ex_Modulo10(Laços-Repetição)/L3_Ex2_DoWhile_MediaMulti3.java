package JavaInicial;

import java.util.Scanner;

public class L3_Ex2_DoWhileMediaMulti3 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int soma = 0;
		int num, cont = 0;
		
		do{
			
			System.out.println("Digite um número para soma: ");
			num = read.nextInt();
			
			if(num == 0)
				break;
			
			if(num % 3 == 0) {
				soma += num;
				cont++;
			}
			
		}while(num != 0);
		
		float calcMedia = soma/cont;
		System.out.printf("A soma dos números positivos é: %.2f",calcMedia);
	}

}