
public class RectanguloColoreado extends Rectangulo {
	private String color;
	RectanguloColoreado(int base, int altura, int coordX, int coordY, String color){
		super(base,altura,coordX,coordY);
		this.color=color;
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
