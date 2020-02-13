package ejercicioD;

import java.util.ArrayList;
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
	
}

