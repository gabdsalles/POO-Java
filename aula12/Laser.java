package aula12;

public class Laser extends Impressora {
	
	public Laser(String marca, String modelo) {
		
		super(marca, modelo);
	}
	
	public void imprimir() {
		
		System.out.println("A impressora Laser está imprimindo o documento.");
	}

}
