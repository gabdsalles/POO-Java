package aula15.calcularimposto;

public class TributosTeste {
	
	public static void main(String[] args) {
		
		Tributos imposto1 = new Tributos(10000.00, new IOF());
		imposto1.calcularTributos();
	}

}
