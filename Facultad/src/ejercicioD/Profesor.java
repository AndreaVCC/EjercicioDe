package ejercicioD;

import java.util.ArrayList;
public class Profesor extends Persona {
	
//--------------------------------------------------------------ATRIBUTO
    public String departamento;
    public int anioIncorporacion; 
    public int numDespacho;
    
//-------------------------------------------------------------CONSTRUCTOR
    
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
     public void imprimir() {
=======

		
	public void imprimir() {
>>>>>>> branch 'master' of https://github.com/el-grupito-del-fondo/EjercicioDe.git
		
	}
	
<<<<<<< HEAD
//------------------------------------------------------------------SETT GETT

=======


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

<<<<<<< HEAD
=======



>>>>>>> branch 'master' of https://github.com/el-grupito-del-fondo/EjercicioDe.git
	public void setAnioIncorporacion(int anioIncorporacion) {
		this.anioIncorporacion = anioIncorporacion;
	}

	public int getNumDespacho() {
		return numDespacho;
	}

	public void setNumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}

//-------------------------------------------------------------------- TO STRING 
	@Override
	public String toString() {
		return super.toString() + "Profesor [departamento=" + departamento + ", anioIncorporacion=" + anioIncorporacion + ", numDespacho="
				+ numDespacho + "]";
	}

<<<<<<< HEAD
//--------------------------------------------------------------------METODOS
=======


 
	
	


	//METODOS
>>>>>>> branch 'master' of https://github.com/el-grupito-del-fondo/EjercicioDe.git
	   public void cambiarDepartamento(ArrayList<String> lista, String dep){
	      dep = dep.toLowerCase(); //validacion para que todos los nombres estén en minuscula 
	      boolean d=false;
		  //buscar en el arraylist que el departamento esté
		  for(int i=0; i<lista.size(); i++) {
			  //comparar string con lo que está dentro
			  if(lista.get(i).equals(dep)) {
				  //reemplazar el atributo departamento (dep)
				  this.departamento = dep;
				  d=true;
			  }
		  }
		  if(d) {
			  System.out.print("cambio exitoso");
		  }else {
			  System.out.print("no se encontró el departamento, cambio fallido");
		  }		  

	    }
	
	  
	  public void reasignarDesopacho(int nudes ){
	        this.numDespacho = nudes;
	    }
}
<<<<<<< HEAD
//--------------------------------------------------------------------Comentarios tests

=======


>>>>>>> branch 'master' of https://github.com/el-grupito-del-fondo/EjercicioDe.git







<<<<<<< HEAD








=======
//Comentarios tests
>>>>>>> branch 'master' of https://github.com/el-grupito-del-fondo/EjercicioDe.git

