package aula15.carrinho;

public class Transportadora implements Frete {
	
	public double calcularFrete(int distancia) {
		
		return 20.00 + (distancia * 0.65);
	}

}
