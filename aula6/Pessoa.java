package aula6;

public class Pessoa {
	
	String nome;
	int idade;
	double peso;
	int quantidadeFilhos;
	
	//método construtor (mesmo nome da classe) -> inicializar variáveis
	//this.nome -> autorreferência (instância) / nome = local;
	public Pessoa (String nome, int idade, double peso, int quantidadeFilhos) {
		
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.quantidadeFilhos = quantidadeFilhos;
	}
	
	public Pessoa (String nome, int idade, double peso) { 
		
		this(nome, idade, peso, 0); //invoca o método construtor com 4 argumentos.
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
