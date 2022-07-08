package lista3.calculadora;

public class Calculadora {
	
	private String marca;
	private String modelo;
	private String tipo;
	private int memoriaInterna;
	
	public Calculadora(String marca, String modelo, String tipo, int memoriaInterna) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memoriaInterna = memoriaInterna;
	}

	public double somar(double a, double b) {
		return a + b;
	}
	
	public double subtrair(double a, double b) {
		return a - b;
	}
	
	public double multiplicar(double a, double b) {
		return a*b;
	}
	
	public double dividir(double a, double b) {
		return a / b;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public int getMemoriaInterna() {
		return memoriaInterna;
	}

}
