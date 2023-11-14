package JavaInicial;

import java.util.Scanner;

public class L2_Ex2_pesquisaColab {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String resp = "s";
		int idade = 0, somaIdade = 0, contPeople = 0, numBack = 0, numCisWoman = 0, numTransWoman = 0, numCisMan = 0, numTransMan = 0, numNoBin = 0;
		while(resp.equalsIgnoreCase("s")) {
			
			System.out.println("Digite sua idade: ");
			idade = read.nextInt();
			
			System.out.println("Digite sua identidade de gênero: ");
			int ident = read.nextInt();
			
			System.out.println("Digite seu cargo dev: ");
			int dev = read.nextInt();
			
			// conta os número de pessoas de cada item
			
			if(dev == 1) {
				numBack++;
			} else if (ident == 1 && dev == 2) {
				numCisWoman++;
			} else if (ident == 4 && dev == 2) {
				numTransWoman++;
			}else if (ident == 2 && dev == 3 && idade > 40) {
				numCisMan++;
			}else if (ident == 5 && dev == 3 && idade > 40) {
			    numTransMan++;
			}else if (ident == 3 && dev == 4 && idade < 30 ) {
				numNoBin++;
			}
			
			somaIdade += idade;
			
			// contador de pessoas
			
			contPeople++;
			
			//adicionar condição de saída
			
			System.out.println("Deseja continuar? s/n");
			resp = read.next();
		}
		
		int sumWomans = numCisWoman+numTransWoman; 
		int sumMans = numCisMan+numTransMan;
		float averageAge = somaIdade/contPeople;
		
		System.out.println("Total de pessoas desenvolvedoras Backend: "+numBack+"\n");
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: "+sumWomans+"\n");
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+sumMans+"\n");
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+numNoBin+"\n");
		System.out.println("Número total de respostas: "+contPeople+"\n");
		System.out.printf("Média de idade: %.2f",averageAge);
		

	}

}
