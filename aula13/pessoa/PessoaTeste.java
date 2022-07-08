package aula13.pessoa;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		PessoaFisica pessoa1 = new PessoaFisica("João", 25000.00, 1500.00);
		pessoa1.calcularImposto();
		
		PessoaJuridica pessoa2 = new PessoaJuridica("Empresa", 50000.00, 12);
		pessoa2.calcularImposto();
	}

}
