/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.idao;

import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Disco;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface IDiscoDAO {
    public abstract void create(Disco disco);
    public abstract Disco read(int codigo);
    public abstract void update(Disco disco);
    public abstract void delete(Disco disco);
    public List<Disco> findALL();
}
