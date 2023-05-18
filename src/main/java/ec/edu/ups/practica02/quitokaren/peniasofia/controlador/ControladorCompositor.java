
package ec.edu.ups.practica02.quitokaren.peniasofia.controlador;


import ec.edu.ups.practica02.quitokaren.peniasofia.idao.ICantanteDAO;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaCompositor;
import ec.edu.ups.practica02.quitokaren.peniasofia.idao.ICompositorDAO;
import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Cancion;
import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Cantante;
import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Compositor;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaCancion;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaCantante;

import java.util.List;

public class ControladorCompositor {
    private VistaCompositor vistaCompositor;
    private VistaCantante vistaCantante;
    private VistaCancion vistaCancion;
    
    private Compositor compositor;
    private Cantante cantante;
    private Cancion cancion;
    
    private ICompositorDAO compositorDAO;
    private ICantanteDAO cantanteDAO;


    public ControladorCompositor(VistaCompositor vistaCompositor, VistaCantante vistaCantante, ICompositorDAO compositorDAO, ICantanteDAO cantanteDAO) {
        this.vistaCompositor = vistaCompositor;
        this.vistaCantante = vistaCantante;
        this.compositorDAO = compositorDAO;
        this.cantanteDAO = cantanteDAO;
    }
    

    public void registrar(){
        compositor = vistaCompositor.ingresarCompositor();
        
        compositorDAO.create(compositor); 
        
    }
    
    public void verCompositor(){
        int id = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(id);
        vistaCompositor.verCompositor(compositor);
    }
    
    public void actualizarCompositor(){
        compositor = vistaCompositor.actualizarCompositor();
        compositorDAO.update(compositor);
    }
    
    public void eliminarCompositor(){
        compositor = vistaCompositor.eliminarCompositor();
        compositorDAO.delete(compositor);
    }
    
    public void verCompositores(){
        List<Compositor> compositores;
        compositores = compositorDAO.findALL();
        vistaCompositor.verCompositores(compositores);
    }
    
    public void agregarCliente(){
        int id = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(id);
        int codigoC = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(codigoC);
        compositor.agregarCliente(cantante);
        compositorDAO.update(compositor);
    }
    
    
    
    public void buscarPorTituloDeCancion(){
        String valor = vistaCompositor.buscarCancion();
        compositor = compositorDAO.buscarPorTituloDeCancion(valor);
        vistaCompositor.verNombreyApellido(compositor);
    }
}
