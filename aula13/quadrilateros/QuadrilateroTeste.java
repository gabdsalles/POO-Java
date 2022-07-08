package aula13.quadrilateros;

import java.util.Scanner;

public class QuadrilateroTeste {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int op=0;
		Quadrilatero figura = null;
		System.out.println("1-Quadrado");
		System.out.println("2-Retângulo");
		System.out.println("3-Losango");
		System.out.println("4-Sair");
		
		while (op != 4) {
			op = input.nextInt();
			
			switch(op) {
			
				case 1:
					figura = new Quadrado(12);
					figura.calcularArea();
					break;
				case 2:
					figura = new Retangulo(5, 8);
					figura.calcularArea();
					break;
				case 3:
					figura = new Losango(8, 4);
					figura.calcularArea();
					break;
				case 4:
					System.out.println("Obrigado!");
					break;
				default:
					System.out.println("Opção inválida!");
			
			}
		}
	}

}
