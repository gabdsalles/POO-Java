package aula2;

import java.util.Scanner;

public class Bhaskara {
	
public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		double a, b, c, delta;
		
		System.out.println("Informe o valor de a:");
		a = entradaTeclado.nextDouble();
		
		System.out.println("Informe o valor de b:");
		b = entradaTeclado.nextDouble();
		
		System.out.println("Informe o valor de c:");
		c = entradaTeclado.nextDouble();
		
		delta = ((b*b) - 4*a*c);
		System.out.println(delta);
	}

}
