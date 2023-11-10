package JavaInicial;

import java.util.Scanner;

public class lerIdadePessoas {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int idade, menorQue = 0, maiorQue = 0;
		
		while (true) {
            System.out.println("Digite a idade (para encerrar, digite uma idade negativa): ");
            idade = read.nextInt();

            if (idade < 0) {
                break;
            }

            if (idade < 21) {
                menorQue++;
            } else if (idade > 50) {
                maiorQue++;
            }
        }

        System.out.println("Total de pessoas menores de 21 anos: " + menorQue);
        System.out.println("Total de pessoas maiores de 50 anos: " + maiorQue);
    }

}
