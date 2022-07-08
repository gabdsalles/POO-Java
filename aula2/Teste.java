package aula2;

import java.util.Scanner;

public class Teste {

	public static void main (String [] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		String nome, sexo, estadoCivil, escolaridade;
		int idade, qtfilhos;
		double renda;
		
		System.out.println("Informe seu nome:");
		nome = entradaTeclado.nextLine();
		
		// entradaTeclado.nextLine();
		
		System.out.println("Informe seu sexo:");
		sexo = entradaTeclado.nextLine();
		
		System.out.println("Informe seu estado civil:");
		estadoCivil = entradaTeclado.nextLine();
		
		System.out.println("Quantos filhos você tem?");
		qtfilhos = entradaTeclado.nextInt();
		
		entradaTeclado.nextLine();
		
		System.out.println("Informe sua escolaridade");
		escolaridade = entradaTeclado.nextLine();
		
		System.out.println("Informe sua renda mensal:");
		renda = entradaTeclado.nextDouble();
		
		System.out.println(nome + " é do sexo " + sexo + ", está " + estadoCivil + ", possui " + qtfilhos + " filhos, tem " + escolaridade + " e ganha "+ renda + " por mês.");
	}
}
