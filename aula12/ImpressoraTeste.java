package aula12;

public class ImpressoraTeste {
	
	public static void main(String[] args) {
		
		Impressora impressora = null;
		
		//simulando que o usuário escolheu laser
		//impressora = new Laser("HP", "1234 plus");
		
		//simulando que o usuário escolheu jato de tinta
		impressora = new JatoDeTinta("Cannon", "9876 Inkjet");
		
		impressora.imprimir();
	}

}
