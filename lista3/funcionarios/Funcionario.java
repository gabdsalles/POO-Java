package lista3.funcionarios;

public class Funcionario {
	
	//atributos
	private int numeroRegistro;
	private String nome, sexo, setor, endereco;
	private int diaNascimento, mesNascimento, anoNascimento, telefone;
	
	
	/*public Funcionario(int numeroRegistro, String nome, String sexo, String setor, String endereco, int diaNascimento,
			int mesNascimento, int anoNascimento, int telefone) {
		
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.sexo = sexo;
		this.setor = setor;
		this.endereco = endereco;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
		this.telefone = telefone;
	}*/
	
	public void imprimirRelatorio() {
		
		System.out.println("Dados do funcionário " + this.nome);
		System.out.println(this.numeroRegistro);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Setor: " + this.setor);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Data de nascimento: " + this.diaNascimento + "/" + this.mesNascimento + "/" + this.anoNascimento);
		System.out.println("Telefone: " + this.telefone);
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getDiaNascimento() {
		return diaNascimento;
	}

	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public int getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
