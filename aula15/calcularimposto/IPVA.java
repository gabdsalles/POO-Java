package aula15.calcularimposto;

public class IPVA implements TipoImposto {
	
	@Override
	public double calcularImposto(double valorProduto) {
		
		return valorProduto * 0.03;
	}

}
