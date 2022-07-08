package lista5.funcionarios;

public class Autonomo extends Prestador {
	
	private long cpf;
	
	public Autonomo(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cpf) {
		
		super(nome, endereco, dataInicio, valorHora, tipoServico);
		this.cpf = cpf;
	}
	
	public void imprimirDados() {
		
		super.imprimirDados();
		System.out.println("CPF do autônomo: " + this.cpf);
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Autonomo [cpf=" + cpf + ", valorHora=" + valorHora + ", tipoServico=" + tipoServico + ", nome=" + nome
				+ ", endereco=" + endereco + ", dataInicio=" + dataInicio + "]";
	}

}
