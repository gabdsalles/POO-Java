package lista2;

public class Livro {
	
	//definindo atributos
	//Agora tirei os acentos das vari�veis e coloquei
	//.equals para comparar strings
	String titulo, autor, editora, situacao;
	int numeroPaginas, anoPublicacao;
	
	public void emprestarLivro () {
		
		if (situacao.equals("dispon�vel")) { 
			System.out.println("O livro " + titulo + " foi emprestado com sucesso.");
			situacao = "emprestado";
		}
		else if (situacao.equals("emprestado")) {
			System.out.println("O livro " + titulo + " j� est� emprestado. N�o � poss�vel fazer o empr�stimo");
		}
	}
	
	public void devolverLivro() {
		
		if (situacao.equals("emprestado")) {
			System.out.println("O livro " + titulo + " foi devolvido com sucesso.");
			situacao = "dispon�vel";
		}
		else if (situacao.equals("dispon�vel")) {
			System.out.println("O livro " + titulo + " ainda n�o foi emprestado. N�o � poss�vel devolv�-lo.");
		}
	}
		
	public void imprimirRelatorio() {
		
		System.out.println(titulo + ", " + autor + ", " + editora + ", " + numeroPaginas + " p�ginas, " + anoPublicacao + ", " + situacao);
	}

}
