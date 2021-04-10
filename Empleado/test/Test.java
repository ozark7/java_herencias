/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Empleado. *;

/**
 *
 * @author Ozark
 */
public class Test {
    
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Andres");
        System.out.println(empleado1);
        
        Operario operario1 = new Operario("Felipe");
        System.out.println(operario1);
        
        Directivo directivo1 = new Directivo("Sara");
        System.out.println(directivo1);
        
        Oficial oficial1 = new Oficial("Isabel");
        System.out.println(oficial1);
        
        Tecnico tecnico1 = new Tecnico("Vanessa");
        System.out.println(tecnico1);
        
    }
    
}
