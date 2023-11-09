package JavaInicial;

import java.util.Scanner;

public class Ex3_sBruto {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		float salBruto, addNotur, horaExtra, desconto, salLiqui;
		
		System.out.println("Digite seu Salário Bruto: ");
		salBruto = read.nextFloat();
		
		System.out.println("Digite seu Adicional Noturno: ");
		addNotur = read.nextFloat();
		
		System.out.println("Digite seu Hora Extra: ");
		horaExtra = read.nextFloat();
		
		System.out.println("Digite seu Desconto: ");
		desconto = read.nextFloat();
		
		salLiqui = salBruto + addNotur + (horaExtra*5) - desconto;
		
		System.out.println("Seu Salário Líquido é: :"+salLiqui);
		
		
	}

}
