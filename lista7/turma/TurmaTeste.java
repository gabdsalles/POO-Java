package lista7.turma;

import java.util.Random;

public class TurmaTeste {
		
	public static void main(String[] args) {
			
		Random gerador = new Random();
		Turma turma1 = new Turma("POO 2022-1");
		turma1.criarNovosAlunos(1215, "João");
		turma1.criarNovosAlunos(34636, "Maria");
		turma1.criarNovosAlunos(123123, "Pedro");
		turma1.criarNovosAlunos(234698, "Luiza");
		turma1.criarNovosAlunos(670949, "Ricardo");
		turma1.criarNovosAlunos(4363646, "Aluno");
			
		for (int i = 0; i < 5; i++) {
			
			turma1.atribuirNotas("João", gerador.nextDouble(10.0));
			turma1.atribuirNotas("Maria", gerador.nextDouble(10.0));
			turma1.atribuirNotas("Pedro", gerador.nextDouble(10.0));
			turma1.atribuirNotas("Luiza", gerador.nextDouble(10.0));
			turma1.atribuirNotas("Ricardo", gerador.nextDouble(10.0));
		}
		
		turma1.atribuirNotas("João", 0);
		turma1.imprimirRelatorioAlunos();
		turma1.imprimirRelatorioTurma();
	}
}
