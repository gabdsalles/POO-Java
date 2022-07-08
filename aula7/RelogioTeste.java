package aula7;

public class RelogioTeste {
	
	public static void main(String[] args) {
		
		Relogio relogio1 = new Relogio("Casio", 6, 23);
		System.out.println(relogio1);
		relogio1.setHora(8);
		System.out.println(relogio1);
	}

}
