/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.controlador;


import ec.edu.ups.practica02.quitokaren.peniasofia.idao.ICantanteDAO;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaCompositor;
import ec.edu.ups.practica02.quitokaren.peniasofia.idao.ICompositorDAO;
import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Cantante;
import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Compositor;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaCantante;
import java.util.List;

/**
 *
 * @author ACER
 */
public class ControladorCompositor {
    private VistaCompositor vistaCompositor;
    private VistaCantante vistaCantante;
    
    private Compositor compositor;
    private Cantante cantante;
    
    private ICompositorDAO compositorDAO;
    private ICantanteDAO cantanteDAO;

    public ControladorCompositor(VistaCompositor vistaCompositor, ICompositorDAO compositorDAO) {
        this.vistaCompositor = vistaCompositor;
        this.compositorDAO = compositorDAO;
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
        int codigo = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(codigo);
        compositor.agregarCliente(cantante);
        compositorDAO.update(compositor);
    }
    
    public void buscarPorTituloDeCancion(){
        String valor = vistaCompositor.buscarCancion();
        compositor = compositorDAO.buscarPorTituloDeCancion(valor);
        vistaCompositor.verNombreyApellido(compositor);
    }
    
    

}
