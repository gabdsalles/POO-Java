package lista4.banco;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		Endereco end1 = new Endereco (104, "Rua Doutor Jamil Mussi", "Jd. Carvalho", "Ponta Grossa", "PR");
		Titular pessoa1 = new Titular(193456234, 138461423, "Gabriel Dalzoto Salles", "11/03/2002", "masculino", 5002.34, end1);
		Conta conta1 = new Conta(1, pessoa1);
		
		conta1.depositar(500);
		conta1.sacar(250);
		conta1.depositar(467);
		conta1.imprimirSaldo();
		conta1.sacar(750);
		conta1.depositar(2000);
		conta1.imprimirSaldo();
	}

}
