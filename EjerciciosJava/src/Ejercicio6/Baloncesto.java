package Ejercicio6;

public class Baloncesto extends Deporte {

	private String arbitro;
	private String lugar;
	private int puntos1;
	private int puntos2;

	public Baloncesto(Hora hora, String arbitro, String lugar, int puntos1,
			int puntos2) {
		setHora(hora);
		this.arbitro = arbitro;
		this.lugar = lugar;
		this.puntos1 = puntos1;
		this.puntos2 = puntos2;
	}

	@Override
	void verResultados() {
		System.out
				.printf("A las %s el árbitro %s pitó en el %s y el resultado fue %d-%d%n",
						getHora(), arbitro, lugar, puntos1,puntos2);

	}

}
