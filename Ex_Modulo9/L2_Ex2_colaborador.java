package JavaInicial;

import java.util.Scanner;

public class L2_Ex2_colaborador {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String colab;
		int codColab;
		float salario, novoSalario, salReajuste;
		
		System.out.println("Digite o Código do Produto: ");
		colab = read.nextLine();
		
		System.out.println("Digite a Quantidade do Item: ");
		codColab = read.nextInt();
		
		System.out.println("Digite a Quantidade do Item: ");
		salario = read.nextFloat();
		
		switch(codColab) {
		case 1:
			salReajuste = salario*0.10f;
			novoSalario = salario+salReajuste;
			System.out.printf("Nome do Colaborador: %s \nCargo: Gerente \nSalário: %.2f", colab, novoSalario);
			break;
		case 2:
			salReajuste = salario*0.07f;
			novoSalario = salario+salReajuste;
			System.out.printf("Nome do Colaborador: %s \nCargo: Vendedor \nSalário: %.2f", colab, novoSalario);
			break;
		case 3:
			salReajuste = salario*0.09f;
			novoSalario = salario+salReajuste;
			System.out.printf("Nome do Colaborador: %s \nCargo: Supervisor \nSalário: %.2f", colab, novoSalario);
			break;
		case 4:
			salReajuste = salario*0.06f;
			novoSalario = salario+salReajuste;
			System.out.printf("Nome do Colaborador: %s \nCargo: Motorista \nSalário: %.2f", colab, novoSalario);
			break;
		case 5:
			salReajuste = salario*0.05f;
			novoSalario = salario+salReajuste;
			System.out.printf("Nome do Colaborador: %s \nCargo: Estoquista \nSalário: %.2f", colab, novoSalario);
			break;
		case 6:
			salReajuste = salario*0.08f;
			novoSalario = salario+salReajuste;
			System.out.printf("Nome do Colaborador: %s \nCargo: Técnico de TI \nSalário: %.2f", colab, novoSalario);
			break;
			default: 
				System.out.println("\nOpção inválida.");
		}

	}

}
