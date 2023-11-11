package JavaInicial;

import java.util.Scanner;

public class L1_Ex4_CaracAnimais {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String carac1, carac2, carac3;
		
		System.out.println("Digite a primeira característica: ");
		carac1 = read.next();
		System.out.println("Digite a segunda característica: ");
		carac2 = read.next();
		System.out.println("Digite a terceira característica: ");
		carac3 = read.next();
		
		if(carac1.equalsIgnoreCase("Vertebrado")) {
			if(carac2.equalsIgnoreCase("Ave")) {
				if(carac3.equalsIgnoreCase("Carnívoro")) {
					System.out.println("Águia");
				} else if (carac3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Pomba");
				} else {
					System.out.println("Inválido");
				}
			} else if (carac2.equalsIgnoreCase("Mamífero")){
				if(carac3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Homem");
				} else if (carac3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Vaca");
				} else {
					System.out.println("Inválido");
				}
			}
		} else if (carac1.equalsIgnoreCase("Invertebrado")) {
			if(carac2.equalsIgnoreCase("Inseto")) {
				if(carac3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Pulga");
				} else if (carac3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Lagarta");
				} else {
					System.out.println("Inválido");
				}
			} else if (carac2.equalsIgnoreCase("Anelídeo")){
				if(carac3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Sanguessuga");
				} else if (carac3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Minhoca");
				} else {
					System.out.println("Inválido");
				}
			}
		}
		
	}
}
