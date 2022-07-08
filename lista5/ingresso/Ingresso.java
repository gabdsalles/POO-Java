package lista5.ingresso;

public class Ingresso {
	
	protected double valorIngresso;
	protected TipoIngresso tipoIngresso;
	
	
	public Ingresso(double valorIngresso, TipoIngresso tipoIngresso) {
		
		this.valorIngresso = valorIngresso;
		this.tipoIngresso = tipoIngresso;
	}
	
	public void imprimirDadosIngresso() {
		
		System.out.println("Valor do ingresso: " + this.valorIngresso);
		System.out.println("Tipo do ingresso: " + this.tipoIngresso.getNome());
	}
	
}
