package ejercicioD;


import java.util.ArrayList;
import java.util.Scanner;


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
	
	//Menu
	public static void main(String[] args) {
	
		int op = 0;
	Scanner scanner = new Scanner(System.in); 

	do {
		System.out.println("");
		System.out.println("Menu");
		System.out.println("--------------------");
		System.out.println("1.- Agregar persona");
		System.out.println("2.- Eliminar ersona");
		System.out.println("3.- Mostrar todos");
		System.out.println("4.- Salir del programa");
		System.out.println("-------------------");
		System.out.println("Ingrese una opción: ");

		op = scanner.nextInt();
		
		switch(op){
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4: 
				System.out.println("Adios!!!");
				break;
			default:
				System.out.println("Ingrese una opción válida");
				break;
		}
		
	}while (op != 4);

	scanner.close();

}

}
