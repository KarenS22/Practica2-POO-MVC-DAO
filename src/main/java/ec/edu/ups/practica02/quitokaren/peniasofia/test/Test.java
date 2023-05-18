package ec.edu.ups.practica02.quitokaren.peniasofia.test;

import ec.edu.ups.practica02.quitokaren.peniasofia.controlador.ControladorCantante;
import ec.edu.ups.practica02.quitokaren.peniasofia.controlador.ControladorCompositor;
import ec.edu.ups.practica02.quitokaren.peniasofia.dao.CantanteDAO;
import ec.edu.ups.practica02.quitokaren.peniasofia.dao.CompositorDAO;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaCancion;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaCantante;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaCompositor;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaDisco;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        VistaCompositor vistaCompositor = new VistaCompositor();
        VistaCantante vistaCantante = new VistaCantante();
        VistaCancion vistaCancion = new VistaCancion();
        VistaDisco vistaDisco = new VistaDisco();

        CompositorDAO compositorDAO = new CompositorDAO();
        CantanteDAO cantanteDAO = new CantanteDAO();

        ControladorCompositor controladorCompositor = new ControladorCompositor(vistaCompositor, 
                vistaCantante, vistaCancion, compositorDAO, cantanteDAO);
        ControladorCantante controladorCantante = new ControladorCantante(vistaCantante, vistaDisco, 
                cantanteDAO);

        // instancia de Scanner para ingreso por teclado (opcion, menu)
        Scanner teclado = new Scanner(System.in);
        int op = 0;

        //bucle do
        do {
            //menu 
            System.out.println("\n MENU MUSIK-UPS \n1. Menu Cantante \n2.Menu Compositor \n3.Salir ");
            //ingreso por teclado de la opcion
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    int opcionCantante;
                    do {
                        //menu interno para opciones adicionales en el caso 1
                        System.out.println("\n MENU CANTANTE \n1. Ingresar cantante  \n2. Ver cantante  \n3.Actualizar cantante \n4.Eliminar cantante \n5.Ver lista de cantantes \n6.Menu Disco \n.7Salir");
                        //ingreso por teclado de la opcion
                        opcionCantante = teclado.nextInt();
                        switch (opcionCantante) {
                            case 1:
                                controladorCantante.registrar();
                                break;
                            case 2:
                                controladorCantante.verCantante();
                                break;
                            case 3:
                                controladorCantante.actualizarCantante();
                                break;
                            case 4:
                                controladorCantante.eliminarCantante();
                                break;
                            case 5:
                                controladorCantante.verCantantes();
                            case 6:
                                int opcionDisco;
                                do {
                                    //menu interno para opciones adicionales en el caso 1
                                    System.out.println("\n MENU DISCO \n1. Ingresar disco  \n2.Actualizar disco \n3.Eliminar disco \n4.Salir");
                                    //ingreso por teclado de la opcion
                                    opcionDisco = teclado.nextInt();
                                    switch (opcionDisco) {
                                        case 1:
                                            controladorCantante.ingresarDisco();

                                            break;
                                        case 2:
                                            controladorCantante.actualizarDisco();
                                            break;
                                        case 3:
                                            controladorCantante.eliminarDisco();
                                            break;
                                        case 4:
                                            break;
                                        default:
                                            System.out.println("Error, opción inválida");
                                            break;
                                    }
                                } while (opcionDisco != 4);
                                break;

                            case 7:
                                break;
                            default:
                                System.out.println("Error, opción inválida");
                                break;
                        }
                    } while (opcionCantante != 7);
                    break;
                case 2:

                    int opcionCompositor;
                    do {
                        //menu interno para opciones adicionales en el caso 1
                        System.out.println("\n MENU COMPOSITOR \n1. Ingresar compositor  \n2. Ver compositor  \n3.Actualizar compositor \n4.Eliminar compositor \n5.Ver compositores \n6.Menu Cancion \n7.MenuCliente \n8.Salir ");
                        //ingreso por teclado de la opcion
                        opcionCompositor = teclado.nextInt();
                        switch (opcionCompositor) {
                            case 1:
                                controladorCompositor.registrar();
                                break;
                            case 2:
                                controladorCompositor.verCompositor();
                                break;
                            case 3:
                                controladorCompositor.actualizarCompositor();
                                break;
                            case 4:
                                controladorCompositor.eliminarCompositor();
                                break;
                            case 5:
                                controladorCantante.verCantantes();
                            case 6:
                                int opcionCancion;
                                do {
                                    //menu interno para opciones adicionales en el caso 1
                                    System.out.println("\n MENU CANCION \n1. Ingresar cancion  \n2.Actualizar cancion \n3.Eliminar cancion \n4.Salir");
                                    //ingreso por teclado de la opcion
                                    opcionCancion = teclado.nextInt();
                                    switch (opcionCancion) {
                                        case 1:
                                            controladorCompositor.ingresarCancion();
                                            break;
                                        case 2:
                                            controladorCompositor.actualizarCancion();
                                            break;
                                        case 3:
                                            controladorCompositor.eliminarCancion();
                                            break;
                                        case 4:
                                            break;
                                        default:
                                            System.out.println("Error, opción inválida");
                                            break;
                                    }
                                } while (opcionCancion != 4);
                                break;
                            case 7:
                                int opcionCliente;
                                do {
                                    //menu interno para opciones adicionales en el caso 1
                                    System.out.println("\n MENU CLIENTE \n1. Ingresar cliente  \n2.Eliminar cliente \n3.Salir");
                                    //ingreso por teclado de la opcion
                                    opcionCliente = teclado.nextInt();
                                    switch (opcionCliente) {
                                        case 1:
                                            controladorCompositor.agregarCliente();
                                            break;
                                        case 2:
                                            controladorCompositor.eliminarCliente();
                                            break;
                                        case 3:
                                            break;
                                        default:
                                            System.out.println("Error, opción inválida");
                                            break;
                                    }
                                } while (opcionCliente != 3);
                            case 8: 
                                break;
                            default:
                                System.out.println("Error, opción inválida");
                                break;
                        }
                    } while (opcionCompositor != 8);
                    break;
                case 3:
                    //salida del bucle
                    break;
                default:
                    //si es que se ingresa una opcion invalida
                    System.out.println("Error, opcion invalida ");
                    ;
            }
            //salida del bucle
        } while (op != 3);
    }
}
