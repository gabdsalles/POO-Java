package lista7.biblioteca;

public class BibliotecaTeste {
	
	public static void main(String[] args) {
		
		Biblioteca bibl = new Biblioteca();
		
		bibl.inserirLivros("Percy Jackson", "Rick Riordan", 2005, "Intrínseca", 379);
		bibl.inserirLivros("Harry Potter", "J.K. Rowling", 1997, "Rocco", 266);
		bibl.inserirLivros("Jogos Vorazes", "Suzanne Collins", 2010, "Rocco", 400);
		
		bibl.verificarDisponibilidade("Percy Jackson");
		bibl.efetuarEmprestimo("Percy Jackson", 15);
		bibl.efetuarEmprestimo("Harry Potter", 18);
		bibl.efetuarDevolucao("Percy Jackson", 21);
		bibl.efetuarEmprestimo("Jogos Vorazes", 26);
		bibl.efetuarEmprestimo("Jogos Vorazes", 27);
		bibl.efetuarDevolucao("Harry Potter", 31);
		bibl.imprimirDadosLivro("Percy Jackson");
		System.out.println("");
		bibl.imprimirDadosLivro("Harry Potter");
		System.out.println("");
		bibl.imprimirDadosLivro("Jogos Vorazes");
	}

}
