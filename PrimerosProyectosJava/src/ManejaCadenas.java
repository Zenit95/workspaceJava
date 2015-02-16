import java.util.Scanner;

public class ManejaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		String primeraLetra;
		String ultimaLetra;
		String resultado="X";
		Scanner sc;
		System.out.print("Dime tu nombre: ");
		sc= new Scanner(System.in);
		cadena=sc.nextLine();
		//System.out.println(cadena);
		//System.out.print("Te llamas "+cadena+" y tu nombre empieza por la letra ");
		//System.out.println(cadena.charAt(0)+" y acaba en "+cadena.charAt(cadena.length()-1));
		sc.close();
		primeraLetra=cadena.substring(0,1);
		ultimaLetra=cadena.substring(cadena.length()-1);
		for(int cont=1;cont<cadena.length()-1;cont++){
			resultado=resultado+"X";
		}
		resultado=primeraLetra+resultado+ultimaLetra;
		System.out.println("Resultado: "+resultado);
	}

}
