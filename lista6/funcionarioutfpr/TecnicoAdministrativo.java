package lista6.funcionarioutfpr;

public class TecnicoAdministrativo extends Funcionario {
	
	private double adicionalNoturno;
	private Processo processo;
	
	
	public TecnicoAdministrativo(int registro, String nome, String dataAdmissao, double salarioBase,
			double adicionalNoturno, Processo processo) {
		super(registro, nome, dataAdmissao, salarioBase);
		this.adicionalNoturno = adicionalNoturno;
		this.processo = processo;
	}
	
	public void calcularSalario() {
		
		this.salario = this.salarioBase + this.adicionalNoturno;
	}
	
	public void imprimirRelatorio () {
		
		this.calcularSalario();
		super.imprimirRelatorio();
		System.out.println("Número do processo: " + this.processo.getNumero());
		System.out.println("Data da criação do processo: " + this.processo.getDataCriacao());
		System.out.println("Descrição do processo: " + this.processo.getDescricao());
		
	}

}
