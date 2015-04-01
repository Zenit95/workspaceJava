package Ejercicio6;

public abstract class Deporte {
	private Hora horarioEncuentro;

	abstract void verResultados();
	
	public Hora getHora(){
		return horarioEncuentro;
	}
	
	public void setHora(Hora hora){
		this.horarioEncuentro=hora;
	}
}
