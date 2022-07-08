package lista7.estacionamento;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	
	private List <Vaga> vagas;
	
	public Estacionamento() {
		
		this.vagas = new ArrayList <Vaga> ();
	}
	
	public void criarNovasVagas(int numeroVaga) {
		
		Vaga vaga = new Vaga(numeroVaga);
		vagas.add(vaga);
		System.out.println("Vaga " + numeroVaga + " criada com sucesso!");
	}
	
	public void colocarVeiculoNaVaga(int numeroVaga, Veiculo veiculo, int horaInicial) {
		
		boolean verificacao = false;
		
		for (Vaga vaga : vagas) {
			
			if (numeroVaga == vaga.getNumeroVaga()) {
				
				vaga.colocarVeiculo(veiculo, horaInicial);
				verificacao = true;
			}
			
		}
		
		if (!verificacao) {
			
			System.out.println("Vaga " + numeroVaga + " inexistente.");
		}
	}
	
	public void retirarVeiculoDaVaga (int numeroVaga, Veiculo veiculo, int horaFinal) throws VagaNaoExistenteException  {
		
		boolean verificacao = false;
		
		for (Vaga vaga : vagas) {
			
			if (numeroVaga == vaga.getNumeroVaga()) {
				
				vaga.retirarVeiculo(veiculo, horaFinal);
				verificacao = true;
			}
			
		}
		
		if (!verificacao) {
			
			throw new VagaNaoExistenteException();
			//System.out.println("Vaga " + numeroVaga + " inexistente.");
		}
	}

}
