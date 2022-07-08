package lista4.disciplinas;

public class Professor {
	
	private int registro;
	private String nome;
	private String dataNascimento;
	private double salario;
	
	
	public Professor(int registro, String nome, String dataNascimento, double salario) {
		this.registro = registro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "Professor [registro=" + registro + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", salario=" + salario + "]";
	}


	public int getRegistro() {
		return registro;
	}


	public String getNome() {
		return nome;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public double getSalario() {
		return salario;
	}

}
