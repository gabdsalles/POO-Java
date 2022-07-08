package lista6.funcionarioutfpr;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		
		Disciplina disc1 = new Disciplina(67, "Cálculo 1", "limites, derivadas e integrais", 90);
		Processo proc1 = new Processo (77, "26/05/2022", "matrícula");
		
		Funcionario funcionario = null;
		String opcao = "Professor";
		
		switch(opcao) {
		
			case "Professor":
				funcionario = new Professor(234, "Maria Claudia", "10/10/2010", 5000.00, "Doutor", disc1);
				funcionario.calcularSalario();
				break;
				
			case "Tecnico":
				funcionario = new TecnicoAdministrativo(127, "João Silveira", "5/2/2015", 4000.00, 1500.00, proc1);
				break;
		}
		
		funcionario.imprimirRelatorio();
		
	}

}
