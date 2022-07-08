package lista6.locacaofilmes;

public class Filme {
	
	private String titulo;
	private int duracao;
	private double preco;
	//variáveis de controle
	private String quemEmprestou; //se é sócio ou dependente
	private int diaLocacao;
	private int diaPrevDevolucao;
	private int diaDevolucao;
	private String nomeCliente;
	private boolean locado;
	private double valorLocacao;
	private double valorMulta;
	
	
	public Filme(String titulo, int duracao, double preco) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.preco = preco;
		this.diaLocacao = 0;
		this.diaPrevDevolucao = 0;
		this.diaDevolucao = 0;
		this.nomeCliente = null;
		this.locado = false;
		this.valorLocacao = 0.0;
		this.valorMulta = 0.0;
	}
	
	public void locarFilme(Pessoa cliente, int diaLocacao) {
		
		if (!locado) { //se o filme não estiver locado, faça a locação.
		
			if (cliente instanceof Socio) {
				
				this.quemEmprestou = "Socio";
			} else if (cliente instanceof Dependente) {
				
				this.quemEmprestou = "Dependente";
			}
			
			this.diaLocacao = diaLocacao;
			this.nomeCliente = cliente.getNome();
			this.diaPrevDevolucao = diaLocacao + 3;
			this.valorLocacao = this.preco;
			this.locado = true;
			System.out.println(this.nomeCliente + " locou o filme " + this.titulo + " com sucesso!");
		
		} else {
			
			System.out.println(cliente.getNome() + ", este filme já está locado!");
		}
	}
	
	public void devolverFilme(int diaDevolucao) {
		
		if (locado) {
			
			this.diaDevolucao = diaDevolucao;
			if (diaDevolucao <= this.diaPrevDevolucao) { //devolveu na data correta
				
				System.out.println(this.nomeCliente + " devolveu o filme " + this.titulo + " com sucesso!");
				System.out.println(this.nomeCliente + " deve pagar R$ " + this.valorLocacao);
			} else { //se passou da data
				
				System.out.println(this.nomeCliente + " devolveu o filme " + this.titulo + " com sucesso!");
				this.calcularMulta();
				this.valorLocacao += this.valorMulta;
				System.out.println(this.nomeCliente + " deve pagar R$ " + this.valorLocacao);
			}
			
			this.imprimirRelatorioLocacao();
			locado = false;
			
			
		} else {
			
			System.out.println("não é possível devolver este filme, pois ele ainda não foi locado!");
		}
	}
	
	private void calcularMulta() {
		
		this.valorMulta = (this.diaDevolucao - this.diaPrevDevolucao) * 2;
	}
	
	private void imprimirRelatorioLocacao() {
		
		System.out.println("");
		System.out.println("Título do filme: " + this.titulo);
		System.out.println("Nome do cliente: " + this.nomeCliente);
		System.out.println("Sócio ou dependente? " + this.quemEmprestou);
		System.out.println("Dia da locação: " + this.diaLocacao);
		System.out.println("Dia previsto para devolução: " + this.diaPrevDevolucao);
		System.out.println("Dia da devolução: " + this.diaDevolucao);
		System.out.println("Preço do filme: " + this.preco);
		System.out.println("Valor da multa: " + this.valorMulta);
		System.out.println("Valor total da locação: " + this.valorLocacao);
	}
}
