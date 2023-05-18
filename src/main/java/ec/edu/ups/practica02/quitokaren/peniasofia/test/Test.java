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

        ControladorCompositor controladorCompositor = new ControladorCompositor(vistaCompositor, vistaCantante, compositorDAO, cantanteDAO);
        ControladorCantante controladorCantante = new ControladorCantante(vistaCantante, vistaDisco, cantanteDAO);

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
                    int opcionCantante;
                    do {
                        //menu interno para opciones adicionales en el caso 1
                        System.out.println("\n Menu Cantante \n1. Ingresar cantante  \n2. Ver cantante  \n3.Actualizar cantante \n4.Eliminar cantante \n5.Salir ");
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
                                break;
                            case 6:
                                
                            default:
                                System.out.println("Error, opción inválida");
                                break;
                        }
                    } while (opcionCantante != 5);
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
