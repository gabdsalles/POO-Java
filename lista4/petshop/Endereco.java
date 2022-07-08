package lista4.petshop;

public class Endereco {
	
	private int numero;
	private String logradouro, bairro, cidade, uf;
	
	
	public Endereco(int numero, String logradouro, String bairro, String cidade, String uf) {
		this.numero = numero;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}


	@Override
	public String toString() {
		return "Endereco [numero=" + numero + ", logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", uf=" + uf + "]";
	}


	public int getNumero() {
		return numero;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public String getBairro() {
		return bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public String getUf() {
		return uf;
	}

}
