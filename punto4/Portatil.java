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
public class Portatil extends Computador{
    
    private String eslogan;
    private int peso;

    public Portatil() {
    }

    public Portatil(int codigo, int precio, String eslogan, int peso) {
        super(codigo,precio);
        
        this.eslogan = eslogan;
        this.peso = peso;
    }

    //getters and setters
    public String getEslogan() {
        return eslogan;
    }

    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    @Override
    public void mostrar(){
        System.out.println("codigo : "+codigo);
        System.out.println("precio : "+precio);
        System.out.println("eslogan : "+eslogan);
        System.out.println("peso : "+peso);
    }
    
    
}
