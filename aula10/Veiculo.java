package aula10;

public class Veiculo {
	
		//Atributos da classe pai são PROTECTED
		protected String modelo;
		protected String fabricante;
		protected int ano;
		protected int numeroPassageiros;
		protected String combustivel;
		
		public Veiculo(String modelo, String fabricante, int ano, int numeroPassageiros, String combustivel) {
			
			this.modelo = modelo;
			this.fabricante = fabricante;
			this.ano = ano;
			this.numeroPassageiros = numeroPassageiros;
			this.combustivel = combustivel;
		}
		
		public void abastecer() {
			
			System.out.println(this.fabricante + " " + this.modelo + " está abastecendo com combustível: " + this.combustivel);
		}


}
