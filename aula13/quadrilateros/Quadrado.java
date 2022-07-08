package aula13.quadrilateros;

public class Quadrado extends Quadrilatero {
	
	private double lado;
	
	public Quadrado(double lado) {
		
		this.lado = lado;
	}
	
	public void calcularArea() {
		
		double area = Math.pow(this.lado, 2);
		System.out.println("Área = " + area);
	}


}
