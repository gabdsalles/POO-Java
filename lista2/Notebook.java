package lista2;

public class Notebook {
	
	String marca;
	String modelo;
	int polegadas;
	String modeloProc;
	int memoriaRAM;
	int armazenamento;
	
	public void ligar() {
		
		System.out.println(modelo + " est� ligando.");
		
	}
	
	public void desligar() {
		
		System.out.println(modelo + " est� desligando.");
		
	}
	
	public void processarInforma��es () {
		
		System.out.println(modelo + " est� processando informa��es.");
		
	}
	
	public void conectarInternet() {
		
		System.out.println(modelo + " est� conectando � Internet.");
		
	}

}
