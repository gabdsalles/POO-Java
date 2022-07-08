package lista6.funcionarioutfpr;

public class Processo {
	
	private int numero;
	private String dataCriacao;
	private String descricao;
	
	
	public Processo(int numero, String dataCriacao, String descricao) {
		this.numero = numero;
		this.dataCriacao = dataCriacao;
		this.descricao = descricao;
	}


	public int getNumero() {
		return numero;
	}


	public String getDataCriacao() {
		return dataCriacao;
	}


	public String getDescricao() {
		return descricao;
	}

}
