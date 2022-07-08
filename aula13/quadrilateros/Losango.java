package aula13.quadrilateros;

public class Losango extends Quadrilatero {
	
	private double diagonalMenor;
	private double diagonalMaior;
	
	
	public Losango(double diagonalMenor, double diagonalMaior) {
		this.diagonalMenor = diagonalMenor;
		this.diagonalMaior = diagonalMaior;
	}
	
	public void calcularArea() {
		
		double area = (this.diagonalMaior * this.diagonalMenor) / 2;
		System.out.println("Área = " + area);
	}

}
