package aula11;

public class Imovel {
	
	protected String endereco;
	protected double valorBase;
	
	
	public Imovel(String endereco, double valorBase) {
		this.endereco = endereco;
		this.valorBase = valorBase;
	}
	
	public void imprimirDados() {

		System.out.println("Endere�o: " +  this.endereco);
		System.out.println("Valor base: " + this.valorBase);
	}

}
