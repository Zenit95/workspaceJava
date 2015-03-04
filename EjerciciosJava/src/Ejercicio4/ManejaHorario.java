package Ejercicio4;

public class ManejaHorario {

	public static void main(String[] args) {
		HoraClase miClase = new HoraClase("Programación","Antonio López","BT4");
		HoraClaseTaller miClaseTaller = new HoraClaseTaller("Sistemas","Juan Apellaniz");
		System.out.println("Estoy en clase de "+miClase.getNombreAsignatura());
		miClaseTaller.setNombreProfesor("Agustin Solé");		

	}

}
