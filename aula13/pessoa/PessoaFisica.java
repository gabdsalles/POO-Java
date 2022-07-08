package aula13.pessoa;

public class PessoaFisica extends Pessoa {
	
	private double gastoSaude;
	
	public PessoaFisica (String nome, double rendaAnual, double gastoSaude) {
		
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	public void calcularImposto() {
		
		double imposto;
		
		if (this.rendaAnual >= 20000) {
			
			imposto = this.rendaAnual * 0.25;
		} else {
			
			imposto = this.rendaAnual * 0.15;
		}
		
		if (this.gastoSaude > 0) {
			
			imposto -= (this.gastoSaude / 2);
		}
		
		System.out.println("Imposto que deve ser cobrado: " + imposto);
	}

}
