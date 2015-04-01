package Ejercicio6;

public class Hora {
	private int hora;
	private int minutos;
	/**
	 * @param hora
	 * @param minutos
	 */
	public Hora(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}
	/**
	 * @return the hora
	 */
	public int getHora() {
		return hora;
	}
	/**
	 * @param hora the hora to set
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}
	/**
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}
	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	@Override
	public String toString(){
		return this.hora+":"+this.minutos;
	}
	
}
