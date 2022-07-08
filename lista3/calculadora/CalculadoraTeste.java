package lista3.calculadora;

public class CalculadoraTeste {
	
	public static void main(String[] args) {
		
		Calculadora calc1 = new Calculadora("Casio", "GTX", "científica", 256);
		double resultado = calc1.somar(5, 6);
		System.out.println(resultado);
		resultado = calc1.subtrair(-1, -8);
		System.out.println(resultado);
	}

}
