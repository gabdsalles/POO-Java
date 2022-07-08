package aula12;

public class JatoDeTinta extends Impressora {
	
	public JatoDeTinta(String marca, String modelo) {
		
		super(marca, modelo);
	}
	
	public void imprimir() {
		
		System.out.println(this.marca + " " + this.modelo + " está imprimindo.");
	}


}
