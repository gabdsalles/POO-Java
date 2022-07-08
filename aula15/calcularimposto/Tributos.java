package aula15.calcularimposto;

public class Tributos {
	
	private double valorProduto;
	private TipoImposto tipoImposto;
	
	
	public Tributos(double valorProduto, TipoImposto tipoImposto) {
		this.valorProduto = valorProduto;
		this.tipoImposto = tipoImposto;
	}
	
	public void calcularTributos() {
		
		double valorFinal = this.valorProduto + this.tipoImposto.calcularImposto(this.valorProduto);
		System.out.println("Valor final do bem/mercadoria com tributo calculado: R$ " + valorFinal);
	}

}
