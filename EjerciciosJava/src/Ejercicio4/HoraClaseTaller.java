package Ejercicio4;

public class HoraClaseTaller extends HoraClase{
	private String nombreProfesorApoyo;
	private String herramienta[];
	private int posicionHerramienta;
	
	public HoraClaseTaller(){
		this.nombreProfesorApoyo="";
		init();
	}
	
	public HoraClaseTaller(String nombreProfesorApoyo){
		this.nombreProfesorApoyo=nombreProfesorApoyo;
		init();
	}
	
	public HoraClaseTaller(String nombreAsignatura, String nombreProfesorApoyo){
		super(nombreAsignatura);
		this.nombreProfesorApoyo=nombreProfesorApoyo;
		init();
	}
	
	private void init(){
		herramienta=new String[10];
		for(int cont=0;cont<10;cont++){
			herramienta[cont]=new String();
			herramienta[cont]="";
		}
		posicionHerramienta=0;
		return;
	}
	
	public void anadeNuevaHerramienta(String nuevaHerramienta){
		herramienta[posicionHerramienta]=nuevaHerramienta;
		posicionHerramienta++;
	}
	
	public String getHerramientaFormat(){
		String texto="";
		texto="HERRAMIENTAS DE LA ASIGNATURA: "+ this.nombreAsignatura;
		texto=texto+"\n";
		for(int cont=0;cont<posicionHerramienta;cont++){
			texto=texto+herramienta[cont]+"\n";
		}
		return texto;
	}
		

}
