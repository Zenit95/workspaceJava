package Ejercicio4;

public class ManejaHorario {

	public static void main(String[] args) {
		HoraClase miClase = new HoraClase("Programaci�n","Antonio L�pez","BT4");
		HoraClaseTaller miClaseTaller = new HoraClaseTaller("Sistemas","Juan Apellaniz");
		System.out.println("Estoy en clase de "+miClase.getNombreAsignatura());
		miClaseTaller.setNombreProfesor("Agustin Sol�");		

	}

}
