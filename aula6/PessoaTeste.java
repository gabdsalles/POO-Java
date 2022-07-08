package aula6;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa ("João da Silva", 30, 75.9);
		Pessoa pessoa2 = new Pessoa ("Maria de Oliveira");
		Pessoa pessoa3 = new Pessoa ("Ricardo Carvalho", 25, 67.8, 2);
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
	}

}
