package lista5.imovel;

public class ImovelVelho extends Imovel {
	
	private double desconto;
	private double valorNovo;
	
	public ImovelVelho(Endereco endereco, double valorBase, double desconto) {
		super(endereco, valorBase);
		this.desconto = desconto;
		this.valorNovo = valorBase - desconto;
	}
	
	public void emitirRelatorio() {
		
		System.out.println("Endereço do imóvel: " + this.endereco.getLogradouro() + ", "
				+ this.endereco.getNumero() + ", " + this.endereco.getBairro() + ", " 
				+ this.endereco.getCidade() + ", " + this.endereco.getUf());
		System.out.println("Valor do imóvel: " + this.valorNovo);
	}

}
