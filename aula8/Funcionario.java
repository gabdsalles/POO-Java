package aula8;

public class Funcionario {
	
	private int registro;
	private String nome, dataAdmissao;
	private DiaSemana folga;
	
	
	public Funcionario(int registro, String nome, String dataAdmissao) {
		this.registro = registro;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
	}
	
	public void setFolga(DiaSemana folga) {
		this.folga = folga;
	}
	
	public void imprimirRelatorio() {
		System.out.println("Registro: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de admissão: " + this.dataAdmissao);
		System.out.println("Dia de folga: " + this.folga.getDiaExtenso());
	}

}
