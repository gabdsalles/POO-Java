package lista7.estacionamento;

public class VagaNaoExistenteException extends Exception {
	
	public VagaNaoExistenteException() {
		
		super("Vaga inexistente.");
	}

}
