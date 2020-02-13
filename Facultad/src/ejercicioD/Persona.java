package ejercicioD;

public abstract class Persona {
    String nombre;
    String apellidos;
    String id;
    String estadoCivil;
   
//---------------------------------------------------------------------CONSTRUCTOR 
   public Persona(String nombre, String apellidos, String id, String estadoCivil) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
		this.estadoCivil = estadoCivil;
	}

	public Persona() {
    }
//--------------------------------------------------------------------- GEt & Set 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
//--------------------------------------------------------------------- TO STRING
   @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", estadoCivil=" + estadoCivil + '}';
    }
//--------------------------------------------------------------------- METODOS
    public void cambiarEstadoCivil(String est){
        this.estadoCivil = est;
    }
	
	public void imprimir(){
		
	}
}













