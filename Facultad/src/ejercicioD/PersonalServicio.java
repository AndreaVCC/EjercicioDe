package ejercicioD;

import java.util.ArrayList;

public class PersonalServicio extends Persona {

	private String seccion;
	private int anioIncorporacion; 
	private int numDespacho;
	    
//--------------------------------------------------------------------- CONSTRUCTOR
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

// ---------------------------------------------------------------------GETTERS Y SETTERS 
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getSeccion() {
		return seccion;
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
//--------------------------------------------------------------------- TO STRING 

	@Override
	public String toString() {
		return  super.toString()+ "PersonalServicio [seccion=" + seccion + ", anioIncorporacion=" + anioIncorporacion + ", numDespacho="
				+ numDespacho + "]";
	}
// --------------------------------------------------------------------- Metodos
	
	
	
	public void reasignarDespacho(ArrayList<Integer> listaDespachos, int nudes){
	      boolean d=false;
		  							
		  for(int i=0; i<listaDespachos.size(); i++) //------------------buscar en el arraylist  el numero de despacho 
			  
			  if(listaDespachos.get(i) == nudes) { //--------------------------------comparar int con lo que está dentro
				
				  this.numDespacho = nudes;
				  d=true;
			  }
		  

		  if(d) {
			  System.out.print("cambio exitoso");
		  }else {
			  System.out.print("no se encontró el número de Despacho, cambio fallido");
		  }		  

	    }	
	
	public void trasladoSeccion(String tsec ){
	        this.seccion = tsec;
	    }
	
	public void imprimir() {
		System.out.println("\nNombre: " + super.getNombre() + "\n Apellidos: " + super.getApellidos() + "\n ID: " + super.getId() + "\n Estado Civil: " + super.getEstadoCivil());
		System.out.println("\n Despacho: " + this.numDespacho + "\n Seccion: " + this.seccion + "\n Año Incorporaion: " + this.anioIncorporacion);
		}		
}
















