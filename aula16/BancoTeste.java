package aula16;

public class BancoTeste {
	
	public static void main(String[] args) {
		
		Banco banco = new Banco (123456, "NewBank");
		
		banco.criarNovasContas(1, "João da Silva");
		banco.criarNovasContas(2, "Maria de Oliveira");
		banco.criarNovasContas(3, "Ricardo Carvalho");
		
		banco.realizarDeposito(2, 1000.00);
		banco.realizarDeposito(3, 650.00);
		banco.realizarSaque(2, 150.00);
		banco.verificarSaldo(1);
		banco.verificarSaldo(2);
		banco.verificarSaldo(3);
		banco.verificarSaldo(16);
		
	}

}
