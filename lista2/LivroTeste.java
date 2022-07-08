package lista2;

public class LivroTeste {
	
	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		
		livro1.titulo = "Bridgertons";
		livro1.autor = "Julia Quinn";
		livro1.anoPublicacao = 2013;
		livro1.editora = "Arqueiro";
		livro1.numeroPaginas = 282;
		livro1.situacao = "disponível";
		
		livro2.titulo = "Percy Jackson";
		livro2.autor = "Rick Riordan";
		livro2.anoPublicacao = 2005;
		livro2.editora = "Intrínseca";
		livro2.numeroPaginas = 387;
		livro2.situacao = "emprestado";
		
		livro3.titulo = "Jogador Número 1";
		livro3.autor = "Ernest Cline";
		livro3.anoPublicacao = 2011;
		livro3.editora = "Leya";
		livro3.numeroPaginas = 460;
		livro3.situacao = "disponível";
		
		livro1.imprimirRelatorio();
		livro2.imprimirRelatorio();
		livro3.imprimirRelatorio();
		
		livro1.emprestarLivro();
		livro2.emprestarLivro();
		livro3.emprestarLivro();
		
		livro2.devolverLivro();
		livro2.imprimirRelatorio();
		livro2.emprestarLivro();
		livro2.imprimirRelatorio();
		
		livro3.devolverLivro();
		
		}

}
