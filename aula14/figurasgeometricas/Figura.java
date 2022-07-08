package aula14.figurasgeometricas;

public abstract class Figura {
	
	protected String cor;
	
	public Figura(String cor) {
		
		this.cor = cor;
	}
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();


}
