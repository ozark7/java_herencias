/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

/**
 *
 * @author Ozark
 */
public class SobreMesa extends Computador {
 
    private String eslogan,descripcion;

    //constructor
    public SobreMesa() {
    }

    public SobreMesa(String eslogan, String descripcion) {
        this.eslogan = eslogan;
        this.descripcion = descripcion;
    }
    
    //getters
    public String getEslogan() {
        return eslogan;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    //setters
    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
