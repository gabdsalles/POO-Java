package aula10;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Professor prof1 = new Professor ("Jo�o", 39, "Rua Vicente Machado", 567.89);
		prof1.calcularSalario();

		Aluno aluno1 = new Aluno ("Maria", 25, "Rua Baldu�no Taques", "Ci�ncia da Computa��o");
		aluno1.realizarMatricula();
	}


}
