package lista3.conta;

public class Conta {
	
	private int numAgencia, numConta;
	private double saldo;
	
	
	public Conta(int numAgencia, int numConta) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldo = 0;
	}
	
	public void depositar(double valor) {
		
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");
	}
	
	public void sacar(double valor) {
		
		if (this.saldo >= valor) {
			
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso.");
			
		} else {
			
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public void verificarSaldo () {
		System.out.println("O saldo atual da conta " + this.numConta + " é " + this.saldo);
	}
	
	@Override
	public String toString() {
		return "Conta [numAgencia=" + numAgencia + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}

}
