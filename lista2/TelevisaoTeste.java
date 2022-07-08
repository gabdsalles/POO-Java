package lista2;

public class TelevisaoTeste {
	
	public static void main(String[] args) {
		
		Televisao tv1 = new Televisao ();
		Televisao tv2 = new Televisao ();
		
		tv1.marca = "Samsung";
		tv1.polegadas = 52;
		tv1.resolução = "4K";
		
		tv2.marca = "LG";
		tv2.polegadas = 40;
		tv2.resolução = "1080p";
		
		tv1.aumentarVolume();
		tv1.imprimirRelatorios();
		
		for (int i = 0; i<113; i++) {
			tv1.alterarCanalParaCima();
		}
		
		tv1.imprimirRelatorios();
		
		tv2.diminuirVolume();
		
		for (int i = 0; i < 20; i++) {
			tv2.aumentarVolume();
		}
		
		tv1.ligar();
		tv2.desligar();
	}

}
