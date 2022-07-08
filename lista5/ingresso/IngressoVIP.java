package lista5.ingresso;

public class IngressoVIP extends Ingresso {
	
	protected double valorAdicional;
	protected String localizacao;
	protected double valorTotal;
	
	public IngressoVIP (double valorIngresso, TipoIngresso tipoIngresso, double valorAdicional, String localizacao) {
		
		super(valorIngresso, tipoIngresso);
		this.valorAdicional = valorAdicional;
		this.localizacao = localizacao;
		this.valorTotal = calcularValorIngressoVIP();
	}
	
	protected double calcularValorIngressoVIP() {
		
		return (this.valorIngresso + this.valorAdicional);
		
	}
	
	public void imprimirDadosIngresso() {
		
		super.imprimirDadosIngresso();
		System.out.println("Valor adicional do ingresso: " + this.valorAdicional);
		System.out.println("Localização: " + this.localizacao);
		System.out.println("Valor total do ingresso VIP: " + this.valorTotal);
	}

}
