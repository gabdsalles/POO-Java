package lista6.funcionarioutfpr;

public class Professor extends Funcionario {
	
	private String titulacao;
	private double gratificacaoTitulacao;
	private Disciplina disciplina;
	
	
	public Professor(int registro, String nome, String dataAdmissao, double salarioBase,
			String titulacao, Disciplina disciplina) {
		super(registro, nome, dataAdmissao, salarioBase);
		
		if (titulacao.equals("Mestre")) {
			
			this.titulacao = titulacao;
			this.gratificacaoTitulacao = 1000;
			
		} else if (titulacao.equals("Doutor")) {
			
			this.titulacao = titulacao;
			this.gratificacaoTitulacao = 2000;
		} else {
			
			System.out.println("Titulação inválida!");
		}
		
		this.disciplina = disciplina;
	}
	
	public void calcularSalario() {
		
		this.salario = this.salarioBase + this.gratificacaoTitulacao;
	}
	
	public void imprimirRelatorio() {
		
		this.calcularSalario();
		super.imprimirRelatorio();
		System.out.println("Titulação do professor: " + this.titulacao);
		System.out.println("Código da disciplina ministrada: " + this.disciplina.getCodigo());
		System.out.println("Nome da disciplina: " + this.disciplina.getNome());
		System.out.println("Ementa: " + this.disciplina.getEmenta());
		System.out.println("Carga horária: " + this.disciplina.getCargaHoraria());
	}

}
