package aula2;

import java.util.Scanner;

public class ValorCompra {
	
	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		double valor;
		
		System.out.println("Informe o valor da sua compra:");
		valor = entradaTeclado.nextDouble();
		valor = (valor >= 50) ? valor - (0.1 * valor) : valor - (0.05 * valor);
		
		System.out.println("O valor, com desconto atualizado, é: " + valor);
		
		
	}


}
