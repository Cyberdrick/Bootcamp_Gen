package JavaInicial;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String sono;
		String coffee;
		
		System.out.println("Você está com sono? (Sim/Nao)");
		sono = sc.nextLine();
		
		
		if (sono.equals("Sim")) {
			
			System.out.println("Quer um café? (Sim/Nao)");
			coffee = sc.nextLine();
			
			if(coffee.equals("Sim")) {
				System.out.println("~VocÊ tomou seu cafezinho no capricho~");
			} else {
				System.out.println("~Você negou o cafezinho~");
			}
		} else {
			System.out.println("~Você não precisa de cafezinho nesse momento~");
		}
		
	}

}
