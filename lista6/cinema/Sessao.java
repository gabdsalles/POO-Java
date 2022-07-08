package lista6.cinema;

public class Sessao {
	
	private String data;
	private String horario;
	private int ingressosVendidos;
	private Sala salaSessao;
	private Filme filme;
	private int numIngressos;
	
	
	public Sessao(String data, String horario, Sala sala, Filme filme) {
		this.data = data;
		this.horario = horario;
		this.ingressosVendidos = 0;
		this.salaSessao = sala;
		this.filme = filme;
		this.numIngressos = salaSessao.getCapacidadeMaxima();
	}
	
	public void venderIngressos(int ingressos) {
		
		if (this.numIngressos >= ingressos) {
			
			this.numIngressos -= ingressos;
			System.out.println(ingressos + " ingressos foram comprados!");
			System.out.println("Ingressos restantes: " + this.numIngressos);
			this.ingressosVendidos += ingressos;
			
		} else {
			
			System.out.println("N�o � poss�vel realizar essa compra!!");
		}
	}


	public void imprimirRelatorio() {
		
		System.out.println("Data da sess�o: " + this.data);
		System.out.println("Hor�rio da sess�o: " + this.horario);
		System.out.println("Total de ingressos vendidos: " + this.ingressosVendidos);
		System.out.println("Sala da sess�o: sala " + this.salaSessao.getNumIdentificao());
		System.out.println("T�tulo do filme: " + this.filme.getTitulo());
		System.out.println("Dura��o do filme: " + this.filme.getDuracao());
	}

}
