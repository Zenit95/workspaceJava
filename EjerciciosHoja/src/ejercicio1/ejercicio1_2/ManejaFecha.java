package ejercicio1.ejercicio1_2;
public class ManejaFecha {

	
	public static void main(String[] args) {
            Fecha miCumpleanyos;
            miCumpleanyos= new Fecha(6,8,2015);
            //System.out.println(miCumpleanyos.devuelveFechaConFormato());
            
            int aux = miCumpleanyos.devuelveAnyos(new Fecha(6,8,1993));
            
            System.out.println(aux);

	}

}
