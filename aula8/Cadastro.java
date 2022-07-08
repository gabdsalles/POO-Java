package aula8;

public class Cadastro {
	
	int codigo;
	String nome, dataNascimento;
	EstadoCivil estado;
	
	
	public Cadastro(int codigo, String nome, String dataNascimento, EstadoCivil estado) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Cadastro [codigo=" + codigo + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", estado="
				+ estado + "]";
	}


	public void setEstado(EstadoCivil estado) {
		this.estado = estado;
	}

}
