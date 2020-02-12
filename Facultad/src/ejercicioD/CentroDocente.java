package ejercicioD;


import java.util.ArrayList;


public class CentroDocente {
   //ArrayList < tipo de dato> Nombre = Instancia tipo ArrayList
	ArrayList <Persona> listaPersona = new ArrayList <>(); // Hacer una lista de todas las personas
	ArrayList <Integer> listaDespachos = new ArrayList <>();// Asignar numero de despacho ( Empleados ) 
	ArrayList <Integer> listaseccion = new ArrayList <>();// Asignar una seccion ( P.servicio)
	ArrayList <String> listaCurso = new ArrayList <>();// Asignar un curso (Estudiantes)
	ArrayList <String> listaDepartamento = new ArrayList <>();// Asignar Departamento ( Profesores ) 
	
	
	//Metodo mostrar persona ingresada en lista
	
	public void muestraPersona(){
		for(Persona personita: listaPersona) {
			System.out.println(personita);
		}
	}
}
