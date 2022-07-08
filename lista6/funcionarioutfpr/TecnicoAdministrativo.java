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
		System.out.println("N�mero do processo: " + this.processo.getNumero());
		System.out.println("Data da cria��o do processo: " + this.processo.getDataCriacao());
		System.out.println("Descri��o do processo: " + this.processo.getDescricao());
		
	}

}
