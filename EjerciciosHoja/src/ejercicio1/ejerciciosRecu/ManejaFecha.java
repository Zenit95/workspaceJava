package ejercicio1.ejerciciosRecu;
import java.util.Scanner;


public class ManejaFecha {

	public static void main(String[] args) {
			Fecha miCumpleanyos;
			System.out.println("--- Escriba su cumplea�os ---");
			miCumpleanyos= leerFecha();
			//System.out.println(miCumpleanyos.devuelveFechaConFormato());

			System.out.println("--- Escriba una fecha cualquiera ---");
			Fecha otroCumpleanyos;
			otroCumpleanyos = leerFecha();
			
			
			int auxiliar = miCumpleanyos.devuelveAnios(otroCumpleanyos);
			System.out.println("La diferencia entre mi cumplea�os y la fecha indicada es: "+auxiliar+" a�os");
	}
	
	/*private static Fecha leerFecha(){
		Fecha auxiliar;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Inserte d�a: ");
		int nuevoDia = entrada.nextInt();
		System.out.print("Inserte mes: ");
		int nuevoMes = entrada.nextInt();
		System.out.print("Inserte a�o: ");
		int nuevoAnio = entrada.nextInt();
		auxiliar = new Fecha(nuevoDia,nuevoMes,nuevoAnio);
		return auxiliar;
	}
*/
}
