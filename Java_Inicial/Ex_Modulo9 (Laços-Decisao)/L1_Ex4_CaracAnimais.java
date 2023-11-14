package JavaInicial;

import java.util.Scanner;

public class L1_Ex4_CaracAnimais {
	
	enum TipoCaracteristicas {
		VERTEBRADO,
        INVERTEBRADO,
        AVE,
        MAMIFERO,
        INSETO,
        ANELIDEO,
        CARNIVORO,
        ONIVORO,
        HERBIVORO,
        HEMATOFAGO
	}
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		TipoCaracteristicas carac1 = lerCaracteristica(read, "Digite a primeira característica: ");
        TipoCaracteristicas carac2 = lerCaracteristica(read, "Digite a segunda característica: ");
        TipoCaracteristicas carac3 = lerCaracteristica(read, "Digite a terceira característica: ");
        
        determinarAnimal(carac1,carac2,carac3);
		
	}
	
	private static TipoCaracteristicas lerCaracteristica(Scanner read, String mensagem) {
        System.out.println(mensagem);
        String input = read.next().toUpperCase();
        return TipoCaracteristicas.valueOf(input);
    }
	
	private static void determinarAnimal(TipoCaracteristicas carac1, TipoCaracteristicas carac2, TipoCaracteristicas carac3) {
        if (carac1 == TipoCaracteristicas.VERTEBRADO) {
            if (carac2 == TipoCaracteristicas.AVE) {
                if (carac3 == TipoCaracteristicas.CARNIVORO) {
                    System.out.println("Águia");
                } else if (carac3 == TipoCaracteristicas.ONIVORO) {
                    System.out.println("Pomba");
                } else {
                    animalInvalido();
                }
            } else if (carac2 == TipoCaracteristicas.MAMIFERO) {
                if (carac3 == TipoCaracteristicas.ONIVORO) {
                    System.out.println("Homem");
                } else if (carac3 == TipoCaracteristicas.HERBIVORO) {
                    System.out.println("Vaca");
                } else {
                    animalInvalido();
                }
            } else {
                animalInvalido();
            }
        } else if (carac1 == TipoCaracteristicas.INVERTEBRADO) {
            if (carac2 == TipoCaracteristicas.INSETO) {
                if (carac3 == TipoCaracteristicas.HEMATOFAGO) {
                    System.out.println("Pulga");
                } else if (carac3 == TipoCaracteristicas.HERBIVORO) {
                    System.out.println("Lagarta");
                } else {
                    animalInvalido();
                }
            } else if (carac2 == TipoCaracteristicas.ANELIDEO) {
                if (carac3 == TipoCaracteristicas.HEMATOFAGO) {
                    System.out.println("Sanguessuga");
                } else if (carac3 == TipoCaracteristicas.ONIVORO) {
                    System.out.println("Minhoca");
                } else {
                    animalInvalido();
                }
            } else {
                animalInvalido();
            }
        } else {
            animalInvalido();
        }
    }

    private static void animalInvalido() {
        System.out.println("Inválido");
    }
}
