package lista6.restaurante;

public class Conta {
	
	private PratoEntrada pratoEntrada;
	private PratoPrincipal pratoPrincipal;
	private Sobremesa sobremesa;
	private double valorTotal;

	public Conta() {
		
		this.pratoEntrada = null;
		this.pratoPrincipal = null;
		this.sobremesa = null;
		this.valorTotal = 0;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
