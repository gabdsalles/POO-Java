package lista3.disciplinas;

public class DisciplinaTeste {
	
	public static void main(String[] args) {
		
		Disciplina disciplina1 = new Disciplina(12, "Programa��o Orientada a Objetos", "presencial", "Programa��o em Java, encapsulamento, heran�a, classes...");
		Disciplina disciplina2 = new Disciplina(14, "Empreendedorismo", "a dist�ncia", "Hist�ria do empreendedorismo e dicas de como empreender");
		
		disciplina1.imprimirRelatorio();
		disciplina2.imprimirRelatorio();
		disciplina1.setCodigo(6);
		disciplina2.setModalidade("presencial");
		disciplina2.setModalidade("outra");
		
		disciplina1.imprimirRelatorio();
		disciplina2.imprimirRelatorio();
	}

}
