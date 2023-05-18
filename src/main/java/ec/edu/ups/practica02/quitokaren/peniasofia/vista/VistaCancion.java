
package ec.edu.ups.practica02.quitokaren.peniasofia.vista;

import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Cancion;
import java.util.List;
import java.util.Scanner;

public class VistaCancion {

    private Scanner teclado;

    public VistaCancion() {
        teclado = new Scanner(System.in);
    }

    public Cancion ingresarCancion() {

            System.out.println("INGRESO DE CANCION");
            System.out.println("Ingrese el codigo de la cancion: ");
            int codigoCa = teclado.nextInt();
            System.out.println("Ingrese el titulo de la cancion: ");
            String titulo = teclado.next();
            System.out.println("Ingrese la letra de la cancion: ");
            String letra = teclado.next();
            System.out.println("Ingrese el tiempo en minutos de la cancion: ");
            double tiempoEnMinutos = teclado.nextDouble();
            return new Cancion(codigoCa, titulo, letra, tiempoEnMinutos);
   
    }

    public Cancion actualizarCancion(int codigoCa) {
        System.out.println("ACTUALIZACION DE CANCION");
            System.out.println("Ingrese el titulo de la cancion: ");
            String titulo = teclado.next();
            System.out.println("Ingrese la letra de la cancion: ");
            String letra = teclado.next();
            System.out.println("Ingrese el tiempo en minutos de la cancion: ");
            double tiempoEnMinutos = teclado.nextDouble();
            return new Cancion(codigoCa, titulo, letra, tiempoEnMinutos);
    }

    public Cancion eliminarCancion() {
        System.out.println("Ingrese codigo cancion a eliminar: ");
        int nD = teclado.nextInt();
        return new Cancion(nD);
    }

    public int buscarCancion() {
        System.out.println("Ingrese el codigo Cancion a buscar: ");
        int codigo = teclado.nextInt();
        return codigo;
    }

    public void verCancion(Cancion cancion) {
        System.out.println("Datos del disco: " + cancion);
    }
    
    public void verCanciones(List<Cancion> listaCancion){
        for (Cancion cancion : listaCancion) {
            System.out.println(cancion);
        }
    }

}
