package lista6.cinema;

public class CinemaTeste {
	
	public static void main(String[] args) {
		
		Sala sala1 = new Sala (1, 150);
		Filme filme1 = new Filme ("Homem Aranha Sem Volta para Casa", 148);
		Sessao sessao1 = new Sessao ("25/05/2022", "19h30", sala1, filme1);
		sessao1.venderIngressos(50);
		sessao1.imprimirRelatorio();
		sessao1.venderIngressos(200);
		sessao1.imprimirRelatorio();
	}

}
