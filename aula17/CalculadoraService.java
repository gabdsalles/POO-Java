package aula17;

import java.util.Scanner;
import java.util.InputMismatchException;

	
public class CalculadoraService {
		
		private Scanner input;
		
		public CalculadoraService() {
			
			this.input = new Scanner(System.in);
		}
		
		public void somar() {
			
			try {
				
				System.out.println("Informe o valor de x:");
				int x = this.input.nextInt();
				
				System.out.println("Informe o valor de y:");
				int y = this.input.nextInt();
				
				int resultado = x + y;
				
				System.out.println(x + "+" + y + " = " + resultado);
			} catch (InputMismatchException ime) {
				
				System.out.println("Informe apenas valores inteiros.");
			}
		}
		
		public void subtrair() {
			
			try {
				
				System.out.println("Informe o valor de x:");
				int x = this.input.nextInt();
				
				System.out.println("Informe o valor de y:");
				int y = this.input.nextInt();
				
				int resultado = x - y;
				
				System.out.println(x + "-" + y + " = " + resultado);
				
			} catch (InputMismatchException ime) {
				
				System.out.println("Informe apenas valores inteiros.");
			}
		}
		
		public void multiplicar() {
			
			try {
				
				System.out.println("Informe o valor de x:");
				int x = this.input.nextInt();
				
				System.out.println("Informe o valor de y:");
				int y = this.input.nextInt();
				
				int resultado = x * y;
				
				System.out.println(x + "x" + y + " = " + resultado);
				
			} catch (InputMismatchException ime) {
				
				System.out.println("Informe apenas valores inteiros.");
			}

		}
		
		public void dividir () {
			
			try {
				
				System.out.println("Informe o valor de x:");
				int x = this.input.nextInt();
				
				System.out.println("Informe o valor de y:");
				int y = this.input.nextInt();
				
				double resultado = x / y;
				
				System.out.println(x + "/" + y + " = " + resultado);
				
			} catch(ArithmeticException ae) {
				
				System.out.println("Erro: divisão por zero é impossível.");
				System.out.println(ae.getMessage());
				
			} catch(InputMismatchException ime) {
				
				System.out.println("Informe apenas valores inteiros.");
				System.out.println(ime.getMessage());
				
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
				
			} finally {
				
				System.out.println("Executando o bloco finally.");
				
			}
		}
		
		public void calcularPotencia() {
			
			try {
				
				System.out.println("Informe o valor de x:");
				int x = this.input.nextInt();
				
				System.out.println("Informe o valor de y:");
				int y = this.input.nextInt();
				
				double resultado = Math.pow(x, y);
				
				System.out.println(x + "^" + y + " = " + resultado);
				
				
			} catch (InputMismatchException ime) {
				
				System.out.println("Informe apenas valores inteiros.");
			}
		}
		
		public void calcularRaizQuadrada() {
			
			try {
				System.out.println("Informe o valor de x: ");
				int x = this.input.nextInt();
			
				double resultado = Math.sqrt(x);
			
				System.out.println("Raiz quadrada de " + x + " = " + resultado);
				
			} catch (InputMismatchException ime) {
				
				System.out.println("Informe apenas valores inteiros.");
			}

		}
		
		public void calcularInverso() {
			
			try {
				
				System.out.println("Informe o valor de x: ");
				int x = this.input.nextInt();
				
				double resultado = 1 / x;
				
				System.out.println("O inverso de " + x + " = " + resultado);
				
			} catch (InputMismatchException ime) {
				
				System.out.println("Informe apenas valores inteiros.");
			} catch (ArithmeticException ae) {
				
				System.out.println(ae.getMessage());
			}
		}
}
