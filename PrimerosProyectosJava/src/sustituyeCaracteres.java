
public class sustituyeCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra="supercalifragilisticoespialidoso";
		String nuevaPalabra = sustituye(palabra);
		System.out.println(palabra);
		System.out.println(nuevaPalabra);
	}

	private static String sustituye(String pal){
		String aux="";
		aux= pal.charAt(0)+"";
		for(int i=1; i<pal.length()-1;i++){
			aux += "x";//aux = aux  + "x";
		}
		aux += pal.charAt(pal.length()-1);
		
		return aux;
	}
}
