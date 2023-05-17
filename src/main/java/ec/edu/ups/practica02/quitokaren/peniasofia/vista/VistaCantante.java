/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.vista;

import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Cantante;
import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Persona;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class VistaCantante {

    private Scanner teclado;

    public VistaCantante() {
        teclado = new Scanner(System.in);
    }

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
        Persona cantante = new Cantante(nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras, codigo, nombre, apellido, edad, nacionalidad, salario);       
        System.out.println("Ingrese la cantidad de discos del cantante: ");
        int nD = teclado.nextInt();
        for (int i = 0; i < nD; i++) {
            System.out.println("INGRESO DE DISCO ");
            System.out.println("Ingrese el codigo del disco: ");
            int codigoD = teclado.nextInt();
            System.out.println("Ingrese el nombre del disco: ");
            String nombreD = teclado.next();
            System.out.println("Ingrese el año de lanzamiento del disco: ");
            int anioDeLanzamiento = teclado.nextInt();
            //casting para aplicar el metodo agregarDisco
            Cantante cantanteC = (Cantante) cantante;
            cantanteC.agregarDisco(codigoD, nombreD, anioDeLanzamiento);
        }
        //metodo para calcular salario final
        cantante.calcularSalario();
        return (Cantante)cantante;
    }

    public Cantante actualizarCantante() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el codigo del cantante a actualizar");
        int codigo = teclado.nextInt();
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

    public Cantante eliminarCantante() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el id del cantante a eliminar: ");
        int id = teclado.nextInt();
        return new Cantante(id, null, null);
    }

    public int buscarCantante() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el id del cantante a eliminar: ");
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

}
