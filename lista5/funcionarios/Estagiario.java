package lista5.funcionarios;

public class Estagiario extends Funcionario {
	
	private int ciee;
	
	public Estagiario (String nome, String endereco, String dataInicio, String funcao, double salario, int ciee) {
		
		super(nome, endereco, dataInicio, funcao, salario);
		this.ciee = ciee;
	}
	
	public void imprimirDados() {
		
		super.imprimirDados();
		System.out.println("Carteira de estagiário: " + this.ciee);
	}

	public int getCiee() {
		return ciee;
	}

	public void setCiee(int ciee) {
		this.ciee = ciee;
	}

	@Override
	public String toString() {
		return "Empregado [ciee=" + ciee + ", funcao=" + funcao + ", salario=" + salario
				+ ", nome=" + nome + ", endereco=" + endereco + ", dataInicio=" + dataInicio + "]";
	}

}
