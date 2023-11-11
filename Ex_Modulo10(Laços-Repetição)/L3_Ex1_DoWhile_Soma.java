package JavaInicial;

import java.util.Scanner;

public class L3_Ex1_DoWhileSoma {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int soma = 0;
		int num;
		
		do{
			
			System.out.println("Digite um número para soma: ");
			num = read.nextInt();
			
			if(num == 0)
				break;
			
			soma += num;
			
		}while(num != 0);
		
		System.out.println("A soma dos números positivos é: "+soma);
	}

}
