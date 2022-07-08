package aula15.carrinho;

public class Correios implements Frete { //correio implementa a interface Frete
	
	@Override
	public double calcularFrete(int distancia) {
		
		return 10.00 + (distancia * 0.35);
	}

}
