package aula12;

public class Calculadora {
	
	public void calcularMedia(double a, double b) {
		
		double media = (a+b) / (double) 2;
		System.out.println("Média = " + media);
	}
	
	public void calcularMedia(double a, double b, double c) {
		
		double media = (a+b+c) / (double) 3;
		System.out.println("Média = " + media);
	}

	public void calcularMedia(double a, double b, double c, double d) {
		
		double media = (a+b+c+d) / (double) 4;
		System.out.println("Média = " + media);
	}

}
