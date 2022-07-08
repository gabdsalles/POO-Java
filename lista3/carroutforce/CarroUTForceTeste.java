package lista3.carroutforce;

public class CarroUTForceTeste {
	
	public static void main(String[] args) {
		
		CarroUTForce carro = new CarroUTForce();
		
		for (int i = 0; i < 20; i++) {
			carro.acelerar();
			System.out.println(carro);
		}
		
		for (int i = 0; i < 10; i++) {
			carro.frear();
			System.out.println(carro);
		}
	}


}
