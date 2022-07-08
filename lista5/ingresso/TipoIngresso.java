package lista5.ingresso;

public enum TipoIngresso {
	
	NORMAL ("normal"),
	VIP ("VIP");
	
	private String nome;

	private TipoIngresso(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	

}
