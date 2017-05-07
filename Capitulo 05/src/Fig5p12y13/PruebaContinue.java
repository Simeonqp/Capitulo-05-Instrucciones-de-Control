/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fig5p12y13;

/**
 *
 * @author Intel7
 */
public class PruebaContinue {
    public static void main(String[] args) {
        int cuenta;
        for(cuenta = 1; cuenta <=10; cuenta++){
            if(cuenta == 5)
                continue;
            System.out.printf("%d ", cuenta);
        }
        System.out.println("\nSe uso continue para omitir imprimir 5");
    }
}
