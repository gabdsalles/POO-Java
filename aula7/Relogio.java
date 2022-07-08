package aula7;

public class Relogio {
	
	private String marca;
	private int hora, minuto;
	
	public Relogio(String marca, int hora, int minuto) {
		this.marca = marca;
		this.setHora(hora);
		this.setMinuto(minuto);
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		
		if (hora >= 0 && hora < 24) {
			
			this.hora = hora;
			
		} else {
			
			System.out.println("Hora inválida!");
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		
		if (minuto >= 0 && minuto < 60) {
			
			this.minuto = minuto;
			
		} else {
			
			System.out.println("Minuto inválido!");
		}
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Relogio [marca=" + marca + ", hora=" + hora + ", minuto=" + minuto + "]";
	}

}
