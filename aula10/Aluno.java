package aula10;

public class Aluno extends Pessoa {
	
	private String curso;
	
	public Aluno (String nome, int idade, String endereco, String curso) {
		
		super(nome, idade, endereco);
		this.curso = curso;
	}
	
	public void realizarMatricula() {
		
		System.out.println("Matrícula de " + this.nome + " foi realizada.");
	}

}
