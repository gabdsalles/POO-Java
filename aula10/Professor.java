package aula10;

public class Professor extends Pessoa {
	
	private double salario;
	
	public Professor (String nome, int idade, String endereco, double salario) {
		
		super(nome, idade, endereco);
		this.salario = salario;
	}
	
	public void calcularSalario() {
		
		System.out.println("Sal�rio do (a) professor(a) " + this.nome + " � R$ " + this.salario);
	}

}
