package lista2;

public class Televisao {
	
	String marca, resolução;
	int polegadas, canal = 0, volume = 0;
	
	public void ligar() {
		
		System.out.println(marca + " está ligando.");
	}
	
	public void desligar() {
		
		System.out.println(marca + " está desligando.");
	}
	
	public void alterarCanalParaCima() {
		
		if (canal < 100 && canal >= 0) {	
			canal++;
			System.out.println(marca + " agora está no canal " + canal);
		}
		else {
			System.out.println("Não é possível alterar o canal para cima");
		}
	}
	
	public void alterarCanalParaBaixo() {
		
		if (canal > 0 && canal <= 100) {	
			canal--;
			System.out.println(marca + " agora está no canal " + canal);
		}
		else {
			System.out.println("Não é possível alterar o canal para baixo");
		}
	}
	
	public void aumentarVolume() {
		
		if (volume < 100 && volume >= 0) {
			volume++;
			System.out.println(marca + " agora está com volume " + volume);
		}
		else {
			System.out.println("Não é possível alterar o volume para cima.");
		}
		
	}
	
	public void diminuirVolume() {
		
		if (volume > 0 && volume <= 100) {
			volume--;
			System.out.println(marca + " agora está com volume " + volume);
		}
		else {
			System.out.println("Não é possível alterar o volume para baixo.");
		}

	}
	
	public void imprimirRelatorios() {
		
		System.out.println(marca + ", " + polegadas + " polegadas, resolução " + resolução + ", canal: " + canal + ", volume: " + volume);
	}

}
