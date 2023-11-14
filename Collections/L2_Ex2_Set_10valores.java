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
			
			do {
				System.out.println("Valor "+(1 + i)+": ");
				valor = read.nextInt();
				if(listaNum.contains(valor)) {
					System.out.println("Esse número já foi digitado. ");
				}
			} while (listaNum.contains(valor));
			
			listaNum.add(valor);
		}
		
		System.out.println("\nValores digitados:");
        Iterator<Integer> iterator = listaNum.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        read.close();
	}

}
