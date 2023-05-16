/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.idao;

import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Cancion;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface ICancionDAO {
    public abstract void create(Cancion cancion);
    public abstract Cancion read(int codigo);
    public abstract void update(Cancion cancion);
    public abstract void delete(Cancion cancion);
    public List<Cancion> findALL();
}
