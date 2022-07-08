package aula15.calcularimposto;

public class INSS implements TipoImposto {

	@Override
	public double calcularImposto(double valorProduto) {
		
		return valorProduto * 0.11;
	}
}
