/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fig5p9y10;

import java.util.Scanner;

/**
 *
 * @author Intel7
 */
public class LibroCalificaciones {
    private String nombreDelCurso;
    private int total;
    private int contadorCalif;
    private int aCuenta;
    private int bCuenta;
    private int cCuenta;
    private int dCuenta;
    private int fCuenta;
    
    public LibroCalificaciones(String nombre){
        nombreDelCurso = nombre;
    }
    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso = nombre;
    }
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }
    public void mostrarMensaje(){
        System.out.printf("Bienvenido al LibroCalificaciones para\n%s!\n\n",
                obtenerNombreDelCurso());
    }
    public void introducirCalif(){
        Scanner entrada = new Scanner(System.in);
        int calificacion;
        System.out.printf("%s\n%s\n  %s\n  %s\n",
                "Escriba las calificaciones enteras en el rango de 0 a 100.",
                "Escriba el indicador de fin de archivo para terminar la entrada:",
                "En Unix/Linux/Mac OS X escriba <ctrl> d y despues oprima Intro",
                "En Windows escriba <ctrl> z y despues oprima Intro");
        while(entrada.hasNext()){
            calificacion = entrada.nextInt();
            total += calificacion;
            ++contadorCalif;
            
            incrementarContadorCalifLetra(calificacion);
        }
    }
    private void incrementarContadorCalifLetra(int calificacion){
        switch(calificacion / 10){
            case 9:
            case 10:
                ++aCuenta;
                break;
            case 8:
                ++bCuenta;
                break;
            case 7:
                ++cCuenta;
                break;
            case 6:
                ++dCuenta;
                break;
            default:
                ++fCuenta;
                break;
        }
    }
    public void mostrarReporteCalif(){
        System.out.println("\nReporte de calificaciones:");
        if(contadorCalif != 0){
            double promedio = (double) total / contadorCalif;
            System.out.printf("el total de las %d calificaciones introducidas es %d\n",
                    contadorCalif, total);
            System.out.printf("El promedio de la clase es %.2f\n", promedio);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
                    "Numero de estudiantes que recibieron  cada calificacion:",
                    "A: ", aCuenta,
                    "B: ", bCuenta,
                    "C: ", cCuenta,
                    "D: ", dCuenta,
                    "F: ", fCuenta);
        }
        else
            System.out.println("No se introdujeron calificaciones");
    }
}
// %s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n” 