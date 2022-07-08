package aula2;

import java.util.Scanner;

public class MaiorInteiro {
	
public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Informe o primeiro valor:");
		a = entradaTeclado.nextInt();
		
		System.out.println("Informe o segundo valor:");
		b = entradaTeclado.nextInt();
		
		System.out.println("Informe o terceiro valor:");
		c = entradaTeclado.nextInt();
		
		if (a > b && a > c) {
			System.out.println(a);
		}
		if (b > c && b > a) {
			System.out.println(b);
		}
		if (c > a && c > b) {
			System.out.println(c);
		}
		
	}

}
