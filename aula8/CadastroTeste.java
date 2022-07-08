package aula8;

public class CadastroTeste {
	
	public static void main(String[] args) {
		
		
		Cadastro pessoa1 = new Cadastro (1, "João das Pedras", "07/03/2022", EstadoCivil.CASADO);
		System.out.println(pessoa1);
		pessoa1.setEstado(EstadoCivil.DIVORCIADO);
		System.out.println(pessoa1);
		
	}

}
