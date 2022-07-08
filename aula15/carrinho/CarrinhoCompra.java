package aula15.carrinho;

public class CarrinhoCompra {
	
	private double valorProdutos;
	private int distancia;
	private Frete frete;
	
	public CarrinhoCompra(double valorProdutos, int distancia, Frete frete) {
		
		this.valorProdutos = valorProdutos;
		this.distancia = distancia;
		//this.frete = new Frete(); //errado: interface não gera objetos!
		this.frete = frete;
	}

	public void realizarCompra() {
		
		double valorTotalCompra = this.valorProdutos + this.frete.calcularFrete(this.distancia);
		
		System.out.println("Valor total: R$ " + valorTotalCompra);
	}


}
