package lista6.restaurante;

public class Cliente {
	
	private String nome;
	private long cpf;
	private Conta conta;
	private Prato pratoEntrada;
	private Prato pratoPrincipal;
	private Prato sobremesa;
	
	
	public Cliente(String nome, long cpf, Conta conta) {
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
		this.pratoEntrada = null;
		this.pratoPrincipal = null;
		this.sobremesa = null;
	}
	
	public void adicionarPratoEntrada(PratoEntrada pratoEntrada) {
		
		if (this.pratoEntrada == null) {
	
			this.pratoEntrada = pratoEntrada;
			System.out.println("Agora você pediu um prato de entrada!");
			this.conta.setValorTotal(this.conta.getValorTotal() + this.pratoEntrada.getPrecoUnitario());
		} else {
			
			System.out.println("Prato de entrada já foi pedido!");
		}
	}
	
	public void adicionarPratoPrincipal(PratoPrincipal pratoPrincipal) {
		
		if (this.pratoPrincipal == null) {
			
			this.pratoPrincipal = pratoPrincipal;
			System.out.println("Agora você pediu um prato principal!");
			this.conta.setValorTotal(this.conta.getValorTotal() + this.pratoPrincipal.getPrecoUnitario());
		} else {
			
			System.out.println("Prato principal já foi pedido!");
		}
	}
	
	public void adicionarSobremesa(Sobremesa sobremesa) {
		
		if (this.sobremesa == null) {
			
			this.sobremesa = sobremesa;
			System.out.println("Agora você pediu uma sobremesa!");
			this.conta.setValorTotal(this.conta.getValorTotal() + this.sobremesa.getPrecoUnitario());
			
		} else {
			
			System.out.println("Sobremesa já foi pedida!");
		}
	}
	
	public void fecharConta() {
		
		if (this.pratoEntrada != null) {
			
			System.out.println("Prato de entrada: " + this.pratoEntrada.getNome());
			System.out.println("Número: " + this.pratoEntrada.getNumero() + ", descrição: " + this.pratoEntrada.getDescricao());
			System.out.println("Preço do prato de entrada: " + this.pratoEntrada.getPrecoUnitario());
		}
		if (this.pratoPrincipal != null) {
			
			System.out.println("Prato principal: " + this.pratoPrincipal.getNome());
			System.out.println("Número: " + this.pratoPrincipal.getNumero() + ", descrição: " + this.pratoPrincipal.getDescricao());
			System.out.println("Preço do prato principal: " + this.pratoPrincipal.getPrecoUnitario());
		} 
		if (this.sobremesa != null) {
			
			System.out.println("Sobremesa: " + this.sobremesa.getNome());
			System.out.println("Número: " + this.sobremesa.getNumero() + ", descrição: " + this.sobremesa.getDescricao());
			System.out.println("Preço da sobremesa: " + this.sobremesa.getPrecoUnitario());
		}
		
		this.conta.setValorTotal(this.conta.getValorTotal() + (this.conta.getValorTotal() * 0.1));
		System.out.println("Valor total da conta: " + this.conta.getValorTotal());
		
		
	}

}
