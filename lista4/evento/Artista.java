package lista4.evento;

public class Artista {
	
	private String nomeArtista;
	private String nacionalidade;
	private String biografia;
	
	
	public Artista(String nomeArtista, String nacionalidade, String biografia) {
		
		this.nomeArtista = nomeArtista;
		this.nacionalidade = nacionalidade;
		this.biografia = biografia;
	}


	public String getNomeArtista() {
		return nomeArtista;
	}


	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public String getBiografia() {
		return biografia;
	}


	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}


	@Override
	public String toString() {
		return "Artista [nomeArtista=" + nomeArtista + ", nacionalidade=" + nacionalidade + ", biografia=" + biografia
				+ "]";
	}
	
	
	

}
