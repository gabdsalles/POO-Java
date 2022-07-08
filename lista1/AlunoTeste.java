package lista1;

public class AlunoTeste {
	
	public static void main(String[] args) { //main
		
		
		Aluno aluno1 = new Aluno (); //instanciando objetos
		
		aluno1.ra = 2257866; // fornecendo valores ao objeto
		aluno1.nome = "Gabriel Dalzoto Salles";
		aluno1.curso = "Ciência da Computação";
		aluno1.turno = "Manhã/Tarde";
		aluno1.periodo = 4;
		aluno1.coeficiente = 0.7;
		aluno1.situacao = "cursando";
		
		//printando os valores do objeto aluno1
		
		aluno1.imprimirRelatorio();
		
		/*System.out.println(aluno1.ra);
		System.out.println(aluno1.nome);
		System.out.println(aluno1.curso);
		System.out.println(aluno1.turno);
		System.out.println(aluno1.periodo);
		System.out.println(aluno1.coeficiente);
		System.out.println(aluno1.situacao);*/
		
		
		
	}

}
