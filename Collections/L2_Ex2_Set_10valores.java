package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class L2_Ex2_Set_10valores {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		Set<Integer> listaNum = new HashSet<>();
		
		System.out.println("Digite 10 valores: ");
		
		for(int i = 0; i < 10; i++) {
			int valor;
			
			//Lê o numero digitado
			do {
				System.out.println("Valor "+(1 + i)+": ");
				valor = read.nextInt();
				// verifica se o número já foi digitado antes
				if(listaNum.contains(valor)) {
					System.out.println("Esse número já foi digitado. ");
				}
				//retorna os numeros para fora do loop
			} while (listaNum.contains(valor));
			
			//adiciona o numero digitado para cada indice
			listaNum.add(valor);
		}
		
		System.out.println("\nValores digitados:");
		
		//Instancia a classe Iterator
        Iterator<Integer> listaNumInt = listaNum.iterator();
        
        //Loop para imprimir o array na tela (hasNext() torna os valores booleanos, verificando se existe o proximo valor. Quando não existe, ele retorna false)
        while (listaNumInt.hasNext()) {
        	//Impressão dos número (next() atua como contador para o loop)
            System.out.println(listaNumInt.next());
        }
	}

}
