package JavaInicial;

import java.util.Arrays;
import java.util.Scanner;

public class L1_Ex1_Vetores_pesquisarNum {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int num[] = {2,5,1,3,4,9,7,8,10,6};
		int posicao = 0;
		System.out.println("Digite um número para pesquisa.");
		int numPesq = read.nextInt();
		
		for (int i = 0; i < num.length; i++) {
			posicao = posicao+1;
			if(numPesq == num[i]) {
				System.out.println("O número "+num[i]+" está na posição: "+(posicao));
				break;
			}
			
		}
		
		

	}

}
