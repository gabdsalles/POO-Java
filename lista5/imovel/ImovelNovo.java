package lista5.imovel;

public class ImovelNovo extends Imovel {

	private double adicional;
	private double valorNovo;
	
	
	public ImovelNovo(Endereco endereco, double valorBase, double adicional) {
		super(endereco, valorBase);
		this.adicional = adicional;
		this.valorNovo = valorBase + adicional;
	}
	
	public void emitirRelatorio() {
		
		System.out.println("Endere�o do im�vel: " + this.endereco.getLogradouro() + ", "
				+ this.endereco.getNumero() + ", " + this.endereco.getBairro() + ", " 
				+ this.endereco.getCidade() + ", " + this.endereco.getUf());
		System.out.println("Valor do im�vel: " + this.valorNovo);
	}
}
