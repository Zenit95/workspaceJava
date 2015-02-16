
public class ManejaRectanguloColoreado {

	public static void main(String[] args) {
		RectanguloColoreado miRectangulo1;
		miRectangulo1 = new RectanguloColoreado(2,8,5,4,"verde");
		System.out.print("El rectangulo coloreado tiene el color " + miRectangulo1.getColor() + ", una base de ");
		System.out.println(miRectangulo1.getBase() + " cm y una altura de " + miRectangulo1.getAltura() + " cm");
		
		

	}

}
