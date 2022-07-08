package lista4.evento;

public class Evento {
	
	private String nomeEvento;
	private Artista artista;
	private String data;
	private Local local;
	private int classificacaoEtaria;
	private int numeroIngressos;
	
	public Evento(String nomeEvento, Artista artista, String data, Local local, int classificacaoEtaria) {
		
		this.nomeEvento = nomeEvento;
		this.artista = artista;
		this.data = data;
		this.local = local;
		this.classificacaoEtaria = classificacaoEtaria;
		this.numeroIngressos = local.getCapacidadeMaxima();
	}



	public void venderIngressos (int ingressos) {
		
		if (ingressos < this.numeroIngressos) {
			
			numeroIngressos = numeroIngressos - ingressos;
			System.out.println("Ingressos disponíveis: " + this.numeroIngressos);
		}
		
		
	}



	@Override
	public String toString() {
		return "Evento [nomeEvento=" + nomeEvento + ", artista=" + artista + ", data=" + data + ", local=" + local
				+ ", classificacaoEtaria=" + classificacaoEtaria + ", numeroIngressos=" + numeroIngressos + "]";
	}


}
