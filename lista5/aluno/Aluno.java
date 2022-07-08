package lista5.aluno;

public class Aluno extends Pessoa {
	
	private int numeroMatricula;
	
	public Aluno (String nome, String nascimento, long rg, long cpf, int numeroMatricula) {
		super (nome, nascimento, rg, cpf);
		this.numeroMatricula = numeroMatricula;
	}
	
	public void emitirRelatorio () {
		
		System.out.println("Nome do aluno:" + this.nome);
		System.out.println("Data de nascimento do aluno:" + this.nascimento);
		System.out.println("RG do aluno: " + this.rg);
		System.out.println("CPF do aluno: " + this.cpf);
		System.out.println("Número de matrícula do aluno: " + this.numeroMatricula);
	}

}
