
public class ManejaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		cadena=new String("Antonio");
		System.out.println(cadena);
		System.out.print("Te llamas "+cadena+" y tu nombre empieza por la letra ");
		System.out.print(cadena.charAt(0)+" y acaba en "+cadena.charAt(cadena.length()-1));
	}

}
