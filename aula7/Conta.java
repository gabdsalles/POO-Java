package aula7;

public class Conta {
	
	private int numeroConta;
	private String titular;
	private double saldo;
	
	public Conta(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0;
	}
	
	public void depositar(double valor) {
		
		this.saldo += valor;
		System.out.println("Dep�sito realizado com sucesso.");
		this.calcularRendimento();
	}
	
	public void sacar(double valor) {
		
		if (this.saldo >= valor) {
			
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso.");
			
		} else {
			
			System.out.println("Saldo insuficiente.");
		}
	}
	
	private void calcularRendimento() {
		
		this.saldo *= 1.10;
	}
	
	public void imprimirSaldo () {
		
		System.out.println("N�mero da conta: " + numeroConta);
		System.out.println("Titular: " + titular);
		System.out.println("Saldo: " + saldo);
	}
	
	public void setTitular(String titular) { //m�todo para ATRIBUIR
		
		this.titular = titular;
	}
	
	public String getTitular() { //m�todo para BUSCAR
		
		return this.titular;
	}

}
