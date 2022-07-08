package aula16;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private int cnpj;
	private String nomeBanco;
	private List <Conta> contas; //apenas declara a lista
	
	public Banco(int cnpj, String nomeBanco) {
		
		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contas = new ArrayList <Conta> (); //instancia a lista no método construtor
	}
	
	public void criarNovasContas(int numeroConta, String nomeTitular) {
		
		Conta conta = new Conta(numeroConta, nomeTitular); //declara e instancia a conta
		this.contas.add(conta); //armazena a conta no vetor
		
		System.out.println("Conta " + numeroConta + " criada com sucesso." );
	}
	
	public void verificarSaldo(int numeroConta) {
		
		boolean verificacao = false;
		
		for (Conta conta : contas) {
			
			if (conta.getNumConta() == numeroConta) {
				
				conta.verificarSaldo();
				verificacao = true;
			}
		}
		
		if (!verificacao) {
			
			System.out.println("Conta inexistente.");
		}
		
		//ou poderia colocar um return dentro do if, pra quando achar a conta já voltar pra main.
	}
	
	public void realizarSaque(int numeroConta, double valor) {
		
		boolean verificacao = false;
		
		for (Conta conta : contas) {
			
			if (conta.getNumConta() == numeroConta) {
				
				conta.realizarSaque(valor);
				verificacao = true;
			}
		}
		
		if (!verificacao) {
			
			System.out.println("Conta inexistente.");
		}
	}
	
	public void realizarDeposito(int numeroConta, double valor) {
		
		boolean verificacao = false;
		
		for (Conta conta : contas) {
			
			if (conta.getNumConta() == numeroConta) {
				
				conta.realizarDeposito(valor);
				verificacao = true;
			}
		}
		
		if (!verificacao) {
			
			System.out.println("Conta inexistente.");
		}
	}
}
		
