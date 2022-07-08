package lista5.funcionarios;

public class TesteColaborador {
	
	public static void main(String[] args) {
		
		Colaborador colab = new Colaborador("Harry Potter", "Hogwarts", "11/03/1997");
		System.out.println(colab);
		System.out.println("========================");
		
		Funcionario func1 = new Funcionario("Percy Jackson", "New York", "06/05/2022", "contador", 1098.23);
		func1.imprimirDados();
		System.out.println("========================");
		
		Empregado empreg = new Empregado("Katniss Everdeen", "Panem", "30/09/2067", "CEO", 76000.00, 123456);
		empreg.imprimirDados();
		System.out.println("========================");
		
		Estagiario estag = new Estagiario("João da Silva", "Piraporinha", "14/06/2017", "TI", 957.23, 789);
		System.out.println(estag);
		
		Prestador prest = new Prestador("Hogwarts", "Inglaterra", "10/07/1367", 200.25, "escola de bruxos");
		prest.imprimirDados();
		System.out.println("========================");
		
		Empresa company = new Empresa("UTFPR", "Ponta Grossa", "26/11/2006", 323.12, "universidade", 1000457923);
		company.imprimirDados();
		System.out.println("========================");
		
		Autonomo aut = new Autonomo("Gabriel Dalzoto Salles", "Jardim Carvalho", "11/03/2002", 567.89, "programador", 938495012);
		aut.imprimirDados();
		System.out.println("========================");
	}

}
