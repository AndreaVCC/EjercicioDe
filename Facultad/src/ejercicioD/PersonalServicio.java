package ejercicioD;
import java.util.ArrayList;

public class PersonalServicio extends Persona {

	private String seccion;
	private int anioIncorporacion; 
	private int numDespacho;
	    
	// CONSTRUCTOR
	
	public PersonalServicio(){
		super();
	}



	public PersonalServicio(String nombre, String apellidos, String id, String estadoCivil, String seccion , int anioIncorporacion, int numDespacho) {
		super(nombre, apellidos, id, estadoCivil);
		// TODO Auto-generated constructor stub
		this.seccion = seccion; 
		this.anioIncorporacion = anioIncorporacion;
		this.numDespacho = numDespacho;
		
	}


	// GETTERS Y SETTERS 


	public void imprimir() {
		
	}
	
	
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}


	public String getSeccion() {
		return seccion;
	}
	
	public void cambiarSeccion(ArrayList<String> listaseccion, Integer cambio ) {
		boolean d = false;
		
		for(int i = 0; i<listaseccion.size(); i++) {
			if(listaseccion.get(i).equals(cambio)) {
				//Cambiamos valor Integer a String
				this.seccion = Integer.toString(cambio);
				d = true;
			}
		}
		
		if (d) {
			System.out.println("Cambio Exitoso");
		} else {
			System.out.println("No se pudo realizar el cambio");
		}
	}





	public int getAnioIncorporacion() {
		return anioIncorporacion;
	}



	public void setAnioIncorporacion(int anioIncorporacion) {
		this.anioIncorporacion = anioIncorporacion;
	}



	public int getNumDespacho() {
		return numDespacho;
	}



	public void setNumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}
 
	
	
	// TO STRING 

	@Override
	public String toString() {
		return  super.toString()+ "PersonalServicio [seccion=" + seccion + ", anioIncorporacion=" + anioIncorporacion + ", numDespacho="
				+ numDespacho + "]";
	}

	
	
	// Metodos
	
	 public void reasignarDesopacho(int nudes ){
	        this.numDespacho = nudes;
	    }
	
	 
	 public void trasladoSeccion(String tsec ){
	        this.seccion = tsec;
	    }
	

	 
	
	
	
	
}