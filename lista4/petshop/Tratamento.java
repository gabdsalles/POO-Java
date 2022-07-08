package lista4.petshop;

public class Tratamento {
	
	private String descricao;
	private String dataInicio;
	private String dataFinal;
	
	public Tratamento(String descricao, String dataInicio, String dataFinal) {
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	
	
	

}
