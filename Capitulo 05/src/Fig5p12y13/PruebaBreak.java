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
public class PruebaBreak {
    public static void main(String[] args) {
        int cuenta;
        for(cuenta = 1; cuenta <=10; cuenta++){
            if(cuenta == 5)
                break;
            System.out.printf("%d", cuenta);
        }
        System.out.printf("\nSalio del ciclo en cuenta = %d\n", cuenta);
    }
}
