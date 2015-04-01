package Ejercicio6;

public class Tenis extends Deporte {

	private String tenista1;
	private String tenista2;
	private int pista;
	private String ganador;

	public Tenis(Hora hora, String tenista1, String tenista2, int pista,
			String ganador) {
		setHora(hora);
		this.tenista1 = tenista1;
		this.tenista2 = tenista2;
		this.pista = pista;
		this.ganador = ganador;
	}

	private String ganador(String tenista1, String tenista2,String ganador) {
		String resp="";
		if(tenista1==ganador){
			resp="primero";
		}
		else if(tenista2==ganador){
			resp="segundo";
		}
		else{
			resp="ERROR";
		}
		return resp;
	}

	@Override
	void verResultados() {
		System.out.printf(
				"%s jugó contra %s a las %s en la pista %d y ganó el %s",
				tenista1, tenista2, getHora(), pista,
				ganador(tenista1, tenista2, ganador));

	}

}
