package lista6.funcionarioutfpr;

public class Disciplina {
	
	private int codigo;
	private String nome;
	private String ementa;
	private int cargaHoraria;
	
	
	public Disciplina(int codigo, String nome, String ementa, int cargaHoraria) {
		this.codigo = codigo;
		this.nome = nome;
		this.ementa = ementa;
		this.cargaHoraria = cargaHoraria;
	}


	public int getCodigo() {
		return codigo;
	}


	public String getNome() {
		return nome;
	}


	public String getEmenta() {
		return ementa;
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}

}
