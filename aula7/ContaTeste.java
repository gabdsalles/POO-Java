package aula7;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta (111, "João da Silva");
		conta1.imprimirSaldo();
		conta1.depositar(500.00);
		conta1.sacar(100.00);
		conta1.imprimirSaldo();
		
		conta1.setTitular("Maria de Oliveira");
		System.out.println(conta1.getTitular());
	}


}
