package Ejercicio3;
/**
 * 3.	La clase clave contiene el nombre de usuario y la clave, 
 * junto con los métodos necesarios para su modificación. 
 * Intente implementar en estos métodos las siguientes características de seguridad:
 * <ul>Utiliza al menos tres de los siguientes cuatro tipos de caracteres:
 * 	<li>Letras mayúsculas (A, B, C).
 * 	<li>Letras minúsculas (a, b, c).
 * 	<li>Números (1, 2, 3).
 * 	<li>Símbolos (` ~ ! @ # $ % ^ & * ( ) _ + - = { } | [ ] \ : " ; ' < > ? , . /).
 * 	<li>Tiene más de 3 caracteres y menos de 8.
 * 	<li>Sin espacios.
 * 	<li>No contiene el nombre de usuario.
 * </ul>
 */

/**
 * @author PORTATIL
 *
 */
public class Clave {
	/**
	 * 
	 */
	private String nombreUsuario;
	/**
	 * 
	 */
	private String contrasena;
	/**
	 * 
	 */
	private int longitudMinima;
	/**
	 * 
	 */
	private int longitudMaxima;

	

	/**
	 * @param nombreUsuario
	 * @param contrasena
	 */
	public Clave(String nombreUsuario, String contrasena, int longitudMinima, int longitudMaxima) {
		super();
		this.longitudMinima = longitudMinima;
		this.longitudMaxima = longitudMaxima;
		if (testConstrasena(nombreUsuario, contrasena) == true) {
			this.nombreUsuario = nombreUsuario;
			this.contrasena = contrasena;
			System.out.println("Contraseña Correcta");
		} else {
			System.out.println("Contraseña Erronea");
		}
	}
	

	private boolean testConstrasena(String nombreUsuario, String contrasena) {
		boolean respuesta = false;
		if (compruebaTipoCaracteres(contrasena) >= 3 
				&& compruebaLongitud(longitudMinima, longitudMaxima, contrasena) == true
				&& compruebaEspacios(contrasena)==true 
				&& noContieneNombreUsuario(nombreUsuario, contrasena)==true) {
					respuesta=true;
		}
		return respuesta;
	}
	
	private boolean noContieneNombreUsuario(String nombreUsuario,String contrasena) {
		boolean respuesta = true;
		if(contrasena.indexOf(nombreUsuario) != -1)
			respuesta = false;
		return respuesta;
	}


	private boolean compruebaEspacios(String contrasena) {
		boolean respuesta = true;
		int cont;
		for(cont=0; cont<contrasena.length(); cont++)
			if(contrasena.charAt(cont) == ' ')
				respuesta = false;
		return respuesta;
	}


	private boolean compruebaLongitud(int longitudMinima, int longitudMaxima, String contrasena) {
		boolean respuesta = false;
		if(contrasena.length() >= longitudMinima && contrasena.length() <= longitudMaxima)
			respuesta = true;
		return respuesta;
	}


	private int compruebaTipoCaracteres(String contrasena) {
		int respuesta = 0;
		if(contieneMayusculas(contrasena))
			respuesta++;
		if(contieneMinusculas(contrasena))
			respuesta++;
		if(contieneNumeros(contrasena))
			respuesta++;
		if(contieneSimbolos(contrasena))
			respuesta++;
		return respuesta;
	}


	private boolean contieneMayusculas(String contrasena) {
		boolean respuesta = false;
		int cont;
		for(cont=0; cont<contrasena.length(); cont++)
			if(contrasena.charAt(cont)>='A' && contrasena.charAt(cont)<='Z')
			//if(Character.isUpperCase(contrasena.charAt(cont)))
				respuesta=true;
		return respuesta;
	}
	
	private boolean contieneMinusculas(String contrasena) {
		boolean respuesta = false;
		int cont;
		for(cont=0; cont<contrasena.length(); cont++)
			if(contrasena.charAt(cont)>='a' && contrasena.charAt(cont)<='z')
			//if(Character.isLowerCase(contrasena.charAt(cont)))
				respuesta=true;
		return respuesta;
	}
	
	private boolean contieneNumeros(String contrasena) {
		boolean respuesta = false;
		int cont;
		for(cont=0; cont<contrasena.length(); cont++)
			if(contrasena.charAt(cont)>='0' && contrasena.charAt(cont)<='9')
			//if(Character.isDigit(contrasena.charAt(cont)))
				respuesta=true;
		return respuesta;
	}

	private boolean contieneSimbolos(String contrasena) {
		boolean respuesta = false;
		int cont, cont2;
		String simbolos = "~!@#$%^&*()_+-={}|[]\\:\";'<>?,./)";
		for(cont=0; cont<contrasena.length(); cont++)
			for(cont2=0; cont2<simbolos.length(); cont2++)
				if(contrasena.charAt(cont) == simbolos.charAt(cont2))
					respuesta = true;
		return respuesta;
	}

	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	/**
	 * @param nombreUsuario
	 *            the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * @param contrasena
	 *            the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	/**
	 * @return the longitudMinima
	 */
	public int getLongitudMinima() {
		return longitudMinima;
	}


	/**
	 * @param longitudMinima the longitudMinima to set
	 */
	public void setLongitudMinima(int longitudMinima) {
		this.longitudMinima = longitudMinima;
	}


	/**
	 * @return the longitudMaxima
	 */
	public int getLongitudMaxima() {
		return longitudMaxima;
	}


	/**
	 * @param longitudMaxima the longitudMaxima to set
	 */
	public void setLongitudMaxima(int longitudMaxima) {
		this.longitudMaxima = longitudMaxima;
	}

}
