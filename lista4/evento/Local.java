package lista4.evento;

public class Local {
	
	private String nomeLocal;
	private Endereco endereco;
	private int capacidadeMaxima;
	
	
	public Local(String nomeLocal, Endereco endereco, int capacidadeMaxima) {
		this.nomeLocal = nomeLocal;
		this.endereco = endereco;
		this.capacidadeMaxima = capacidadeMaxima;
	}


	public String getNomeLocal() {
		return nomeLocal;
	}


	public void setNomeLocal(String nomeLocal) {
		this.nomeLocal = nomeLocal;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}


	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}


	@Override
	public String toString() {
		return "Local [nomeLocal=" + nomeLocal + ", endereco=" + endereco + ", capacidadeMaxima=" + capacidadeMaxima
				+ "]";
	}
	
	
	
	

}
