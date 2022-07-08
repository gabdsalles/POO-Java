package lista2;

public class Televisao {
	
	String marca, resolu��o;
	int polegadas, canal = 0, volume = 0;
	
	public void ligar() {
		
		System.out.println(marca + " est� ligando.");
	}
	
	public void desligar() {
		
		System.out.println(marca + " est� desligando.");
	}
	
	public void alterarCanalParaCima() {
		
		if (canal < 100 && canal >= 0) {	
			canal++;
			System.out.println(marca + " agora est� no canal " + canal);
		}
		else {
			System.out.println("N�o � poss�vel alterar o canal para cima");
		}
	}
	
	public void alterarCanalParaBaixo() {
		
		if (canal > 0 && canal <= 100) {	
			canal--;
			System.out.println(marca + " agora est� no canal " + canal);
		}
		else {
			System.out.println("N�o � poss�vel alterar o canal para baixo");
		}
	}
	
	public void aumentarVolume() {
		
		if (volume < 100 && volume >= 0) {
			volume++;
			System.out.println(marca + " agora est� com volume " + volume);
		}
		else {
			System.out.println("N�o � poss�vel alterar o volume para cima.");
		}
		
	}
	
	public void diminuirVolume() {
		
		if (volume > 0 && volume <= 100) {
			volume--;
			System.out.println(marca + " agora est� com volume " + volume);
		}
		else {
			System.out.println("N�o � poss�vel alterar o volume para baixo.");
		}

	}
	
	public void imprimirRelatorios() {
		
		System.out.println(marca + ", " + polegadas + " polegadas, resolu��o " + resolu��o + ", canal: " + canal + ", volume: " + volume);
	}

}
