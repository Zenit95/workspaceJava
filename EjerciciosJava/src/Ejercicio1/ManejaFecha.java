package Ejercicio1;

import java.util.Calendar;
import java.util.Scanner;

public class ManejaFecha {

	
	public static void main(String[] args) {
			Calendar miCalendario;
            Fecha miCumpleanyos=new Fecha();
            Fecha fechaActual=new Fecha();
            Scanner sc=new Scanner (System.in);
            miCalendario=Calendar.getInstance();
            System.out.println("Dime el dia de tu cumple: ");
            miCumpleanyos.setDia(sc.nextInt());
            System.out.println("Dime el mes de tu cumple: ");
            miCumpleanyos.setMes(sc.nextInt());
            System.out.println("Dime el año de tu cumple: ");
            miCumpleanyos.setAnyo(sc.nextInt());
            
            /*System.out.println("Dime el dia actual: ");
            fechaActual.setDia(sc.nextInt());
            System.out.println("Dime el mes actual: ");
            fechaActual.setMes(sc.nextInt());
            System.out.println("Dime el año actual: ");
            fechaActual.setAnyo(sc.nextInt());
            */
            fechaActual.setDia(miCalendario.get(Calendar.DATE));
            fechaActual.setMes(miCalendario.get(Calendar.MONTH)+1);
            fechaActual.setAnyo(miCalendario.get(Calendar.YEAR));
            
            System.out.println(miCumpleanyos.devuelveFechaConFormato());
            System.out.println(miCumpleanyos.devuelveAnyos(fechaActual));
            sc.close();
            
	}

}
