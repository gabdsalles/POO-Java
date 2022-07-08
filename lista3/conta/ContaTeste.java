package lista3.conta;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta (4421, 895);
		Conta conta2 = new Conta (2341, 793);
		
		System.out.println(conta1);
		System.out.println(conta2);
		conta1.depositar(2000);
		conta1.sacar(579.34);
		conta2.depositar(632.87);
		conta2.sacar(657.12);
		conta1.verificarSaldo();
		conta2.verificarSaldo();
	
	}

}
