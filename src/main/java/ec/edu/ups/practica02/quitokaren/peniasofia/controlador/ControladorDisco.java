/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.controlador;

import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Disco;
import ec.edu.ups.practica02.quitokaren.peniasofia.vista.VistaDisco;

/**
 *
 * @author ACER
 */
public class ControladorDisco {
    private VistaDisco vistadisco;
    
    private Disco disco;

    public ControladorDisco(VistaDisco vistadisco, Disco disco) {
        this.vistadisco = vistadisco;
        this.disco = disco;
    }
    
    
    public void registrarDisco(){
        disco = vistadisco.ingresarDisco();   
    }
    
    public void verDisco(){
        int codigo = vistadisco.buscarDisco();
        vistadisco.verDisco(disco);
    }
    
    public void actualizarDisco(){
        disco = vistadisco.actualizarDisco();
    }
    
    public void eliminar(){
        disco = vistadisco.eliminarDisco();
        
    }
    
}
