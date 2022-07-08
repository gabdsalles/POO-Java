package aula6;

public class Carro {
	
	String modelo;
	String marca;
	int anoFabricacao;
	String placa;
	String cor;
	boolean ligado;
	int velocidade;
	
	public Carro (String modelo, String marca, int anoFabricacao, String placa, String cor) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
		this.placa = placa;
		this.cor = cor;
		ligado = false;
		velocidade = 0;
	}
	
	public void ligar() {
		
		if (!ligado) { //poderia ser if (ligado == false)
			ligado = true;
			System.out.println(marca + " " + modelo + " está ligando.");
		} else {
			System.out.println(marca + " " + modelo + " já se encontra ligado.");
		}
		
	}
	
	public void desligar() {
		
		if (ligado) { //poderia ser if (ligado == true)
			ligado = false;
			System.out.println(marca + " " + modelo + " está desligando.");
		} else {
			System.out.println(marca + " " + modelo + " já se encontra desligado.");
		}
		
	}
	
	public void acelerar() {
		
		if (ligado) {
			velocidade += 10; //velocidade = velocidade + 10
			System.out.println(marca + " " + modelo + " está acelerando. Velocidade: " + velocidade + " km/h");
		} else {
			System.out.println(marca + " " + modelo + " encontra-se desligado.");
		}
		
	}
	
	public void frear() {
		
		if (ligado) {
			velocidade -= 10; //velocidade = velocidade + 10
			System.out.println(marca + " " + modelo + " está freando. Velocidade: " + velocidade + " km/h");
		} else {
			System.out.println(marca + " " + modelo + " encontra-se desligado.");
		}
		
	}
	
	public void imprimirDados() { //método para o usuário final
		
		System.out.println("===============");
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Ano de fabricação: " + anoFabricacao);
		System.out.println("Placa: " + placa);
		System.out.println("Cor: " + cor);
		System.out.println("Ligado: " + ligado);
		System.out.println("Velocidade: " + velocidade);
		System.out.println("===============");
		
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", anoFabricacao=" + anoFabricacao + ", placa=" + placa
				+ ", cor=" + cor + ", ligado=" + ligado + ", velocidade=" + velocidade + "]";
	}

}
