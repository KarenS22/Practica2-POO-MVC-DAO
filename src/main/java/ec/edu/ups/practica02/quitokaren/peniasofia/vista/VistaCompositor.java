
package ec.edu.ups.practica02.quitokaren.peniasofia.vista;

import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Compositor;
import java.util.List;

import java.util.Scanner;

public class VistaCompositor {
//atributo
    private Scanner teclado;
//constructor
    public VistaCompositor() {
        teclado = new Scanner(System.in);
    }
// ingreso de datos por teclado pa sus respectivos metodos
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
        return new Compositor(numeroDeComposiciones, codigoC, nombreC, apellidoC, edadC, nacionalidadC, salarioC);

                    
    }

    public Compositor actualizarCompositor() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el codigo del cliente a actualizar: ");
        int codigo = teclado.nextInt();
        System.out.println("ACTUALIZACION DEL COMPOSITOR");
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
