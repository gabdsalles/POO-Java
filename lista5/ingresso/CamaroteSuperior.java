package lista5.ingresso;

public class CamaroteSuperior extends IngressoVIP {
	
	public CamaroteSuperior (double valorIngresso, TipoIngresso tipoIngresso, double valorAdicional, String localizacao) {
		
		super(valorIngresso, tipoIngresso, valorAdicional, localizacao);
		//this.valorTotal = super.calcularValorIngressoVIP();
		
	}
	
	public void imprimirDadosIngresso() {
		
		super.imprimirDadosIngresso();
	}
	
}
