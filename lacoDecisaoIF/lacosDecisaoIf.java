package JavaInicial;

import java.util.Scanner;

public class lacosDecisaoIf {

	public static void main(String[] args) {
		
		float n1,n2,n3,media;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		n1 = read.nextFloat();
		
		System.out.println("Entre com a primeira nota: ");
		n2 = read.nextFloat();
		
		System.out.println("Entre com a primeira nota: ");
		n3 = read.nextFloat();
		
		media = (n1+n2+n3)/3;
		System.out.println("\nMédia aritmética: "+media);
		System.out.printf("\nMédia aritmética: %.2f", media);
		
		if(media >= 7 && media <= 10) {
			System.out.println("\nAprovado");
		}else if(media>=5 && media<7) {
			System.out.println("\nAluno de exame");
		}else {
			System.out.println("\nReprovado");
		}
		

	}

}
