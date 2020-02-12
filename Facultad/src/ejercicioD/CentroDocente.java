package ejercicioD;


import java.util.ArrayList;


public class CentroDocente {
   //ArrayList < tipo de dato> Nombre = Instancia tipo ArrayList
	static ArrayList <Persona> listaPersona = new ArrayList <>(); // Hacer una lista de todas las personas
	static ArrayList <Integer> listaDespachos = new ArrayList <>();// Asignar numero de despacho ( Empleados ) 
	static ArrayList <Integer> listaseccion = new ArrayList <>();// Asignar una seccion ( P.servicio)
	static ArrayList <String> listaCurso = new ArrayList <>();// Asignar un curso (Estudiantes)
	static ArrayList <String> listaDepartamento = new ArrayList <>();// Asignar Departamento ( Profesores ) 
	
	
	//Metodo mostrar persona ingresada en lista
	
	public static void muestraPersona(){
		for(Persona personita: listaPersona) {
			System.out.println(personita);
		}
	}
}
