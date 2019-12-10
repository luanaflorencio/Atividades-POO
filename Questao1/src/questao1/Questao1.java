/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author luana
 */
public class Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        elementosNN(new Double[] {1.3, 7.2, null,  3.9});
    }
    public static <T> void elementosNN (T[] array){
        
        int c = 0;
        for(T v : array){
            if(v != null){
                c++;
            }
        }
        System.out.println(c + " ");
    }
}
