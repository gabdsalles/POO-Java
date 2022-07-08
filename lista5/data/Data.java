package lista5.data;

public class Data {
	
	protected int dia, mes, ano;
	
	public Data (int dia, int mes, int ano) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data (int mes, int ano) {
		
		this(1, mes, ano);
	}
	
	public Data (int dia) {
		this(dia, 1, 2019);
	}
	
	public Data () {
		this(1, 1, 2019);
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

}
