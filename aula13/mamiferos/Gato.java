package aula13.mamiferos;

public class Gato extends Mamifero {
	
	public Gato(String nome) {
		
		super(nome);
	}
	
	@Override //sobreposi��o
	public void emitirSom() {
		
		System.out.println(this.nome + " est� miando.");
	}

}
