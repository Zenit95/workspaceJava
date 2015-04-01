package Ejercicio6;

public class Futbol extends Deporte {

	private String equipo1;
	private String equipo2;
	private int goles1;
	private int goles2;

	public Futbol(Hora hora, String equipo1, String equipo2, int goles1,
			int goles2) {
		setHora(hora);
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.goles1 = goles1;
		this.goles2 = goles2;
	}

	@Override
	void verResultados() {
		System.out.printf(
				"El %s jugó contra el %s a las %s y el resultado fue %d-%d%n",
				equipo1, equipo2, getHora(), goles1, goles2);
	}

}
