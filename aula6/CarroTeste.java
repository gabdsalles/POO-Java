package aula6;

import java.util.Scanner;

public class CarroTeste {
	
public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		Carro carro1 = new Carro("Sandero", "Renault", 2015, "STU-2345", "branco");
		Carro carro2 = new Carro("Gol", "Volks", 2010, "MNO-9876", "preto");

		/*carro2.modelo = "Gol";
		carro2.marca = "Volks";
		carro2.anoFabricacao = 2010;
		carro2.placa = "MNO-9876";
		carro2.cor = "preto"; 
		
		//System.out.println(carro1);
		//System.out.println(carro2);*/
		
		
		
		//imprimir dados para o usuário final
		carro1.imprimirDados();
		carro2.imprimirDados();
		
		
		//testando os métodos
		carro2.ligar();
		carro2.ligar();
		carro1.acelerar();
		carro1.ligar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		
		carro1.imprimirDados();
		
		carro1.frear();
		carro1.desligar();
		carro1.desligar();
		
		entradaTeclado.close();
		
		
	}

}
