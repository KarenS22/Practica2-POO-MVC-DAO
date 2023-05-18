/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.vista;

import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Cancion;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class VistaCancion {

    private Scanner teclado;

    public VistaCancion() {
        teclado = new Scanner(System.in);
    }

    public Cancion ingresarCancion() {
        System.out.println("Ingrese el numero de canciones en el Top 100 Billboard del compositor: ");
        int nC = teclado.nextInt();

        for (int i = 0; i < nC; i++) {
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
        return null;
    }

    public Cancion actualizarCancion() {
        System.out.println("ACTUALIZACION DE CANCION");
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

    public Cancion eliminarCancion() {
        System.out.println("Ingrese el id de la cancion a eliminar: ");
        int nD = teclado.nextInt();
        return new Cancion();
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
