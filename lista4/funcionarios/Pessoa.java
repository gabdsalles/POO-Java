package lista4.funcionarios;

public class Pessoa {
	
	private int numRegistro;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private int telefone;
	private Endereco endereco1;
	
	
	public Pessoa(int numRegistro, String nome, String dataNascimento, String sexo, String setor,
			int telefone, int numero, String logradouro, String bairro, String cidade, String uf) {
		this.numRegistro = numRegistro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.endereco1 = new Endereco(numero, logradouro, bairro, cidade, uf);
		
	}//PRIMEIRA MANEIRA
	
	public Pessoa(int numRegistro, String nome, String dataNascimento, String sexo, String setor,
			int telefone, Endereco endereco) {
		this.numRegistro = numRegistro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.endereco1 = endereco;
	} // SEGUNDA MANEIRA
	

	public void imprimirRelatorio() {
		
		System.out.println("Número de registro:" + this.numRegistro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de nascimento: " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Setor: " + this.setor);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Logradouro: " + this.endereco1.getLogradouro());
		System.out.println("Número: " + this.endereco1.getNumero());
		System.out.println("Bairro: " + this.endereco1.getBairro());
		System.out.println("Cidade: " + this.endereco1.getCidade());
		System.out.println("UF: " + this.endereco1.getUf());
	}

	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
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

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco1;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco1 = endereco;
	}

}
