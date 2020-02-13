package ejercicioD;
import java.util.ArrayList;

public class PersonalServicio extends Persona {

	private String seccion;
	
	
	public PersonalServicio(){
		super();
	}

	public PersonalServicio(String nombre, String apellidos, String id, String estadoCivil, String seccion) {
		super(nombre, apellidos, id, estadoCivil);
		this.seccion = seccion;
	}

	public void imprimir() {
		
	}
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getSeccion() {
		return seccion;
	}
	
	public void cambiarSeccion(ArrayList<String> listaseccion, Integer cambio ) {
		boolean d = false;
		
		for(int i = 0; i<listaseccion.size(); i++) {
			if(listaseccion.get(i).equals(cambio)) {
				//Cambiamos valor Integer a String
				this.seccion = Integer.toString(cambio);
				d = true;
			}
		}
		
		if (d) {
			System.out.println("Cambio Exitoso");
		} else {
			System.out.println("No se pudo realizar el cambio");
		}
	}

	public String toString() {
		return super.toString() + "Seccion: "+ seccion;

	}
}

