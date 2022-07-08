package lista5.funcionarios;

public class Funcionario extends Colaborador {
	
	protected String funcao;
	protected double salario;
	
	public Funcionario (String nome, String endereco, String dataInicio, String funcao, double salario) {
		
		super(nome, endereco, dataInicio);
		this.funcao = funcao;
		this.salario = salario;
	}
	
	public void imprimirDados() {
		
		super.imprimirDados();
		System.out.println("Função do funcionário: " + this.funcao);
		System.out.println("Salário do funcionário: " + this.salario);
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [funcao=" + funcao + ", salario=" + salario + ", nome=" + nome + ", endereco=" + endereco
				+ ", dataInicio=" + dataInicio + "]";
	}
	
	
	
	
	
	
	
	

}
