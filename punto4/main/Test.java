/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import punto4.*;

/**
 *
 * @author Ozark
 */
public class Test {
    
    public static void main(String[] args) {
        
        Portatil portatil = new Portatil(15,1400000,"Ideal para sus viajes",7);
        System.out.println(portatil.mostrar());
        SobreMesa sobremesa = new SobreMesa("Es el que más pesa, pero el que menos cuesta "," torre con 16GB");
        System.out.println("eslogan sobremesa: "+sobremesa.getEslogan()+", descripcion torre: "+sobremesa.getDescripcion());
    }
}
