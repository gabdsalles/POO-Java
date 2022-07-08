package aula14.figurasgeometricas;

public class Retangulo extends Figura {
	
	private double base;
	private double altura;
	
	public Retangulo (String cor, double base, double altura) {
		
		super(cor);
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {
		
		return this.base * this.altura;
	}
	
	public double calcularPerimetro() {
		
		return 2 * this.base + 2 * this.altura;
	}

}
