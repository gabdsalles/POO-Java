package aula9;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("João da Silva", "27/04/1997", "masculino", "joao@gmail.com", 
				EstadoCivil.SOLTEIRO, 104, "Rua Vicente Machado", "Centro", "Ponta Grossa", "PR");
		pessoa1.imprimirRelatorio();
		System.out.println("----------------------------");
		//PRIMEIRA MANEIRA
		
		pessoa1.getEndereco().setLogradouro("Monteiro Lobato");
		pessoa1.getEndereco().setNumero(689);
		pessoa1.getEndereco().setBairro("Jardim Carvalho");
		
		pessoa1.imprimirRelatorio();
		
		Endereco enderecop2 = new Endereco(104, "Rua Balduíno Taques", "Centro", "Ponta Grossa", "PR");
		Pessoa pessoa2 = new Pessoa("Maria de Oliveira", "07/02/1965", "feminino", "maria@gmail.com", 
				EstadoCivil.SOLTEIRO, enderecop2);
		pessoa2.imprimirRelatorio();
		
		
	}

}
