package Empleado;
/**
 *
 * @author Ozark
 */
public class Operario extends Empleado {
    
    public Operario() {  
    }
    
    public Operario(String nombre) {
        super(nombre);
    }
    
    @Override
    public String toString(){
        return "Empleado: "+this.nombre+" -- operario";
    }
   
}
