package lista5.data;

public class Feriado extends Data {
	
	private String descricao;
	
	public Feriado (int dia, int mes, int ano, String descricao) {
		
		super(dia, mes, ano);
		this.descricao = descricao;		
	}
	
	public Feriado (int mes, int ano) {
		
		super(1, mes, ano);
		this.descricao = descricao;	
	}
	
	public Feriado (String descricao) {
		super(1, 1, 2019);
		this.descricao = descricao;
	}
	
	public Feriado () {
		super(1, 1, 2019);
		this.descricao = "Feriado";	
	}
	
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano + " - " + descricao;
	}

}
