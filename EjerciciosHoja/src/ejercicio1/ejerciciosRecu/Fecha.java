package ejercicio1.ejerciciosRecu;

public class Fecha {
	
	int dia;
	int mes;
	int anyo;
	int hora;
	int minutos;
	int segundos;
	//Constructores
	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}
	
	public Fecha(int dia, int mes, int anyo, int hora, int minutos, int segundos) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	//Metodos get/set
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
	//Métodos creados para esta clase
	
	
	//Método privado
	private String devuelveNombre(int mes){
		String nombreMes;
		switch(mes){
			case 1:
					nombreMes="Enero";
					break;
			case 2:
					nombreMes="Febrero";
					break;
			case 3:
					nombreMes="Marzo";
					break;
			case 4:
					nombreMes="Abril";
					break;
			case 5:
					nombreMes="Mayo";
					break;
			case 6:
					nombreMes="Junio";
					break;
			case 7:
					nombreMes="Julio";
					break;
			case 8:
					nombreMes="Agosto";
					break;
			case 9:
					nombreMes="Septiembre";
					break;
			case 10:
					nombreMes="Octubre";
					break;
			case 11:
					nombreMes="Noviembre";
					break;
			case 12:
					nombreMes="Diciembre";
					break;
			default:
					nombreMes="";
		
		}
		
		return nombreMes;
	}

	//Métodos publicos
	public String devuelveFechaConFormato(){
		String fechaFormateada;
		fechaFormateada= ""+ dia +" de "+ devuelveNombre(mes) +" de " + anyo;
		
		return fechaFormateada;
		
	}
	
	/**
	 * Devuelve cuantos años hay desde una fecha a otra
	 * @param fechaExterna la fecha con la que queremos comparar
	 * @return años desde una fecha a la otra
	 */
	public int devuelveAnios(Fecha fechaExterna){
		int anio1,mes1,dia1;
		int anio2,mes2,dia2;
		int resul=0;
		
		anio1=this.getAnyo();
		anio2=fechaExterna.getAnyo();
		mes1=this.getMes();
		mes2=fechaExterna.getMes();
		dia1=this.getDia();
		dia2=fechaExterna.getDia();
		
		/*if(mes2>mes1)
			resul=anio2-anio1;
		if(mes2==mes1)
			if(dia2>=dia1)
				resul=anio2-anio1;
			else
				resul=anio2-anio1-1;
		*/
		
		if(haPasadoMiAniversario(dia2,mes2)==true)
			resul=anio2-anio1;
		else
			resul=anio2-anio1-1;
		
		//Caso en el que el aniversario de la fecha YA ha ocurrido
		/*if(mes2>mes1 || (mes2>mes1 && dia2>=dia1))		
			resul=anio2-anio1;
		//Caso en el que el aniversario de la fecha NO ha ocurrido
		if(mes2<mes1 || (mes2==mes1 && dia2<dia1))
			resul=anio2-anio1-1;
			
		*/
		return resul;
	}

	/**
	 * Devuelve True si ha pasado mi aniversario
	 * @param dia2 dia de la fecha ajena
	 * @param mes2 mes de la fecha ajena
	 * @return
	 */
	private boolean haPasadoMiAniversario(int dia2, int mes2) {
		return false;
	}
	
}
