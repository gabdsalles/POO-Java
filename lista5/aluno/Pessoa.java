package lista5.aluno;

public class Pessoa {
	
	protected String nome;
	protected String nascimento;
	protected long rg;
	protected long cpf;
	
	
	public Pessoa(String nome, String nascimento, long rg, long cpf) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public void emitirRelatorio () {
			
		System.out.println("Nome do aluno:" + this.nome);
		System.out.println("Data de nascimento do aluno:" + this.nascimento);
		System.out.println("RG do aluno: " + this.rg);
		System.out.println("CPF do aluno: " + this.cpf);
	}

}
