package ejercicioD;

import java.util.ArrayList;

public class Estudiante extends Persona{
    
//--------------------------------------------------------------------ATRIBUTO  
	private ArrayList<String> cursos = new ArrayList<>();

//--------------------------------------------------------------------CONSTRUCTOR 
	public Estudiante() {
		super();
		this.cursos = null;
		// TODO Auto-generated constructor stub ok
	}

	public Estudiante(String nombre, String apellidos, String id, String estadoCivil, String _curso) {
		super(nombre, apellidos, id, estadoCivil);
		this.cursos.add(_curso); 
	}
	
//--------------------------------------------------------------------GETT & SETT
/*/ GETT & SETT  
	public String getCursos() {
		
		
		return cursos.get();
	}

	public void setCurso(String curso) {
		this.cursos = curso;
	}*/

//-------------------------------------------------------------------- METODOS 
	public void imprimir() {
		System.out.println("\nNombre: " + super.getNombre() + "\n Apellidos: " + super.getApellidos() + "\n ID: " + super.getId() + "\n Estado Civil: " + super.getEstadoCivil());
		System.out.println("Cursos: ");
		for(int i=0; i<cursos.size();i++) {
			System.out.println(cursos.get(i));
		}
	} 
	
	//agregacion de elemento a arraylist cursos evitando repeticiones
	public void matriculaNuevoCurso(String curso) {
		boolean cond=true;
		for(int i=0; i<cursos.size();i++) {
			if(cursos.get(i).equals(curso)) {
				System.out.println("el curso ya existe");
				cond=false;
			}
		}
		if(cond) {
			cursos.add(curso);
		}
		
	}
	//eliminar curso en base a busqueda y comparación en arraylist cursos
	public void eliminarCurso(String curso){
		boolean b=false;
		
		for(int i=0; i<cursos.size();i++) {
			if(cursos.get(i).equals(curso)) {
				cursos.remove(i);
				b=true;				
			}
		}
		if(b) {
			System.out.println("eliminación exitosa");
		}else {
			System.out.println("No se pudo eliminar, no se encontró el curso");
		}
	}
}













