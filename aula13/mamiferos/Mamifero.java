package aula13.mamiferos;

public class Mamifero {
	
	protected String nome;
	
	public Mamifero(String nome) {
		
		this.nome = nome;
	}

	public void emitirSom() {
		
		System.out.println(this.nome + " est� emitindo som gen�rico.");
	}

}
