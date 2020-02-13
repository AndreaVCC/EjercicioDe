package ejercicioD;


import java.util.*;// Importas todo.


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
	

	// Metodo Agregar Persona 
	public static void agregarPersona () { 
		Scanner sc = new Scanner( System.in);// Creacion instancia escaner 
		int TipoPersona; // creación de la variable local " TipoPersona" , así podremos seleccionar el tipo de persona ( estudiante, Personal de Servicio, Profesor) 
		
		
		
		System.out.println("Ingrese tipo de persona: 1.- Estudiante , 2.- Personal de Servicio , 3.- Profesor. ");// El usuario lee
		TipoPersona = sc.nextInt(); // Estamos Leyendo La opcion ingresada por teclado de la variable "Tipo persona"  con la instancia de la clase Scanner. 
		switch ( TipoPersona) { // DEfinicion de los casos segun el valor de la variable local.
		
		case 1 : 
			Estudiante est = new Estudiante();// Instancia de la Clase Estudiante que incluye los atributos master y locales
			System.out.print("Ingrese los Datos del Estudiante");
			
			System.out.print("nombre: ");
			est.setNombre(sc.next());
			
			System.out.print("apellido: ");
			est.setApellidos(sc.next());
			
			System.out.println("ID : ");
			est.setId(sc.next());
			
			System.out.println("Estado Civil : ");
			est.setEstadoCivil(sc.next());
			
			System.out.println(" Curso");
			est.setCurso(sc.next());
			
			listaPersona.add(est);
			

			break ;
		
		
		case 2 : 
			PersonalServicio pserv = new PersonalServicio(null, null, null, null, null);// Instancia de la Clase Personal de Servicio que incluye los atributos master y locales
			System.out.print("Ingrese los Datos del Personal de Servicio");
			
			System.out.print("nombre: ");
			pserv.setNombre(sc.next());
			
			System.out.print("apellido: ");
			pserv.setApellidos(sc.next());
			
			System.out.println("ID : ");
			pserv.setId(sc.next());
			
			System.out.println("Estado Civil : ");
			pserv.setEstadoCivil(sc.next());
			
			System.out.println("Sección : ");
			pserv.setEstadoCivil(sc.next());
			
			listaPersona.add(pserv);
			
			break ; 
		
		case 3: 
			
			Profesor prof = new Profesor (null, null, null, null, null); // Instancia de la Clase Personal de Servicio que incluye los atributos master y locales
			System.out.print("Ingrese los Datos del Profesor ");
			
			System.out.print("nombre: ");
			prof.setNombre(sc.next());
			
			System.out.print("apellido: ");
			prof.setApellidos(sc.next());
			
			System.out.println("ID : ");
			prof.setId(sc.next());
			
			System.out.println("Estado Civil : ");
			prof.setEstadoCivil(sc.next());
			
			System.out.println(" Departamento  : ");
			prof.setEstadoCivil(sc.next());
			
			listaPersona.add(prof);
			
			break;
		
		
		
		}
		
	}
	// Metodo remover persona ingresada en lista
	public static void darDeBaja(String dni) {
		for (int i = 0; i < listaPersona.size(); i++) {
			if (listaPersona.get(i).getId().equals(dni)) {
				listaPersona.remove(i);
				System.out.println("¡Eliminación exitosa! :D!!");
			}else{
				System.out.println("no se ha encontrado alguien con el id ingresado");
			}		
				

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
		System.out.println("2.- Eliminar persona");
		System.out.println("3.- Mostrar todos");
		System.out.println("4.- Salir del programa");
		System.out.println("-------------------");
		System.out.println("Ingrese una opciÃ³n: ");

		op = scanner.nextInt();
		
		switch(op){
			case 1:
				agregarPersona();
				break;
			case 2:
				darDeBaja(null);
				break;
			case 3:
				muestraPersona();
				break;
			case 4: 
				System.out.println("Adios!!!");
				break;
			default:
				System.out.println("Ingrese una opcion valida");
				break;
		}
		
	}while (op != 4);

	scanner.close();

}

}
