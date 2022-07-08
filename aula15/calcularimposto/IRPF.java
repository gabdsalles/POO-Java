package aula15.calcularimposto;

public class IRPF implements TipoImposto {
	
	@Override
	public double calcularImposto(double valorProduto) {

		return valorProduto * 0.075;
	}

}
