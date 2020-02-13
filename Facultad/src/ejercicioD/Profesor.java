package ejercicioD;


public class Profesor extends Persona {
	
	//ATRIBUTO
    public String departamento;

    //CONSTRUCTOR
    
    
    
    public Profesor() {
    	super ();
    }
    
	public Profesor(String nombre, String apellidos, String id, String estadoCivil, String departamento) {
		super(nombre, apellidos, id, estadoCivil);
		this.departamento = departamento;
	}

		
	public void imprimir() {
		
	}
	//SETT GETT
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	//toSTRING
	@Override
	public String toString() {
		return super.toString() + "Profesor [departamento=" + departamento + "]";
	}

	//METODOS
	  public void cambiarDepartamento(String dep){
	        this.departamento = dep;
	    }
	
}

//Comentarios tests
