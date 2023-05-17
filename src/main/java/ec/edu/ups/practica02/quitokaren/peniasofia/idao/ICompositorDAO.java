/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.idao;

import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Compositor;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface ICompositorDAO {
    public abstract void create(Compositor compositor);
    public abstract Compositor read(int codigo);
    public abstract void update(Compositor compositor);
    public abstract void delete(Compositor compositor);
    public List<Compositor> findALL();
    public abstract Compositor buscarPorTituloDeCancion(String valor);
}
