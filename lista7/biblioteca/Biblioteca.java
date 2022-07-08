package lista7.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private List <Livro> livros;
	
	public Biblioteca() {
		
		this.livros = new ArrayList <Livro> ();
	}
	
	public void inserirLivros(String titulo, String autor, int anoPublicacao, String editora, int numeroPaginas) {
		
		Livro livro = new Livro(titulo, autor, anoPublicacao, editora, numeroPaginas);
		this.livros.add(livro);
		
		System.out.println("Livro " + titulo + " inserido com sucesso na biblioteca!");
		
	}
	
	public void verificarDisponibilidade(String titulo) {
		
		boolean verificacao = false;
		
		for (Livro livro : livros) {
			
			if (livro.getTitulo().equals(titulo)) {
				
				livro.verificarDisponibilidade();
				verificacao = true;
			}
		}
		
		if (!verificacao) {
			
			System.out.println("Livro inexistente na biblioteca.");
		}
		
	}
	
	public void efetuarEmprestimo(String titulo, int diaLocacao) {
		
		boolean verificacao = false;
		
		for (Livro livro : livros) {
			
			if (livro.getTitulo().equals(titulo)) {
				
				livro.efetuarEmprestimo(diaLocacao);
				verificacao = true;
			}
		}
		
		if (!verificacao) {
			
			System.out.println("Livro inexistente na biblioteca.");
		}

	}
	
	public void efetuarDevolucao(String titulo, int diaDevolucao) {
		
		boolean verificacao = false;
		
		for (Livro livro : livros) {
			
			if (livro.getTitulo().equals(titulo)) {
				
				livro.efetuarDevolucao(diaDevolucao);
				verificacao = true;
			}
		}
		
		if (!verificacao) {
			
			System.out.println("Livro inexistente na biblioteca.");
		}

	}
	
	public void imprimirDadosLivro(String titulo) {
		
		boolean verificacao = false;
		
		for (Livro livro : livros) {
			
			if (livro.getTitulo().equals(titulo)) {
				
				livro.imprimirDadosLivro();
				verificacao = true;
			}
		}
		
		if (!verificacao) {
			
			System.out.println("Livro inexistente na biblioteca.");
		}

	}

}
