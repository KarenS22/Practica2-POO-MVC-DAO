
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
        cantante.calcularSalario();
        cantanteDAO.create(cantante);
    }
    
    public void verCantante(){
        int id = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(id);
        vistaCantante.verCantante(cantante);
    }
    
    public void actualizarCantante(){
        int codigo = vistaCantante.buscarCantante();
        cantante = vistaCantante.actualizarCantante(codigo);
        cantante.calcularSalario();
        cantanteDAO.update(cantante);
    }
    
    public void eliminarCantante(){
        int codigo = vistaCantante.buscarCantante();
        cantante = vistaCantante.eliminarCantante(codigo);
        cantanteDAO.delete(cantante);
    }
    
    public void verCantantes(){
        List<Cantante> cantantes;
        cantantes = cantanteDAO.findALL();
        vistaCantante.verCantantes(cantantes);
    }
    
    
    public void ingresarDisco(){
        int id = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(id);
        disco = vistaDisco.ingresarDisco();
        cantante.agregarDisco(disco);
        cantanteDAO.update(cantante);
    }
    
    public void verDisco(){
         int codigoC = vistaCantante.buscarCantante();
        int codigoD = vistaDisco.buscarDisco();
        cantante = cantanteDAO.read(codigoC);
        disco = cantante.buscarDisco(codigoD);
        vistaDisco.verDisco(disco);
    }
    
    public void actualizarDisco(){
        int codigoC = vistaCantante.buscarCantante();
        int codigoD = vistaDisco.buscarDisco();
        cantante = cantanteDAO.read(codigoC);
        disco = vistaDisco.actualizarDisco(codigoD);
        cantante.actualizarDisco(disco);
        cantanteDAO.update(cantante);
    }
    
    public void eliminarDisco(){
        int id = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(id);
        disco = vistaDisco.eliminarDisco();
        cantante.eliminarDisco(disco);
        cantanteDAO.update(cantante);
    }
    
    public void verDiscos(){
        int id = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(id);
        List<Disco> listaDisco;
        listaDisco = cantante.listaDisco();
        vistaDisco.verDiscografia(listaDisco);
    }
    
    public void buscarPorNombreDeDisco(){
        String valor = vistaCantante.buscarPorDisco();
        cantante = cantanteDAO.buscarPorNombreDeDisco(valor);
        vistaCantante.verNombreyApellido(cantante);
    }
}
