package lista2;

public class Livro {
	
	//definindo atributos
	//Agora tirei os acentos das variáveis e coloquei
	//.equals para comparar strings
	String titulo, autor, editora, situacao;
	int numeroPaginas, anoPublicacao;
	
	public void emprestarLivro () {
		
		if (situacao.equals("disponível")) { 
			System.out.println("O livro " + titulo + " foi emprestado com sucesso.");
			situacao = "emprestado";
		}
		else if (situacao.equals("emprestado")) {
			System.out.println("O livro " + titulo + " já está emprestado. Não é possível fazer o empréstimo");
		}
	}
	
	public void devolverLivro() {
		
		if (situacao.equals("emprestado")) {
			System.out.println("O livro " + titulo + " foi devolvido com sucesso.");
			situacao = "disponível";
		}
		else if (situacao.equals("disponível")) {
			System.out.println("O livro " + titulo + " ainda não foi emprestado. Não é possível devolvê-lo.");
		}
	}
		
	public void imprimirRelatorio() {
		
		System.out.println(titulo + ", " + autor + ", " + editora + ", " + numeroPaginas + " páginas, " + anoPublicacao + ", " + situacao);
	}

}
