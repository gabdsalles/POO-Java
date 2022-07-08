package lista7.estacionamento;

public class EstacionamentoTeste {
	
	public static void main(String[] args) {
		
		try {
			
			Estacionamento est = new Estacionamento();
			
			for (int i = 1; i <= 40; i++) {
				
				est.criarNovasVagas(i);
			}
			
			Veiculo veiculo1 = new Veiculo("ABC-1243");
			Veiculo veiculo2 = new Veiculo("FZS-2168");
			Veiculo veiculo3 = new Veiculo("YUQ-9987");
			
			est.colocarVeiculoNaVaga(23, veiculo1, 9);
			est.colocarVeiculoNaVaga(2, veiculo3, 15);
			est.colocarVeiculoNaVaga(14, veiculo2, 21);
			
			est.retirarVeiculoDaVaga(23, veiculo1, 15);
			est.retirarVeiculoDaVaga(2, veiculo3, 17);
			est.retirarVeiculoDaVaga(41, veiculo2, 24);
		}
		
		catch (VagaNaoExistenteException vnee) {
			
			System.out.println(vnee.getMessage());
		}
	}

}
