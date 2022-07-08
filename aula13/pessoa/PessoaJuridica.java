package aula13.pessoa;

public class PessoaJuridica extends Pessoa {
	
	private int numFuncionarios;
	
	public PessoaJuridica (String nome, double rendaAnual, int numFuncionarios) {
			
			super(nome, rendaAnual);
			this.numFuncionarios = numFuncionarios;
		}
	
	public void calcularImposto() {
		
		double imposto;
		
		if (numFuncionarios > 15) {
			
			imposto = rendaAnual * 0.13;
		} else {
			
			imposto = rendaAnual * 0.18;
		}
		
		System.out.println("Imposto que deve ser pago: " + imposto);
	}

}
