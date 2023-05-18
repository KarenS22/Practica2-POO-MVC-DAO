
package ec.edu.ups.practica02.quitokaren.peniasofia.controlador;

import ec.edu.ups.practica02.quitokaren.peniasofia.idao.ICantanteDAO;
import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Cantante;
import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Disco;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaCantante;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaDisco;
import java.util.List;


public class ControladorCantante {
    //atributos
    private VistaCantante vistaCantante;
    private VistaDisco vistaDisco;
    
    private Cantante cantante;
    private Disco disco;
    
    private ICantanteDAO cantanteDAO;


    public ControladorCantante(VistaCantante vistaCantante, VistaDisco vistaDisco, ICantanteDAO cantanteDAO) {
        this.vistaCantante = vistaCantante;
        this.vistaDisco = vistaDisco;
        this.cantanteDAO = cantanteDAO;
    }
    

    public void registrar(){
        cantante = vistaCantante.ingresarCantante();
        disco = vistaDisco.ingresarDisco();
        cantante.agregarDisco(disco);
        cantante.calcularSalario();
        cantanteDAO.create(cantante);
    }
    
    public void verCantante(){
        int id = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(id);
        vistaCantante.verCantante(cantante);
    }
    
    public void actualizarCantante(){
        cantante = vistaCantante.actualizarCantante();
        disco = vistaDisco.actualizarDisco();
        cantante.actualizarDisco(disco);
        cantante.calcularSalario();
        cantanteDAO.update(cantante);
    }
    
    public void eliminarCantante(){
        cantante = vistaCantante.eliminarCantante();
        disco = vistaDisco.eliminarDisco();
        cantante.eliminarDisco(disco);
        cantanteDAO.delete(cantante);
    }
    
    public void verCantantes(){
        List<Cantante> cantantes;
        cantantes = cantanteDAO.findALL();
        vistaCantante.verCantantes(cantantes);
    }
    
    public void buscarPorNombreDeDisco(){
        String valor = vistaCantante.buscarPorDisco();
        cantante = cantanteDAO.buscarPorNombreDeDisco(valor);
        vistaCantante.verNombreyApellido(cantante);
    }
}
