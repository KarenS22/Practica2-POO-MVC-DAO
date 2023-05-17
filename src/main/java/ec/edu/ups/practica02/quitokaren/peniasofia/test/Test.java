/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.test;

import ec.edu.ups.practica02.quitokaren.peniasofia.controlador.ControladorCantante;
import ec.edu.ups.practica02.quitokaren.peniasofia.controlador.ControladorCompositor;
import ec.edu.ups.practica02.quitokaren.peniasofia.dao.CantanteDAO;
import ec.edu.ups.practica02.quitokaren.peniasofia.dao.CompositorDAO;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaCantante;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaCompositor;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Test {

    public static void main(String[] args) {

        VistaCompositor vistaCompositor = new VistaCompositor();
        VistaCantante vistaCantante = new VistaCantante();

        CompositorDAO compositorDAO = new CompositorDAO();
        CantanteDAO cantanteDAO = new CantanteDAO();

        ControladorCompositor controladorCompositor = new ControladorCompositor(vistaCompositor, compositorDAO);
        ControladorCantante controladorCantante = new ControladorCantante(vistaCantante, cantanteDAO);

        // instancia de Scanner para ingreso por teclado (opcion, menu)
        Scanner teclado = new Scanner(System.in);
        int op = 0;

        //bucle do
        do {
            //menu 
            System.out.println("\n Menu MusikUPS \n1. Ingresar un cantante \n2. Ingresar un compositor \n3. Agregar Clientes \n4. Imprimir personas \n5. Buscar cantante por nombre de disco \n6. Buscar compositor por titulo de cancion \n7. Salir ");
            //ingreso por teclado de la opcion
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    controladorCantante.registrar();
                    break;
                case 2:
                    controladorCompositor.registrar();
                    break;
                case 3:
                    controladorCompositor.agregarCliente();
                    break;
                case 4:
                    // imprime la lista de personas
                    controladorCompositor.verCompositores();
                    controladorCantante.verCantantes();
                    break;
                case 5:
                    controladorCantante.buscarPorNombreDeDisco();
                    break;
                case 6:
                    controladorCompositor.buscarPorTituloDeCancion();
                    break;
                case 7:
                    //salida del bucle
                    break;
                default:
                    //si es que se ingresa una opcion invalida
                    System.out.println("Error, opcion invalida ");
                    ;

            }
            //salida del bucle
        } while (op != 7);
    }

}
