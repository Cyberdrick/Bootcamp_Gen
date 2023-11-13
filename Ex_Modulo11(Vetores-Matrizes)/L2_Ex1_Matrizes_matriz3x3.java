package JavaInicial;

import java.util.Scanner;

public class L2_Ex1_Matrizes_matriz3x3 {

public static void main(String[] args) {
		
		int matriz[][] = new int[3][3];
		int linha,coluna,somaDiagonal=0,somaDiagSec=0;
		Scanner read = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nEntre com um número: ");
				matriz[linha][coluna] = read.nextInt();
				
				if(linha == coluna) {
					somaDiagonal += matriz[linha][coluna];
				}
				
				if((linha+coluna) == 2) {
					somaDiagSec += matriz[linha][coluna];
				}
				
			}
		}
		
		System.out.println("Elementos da Diagona Principal: "+matriz[0][0]+matriz[1][1]+matriz[2][2]+'\n');
		System.out.println("Elementos da Diagona Secundária: "+matriz[0][2]+matriz[1][1]+matriz[2][0]);
		System.out.println("\nSoma dos Elementos Diagonal Principal: "+somaDiagonal);
		System.out.println("\nSoma dos Elementos da Diagonal Secundária: "+somaDiagSec);

	}

}
