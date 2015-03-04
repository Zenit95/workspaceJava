package Ejercicio4;

public class HoraClase {
	protected String nombreAsignatura;
	private String nombreProfesor;
	private String ubicacion;

	public HoraClase(){
		this.nombreAsignatura="";
		this.nombreProfesor="";
		this.ubicacion="";
	}

	/**
	 * @param nombreAsignatura
	 */
	public HoraClase(String nombreAsignatura) {
		super();
		this.nombreAsignatura = nombreAsignatura;
	}

	/**
	 * @param nombreAsignatura
	 * @param nombreProfesor
	 * @param ubicacion
	 */
	public HoraClase(String nombreAsignatura, String nombreProfesor,
			String ubicacion) {
		super();
		this.nombreAsignatura = nombreAsignatura;
		this.nombreProfesor = nombreProfesor;
		this.ubicacion = ubicacion;
	}

	/**
	 * @return the nombreAsignatura
	 */
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	/**
	 * @param nombreAsignatura the nombreAsignatura to set
	 */
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	/**
	 * @return the nombreProfesor
	 */
	public String getNombreProfesor() {
		return nombreProfesor;
	}

	/**
	 * @param nombreProfesor the nombreProfesor to set
	 */
	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}

	/**
	 * @return the ubicacion
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * @param ubicacion the ubicacion to set
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


}
