/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fig5p1;

/**
 *
 * @author Intel7
 */
public class Suma {
    public static void main(String[] args) {
        int total = 0;
        for(int numero = 2; numero <= 20; numero +=2)
            total += numero; 
            System.out.printf("La suma es %d\n", total);
    }
}
