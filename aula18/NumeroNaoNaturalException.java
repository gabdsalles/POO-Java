package aula18;

public class NumeroNaoNaturalException extends Exception {
	
	public NumeroNaoNaturalException(String mensagem) {
		
		super(mensagem);
	}
	
	public NumeroNaoNaturalException() {
		
		super("N�mero n�o natural");
	}
	

}
