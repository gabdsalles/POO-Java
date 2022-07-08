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
			System.out.println("Agora voc� pediu um prato de entrada!");
			this.conta.setValorTotal(this.conta.getValorTotal() + this.pratoEntrada.getPrecoUnitario());
		} else {
			
			System.out.println("Prato de entrada j� foi pedido!");
		}
	}
	
	public void adicionarPratoPrincipal(PratoPrincipal pratoPrincipal) {
		
		if (this.pratoPrincipal == null) {
			
			this.pratoPrincipal = pratoPrincipal;
			System.out.println("Agora voc� pediu um prato principal!");
			this.conta.setValorTotal(this.conta.getValorTotal() + this.pratoPrincipal.getPrecoUnitario());
		} else {
			
			System.out.println("Prato principal j� foi pedido!");
		}
	}
	
	public void adicionarSobremesa(Sobremesa sobremesa) {
		
		if (this.sobremesa == null) {
			
			this.sobremesa = sobremesa;
			System.out.println("Agora voc� pediu uma sobremesa!");
			this.conta.setValorTotal(this.conta.getValorTotal() + this.sobremesa.getPrecoUnitario());
			
		} else {
			
			System.out.println("Sobremesa j� foi pedida!");
		}
	}
	
	public void fecharConta() {
		
		if (this.pratoEntrada != null) {
			
			System.out.println("Prato de entrada: " + this.pratoEntrada.getNome());
			System.out.println("N�mero: " + this.pratoEntrada.getNumero() + ", descri��o: " + this.pratoEntrada.getDescricao());
			System.out.println("Pre�o do prato de entrada: " + this.pratoEntrada.getPrecoUnitario());
		}
		if (this.pratoPrincipal != null) {
			
			System.out.println("Prato principal: " + this.pratoPrincipal.getNome());
			System.out.println("N�mero: " + this.pratoPrincipal.getNumero() + ", descri��o: " + this.pratoPrincipal.getDescricao());
			System.out.println("Pre�o do prato principal: " + this.pratoPrincipal.getPrecoUnitario());
		} 
		if (this.sobremesa != null) {
			
			System.out.println("Sobremesa: " + this.sobremesa.getNome());
			System.out.println("N�mero: " + this.sobremesa.getNumero() + ", descri��o: " + this.sobremesa.getDescricao());
			System.out.println("Pre�o da sobremesa: " + this.sobremesa.getPrecoUnitario());
		}
		
		this.conta.setValorTotal(this.conta.getValorTotal() + (this.conta.getValorTotal() * 0.1));
		System.out.println("Valor total da conta: " + this.conta.getValorTotal());
		
		
	}

}
