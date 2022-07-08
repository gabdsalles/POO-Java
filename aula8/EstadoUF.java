package aula8;

public enum EstadoUF {
	
	PARANÁ ("Paraná", "PR", "Curitiba"),
	SANTA_CATARINA("Santa Catarina", "SC", "Florianópolis"),
	RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", "Porto Alegre"),
	SÃO_PAULO("São Paulo", "SP", "São Paulo"),
	RIO_DE_JANEIRO("Rio de Janeiro", "RJ", "Rio de Janeiro"),
	MINAS_GERAIS("Minas Gerais", "MG", "Belo Horizonte"),
	ESPÍRITO_SANTO("Espírito Santo", "ES", "Vitória");
	
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
