package aula8;

public enum EstadoUF {
	
	PARAN� ("Paran�", "PR", "Curitiba"),
	SANTA_CATARINA("Santa Catarina", "SC", "Florian�polis"),
	RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", "Porto Alegre"),
	S�O_PAULO("S�o Paulo", "SP", "S�o Paulo"),
	RIO_DE_JANEIRO("Rio de Janeiro", "RJ", "Rio de Janeiro"),
	MINAS_GERAIS("Minas Gerais", "MG", "Belo Horizonte"),
	ESP�RITO_SANTO("Esp�rito Santo", "ES", "Vit�ria");
	
	private String nomeEstado;
	private String siglaEstado;
	private String nomeCapital;
	
	
	private EstadoUF(String nomeEstado, String siglaEstado, String nomeCapital) {
		this.nomeEstado = nomeEstado;
		this.siglaEstado = siglaEstado;
		this.nomeCapital = nomeCapital;
	}


	public String getNomeEstado() {
		return nomeEstado;
	}


	public String getSiglaEstado() {
		return siglaEstado;
	}


	public String getNomeCapital() {
		return nomeCapital;
	}

}
