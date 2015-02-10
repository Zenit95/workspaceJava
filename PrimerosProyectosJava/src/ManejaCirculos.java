
public class ManejaCirculos {

	public static void main(String[] args) {
		/*Circulo miCirculito1,miCirculito2;
		miCirculito1=new Circulo(3.5,4.0,6.5,"rojo");
		miCirculito2=new Circulo(2.6,5.4,7.10,"negro");
		miCirculito1.setColor("azul");
		System.out.println("miCirculito2 tiene un radio de "+ miCirculito2.getRadio());*/
		
		int cont;
		Circulo miCirculito[];
		miCirculito= new Circulo[4];
		for (cont=0;cont<4;cont++){
			miCirculito [cont]=new Circulo (5.0,1.0+cont,2.0,"verde");
			
		}

	}

}
