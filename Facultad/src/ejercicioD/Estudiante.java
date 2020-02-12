package ejercicioD;

public class Estudiante extends Persona{
    
	//ATRIBUTO  
	private String curso;

	//CONSTRUCTOR 
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub ok
	}

	public Estudiante(String nombre, String apellidos, String id, String estadoCivil, String _curso) {
		super(nombre, apellidos, id, estadoCivil);
		this.curso = _curso; 
	}
	
	// GETT & SETT 
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	// TO STRING 
	@Override
	public String toString() {
		return "Estudiante [curso=" + curso + super.toString() + "]";
	} 
	

}