package lista5.data;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data data1 = new Data (31, 3, 2022);
		Data data2 = new Data (5, 1967);
		Data data3 = new Data (19);
		Data data4 = new Data ();
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		
		System.out.println("AGORA, TESTANDO FERIADOS:");
		Feriado feriado1 = new Feriado();
		Feriado feriado2 = new Feriado("Dia do Trabalho");
		Feriado feriado3 = new Feriado(25, 12, 2022, "Natal");
		System.out.println(feriado1);
		System.out.println(feriado2);
		System.out.println(feriado3);
	}

}
