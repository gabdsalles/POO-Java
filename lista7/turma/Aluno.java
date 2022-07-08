package lista7.turma;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private long ra;
	private String nome;
	private List <Double> notas;
	private double media;
	private String resultado;
	
	
	public Aluno(long ra, String nome) {
		this.ra = ra;
		this.nome = nome;
		this.notas = new ArrayList <Double> ();
		this.media = 0.0;
		this.resultado = null;
	}
	
	public void atribuirNotas(double nota) {
		
		if (notas.size() > 3) {
			
			System.out.println("Não é possível inserir novas notas!");
		} else {
			
			notas.add(nota);
			this.media = this.calcularMedia();
			System.out.println("Nota inserida com sucesso!");
		}

	}
	
	public void verificarAprovacao() {
		
		if (this.media >= 6.0) {
			
			this.resultado = "Aprovado!";

		} else {
			
			this.resultado = "Reprovado.";
		}
	}
	
	public double calcularMedia() {
		
		double aux = 0.0;
		
		for (Double double1 : notas) {
			
			aux += double1;
		}
		
		return aux / (notas.size());
		
	}
	
	public void imprimirNotas() {
		
		int aux = 1;
		
		for (Double double1 : notas) {
			
			System.out.println("Nota " + aux + ": " + double1);
			aux++;
		}
		
		System.out.println("Média: " + this.media);
		this.verificarAprovacao();
		System.out.println("Resultado final: " + this.resultado);
	}

	public long getRa() {
		return ra;
	}

	public String getNome() {
		return nome;
	}

	public List<Double> getNotas() {
		return notas;
	}
	
	public double getMedia() {
		return media;
	}
	
	
	
	

}
