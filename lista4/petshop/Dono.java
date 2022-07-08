package lista4.petshop;

public class Dono {
	
	private int cpf;
	private String nome;
	private int telefone;
	private String email;
	private Endereco endereco;
	
	
	public Dono(int cpf, String nome, int telefone, String email, Endereco endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}


	public int getCpf() {
		return cpf;
	}


	public String getNome() {
		return nome;
	}


	public int getTelefone() {
		return telefone;
	}


	public String getEmail() {
		return email;
	}


	public Endereco getEndereco() {
		return endereco;
	}
	
	
	
	
	

}
