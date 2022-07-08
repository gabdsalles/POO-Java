package aula14.figurasgeometricas;

public class Circulo extends Figura {
	
	private double raio;
	
	public Circulo (String cor, double raio) {
		
		super(cor);
		this.raio = raio;
	}
	
	public double calcularArea() {
		
		return Math.PI * Math.pow(this.raio, 2);
	}
	
	public double calcularPerimetro() {
		
		return 2.00 * Math.PI * this.raio;
	}

}
