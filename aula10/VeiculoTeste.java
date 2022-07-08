package aula10;

public class VeiculoTeste {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Gol", "Volkswagen", 2020, 5, "Flex", 5);
		carro1.abastecer();
		carro1.calibrarPneus();
		
		Aviao aviao1 = new Aviao("A-380", "Airbus", 2005, 800, "de Aviação", 40000);
		aviao1.abastecer();
		aviao1.voar();
	}

}
