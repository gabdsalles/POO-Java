package aula6;

public class Pessoa {
	
	String nome;
	int idade;
	double peso;
	int quantidadeFilhos;
	
	//m�todo construtor (mesmo nome da classe) -> inicializar vari�veis
	//this.nome -> autorrefer�ncia (inst�ncia) / nome = local;
	public Pessoa (String nome, int idade, double peso, int quantidadeFilhos) {
		
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.quantidadeFilhos = quantidadeFilhos;
	}
	
	public Pessoa (String nome, int idade, double peso) { 
		
		this(nome, idade, peso, 0); //invoca o m�todo construtor com 4 argumentos.
	}
	
	public Pessoa (String nome) {
		
		this(nome, 0, 0.0, 0);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", quantidadeFilhos=" + quantidadeFilhos
				+ "]";
	}

}
