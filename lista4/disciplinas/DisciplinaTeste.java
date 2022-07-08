package lista4.disciplinas;

public class DisciplinaTeste {
	
	public static void main(String[] args) {
		
		Professor prof1 = new Professor(567, "Vinicius Andrade", "07/04/1990", 123.45);
		Disciplina disc1 = new Disciplina(23, "POO", "presencial", 60, prof1);
		disc1.imprimirRelatorio();
		
		Disciplina disc2 = new Disciplina(16, "Algoritmos", "a distância", 90, 
				123, "Simone Aires", "12/11/1975", 456.78);
		
		System.out.println("===================");
		disc2.imprimirRelatorio();
		System.out.println(disc2.getProfessor());
	}

}
