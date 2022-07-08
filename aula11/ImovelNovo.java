package aula11;

public class ImovelNovo extends Imovel {
	
	private double valorAdicional;
	private double valorNovo;
	
	
	public ImovelNovo(String endereco, double valorBase, double valorAdicional) {
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
		this.valorNovo = this.valorBase + this.valorAdicional;
	}
	
	public void imprimirDados() {
		
		super.imprimirDados();
		System.out.println("Valor adicional: " + this.valorAdicional);
		System.out.println("Valor total: " + this.valorNovo);
	}

}
