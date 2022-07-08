package aula8;

public class EmpresaTeste {
	
	public static void main(String[] args) {
		
		Empresa empresa1 = new Empresa ("Tozetto", 845321, EstadoUF.PARANÁ);
		empresa1.imprimirRelatorio();
		Empresa empresa2 = new Empresa ("Samsung Brasil", 234012, EstadoUF.SÃO_PAULO);
		empresa2.imprimirRelatorio();
	}

}
