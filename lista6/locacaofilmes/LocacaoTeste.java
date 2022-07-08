package lista6.locacaofilmes;

public class LocacaoTeste {
	
	public static void main(String[] args) {
		
		//criar filme, sócio, dependente
		
		Pessoa pessoa1 = null;
		Pessoa pessoa2 = null;
		Pessoa pessoa3 = null;
		Endereco endereco = new Endereco ("Rua Doutor Jamil Mussi", 104, "Jardim Carvalho", 84012457, "Ponta Grossa", "PR");
		
		//se o usuário escolher sócio pra pessoa1 e dependente pra pessoa2, por exemplo:
		pessoa1 = new Socio("Gilsani Dalzoto", "31/05/1973", 49384386, 99823134, endereco);
		pessoa2 = new Dependente("Gabriel Salles", "11/03/2002", 998721456, endereco);
		((Socio) pessoa1).setDependente(pessoa2);
		
		//a pessoa 3 só foi criada pra testar oq acontece se locamos um filme já locado, ou devolver um filme ja devolvido
		pessoa3 = new Socio("Harry Potter", "31/07/1980", 48739857, 991237789, endereco);
		
		Filme filme1 = new Filme("Doutor Estranho 2", 125, 6.00);
		Filme filme2 = new Filme("Matrix", 137, 4.00);
		Filme filme3 = new Filme("Gente Grande", 110, 4.50);
		
		filme1.locarFilme(pessoa1, 14);
		filme2.locarFilme(pessoa1, 14);
		filme1.locarFilme(pessoa3, 15);
		filme3.locarFilme(pessoa2, 16);
		filme1.devolverFilme(16);
		filme1.devolverFilme(18);
		filme2.devolverFilme(19);
		filme3.devolverFilme(19);
		
	}

}
