package lista2;

public class Notebook {
	
	String marca;
	String modelo;
	int polegadas;
	String modeloProc;
	int memoriaRAM;
	int armazenamento;
	
	public void ligar() {
		
		System.out.println(modelo + " está ligando.");
		
	}
	
	public void desligar() {
		
		System.out.println(modelo + " está desligando.");
		
	}
	
	public void processarInformações () {
		
		System.out.println(modelo + " está processando informações.");
		
	}
	
	public void conectarInternet() {
		
		System.out.println(modelo + " está conectando à Internet.");
		
	}

}
