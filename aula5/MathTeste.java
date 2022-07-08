package aula5;

import java.util.Scanner;

public class MathTeste {
	
	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner (System.in);
		
		System.out.println("Primeiro valor: ");
		double valor1 = entradaTeclado.nextDouble();
		System.out.println("Segundo valor: ");
		double valor2 = entradaTeclado.nextDouble();
		
		double valorMaior = Math.max(valor1, valor2);
		double raizValor1 = Math.sqrt(valor1);
		double potencia = Math.pow(valor1, valor2);
		
		System.out.println(valorMaior);
		System.out.println(raizValor1);
		System.out.println(potencia);
		
		entradaTeclado.close();
		
	}

}
