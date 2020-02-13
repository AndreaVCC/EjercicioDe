package ejercicioD;

public abstract class Persona {
    String nombre;
    String apellidos;
    String id;
    String estadoCivil;

    public Persona(String nombre, String apellidos, String id, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public Persona() {
    }
    public void imprimir() {
    	
    }

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

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", estadoCivil=" + estadoCivil + '}';
    }
    
    public void cambiarEstadoCivil(String est){
        this.estadoCivil = est;
    }
}
