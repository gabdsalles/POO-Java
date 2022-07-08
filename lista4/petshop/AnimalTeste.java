package lista4.petshop;

public class AnimalTeste {
	
	public static void main(String[] args) {
	
		Endereco end1 = new Endereco(104, "Rua Doutor Jamil Mussi", "Jd. Carvalho", "Ponta Grossa", "PR");
		Dono dono1 = new Dono(938456782, "Gabriel Dalzoto Salles", 98748821, "gdsalles@outlook.com", end1);
		Animal animal1 = new Animal("Doki", 12, "masculino", dono1);
		
		animal1.receberTratamento("tosa", "03/05/2022", "04/05/2022");
		System.out.println("=====================");
		
		animal1.emitirRelatorio();
	}
}
