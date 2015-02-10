/*Con car*/
package ejercicio1.ejercicio1_1;
public class Fecha {
	
	int dia;
	int mes;
	int anyo;
	int hora;
	int minutos;
	int segundos;
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
	// M�todos privados
	private String devuelveNombre(int mes) {
		String nombreMes;
		switch(mes){
			case 1:
			   nombreMes="Enero";
			   break;
			case 2:
			   nombreMes="Febrero";
			   break;
			default:
		       nombreMes="";
	   
	
		}
		return nombreMes;
	}
	devuelveAnyos(){}
	
	//M�todos creados para esta clase
	
	public String devuelveFechaConFormato(){
		String fechaFormateada;
		fechaFormateada= dia +" de "+ devuelveNombre(mes) + " de "+ anyo;
		return fechaFormateada;
		
	}
	
	


	
	

}
