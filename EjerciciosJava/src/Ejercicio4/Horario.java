package Ejercicio4;

public class Horario {
	private HoraClase listaHoras[];
	
	public Horario(){
		listaHoras=new HoraClase[30];
		for(int cont=0;cont<30;cont++)
			listaHoras[cont]=new HoraClase();
	}
	
	public void setHoraClase(int diaSemana, int horaDia, String nombreAsignatura, String nombreProfesor, String ubicacion){
		int posicion;
		posicion=((diaSemana-1)*6+horaDia)-1;
		listaHoras[posicion].setNombreAsignatura(nombreAsignatura);
		listaHoras[posicion].setNombreProfesor(nombreProfesor);
		listaHoras[posicion].setUbicacion(ubicacion);
		return;
	}
	
	public void setHoraClase(int diaSemana, int horaDia, String cadena, int MODO){
		int posicion;
		posicion=((diaSemana-1)*6+horaDia)-1;
		switch(MODO){
			case 0:
				listaHoras[posicion].setNombreAsignatura(cadena);
				break;
			case 1:
				listaHoras[posicion].setNombreProfesor(cadena);
				break;
			case 2:
				listaHoras[posicion].setUbicacion(cadena);
				break;
		}
		return;		
	}

}
