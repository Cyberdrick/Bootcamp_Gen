package JavaInicial;

import java.util.Scanner;

public class L1_Ex3_DoarSangue {

		public static void main(String[] args) {
			
			Scanner read = new Scanner(System.in);
			
			String nome;
			String doacaoresposta;
			
			int idade;
			
			boolean doacao = false;
			
			System.out.println("Digite o seu nome: ");
			nome = read.nextLine();
			
			System.out.println("Digite sua idade: ");
			idade = read.nextInt();
			
			System.out.println("Primeira doação de sangue? (S/N): ");
			doacaoresposta = read.next();
			
			if(doacaoresposta.equals("S")) {
				doacao = true;
			} else if (doacaoresposta.equals("N")) {
				doacao = false;
			} else {
				System.out.println("Valor inválido.");
			}
			
			if(idade >= 18 && idade <= 59) {
				System.out.println(nome+" está apto para doar!");
			} else if (idade >= 60 && idade <= 69 && doacao == false) {
				System.out.println(nome+" está apto para doar!");
			} else if (idade >= 60 && idade <= 69 && doacao == true) {
				System.out.println(nome+" não está apto para doar!");
			} else {
				System.out.println(nome+" não está apto para doar!");
			}
					
			
			

	}

}
