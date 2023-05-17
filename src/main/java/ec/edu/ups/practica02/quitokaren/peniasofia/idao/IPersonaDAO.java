/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.idao;

import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Persona;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface IPersonaDAO {
    public abstract void create(Persona persona);
    public abstract Persona read(int codigo);
    public abstract void update(Persona persona);
    public abstract void delete(Persona persona);
    public List<Persona> findALL();
    public abstract Persona buscarPorNombreDeDisco(String valor);
    public abstract Persona buscarPorTituloDeCancion(String valor);
}
