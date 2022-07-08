package aula8;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario (1, "Percy Jackson", "12/08/1997");
		func1.setFolga(DiaSemana.SEXTA);
		func1.imprimirRelatorio();
	}

}
