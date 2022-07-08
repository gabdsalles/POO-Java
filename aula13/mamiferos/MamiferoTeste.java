package aula13.mamiferos;

import java.util.Scanner;

public class MamiferoTeste {
	
	public static void main(String[] args) {
		
		Mamifero mamifero = null;
		Scanner input = new Scanner (System.in);
		// mamifero = new Gato("Garfield");
		int op;
		System.out.println("1-Gato, 2-Cachorro");
		op = input.nextInt();
		
		switch(op) {
		
			case 1:
				mamifero = new Gato("Garfield");
				break;
			
			case 2:
				mamifero = new Cachorro("Spike");
				break;
				
			}
		mamifero.emitirSom();
		
		
		/*Gato gato1 = new Gato("Garfield");
		gato1.emitirSom();
		
		Cachorro cachorro1 = new Cachorro("Spike");
		cachorro1.emitirSom();*/
	}

}
