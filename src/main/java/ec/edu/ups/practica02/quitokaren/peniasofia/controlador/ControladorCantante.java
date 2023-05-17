
package ec.edu.ups.practica02.quitokaren.peniasofia.controlador;

import ec.edu.ups.practica02.quitokaren.peniasofia.idao.ICantanteDAO;
import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Cantante;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaCantante;
import java.util.List;


public class ControladorCantante {
    //atributos
    private VistaCantante vistaCantante;
    
    private Cantante cantante;
    
    private ICantanteDAO cantanteDAO;


    public ControladorCantante(VistaCantante vistaCantante, ICantanteDAO cantanteDAO) {
        this.vistaCantante = vistaCantante;
        this.cantanteDAO = cantanteDAO;
    }

    public void registrar(){
        cantante = vistaCantante.ingresarCantante();
        cantanteDAO.create(cantante);
    }
    
    public void verCantante(){
        int id = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(id);
        vistaCantante.verCantante(cantante);
    }
    
    public void actualizarCantante(){
        cantante = vistaCantante.actualizarCantante();
        cantanteDAO.update(cantante);
    }
    
    public void eliminarCantante(){
        cantante = vistaCantante.eliminarCantante();
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
