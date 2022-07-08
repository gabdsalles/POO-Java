package aula8;

public class Empresa {
	
	private String razaoSocial;
	private int cnpj;
	EstadoUF uf;
	
	
	public Empresa(String razaoSocial, int cnpj, EstadoUF uf) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.uf = uf;
	}
	
	public void imprimirRelatorio() {
		System.out.println("Empresa: " + this.razaoSocial + ", CNPJ " + this.cnpj);
		System.out.println("Estado: " + this.uf.getNomeEstado() + " (" + this.uf.getSiglaEstado()
		+ "), Capital: " + this.uf.getNomeCapital());
	}
	

}
