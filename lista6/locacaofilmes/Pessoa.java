package lista6.locacaofilmes;

public abstract class Pessoa {
	
	private String nome;
	private String dataNascimento;
	private long telefone;
	private Endereco endereco;
	
	
	public Pessoa(String nome, String dataNascimento, long telefone, Endereco endereco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}


	
	
	
	

}
