package aula13.quadrilateros;

public class Retangulo extends Quadrilatero {
	
	private double base;
	private double altura;
	
	
	public Retangulo(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
	}
	
	public void calcularArea() {
		
		double area = this.base * this.altura;
		System.out.println("Área = " + area);
		
	}

}
