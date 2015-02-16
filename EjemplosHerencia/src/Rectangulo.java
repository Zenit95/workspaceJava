
public class Rectangulo {
	private int base;
	private int altura;
	private int coordX;
	private int coordY;
	public Rectangulo(int base, int altura, int coordX, int coordY) {
		this.base = base;
		this.altura = altura;
		this.coordX = coordX;
		this.coordY = coordY;
	}
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getCoordX() {
		return coordX;
	}
	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}
	public int getCoordY() {
		return coordY;
	}
	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

}
