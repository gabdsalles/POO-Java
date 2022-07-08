package lista5.funcionarios;

public class Empresa extends Prestador {
	
	private long cnpj;
	
	public Empresa (String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cnpj) {
		
		super(nome, endereco, dataInicio, valorHora, tipoServico);
		this.cnpj = cnpj;
	}
	
	public void imprimirDados() {
		
		super.imprimirDados();
		System.out.println("CNPJ da empresa: " + this.cnpj);
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Empresa [cnpj=" + cnpj + ", valorHora=" + valorHora + ", tipoServico=" + tipoServico + ", nome=" + nome
				+ ", endereco=" + endereco + ", dataInicio=" + dataInicio + "]";
	}
	
	

}
