package aula14.figurasgeometricas;

public class FiguraTeste {
	
	public static void main(String[] args) {
		
		Figura figura = null;
		
		String opcao = "Retangulo";
		
		switch(opcao) {
		
			case "Circulo":
				figura = new Circulo("amarelo", 10);
				break;
				
			case "Quadrado":
				figura = new Quadrado("vermelho", 9);
				break;
				
			case "Retangulo":
				figura = new Retangulo("azul", 6, 7);
			}
	
		System.out.println("Cor da figura: " + figura.cor);
		System.out.println("Área da figura: " + figura.calcularArea());
		System.out.println("Perímetro da figura: " + figura.calcularPerimetro());
	
	}

}
