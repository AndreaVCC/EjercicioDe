package ejercicioD;

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
// ---------------------------------------------------------------------Metodos
	public void reasignarDesopacho(int nudes ){
	        this.numDespacho = nudes;
	    }
	
	public void trasladoSeccion(String tsec ){
	        this.seccion = tsec;
	    }
	
	public void imprimir() {
		}		
}
















