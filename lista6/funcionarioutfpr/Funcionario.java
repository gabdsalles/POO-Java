package lista6.funcionarioutfpr;

public abstract class Funcionario {
	
	protected int registro;
	protected String nome;
	protected String dataAdmissao;
	protected double salarioBase;
	protected double salario;
	
	
	public Funcionario(int registro, String nome, String dataAdmissao, double salarioBase) {
		this.registro = registro;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salarioBase = salarioBase;
		this.salario = 0;
	}
	
	public abstract void calcularSalario();
	
	public void imprimirRelatorio() {
		
		System.out.println("Nome do funcion�rio: " + this.nome);
		System.out.println("Registro do funcion�rio: " + this.registro);
		System.out.println("Data de admiss�o do funcion�rio: " + this.dataAdmissao);
		System.out.println("Sal�rio total do funcion�rio: " + this.salario);
	}

}
