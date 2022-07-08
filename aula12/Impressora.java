package aula12;

public class Impressora {
	
	protected String modelo;
	protected String marca;
	
	public Impressora(String marca, String modelo) {
		
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void imprimir() {
		
		System.out.println("executando método imprimir() da classe pai!");
	}

}
