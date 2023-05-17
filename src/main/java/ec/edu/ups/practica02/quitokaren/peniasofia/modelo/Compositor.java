/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ACER
 */
public class Compositor extends Persona {
     //atributos
    private int numeroDeComposiciones;
    private List<Cancion> cancionesTop100Billboard;
    private List<Cantante> clientes;

    //constructor

    public Compositor(int codigo, String nombre, String apellido) {
        super(codigo, nombre, apellido);
    }
    
    
    public Compositor(int numeroDeComposiciones, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
        this.cancionesTop100Billboard =new ArrayList();
        this.clientes = new ArrayList();
    }

    //sobreescritura metodo calcularSalario, dependiendo las condiciones el salario aumenta
    @Override
    public double calcularSalario() {
        double salariob = super.getSalario();
        double salariofinal = salariob;
        double aumento = 0;
        if (numeroDeComposiciones >= 5){
            salariofinal += 300;
        } else if (cancionesTop100Billboard.size()>=1 && cancionesTop100Billboard.size()<=3){
            aumento += (salariob * 0.1);
        } else if(cancionesTop100Billboard.size()>=4 && cancionesTop100Billboard.size()<=6){
            aumento += (salariob * 0.2);
        } else if (cancionesTop100Billboard.size()> 6){
            aumento += (salariob * 0.2);
        }
        super.setSalario(salariofinal + aumento);
        return super.getSalario();
    }
    
    /*
    metodo agregarCancion donde se tiene que poner 4 parametros de entrada que crearan 
    un objeto cancion que luego sera agregado a la lista cancionesTop100Billboard
    */
    public void agregarCancion(int codigo, String titulo, String letra, double tiempoEnMinutos){
        Cancion cancion = new Cancion(codigo, titulo, letra, tiempoEnMinutos);
        cancionesTop100Billboard.add(cancion);
    }
    
    public void actualizarCancion(Cancion cancion){
        if (cancionesTop100Billboard.contains(cancion)){
            int index = cancionesTop100Billboard.indexOf(cancion);
            cancionesTop100Billboard.set(index, cancion);
        }
    }
    
    public void eliminarCancion(Cancion cancion){
        if (cancionesTop100Billboard.contains(cancion)){
            int index = cancionesTop100Billboard.indexOf(cancion);
            cancionesTop100Billboard.remove(index);
        }
    }
    
    public List<Cancion> listarCanciones(){
        return cancionesTop100Billboard;
    }
    /*
    metodo agregarCliente se pone un objeto tipo Cantante que luego sera 
    agregado a la lista clientes
    */
    public void agregarCliente(Cantante cliente){
        clientes.add(cliente);
    }
    
    public void actualizarCliente(Cantante cantante){
        if (clientes.contains(cantante)){
            int index = clientes.indexOf(cantante);
            clientes.set(index, cantante);
        }
    }
    
    public void eliminarCliente(Cantante cantante){
        if (clientes.contains(cantante)){
            int index = clientes.indexOf(cantante);
            clientes.remove(index);
        }
    }
    
    public List<Cantante> listarClientes(){
        return clientes;
    }
    
       //getters and setters
    public int getNumeroDeComposiciones() {
        return numeroDeComposiciones;
    }

    public void setNumeroDeComposiciones(int numeroDeComposiciones) {
        this.numeroDeComposiciones = numeroDeComposiciones;
    }

    //sobreescritura toString
    @Override
    public String toString() {
        return "Compositor{" + super.toString() + "numeroDeComposiciones=" + numeroDeComposiciones + ", cancionesTop100Billboard=" + cancionesTop100Billboard + ", clientes=" + clientes + '}';
    } 
}
