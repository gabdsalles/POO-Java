package aula9;

public class Pessoa {
	
	private String nome, dataNascimento, sexo, email;
	private EstadoCivil estado;
	private Endereco endereco;
	
	
	public Pessoa(String nome, String dataNascimento, String sexo, String email, EstadoCivil
			estado, int numero, String logradouro, String bairro, String cidade, String uf) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.estado = estado;
		this.endereco = new Endereco(numero, logradouro, bairro, cidade, uf);
	}
	
	public Pessoa(String nome, String dataNascimento, String sexo, String email, EstadoCivil
			estado, Endereco endereco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.estado = estado;
		this.endereco = endereco;
	} // SEGUNDA MANEIRA
	
	public void imprimirRelatorio() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de nascimento: " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("E-mail: " + this.email);
		System.out.println("Estado civil: " + this.estado);
		System.out.println("Logradouro: " + this.endereco.getLogradouro());
		System.out.println("Número: " + this.endereco.getNumero());
		System.out.println("Bairro: " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("UF: " + this.endereco.getUf());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EstadoCivil getEstado() {
		return estado;
	}

	public void setEstado(EstadoCivil estado) {
		this.estado = estado;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
