package lista4.petshop;

public class Animal {
	
	//atributos
	private String nome;
	private int idade;
	private String sexo;
	private Dono dono;
	private Tratamento [] tratamento;
	private int numTratamentos;
	
	
	public Animal(String nome, int idade, String sexo, Dono dono) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.dono = dono;
		this.numTratamentos = 0;
	}
	
	public void receberTratamento(String descricao, String dataInicio, String dataFinal) {
		
		this.tratamento[numTratamentos].setDescricao(descricao);
		this.tratamento[numTratamentos].setDataInicio(dataInicio);
		this.tratamento[numTratamentos].setDataFinal(dataFinal);
		this.numTratamentos++;
		
	}
	
	public void emitirRelatorio() {
		
		System.out.println("Nome do animal: " + this.nome);
		System.out.println("Idade do animal: " + this.idade);
		System.out.println("Sexo do animal: " + this.sexo);
		System.out.println("Nome do dono: " + this.dono.getNome());
		System.out.println("CPF do dono: " + this.dono.getCpf());
		System.out.println("E-mail do dono: " + this.dono.getEmail());
		System.out.println("Endereço do dono: " + this.dono.getEndereco().getLogradouro() + ", "
		+ this.dono.getEndereco().getNumero() + ", " + this.dono.getEndereco().getBairro() + ", " 
		+ this.dono.getEndereco().getCidade() + ", " + this.dono.getEndereco().getUf());
		
		
		/*for (int i = 0; i <= this.numTratamentos; i++) {
			
			if (this.tratamento[i].getDescricao() != null) {
					
				System.out.println("Tratamento " + this.numTratamentos + ": " + this.tratamento[i].getDescricao());
				System.out.println("Data de início: " + this.tratamento[i].getDataInicio());
				System.out.println("Data de final: " + this.tratamento[i].getDataFinal());
			} else {
				System.out.println("Nenhum tratamento foi feito!");
			}
		}*/
		
		System.out.println(this.tratamento[0].getDescricao());
	}
	

}
