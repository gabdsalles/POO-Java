package lista6.restaurante;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		PratoEntrada prato1 = new PratoEntrada(2, "sopa", "sopa com legumes e macarrão", 12.35);
		PratoPrincipal prato2 = new PratoPrincipal(7, "arroz com feijão", "arroz, feijão, carne e batata", 19.78);
		Sobremesa prato3 = new Sobremesa(9, "bolo", "bolo de cenoura com chocolate", 6.60);
		
		Cliente cliente1 = new Cliente("Gabriel Salles", 88287462, new Conta());
		
		cliente1.adicionarPratoEntrada(prato1);
		cliente1.adicionarPratoPrincipal(prato2);
		cliente1.adicionarSobremesa(prato3);
		cliente1.adicionarPratoPrincipal(prato2);
		cliente1.fecharConta();
		
	}

}
