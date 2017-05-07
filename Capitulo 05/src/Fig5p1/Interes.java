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
public class Interes {
    public static void main(String[] args) {
        double monto;
        double principal = 1000.0;
        double tasa = 0.05;
        
        System.out.printf("%s%20s\n", "anio", "Monto en deposito");
        for(int anio=1; anio <=10; anio++){
            monto = principal * Math.pow(1.0 + tasa, anio);
            System.out.printf("%4d%, 20.2f\n", anio, monto);
        }
    }
}
