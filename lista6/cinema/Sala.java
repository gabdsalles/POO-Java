package lista6.cinema;

public class Sala {
	
	private int numIdentificao;
	private int capacidadeMaxima;
	
	public Sala (int numIdentificacao, int capacidadeMaxima) {
		
		this.numIdentificao = numIdentificacao;
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	
	public int getNumIdentificao() {
		return numIdentificao;
	}
	public void setNumIdentificao(int numIdentificao) {
		this.numIdentificao = numIdentificao;
	}
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

}
