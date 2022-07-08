package lista4.funcionarios;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa(1234, "João da Silva", "27/04/1997", "masculino", "Informática",
		84015234, 104, "Rua Vicente Machado", "Centro", "Ponta Grossa", "PR");
		pessoa1.imprimirRelatorio();
		System.out.println("----------------------------");
		//PRIMEIRA MANEIRA
		
		pessoa1.getEndereco().setLogradouro("Monteiro Lobato");
		pessoa1.getEndereco().setNumero(689);
		pessoa1.getEndereco().setBairro("Jardim Carvalho");
		
		pessoa1.imprimirRelatorio();
		
		Endereco enderecop2 = new Endereco(104, "Rua Balduíno Taques", "Centro", "Ponta Grossa", "PR");
		Pessoa pessoa2 = new Pessoa(5678, "Maria de Oliveira", "07/02/1965", "feminino", "RH", 
				99834123, enderecop2);
		pessoa2.imprimirRelatorio();
		//SEGUNDA MANEIRA
	}

}
