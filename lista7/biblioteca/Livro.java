package lista7.biblioteca;

public class Livro {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String editora;
	private int numeroPaginas;
	private boolean disponibilidade; //falso = livro está emprestado / true = livro disponível
	private int diaLocacao;
	private int diaPrevistoDevolucao;
	private int diaDevolucao;
	private double multa;
	
	
	public Livro(String titulo, String autor, int anoPublicacao, String editora, int numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.numeroPaginas = numeroPaginas;
		this.disponibilidade = true;
		this.diaLocacao = 0;
		this.diaPrevistoDevolucao = 0;
		this.diaDevolucao = 0;
		this.multa = 0;
		
	}
	
	public void verificarDisponibilidade() {
		
		if (this.disponibilidade) {
			
			System.out.println("O livro " + this.titulo + " está disponível para ser emprestado!");
		} else {
			
			System.out.println("O livro " + this.titulo + " não pode ser emprestado no momento.");
		}
		
	}
	
	public void efetuarEmprestimo(int diaLocacao) {
		
		if (this.disponibilidade) {
			
			this.diaLocacao = diaLocacao;
			this.disponibilidade = false;
			this.diaPrevistoDevolucao = diaLocacao + 7;
			System.out.println("Empréstimo do livro " + this.titulo + " realizado com sucesso.");
			
		} else {
			
			System.out.println("O livro " + this.titulo + " não está disponível para empréstimo.");
		}
		
	}
	
	public void efetuarDevolucao(int diaDevolucao) {
		
		if (!disponibilidade) {
			
			this.diaDevolucao = diaDevolucao;
			
			if (this.diaDevolucao > this.diaPrevistoDevolucao) { //cobrar multa
				
				multa = this.calcularMulta();
				System.out.println("Multa: R$ " + this.multa);
				System.out.println("Devolução do livro " + this.titulo + " realizada com sucesso!");
			} else {
				
				System.out.println("Devolução do livro " + this.titulo + " realizada com sucesso!");
			}
			
			this.disponibilidade = true;
			
		} else {
			
			System.out.println("O livro " + this.titulo + " não pode ser devolvido, pois ele ainda não foi emprestado.");
		}
	}
	
	public double calcularMulta() {
		
		return (this.diaDevolucao - this.diaPrevistoDevolucao) * 1.5;
	}
	
	public void imprimirDadosLivro() {
		
		System.out.println("Título do livro: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Ano de publicação: " + this.anoPublicacao);
		System.out.println("Editora: " + this.editora);
		System.out.println("Número de páginas: " + this.numeroPaginas);
	
	}

	public String getTitulo() {
		return titulo;
	}

}
