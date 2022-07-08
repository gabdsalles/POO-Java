package lista3.funcionarios;

import java.util.Scanner;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		
		//Dois modos: 
		//1) método construtor
		//2) ou perguntando ao usuário
		Funcionario func1 = new Funcionario();
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Informe número para registro: ");
		func1.setNumeroRegistro(entradaTeclado.nextInt());
		
		entradaTeclado.nextLine();
		
		System.out.println("Informe seu nome: ");
		func1.setNome(entradaTeclado.nextLine());
		
		System.out.println("Informe seu sexo: ");
		func1.setSexo(entradaTeclado.nextLine());
		
		System.out.println("Informe o setor no qual você trabalha: ");
		func1.setSetor(entradaTeclado.nextLine());
		
		System.out.println("Informe seu endereço: ");
		func1.setEndereco(entradaTeclado.nextLine());
		
		System.out.println("Informe sua data de nascimento");
		func1.setDiaNascimento(entradaTeclado.nextInt());
		func1.setMesNascimento(entradaTeclado.nextInt());
		func1.setAnoNascimento(entradaTeclado.nextInt());
		
		System.out.println("Informe seu telefone: ");
		func1.setTelefone(entradaTeclado.nextInt());
		
		func1.imprimirRelatorio();
		
		entradaTeclado.close();	
	}

}
