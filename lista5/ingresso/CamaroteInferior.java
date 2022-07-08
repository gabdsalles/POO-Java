package lista5.ingresso;

public class CamaroteInferior extends IngressoVIP {
	
	public CamaroteInferior (double valorIngresso, TipoIngresso tipoIngresso, double valorAdicional, String localizacao) {
		
		super(valorIngresso, tipoIngresso, valorAdicional, localizacao);
		this.valorTotal = super.calcularValorIngressoVIP();
	}
	
	

}
