package Ejercicio6;

public class ManejaDeportes {

	public static void main(String[] args) {
		Futbol f=new Futbol(new Hora(18,30),"Racing","Villareal",1,0);
		Baloncesto b=new Baloncesto(new Hora(19,00),"Manuel Rodriguez","Principe Felipe",80,68);
		Tenis t=new Tenis(new Hora(16,00),"Ferrero","Nadal",4,"Ferrero");
		f.verResultados();
		b.verResultados();
		t.verResultados();		
	}
}
