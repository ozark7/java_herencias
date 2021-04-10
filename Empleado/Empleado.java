package Empleado;
/**
 *
 * @author Ozark
 */
public class Empleado {
    String nombre;
    
    //constructor
    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    //getters
    public String getNombre() {
        return nombre;
    }
    
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //metodos
    @Override //sobreescribir
    public String toString(){
        return "Empleado: "+this.nombre;
    }
    
}
