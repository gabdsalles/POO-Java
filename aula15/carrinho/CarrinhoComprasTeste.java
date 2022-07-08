package aula15.carrinho;

public class CarrinhoComprasTeste {
	
	public static void main(String[] args) {
		
		//CarrinhoCompra carrinhoCompra = new CarrinhoCompra(500.00, 100, new Transportadora());
		//CarrinhoCompra carrinhoCompra = new CarrinhoCompra(500.00, 100, new Sedex());
		CarrinhoCompra carrinhoCompra = new CarrinhoCompra(500.00, 100, new Correios());
		carrinhoCompra.realizarCompra();
	}

}
