/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.idao;

import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Cantante;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface ICantanteDAO {
    public abstract void create(Cantante cantante);
    public abstract Cantante read(int codigo);
    public abstract void update(Cantante cantante);
    public abstract void delete(Cantante cantante);
    public List<Cantante> findALL();
}
