package aula11;

public class ImovelUsado extends Imovel {
	
	private double valorDesconto;
	private double valorNovo;
	
	public ImovelUsado(String endereco, double valorBase, double valorDesconto) {
		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
		this.valorNovo = this.valorBase - this.valorDesconto;
	}
	
	public void imprimirDados() {
		
		super.imprimirDados();
		System.out.println("Valor de desconto: " + this.valorDesconto);
		System.out.println("Valor total: " + this.valorNovo);
	}

}
