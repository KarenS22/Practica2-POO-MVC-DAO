
package ec.edu.ups.practica02.quitokaren.peniasofia.vista;

import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Disco;
import java.util.List;
import java.util.Scanner;

public class VistaDisco {

    private Scanner teclado;

    public VistaDisco() {
        teclado = new Scanner(System.in);
    }

    public Disco ingresarDisco() {

        System.out.println("INGRESO DE DISCO ");
        System.out.println("Ingrese el codigo del disco: ");
        int codigoD = teclado.nextInt();
        System.out.println("Ingrese el nombre del disco: ");
        String nombreD = teclado.next();
        System.out.println("Ingrese el año de lanzamiento del disco: ");
        int anioDeLanzamiento = teclado.nextInt();
        return new Disco(codigoD, nombreD, anioDeLanzamiento);

    }

    public Disco actualizarDisco(int codigoD) {
        System.out.println("ACTUALIZACION DE DISCO ");
        System.out.println("Ingrese el nombre del disco: ");
        String nombreD = teclado.next();
        System.out.println("Ingrese el año de lanzamiento del disco: ");
        int anioDeLanzamiento = teclado.nextInt();

        return new Disco(codigoD, nombreD, anioDeLanzamiento);
    }

    public Disco eliminarDisco() {
        System.out.println("Ingrese codigo de disco a eliminar: ");
        int codigo = teclado.nextInt();
        return new Disco(codigo);
    }

    public int buscarDisco() {
        System.out.println("Ingrese el codigo a buscar: ");
        int codigo = teclado.nextInt();
        return codigo;
    }

    public void verDisco(Disco disco) {
        System.out.println("Datos del disco: " + disco);
    }

    public void verDiscografia(List<Disco> listaDisco) {
        for (Disco disco : listaDisco) {
            System.out.println(disco);
        }
    }

}
