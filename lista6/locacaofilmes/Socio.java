package lista6.locacaofilmes;

public class Socio extends Pessoa {
	
	private long cpf;
	private Pessoa dependente;
	
	
	public Socio(String nome, String dataNascimento, long cpf, long telefone, Endereco endereco) {

		super(nome, dataNascimento, telefone, endereco);
		this.cpf = cpf;
	}


	public void setDependente(Pessoa dependente) {
		this.dependente = dependente;
	}

	
	

}
