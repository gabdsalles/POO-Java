package aula16;

public class Carro {
	
	private String placa;
	private String modelo;
	
	
	public Carro(String placa, String modelo) {
		super();
		this.placa = placa;
		this.modelo = modelo;
	}


	public String getPlaca() {
		return placa;
	}


	public String getModelo() {
		return modelo;
	}


	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", modelo=" + modelo + "]";
	}

}
