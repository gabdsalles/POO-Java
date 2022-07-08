package aula11;

public class ImovelTeste {
	
	public static void main(String[] args) {
		
		//UPCASTING pai recebe filha //im�vel <- im�vel novo
		Imovel imovel = new ImovelNovo("Vicente Machado, 1024, Centro, Ponta Grossa, PR", 500000.00, 150000.00);
		//imovel.imprimirDados();
		
		//DOWNCASTING filha recebe pai //im�vel novo <- im�vel
		//verifica��o com a palavra reservada instanceof
		
		if (imovel instanceof ImovelNovo) {
			
			ImovelNovo imovelNovo1 = (ImovelNovo) imovel; //convers�o fica expl�cita
			imovelNovo1.imprimirDados();
		} else { //if imovel instanceof ImovelUsado
			
			ImovelUsado imovelUsado1 = (ImovelUsado) imovel;
			imovelUsado1.imprimirDados();
		}
		
		
		/*System.out.println("Im�vel novo: ");
		//UPCASTING
		Imovel imovel1 =  new ImovelNovo("Vicente Machado, 1024, Centro, Ponta Grossa, PR", 500000.00, 150000.00);
		imovel1.imprimirDados();
		System.out.println("======================================================");
		
		System.out.println("Im�vel usado: ");
		//UPCASTING
		Imovel imovel2 = new ImovelUsado("Baldu�no Taques, 512, Centro, Ponta Grossa, PR", 500000.00, 100000.00);
		imovel2.imprimirDados();*/
		
	}

}
