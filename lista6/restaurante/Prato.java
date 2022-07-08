package lista6.restaurante;

public abstract class Prato {
	
	protected int numero;
	protected String nome;
	protected String descricao;
	protected double precoUnitario;
	
	
	public Prato(int numero, String nome, String descricao, double precoUnitario) {
		this.numero = numero;
		this.nome = nome;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
	}


	public int getNumero() {
		return numero;
	}


	public String getNome() {
		return nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public double getPrecoUnitario() {
		return precoUnitario;
	}

}
