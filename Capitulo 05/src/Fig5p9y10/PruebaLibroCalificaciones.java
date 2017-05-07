/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fig5p9y10;

/**
 *
 * @author Intel7
 */
public class PruebaLibroCalificaciones {
    public static void main(String[] args) {
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(
                "CS 101 Introduccion a la programacion en Java");
        
        miLibroCalificaciones.mostrarMensaje();
        miLibroCalificaciones.introducirCalif();
        miLibroCalificaciones.mostrarReporteCalif();
           
    }
}
