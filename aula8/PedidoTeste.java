package aula8;

public class PedidoTeste {
	
	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido(1, "18/04/2022");
		System.out.println(pedido1);
		pedido1.setStatusPedido(Status.PROCESSANDO);
		System.out.println(pedido1);
	}

}
