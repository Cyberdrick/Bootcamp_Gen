package JavaInicial;

import java.util.Scanner;

public class somaNumerosPositivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, soma = 0;

        do {
            System.out.println("Digite um número (para encerrar, digite 0): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                soma += numero; // Adiciona apenas números positivos a soma
            }
        } while (numero != 0);

        System.out.println("A soma dos números positivos digitados é: " + soma);
    }
}
