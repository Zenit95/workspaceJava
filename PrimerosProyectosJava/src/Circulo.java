
public class Circulo {
	// Atributos
	private double radio;
	private double xCentro;
	private double yCentro;
	private String color;
	//CONSTRUCTOR
	
	//Sobrecarga del constructor
	public Circulo(double radio){
		this.radio=radio;
	}
	
	public Circulo(double xCentro, double yCentro){
		this.xCentro=xCentro;
		this.yCentro=yCentro;
	}
	
	public Circulo(String color){
		
	}
	
	public Circulo(double radio, double xCentro, double yCentro, String color) {
		super();
		this.radio = radio;
		this.xCentro = xCentro;
		this.yCentro = yCentro;
		this.color = color;
	}

	// Metodos de tipo get/set
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getxCentro() {
		return xCentro;
	}
	public void setxCentro(double xCentro) {
		this.xCentro = xCentro;
	}
	public double getyCentro() {
		return yCentro;
	}
	public void setyCentro(double yCentro) {
		this.yCentro = yCentro;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	
}
