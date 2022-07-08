package lista7.turma;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private List <Aluno> alunos;
	private String nome;
	
	public Turma(String nome) {
		
		this.alunos = new ArrayList <Aluno> ();
		this.nome = nome;
	}
	
	public void criarNovosAlunos(long ra, String nome) {
		
		if (alunos.size() > 4) {
			
			System.out.println("Não é possível inserir novos alunos!");
		} else {
			
			Aluno alunoAuxiliar = new Aluno(ra, nome);
			alunos.add(alunoAuxiliar);
			System.out.println("Aluno " + nome + " criado com sucesso!");
		}

		
	}
	
	public void atribuirNotas(String nome, double nota) {
		
		boolean verificacao = false;
		
		for (Aluno aluno: alunos) {
			
			if (nome.equals(aluno.getNome())) {
				
				aluno.atribuirNotas(nota);
				verificacao = true;
			}
		}
		
		if (!verificacao) {
			
			System.out.println("Este aluno não existe!");
		}
	}
	
	public void imprimirRelatorioAlunos() {
		
		for (Aluno aluno : alunos) {
			
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("RA: " + aluno.getRa());
			aluno.imprimirNotas();
			System.out.println("");
		}
	}
	
	public void imprimirRelatorioTurma() {
		
		double mediaTurma = 0.0;
		
		for (Aluno aluno : alunos) {
			
			mediaTurma += aluno.getMedia();
		}
		
		mediaTurma = mediaTurma / 5;
		
		System.out.println("Informações da turma. Nome: " + this.nome);
		System.out.println("Média da turma: " + mediaTurma);
	}

}