/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos3d;

/**
 *
 * @author luana
 */
public class TesteObjetos3D {
    public static void main(String[] args) {
        Objetos3D c1 = new Cubo(3.7, 7, 4.5, 6.9);
        System.out.println("O volume do cubo eh " + c1.volume());
        System.out.println("A area da superficie eh " + c1.areaDaSuperficie());
        
        c1 = new Paralelepipedo(3.9, 4, 7.6);
        System.out.println("O volume do nome muito grande eh " + c1.volume());
        System.out.println("E a sua area eh " + c1.areaDaSuperficie());
    }
    
}
