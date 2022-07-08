package lista4.banco;

public class Titular {
	
	private int cpf;
	private int rg;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private double rendaMensal;
	private Endereco endereco;
	
	//método construtor
	public Titular(int cpf, int rg, String nome, String dataNascimento, String sexo, double rendaMensal,
			Endereco endereco) {
		
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.rendaMensal = rendaMensal;
		this.endereco = endereco;
		
	}

	public int getCpf() {
		return cpf;
	}

	public int getRg() {
		return rg;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public double getRendaMensal() {
		return rendaMensal;
	}

	public Endereco getEndereco() {
		return endereco;
	}

}
