package JavaInicial;

import java.util.Scanner;

public class compararNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 >= num2) {
            System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo.");
        } else {
            System.out.println("No intervalo de " + num1 + " a " + num2 + ":");
            for (int i = num1; i <= num2; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    System.out.print(i + " é Multiplo de 3 e 5\n");
                }
            }
        }
    }
}