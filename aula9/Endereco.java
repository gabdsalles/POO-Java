package aula9;

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


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}

}
