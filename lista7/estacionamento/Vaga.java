package lista7.estacionamento;

public class Vaga {
	
	private int numeroVaga;
	private Veiculo veiculo;
	private double custoPermanencia;
	private int horaInicial;
	private int horaFinal;
	private boolean ocupada;
	
	final double taxaMinima = 2.0;
	
	public Vaga (int numeroVaga) {
		
		this.numeroVaga = numeroVaga;
		this.veiculo = null;
		this.custoPermanencia = 0.0;
		this.horaInicial = 0;
		this.horaFinal = 0;
		this.ocupada = false;
	}
	
	public void colocarVeiculo(Veiculo veiculo, int horaInicial) {
		
		if (!ocupada) {
			
			this.veiculo = veiculo;
			this.horaInicial = horaInicial;
			System.out.println("O veículo da placa " + veiculo.getPlaca() + " foi colocado na vaga " + 
					this.numeroVaga + " às " + horaInicial + " horas!");
			this.ocupada = true;
		} else {
			
			System.out.println("Esta vaga já se encontra ocupada!");
		}
		
	}
	
	public void retirarVeiculo(Veiculo veiculo, int horaFinal) {
		
		if (ocupada) {
			
			this.horaFinal = horaFinal;
			double horasEstacionadas = horaFinal - horaInicial;
			
			if (horasEstacionadas > 3) {
				
				this.custoPermanencia = this.taxaMinima + 0.5 * horasEstacionadas;
				
			} else {
				
				this.custoPermanencia = this.taxaMinima;
				
			}
			
			System.out.println("O veículo da placa " + veiculo.getPlaca() + " foi retirado da vaga " + 
					this.numeroVaga + " às " + horaFinal + " horas!");
			
			System.out.println("Taxa final: R$ " + this.custoPermanencia);
			this.ocupada = false;
			this.veiculo = null;
			this.horaFinal = 0;
			this.horaInicial = 0;
			this.custoPermanencia = 0.0;
			
		} else {
			
			System.out.println("Esta vaga já se encontra vazia!");
		}
		
	}

	public int getNumeroVaga() {
		return numeroVaga;
	}
	
	

}
