/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author Ozark
 */
public class Directivo extends Empleado {

    public Directivo() {
    }
    
    public Directivo(String nombre){
        super(nombre);
 
    }
    
    @Override
    public String toString(){
        return "Empleado: "+this.nombre+" -- directivo";
    }
    
}
