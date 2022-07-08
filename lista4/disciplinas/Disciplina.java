package lista4.disciplinas;

public class Disciplina {
	
	private int codigo;
	private String nome;
	private String modalidade;
	private int cargaHoraria;
	private Professor professor;
	
	
	public Disciplina(int codigo, String nome, String modalidade, int cargaHoraria, Professor professor) {
		this.codigo = codigo;
		this.nome = nome;
		
		if (modalidade.equals("presencial") || modalidade.equals("a distância")) {
			this.modalidade = modalidade;	
		}
		
		else if (modalidade.equals("a distância")) {
			this.modalidade = modalidade;
		}
		
		else {
			System.out.println("Modalidade deve ser presencial ou a distância!");
		}
		
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
	}
	
	public Disciplina(int codigo, String nome, String modalidade, int cargaHoraria,
			int registro, String nomeProf, String dataNascimento, double salario) {
		this.codigo = codigo;
		this.nome = nome;
		
		if (modalidade.equals("presencial") || modalidade.equals("a distância")) {
			this.modalidade = modalidade;	
		}
		
		else if (modalidade.equals("a distância")) {
			this.modalidade = modalidade;
		}
		
		else {
			System.out.println("Modalidade deve ser presencial ou a distância!");
		}
		
		this.cargaHoraria = cargaHoraria;
		this.professor = new Professor (registro, nomeProf, dataNascimento, salario);
		
	}
	
	
	public void imprimirRelatorio() {
			
			System.out.println("Dados da disciplina " + this.nome + ", Código: " + this.codigo);
			System.out.println("Modalidade: " + this.modalidade);
			System.out.println("Carga horária da disciplina: " + this.cargaHoraria + " horas");
			System.out.println("Professor (a) que ministra a disciplina: " + this.professor.getNome());
		}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		if (modalidade.equals("presencial") || modalidade.equals("a distância")) {
			this.modalidade = modalidade;	
		}
		
		else if (modalidade.equals("a distância")) {
			this.modalidade = modalidade;
		}
		
		else {
			System.out.println("Modalidade deve ser presencial ou a distância!");
		}
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
