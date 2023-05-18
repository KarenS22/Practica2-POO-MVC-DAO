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

    public ControladorCompositor(VistaCompositor vistaCompositor, VistaCantante vistaCantante, VistaCancion vistaCancion, ICompositorDAO compositorDAO, ICantanteDAO cantanteDAO) {
        this.vistaCompositor = vistaCompositor;
        this.vistaCantante = vistaCantante;
        this.vistaCancion = vistaCancion;
        this.compositorDAO = compositorDAO;
        this.cantanteDAO = cantanteDAO;
    }

    public void registrar() {
        compositor = vistaCompositor.ingresarCompositor();
        compositor.calcularSalario();
        compositorDAO.create(compositor);

    }

    public void verCompositor() {
        int id = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(id);
        vistaCompositor.verCompositor(compositor);
    }

    public void actualizarCompositor() {
        int codigo = vistaCompositor.buscarCompositor();
        compositor = vistaCompositor.actualizarCompositor(codigo);
        compositor.calcularSalario();
        compositorDAO.update(compositor);
    }

    public void eliminarCompositor() {
        int id = vistaCompositor.buscarCompositor();
        compositor = vistaCompositor.eliminarCompositor(id);
        compositorDAO.delete(compositor);
    }

    public void verCompositores() {
        List<Compositor> compositores;
        compositores = compositorDAO.findALL();
        vistaCompositor.verCompositores(compositores);
    }

    public void ingresarCancion() {
        int id = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(id);
        cancion = vistaCancion.ingresarCancion();
        compositor.agregarCancion(cancion);
        compositorDAO.update(compositor);
    }

    public void verCancion() {
        int id = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(id);
        int idcan = vistaCancion.buscarCancion();
        cancion = compositor.buscarCancion(idcan);
        vistaCancion.verCancion(cancion);
    }

    public void actualizarCancion() {
        int id = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(id);
        int idcan = vistaCancion.buscarCancion();
        cancion = vistaCancion.actualizarCancion(idcan);
        compositor.actualizarCancion(cancion);
        compositorDAO.update(compositor);
    }

    public void eliminarCancion() {
        int id = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(id);
        cancion = vistaCancion.eliminarCancion();
        
        compositor.eliminarCancion(cancion);
        compositorDAO.update(compositor);
    }

    public void verCanciones() {
        int id = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(id);
        List<Cancion> listaCancion = compositor.listarCanciones();
        vistaCancion.verCanciones(listaCancion);
    }

    public void agregarCliente() {
        int id = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(id);
        int codigoC = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(codigoC);
        compositor.agregarCliente(cantante);
        compositorDAO.update(compositor);
    }

    public void verCliente() {
        int id = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(id);
        int idcl = vistaCantante.buscarCantante();
        cantante = compositor.buscarCli(idcl);
        vistaCantante.verCantante(cantante);

    }

    public void verClientes() {
        int id = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(id);
        List<Cantante> listaCliente = compositor.listarClientes();
        vistaCantante.verCantantes(listaCliente);

    }

    public void eliminarCliente() {
        int id = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(id);
        int idCan = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(idCan);
        compositor.eliminarCliente(cantante);
        compositorDAO.update(compositor);

    }

    public void buscarPorTituloDeCancion() {
        String valor = vistaCompositor.buscarCancion();
        compositor = compositorDAO.buscarPorTituloDeCancion(valor);
        vistaCompositor.verNombreyApellido(compositor);
    }
}
