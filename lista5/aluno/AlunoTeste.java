package lista5.aluno;

public class AlunoTeste {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Casimiro", "29/07/1992", 1234789561, 893842671);
		pessoa1.emitirRelatorio();
		Aluno aluno1 = new Aluno("Gabriel Salles", "11/03/2002", 43343456, 78764532, 123);
		System.out.println("===========");
		aluno1.emitirRelatorio();
	}

}
