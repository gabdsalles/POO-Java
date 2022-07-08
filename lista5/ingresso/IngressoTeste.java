package lista5.ingresso;

public class IngressoTeste {
	
	public static void main(String[] args) {
		
		IngressoNormal ingresso1 = new IngressoNormal(50.00, TipoIngresso.NORMAL);
		ingresso1.imprimirDadosIngresso();
		
		CamaroteSuperior ingresso2 = new CamaroteSuperior(70.00, TipoIngresso.VIP, 12.00, "camarote superior");
		ingresso2.imprimirDadosIngresso();
		
		CamaroteInferior ingresso3 = new CamaroteInferior(70.00, TipoIngresso.VIP, 25.00, "camarote inferior");
		ingresso3.imprimirDadosIngresso();
		
	}

}
