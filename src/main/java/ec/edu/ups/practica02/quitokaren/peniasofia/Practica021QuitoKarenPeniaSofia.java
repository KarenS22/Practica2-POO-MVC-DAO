/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practica02.quitokaren.peniasofia;

import ec.edu.ups.practica02.quitokaren.peniasofia.controlador.ControladorCompositor;
import ec.edu.ups.practica02.quitokaren.peniasofia.dao.CompositorDAO;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaCompositor;

/**
 *
 * @author ACER
 */
public class Practica021QuitoKarenPeniaSofia {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        VistaCompositor vistacompositor = new VistaCompositor();
        
        CompositorDAO compositorDAO = new CompositorDAO();
        
        ControladorCompositor controladorCompositor = new ControladorCompositor(vistacompositor, compositorDAO);
        
        controladorCompositor.registrar();
        
        controladorCompositor.verCompositor();
        
    }
}
