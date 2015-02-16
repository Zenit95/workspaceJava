/*Con car*/


public class Fecha {

	private int dia;
	private int mes;
	private int anyo;
	private int hora;
	private int minutos;
	private int segundos;
	public Fecha(){
		this.dia = 0;
		this.mes = 0;
		this.anyo = 0;
	}

	public Fecha(int dia, int mes, int anyo, int hora, int minutos, int segundos) {

		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	// Métodos privados
	private String devuelveNombre(int mes) {
		String nombreMes;
		switch (mes) {
		case 1:
			nombreMes = "Enero";
			break;
		case 2:
			nombreMes = "Febrero";
			break;
		case 3:
			nombreMes = "Marzo";
			break;
		case 4:
			nombreMes = "Abril";
			break;
		case 5:
			nombreMes = "Mayo";
			break;
		case 6:
			nombreMes = "Junio";
			break;
		case 7:
			nombreMes = "Julio";
			break;
		case 8:
			nombreMes = "Agosto";
			break;
		case 9:
			nombreMes = "Septiembre";
			break;
		case 10:
			nombreMes = "Octubre";
			break;
		case 11:
			nombreMes = "Noviembre";
			break;
		case 12:
			nombreMes = "Diciembre";
			break;
		default:
			nombreMes = "";

		}

		return nombreMes;
	}

	public int devuelveAnyos(Fecha fechaExterna) {
		
		int resp =fechaExterna.getAnyo() - anyo - 1;
		
		if (haPasadoMiAniversario(fechaExterna.getDia(),fechaExterna.getMes()))
			resp =fechaExterna.getAnyo() - anyo;

		return resp;

	}

	// Métodos creados para esta clase

	private boolean haPasadoMiAniversario(int diaExterno, int mesExterno) {

		return (mesExterno > mes || (mesExterno == mes && diaExterno >= dia));
	}

	public String devuelveFechaConFormato() {
		String fechaFormateada;
		fechaFormateada = dia + " de " + devuelveNombre(mes) + " de " + anyo;
		return fechaFormateada;

	}

}
