package lista3.disciplinas;

public class Disciplina {
	
	private int codigo;
	private String nome, modalidade, conteudo;
	
	
	public Disciplina(int codigo, String nome, String modalidade, String conteudo) {
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
		
		this.conteudo = conteudo;
	}
	
	public void imprimirRelatorio() {
			
			System.out.println("Dados da disciplina " + this.nome + ", Código: " + this.codigo);
			System.out.println("Modalidade: " + this.modalidade);
			System.out.println("Conteúdo: " + this.conteudo);
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


	public String getConteudo() {
		return conteudo;
	}


	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

}
