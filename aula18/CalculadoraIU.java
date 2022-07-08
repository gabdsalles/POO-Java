package aula18;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraIU {
	
	private Scanner input;
	private CalculadoraService calcService;
	
	
	
	public CalculadoraIU() {
		this.input = new Scanner(System.in);
		this.calcService = new CalculadoraService();
	}

	public void escolherOperacao() {
		
		double resultado = 0.0;
		int x, y;
		
		try {
			
			System.out.println("Informe a operação:");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Potenciação");
			System.out.println("6 - Raiz quadrada");
			System.out.println("7 - Inverso");
			System.out.println("Opção: ");
			int opcao = input.nextInt();
			
			if (opcao >= 1 && opcao <= 5) {
				
				System.out.println("Informe o valor de x:");
				x = this.input.nextInt();
				
				System.out.println("Informe o valor de y:");
				y = this.input.nextInt();
			} else {
				
				System.out.println("Informe o valor de x: ");
				x = this.input.nextInt();
				y = 0;
				
			}
			
			switch(opcao) {
				case 1:
					resultado = calcService.somar(x, y);
					break;
				case 2:
					resultado = calcService.subtrair(x, y);
					break;
				case 3:
					resultado = calcService.multiplicar(x, y);
					break;
				case 4:
					resultado = calcService.dividir(x, y);
					break;
				case 5:
					resultado = calcService.calcularPotencia(x, y);
					break;
				case 6:
					resultado = calcService.calcularRaizQuadrada(x);
					break;
				case 7:
					resultado = calcService.calcularInverso(x);
					break;
			}
		} catch (NumeroNaoNaturalException nnne) {
			
			System.out.println(nnne.getMessage());
		}
		
		catch(ArithmeticException ae) {
			
			System.out.println("Erro: divisão por zero é impossível.");
			System.out.println(ae.getMessage());
			
		} catch(InputMismatchException ime) {
			
			System.out.println("Informe apenas valores inteiros.");
			System.out.println(ime.getMessage());
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("Resultado = " + resultado);
	}

}
