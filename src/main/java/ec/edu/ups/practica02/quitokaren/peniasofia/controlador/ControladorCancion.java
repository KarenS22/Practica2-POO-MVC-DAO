/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.controlador;

import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Cancion;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaCancion;

/**
 *
 * @author ACER
 */
public class ControladorCancion {
    private VistaCancion vistaCancion;
    
    private Cancion cancion;

    public ControladorCancion(VistaCancion vistaCancion, Cancion cancion) {
        this.vistaCancion = vistaCancion;
        this.cancion = cancion;
    }
    
        public void registrarCancion(){
        cancion = vistaCancion.ingresarCancion();   
    }
    
    public void verCancion(){
        int codigo = vistaCancion.buscarCancion();
        vistaCancion.verCancion(cancion);
    }
    
    public void actualizarCancion(){
        cancion = vistaCancion.actualizarCancion();
    }
    
    public void eliminarCancion(){
        cancion = vistaCancion.eliminarCancion();
        
    }
    
}
