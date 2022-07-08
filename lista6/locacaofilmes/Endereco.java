package lista6.locacaofilmes;

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String bairro;
	private long cep;
	private String cidade;
	private String uf;
	
	
	public Endereco(String logradouro, int numero, String bairro, long cep, String cidade, String uf) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	

}
