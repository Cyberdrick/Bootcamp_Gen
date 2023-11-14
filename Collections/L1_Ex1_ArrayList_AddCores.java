package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L1_Ex1_ArrayList_AddCores {

	public static void main(String[] args) {
		
		List<String> minhaLista = new ArrayList<>();
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite as cores: ");
		
		for(int i = 0; i <= 4; i++) {
            String valor = read.nextLine();
            
            System.out.println("teste");
            
            // Adicionando o valor à lista
            minhaLista.add(valor);
        }
		// Mostra lista não ordenada
		System.out.println("Sua lista não ordenada: "+minhaLista);
		
		// Método para ordenar lista
		Collections.sort(minhaLista);
		// Mostra lista ordenada
		System.out.println("\nSua lista ordenada: "+minhaLista);
		
		

	}

}