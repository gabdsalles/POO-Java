package lista3.carroutforce;

public class CarroUTForce {
	
	private int velocidade, marcha;

	public CarroUTForce() {
		this.velocidade = 0;
		this.marcha = 0; // inicializo o carro com 0, representando a marcha no neutro.
	}
	
	public void acelerar () {
		
		if (velocidade == 130) {
			System.out.println("Velocidade máxima");
		} else {
			velocidade += 5;
		}
		this.mudarMarcha();
	}
	
	public void frear () {
		if (velocidade == 0) {
			System.out.println("Carro já está parado");
		} else {
			velocidade -= 5;
		}
		this.mudarMarcha();
	}
	
	private void mudarMarcha() {
		
		if (velocidade < 20) {
			marcha = 1;
		}
		
		else if (velocidade >= 20 && velocidade < 40) {
			marcha = 2;
		}
		
		else if (velocidade >= 40 && velocidade < 60) {
			marcha = 3;
		}
		
		else if (velocidade >= 60 && velocidade < 90) {
			marcha = 4;
		}
		
		else if (velocidade >= 90) {
			marcha = 5;
		}
	}

	@Override
	public String toString() {
		return "CarroUTForce [velocidade=" + velocidade + ", marcha=" + marcha + "]";
	}

}
