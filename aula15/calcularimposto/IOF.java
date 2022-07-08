package aula15.calcularimposto;

public class IOF implements TipoImposto {
	
	@Override
	public double calcularImposto(double valorProduto) {
		
		return valorProduto * 0.06;
	}

}
