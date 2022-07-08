package lista4.banco;

public class Conta {
	
	private int numeroConta;
	private Titular titular;
	private double saldo;
	
	public Conta(int numeroConta, Titular titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0;
	}
	
	public void depositar(double valor) {
		
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");
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
		
		System.out.println("Número da conta: " + numeroConta);
		//agora, os dados do titular:
		System.out.println("Nome do titular: " + this.titular.getNome());
		System.out.println("CPF do titular: " + this.titular.getCpf());
		System.out.println("RG do titular: " + this.titular.getRg());
		System.out.println("Data de nascimento do titular: " + this.titular.getDataNascimento());
		System.out.println("Renda mensal do titular: " + this.titular.getRendaMensal());
		System.out.println("Sexo do titular: " + this.titular.getSexo());
		//endereço
		System.out.println("Endereço do titular: " + this.titular.getEndereco().getLogradouro()
			+ ", " + this.titular.getEndereco().getNumero() + ", " + this.titular.getEndereco().getBairro() + "."	);
		System.out.println("Cidade do titular: " + this.titular.getEndereco().getCidade() + ", " + this.titular.getEndereco().getUf());
		System.out.println("Saldo: R$ " + saldo);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public Titular getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

}
