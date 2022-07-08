package lista5.imovel;

public class ImovelTeste {

	public static void main(String[] args) {
		
		Endereco end1 = new Endereco(104, "Rua Doutor Jamil Mussi", "Jd. Carvalho", "Ponta Grossa", "PR");
		Endereco end2 = new Endereco(778, "Rua Vicente Machado", "Centro", "Ponta Grossa", "PR");
		ImovelNovo imovel1 = new ImovelNovo(end1, 100000.00, 20000.00);
		ImovelVelho imovel2 = new ImovelVelho(end2, 75000.00, 5670.00);
		imovel1.emitirRelatorio();
		imovel2.emitirRelatorio();
	}
}
