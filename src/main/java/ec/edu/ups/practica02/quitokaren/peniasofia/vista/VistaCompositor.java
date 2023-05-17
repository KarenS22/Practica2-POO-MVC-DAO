/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.vista;

import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Compositor;
import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Persona;
import java.util.List;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class VistaCompositor {

    private Scanner teclado;

    public VistaCompositor() {
        teclado = new Scanner(System.in);
    }

    public Compositor ingresarCompositor() {

        System.out.println("INGRESO DE COMPOSITOR");
        //ingreso de datos con scanner
        System.out.println("Ingrese el codigo del compositor: ");
        int codigoC = teclado.nextInt();
        System.out.println("Ingrese el nombre del compositor: ");
        String nombreC = teclado.next();
        System.out.println("Ingrese el apellido del compositor: ");
        String apellidoC = teclado.next();
        System.out.println("Ingrese la edad del compositor: ");
        int edadC = teclado.nextInt();
        System.out.println("Ingrese la nacionalidad del compositor: ");
        String nacionalidadC = teclado.next();
        System.out.println("Ingrese el salario del compositor: ");
        double salarioC = teclado.nextDouble();
        System.out.println("Ingrese el numero de composiciones del compositor: ");
        int numeroDeComposiciones = teclado.nextInt();

        //instanciar compositor
        Persona compositor = new Compositor(numeroDeComposiciones, codigoC, nombreC, apellidoC, edadC, nacionalidadC, salarioC);
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
            //casting para usar metodo agregarCancion
            Compositor compositorC = (Compositor) compositor;
            compositorC.agregarCancion(codigoCa, titulo, letra, tiempoEnMinutos);
        }
        // calculo del salario final 
        compositor.calcularSalario();
        // colocar el objeto en la lista personas
        return (Compositor) compositor;
    }

    public Compositor actualizarCompositor() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el codigo del cliente a actualizar: ");
        int codigo = teclado.nextInt();
        System.out.println("ACTUALIZACION DEL COMPOSITOR");
        //ingreso de datos con scanner
        System.out.println("Ingrese el codigo del compositor: ");
        int codigoC = teclado.nextInt();
        System.out.println("Ingrese el nombre del compositor: ");
        String nombreC = teclado.next();
        System.out.println("Ingrese el apellido del compositor: ");
        String apellidoC = teclado.next();
        System.out.println("Ingrese la edad del compositor: ");
        int edadC = teclado.nextInt();
        System.out.println("Ingrese la nacionalidad del compositor: ");
        String nacionalidadC = teclado.next();
        System.out.println("Ingrese el salario del compositor: ");
        double salarioC = teclado.nextDouble();
        System.out.println("Ingrese el numero de composiciones del compositor: ");
        int numeroDeComposiciones = teclado.nextInt();

        return new Compositor(numeroDeComposiciones, codigo, nombreC, apellidoC, edadC, nacionalidadC, salarioC);
    }

    public Compositor eliminarCompositor() {
        teclado = new Scanner(System.in);
        int id = teclado.nextInt();
        return new Compositor(id, null, null);
    }

    public int buscarCompositor() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el codigo a buscar: ");
        int codigo = teclado.nextInt();
        return codigo;
    }

    public void verCompositor(Compositor compositor) {
        System.out.println("Datos del Compositor: " + compositor);
    }

    public void verCompositores(List<Compositor> compositores) {
        for (Compositor compositore : compositores) {
            System.out.println("Datos del Compositor: " + compositore);
        }
    }

    public String buscarCancion() {
        teclado = new Scanner(System.in);
        System.out.println("BUSQUEDA POR TITULO DE CANCION");
        System.out.println("Ingrese el titulo de la cancion a buscar: ");
        String valorT = teclado.next();
        return valorT;
    }
    
    public void verNombreyApellido(Compositor compositor){
        System.out.println("Canatante: " + compositor.getNombre() + " " + compositor.getApellido());
    }

}
