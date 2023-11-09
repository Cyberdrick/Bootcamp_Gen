package JavaInicial;

import java.util.Scanner;

public class Ex2_Notas {

	public static void main(String[] args) {
		
		float n1,n2,n3,n4,mediaFinal;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = read.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		n2 = read.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		n3= read.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		n4 = read.nextFloat();
		
		mediaFinal = (n1+n2+n3+n4)/4;
		
		System.out.println("A media final é: "+mediaFinal);

	}

}
