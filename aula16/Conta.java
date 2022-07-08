package aula16;

public class Conta {
	
	private int numConta;
	private double saldo;
	private String nomeTitular;
	
	
	public Conta(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.saldo = 0;
		this.nomeTitular = nomeTitular;
	}
	
	public void verificarSaldo() {
		
		System.out.println("===========SALDO===========");
		System.out.println("Número da conta: " + this.numConta);
		System.out.println("Titular: " + this.nomeTitular);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("===========================");
	}
	
	public void realizarSaque(double valor) {
		
		if (valor <= this.saldo) {
			
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso da conta " + this.numConta + " :)");
			
		} else {
			
			System.out.println("Saldo insuficiente da conta " + this.numConta + " :(");
		}
		
	}
	
	public void realizarDeposito(double valor) {
		
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso da conta " + this.numConta + " :)");
		
	}

	public int getNumConta() {
		return numConta;
	}

}
