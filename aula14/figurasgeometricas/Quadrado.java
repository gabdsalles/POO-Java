package aula14.figurasgeometricas;

public class Quadrado extends Figura {
	
	private double lado;
	
	public Quadrado (String cor, double lado) {
		
		super(cor);
		this.lado = lado;
	}
	
	public double calcularArea() {
		
		return Math.pow(this.lado, 2);
	}
	
	public double calcularPerimetro() {
		
		return 4 * this.lado;
	}

}
