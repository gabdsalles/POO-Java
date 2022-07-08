package lista4.evento;

public class EventoTeste {
	
	public static void main(String[] args) {
		
		Endereco end1 = new Endereco(104, "Rua Doutor Jamil Mussi", "Jd. Carvalho", "Ponta Grossa", "PR");
		Local local1 = new Local("Cavan", end1, 500);
		Artista artista1 = new Artista("Billie Eilish", "americana", "cantora que canta músicas");
		Evento evento1 = new Evento ("Show na Cavan com Billie Eilish", artista1, "3/5/2022", local1, 18);
		
		System.out.println(evento1);
		evento1.venderIngressos(400);
		
	}

}
