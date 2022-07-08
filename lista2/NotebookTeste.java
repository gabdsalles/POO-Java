package lista2;

public class NotebookTeste {
	
	public static void main(String[] args) {
		
		Notebook note1 = new Notebook();
				
		note1.modelo = "MacBook Pro";
		note1.marca = "Mac";
		note1.polegadas = 20;
		note1.modeloProc = "Intel";
		note1.memoriaRAM = 8;
		note1.armazenamento = 256;
		
		note1.ligar();
		note1.processarInformações();
		note1.conectarInternet();
		note1.desligar();
		
		System.out.println(note1.modelo);
		System.out.println(note1.marca);
		System.out.println(note1.polegadas);
		System.out.println(note1.modeloProc);
		System.out.println(note1.memoriaRAM);
		System.out.println(note1.armazenamento);
	}

}
