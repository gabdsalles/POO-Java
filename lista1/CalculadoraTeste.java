package lista1;

public class CalculadoraTeste {
	
	public static void main(String[] args) {
		
		Calculadora calc1 = new Calculadora ();
		Calculadora calc2 = new Calculadora ();
		
		calc1.marca = "ABC";
		calc1.modelo = "Modelo 567";
		calc1.tipo = "básica";
		calc1.memoriaInterna = 20;
		
		calc2.marca = "XYZ";
		calc2.modelo = "Modelo 234";
		calc2.tipo = "científica";
		calc2.memoriaInterna = 100;
		
		System.out.println("Calculadora 1: " + calc1.marca +  " " + calc1.modelo + " " + calc1.tipo + " " + calc1.memoriaInterna);
		System.out.println("Calculadora 2: " + calc2.marca + " " + calc2.modelo + " " + calc2.tipo + " " + calc2.memoriaInterna);
	}

}
