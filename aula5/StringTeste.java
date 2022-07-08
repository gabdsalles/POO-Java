package aula5;

import java.util.Scanner;

public class StringTeste {
	
	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner (System.in);
		
		System.out.println("Informe a string 1: ");
		String s1 = entradaTeclado.nextLine();
		String [] s1Dividida = s1.split(" ");
		System.out.println(s1.charAt(3));
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		
		for (int i = 0; i < 3; i++) {
			System.out.println(s1Dividida[i]);
		}
		
		System.out.println("Informe a string 2");
		String s2 = entradaTeclado.nextLine();
		if (s1.equals(s2)) {
			System.out.println("as strings são iguais!");
		}
		else {
			System.out.println("strings diferentes.");
		}
		
		entradaTeclado.close();
	}
	

}
