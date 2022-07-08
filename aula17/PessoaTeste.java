package aula17;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Nome:");
			String nome = input.nextLine();
			
			System.out.println("Idade:");
			int idade = input.nextInt();
			
			System.out.println("CPF:");
			int cpf = input.nextInt();
			input.nextLine();
			
			System.out.println("Logradouro:");
			String logradouro = input.nextLine();
			
			System.out.println("Número:");
			int numero = input.nextInt();
			input.nextLine();
			
			System.out.println("Bairro:");
			String bairro = input.nextLine();
			
			System.out.println("Cidade:");
			String cidade = input.nextLine();
			
			System.out.println("Estado:");
			String estado = input.nextLine();
			
			System.out.println("CEP:");
			int cep = input.nextInt();
			
			Pessoa pessoa1 = new Pessoa(nome, idade, cpf, logradouro, numero, bairro, cidade, estado, cep);
			System.out.println(pessoa1);
			
		} catch (InputMismatchException ime) {
			
			System.out.println("Informe número inteiro.");
		}
		
		
	}

}
