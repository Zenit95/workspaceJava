package algoritmo23;

import java.util.Scanner;
public class DNI {

	public static void main(String[] args) {
		int dni;
		int resto;
		Scanner sc;
		String letras="TRWAGMYFPDXBNJZSQVHLCKE" ;
		sc=new Scanner (System.in);
		System.out.printf("\ndni:");
		dni=sc.nextInt();
		sc.close();
		resto=dni %23;
		System.out.printf("\n La letra de su dni es : %s\n",letras.substring(resto, resto+1));
	}

}
