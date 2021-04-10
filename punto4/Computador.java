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
public class Computador {
    
    protected int codigo;
    protected int precio;
    
    //constructor
    public Computador() {
    }

    public Computador(int codigo, int precio) {
        this.codigo = 15;
        this.precio = 240000;
    }
      
    //getters
    public int getCodigo() {
        return codigo;
    }

    public int getPrecio() {
        return precio;
    }
    
    //setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void mostrar(){
        System.out.println("codigo : "+codigo);
        System.out.println("precio : "+precio);;
    }
 
    
    
}
