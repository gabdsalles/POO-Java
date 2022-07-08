package aula16;

import java.util.ArrayList;
import java.util.List;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		List <Carro> vetorGenerico = new <Carro> ArrayList(); //parametrizar
		
		Carro carro1 = new Carro ("ABC-1234", "Gol");
		Carro carro2 = new Carro ("MNO-9877", "Onix");
		Carro carro3 = new Carro ("XYZ-1934", "Sandero");
		Carro carro4 = new Carro ("GHI-7212", "Fiesta");
		
		vetorGenerico.add(carro1);
		vetorGenerico.add(carro2);
		vetorGenerico.add(carro3);
		vetorGenerico.add(carro4);
		
		/*for (int i = 0; i < vetorGenerico.size(); i++) {
			
			Carro c = vetorGenerico.get(i);
			System.out.println(c.getPlaca());
		}*/
		
		//foreach
		for (Carro c : vetorGenerico) {
			
			System.out.println(c.getPlaca());
		}
	}

}
