package aula8;

public enum DiaSemana {
	
	DOMINGO (1, "domingo"),
	SEGUNDA (2, "segunda"),
	TER�A (3, "ter�a"),
	QUARTA (4, "quarta"),
	QUINTA (5, "quinta"),
	SEXTA (6, "sexta"),
	S�BADO (7, "s�bado");
	
	private int dia;
	private String diaExtenso;
	
	private DiaSemana(int dia, String diaExtenso) {
		
		this.dia = dia;
		this.diaExtenso = diaExtenso;
	}
	
	public int getDia () {
		return dia;
	}
	
	public String getDiaExtenso() {
		return diaExtenso;
	}

}
