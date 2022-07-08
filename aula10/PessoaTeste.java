package aula10;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Professor prof1 = new Professor ("João", 39, "Rua Vicente Machado", 567.89);
		prof1.calcularSalario();

		Aluno aluno1 = new Aluno ("Maria", 25, "Rua Balduíno Taques", "Ciência da Computação");
		aluno1.realizarMatricula();
	}


}
