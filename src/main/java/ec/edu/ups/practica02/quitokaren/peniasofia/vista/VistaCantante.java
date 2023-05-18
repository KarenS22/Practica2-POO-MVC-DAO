package ec.edu.ups.practica02.quitokaren.peniasofia.vista;

import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Cantante;
import java.util.List;
import java.util.Scanner;

public class VistaCantante {
//atributo

    private Scanner teclado;
//constructor

    public VistaCantante() {
        teclado = new Scanner(System.in);
    }
//ingreso por teclado de los datos para los diferentes metodos

    public Cantante ingresarCantante() {
        teclado = new Scanner(System.in);
        System.out.println("INGRESO DE CANTANTE");
        //ingreso de datos con Scanner
        System.out.println("Ingrese el codigo del cantante: ");
        int codigo = teclado.nextInt();
        System.out.println("Ingrese el nombre del cantante: ");
        String nombre = teclado.next();
        System.out.println("Ingrese el apellido del cantante: ");
        String apellido = teclado.next();
        System.out.println("Ingrese la edad del cantante: ");
        int edad = teclado.nextInt();
        System.out.println("Ingrese la nacionalidad del cantante: ");
        String nacionalidad = teclado.next();
        System.out.println("Ingrese el salario del cantante: ");
        double salario = teclado.nextDouble();
        System.out.println("Ingrese el nombre artistico del cantante: ");
        String nombreArtistico = teclado.next();
        System.out.println("Ingrese el genero musical del cantante: ");
        String generoMusical = teclado.next();
        System.out.println("Ingrese el numero del sencillos del cantante: ");
        int numeroDeSencillos = teclado.nextInt();
        System.out.println("Ingrese el numero de conciertos del cantante: ");
        int numeroDeConciertos = teclado.nextInt();
        System.out.println("Ingrese el numero de giras del cantante: ");
        int numeroDeGiras = teclado.nextInt();
        return new Cantante(nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras, codigo, nombre, apellido, edad, nacionalidad, salario);
    }

    public Cantante actualizarCantante(int codigo) {
        teclado = new Scanner(System.in);
        System.out.println("ACTUALIZACION DE DATOS DE CANTANTE");
        //ingreso de datos con Scanner
        System.out.println("Ingrese el nombre del cantante: ");
        String nombre = teclado.next();
        System.out.println("Ingrese el apellido del cantante: ");
        String apellido = teclado.next();
        System.out.println("Ingrese la edad del cantante: ");
        int edad = teclado.nextInt();
        System.out.println("Ingrese la nacionalidad del cantante: ");
        String nacionalidad = teclado.next();
        System.out.println("Ingrese el salario del cantante: ");
        double salario = teclado.nextDouble();
        System.out.println("Ingrese el nombre artistico del cantante: ");
        String nombreArtistico = teclado.next();
        System.out.println("Ingrese el genero musical del cantante: ");
        String generoMusical = teclado.next();
        System.out.println("Ingrese el numero del sencillos del cantante: ");
        int numeroDeSencillos = teclado.nextInt();
        System.out.println("Ingrese el numero de conciertos del cantante: ");
        int numeroDeConciertos = teclado.nextInt();
        System.out.println("Ingrese el numero de giras del cantante: ");
        int numeroDeGiras = teclado.nextInt();
        return new Cantante(nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras, codigo, nombre, apellido, edad, nacionalidad, salario);
    }

    public Cantante eliminarCantante(int id) {
        teclado = new Scanner(System.in);
        return new Cantante(id, null, null);
    }

    public int buscarCantante() {
        System.out.println("Ingrese el id del cantante: ");
        int id = teclado.nextInt();
        return id;
    }

    public void verCantante(Cantante cantante) {
        System.out.println("Datos del cantante: " + cantante);
    }

    public void verCantantes(List<Cantante> cantantes) {
        for (Cantante cantante : cantantes) {
            System.out.println("Datos del cantante: " + cantante);
        }
    }

    public String buscarPorDisco() {
        teclado = new Scanner(System.in);
        System.out.println("BUSQUEDA POR NOMBRE DE DISCO");
        System.out.println("Ingrese el nombre del disco a buscar: ");
        String valor = teclado.next();
        return valor;
    }

    public void verNombreyApellido(Cantante cantante) {
        System.out.println("Canatante: " + cantante.getNombre() + " " + cantante.getApellido());
    }


}
