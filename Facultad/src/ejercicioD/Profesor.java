package ejercicioD;


public class Profesor extends Persona {
	
	//ATRIBUTO
    public String departamento;
    public int anioIncorporacion; 
    public int numDespacho;
    
  
    

    //CONSTRUCTOR
    
    
    
    public Profesor() {
    	super ();
    }
    
    
  
    public Profesor(String nombre, String apellidos, String id, String estadoCivil, String departamento, int anioIncorporacion , int numDespacho) {
		super(nombre, apellidos, id, estadoCivil);
		// TODO Auto-generated constructor stub
		this.departamento = departamento;
		this.anioIncorporacion = anioIncorporacion; 
		this.numDespacho = numDespacho ; 
	}

<<<<<<< HEAD

// GETT AND SETT
	

=======
		
	public void imprimir() {
		
	}
	


//SETT GETT
>>>>>>> branch 'master' of https://github.com/el-grupito-del-fondo/EjercicioDe.git
	public String getDepartamento() {
		return departamento;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
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
		return super.toString() + "Profesor [departamento=" + departamento + ", anioIncorporacion=" + anioIncorporacion + ", numDespacho="
				+ numDespacho + "]";
	}



	//METODOS 
	
	

	  public void cambiarDepartamento(String dep){
	        this.departamento = dep;
	    }
	
	  
	  public void reasignarDesopacho(int nudes ){
	        this.numDespacho = nudes;
	    }
}

<<<<<<< HEAD







//Comentarios tests
=======
>>>>>>> branch 'master' of https://github.com/el-grupito-del-fondo/EjercicioDe.git
