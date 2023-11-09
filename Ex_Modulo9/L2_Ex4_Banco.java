package JavaInicial;

import java.util.Scanner;

public class L2_Ex4_Banco {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int codOpe;
		float saque = 0; 
		float deposito;
		float saldo = 1000;
		
		System.out.println("Digite o número da operação: ");
		codOpe = read.nextInt();
		
		switch(codOpe) {
		case 1:
			System.out.println("Operação - Saldo \n Saldo: "+saldo);
			break;
		case 2:
			System.out.println("Digite um valor para saque: ");
				saque = read.nextInt();
			if(saque <= saldo) {
				
				saldo -= saque;
				
				System.out.println("Operação - Saque \nNovo Saldo: "+saldo);
			} else {
				System.out.println("Saldo Insuficiente!");
			}
			break;
		case 3:
			System.out.println("Digite um valor para saque: ");
			deposito = read.nextInt();
			
			saldo += deposito;
			
			System.out.println("Operação - Depósito \n Novo Saldo: "+saldo);
			break;
			default:
				System.out.println("Operação Inválida!");
		}

	}

}