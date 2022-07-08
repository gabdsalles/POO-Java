package aula18;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraService {
	
	private Scanner input;
	
	public double somar(double x, double y) throws InputMismatchException {
		
		return x + y;
	}
	
	public double subtrair(double x, double y) throws InputMismatchException {
		
		return x - y;
	}
	
	public double multiplicar(double x, double y) throws InputMismatchException {
		
		return x * y;

	}
	
	public double dividir (double x, double y) throws ArithmeticException, InputMismatchException, Exception {
		
		return x / y;
		
	}
	
	public double calcularPotencia(double x, double y) throws InputMismatchException {
		
		return Math.pow(x, y);

	}
	
	public double calcularRaizQuadrada(double x) throws NumeroNaoNaturalException, InputMismatchException{
		
		if (x < 0) {
			
			//throw new NumeroNaoNaturalException("Erro: número menor que 0");
			throw new NumeroNaoNaturalException();
		}
		
		return Math.sqrt(x);
	}
	
	public double calcularInverso(double x) {
		
		return 1 / x;
	}

}
