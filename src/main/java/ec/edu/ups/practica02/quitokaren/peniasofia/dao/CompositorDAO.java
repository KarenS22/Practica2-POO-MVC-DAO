/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.dao;

import ec.edu.ups.practica02.quitokaren.peniasofia.idao.ICompositorDAO;
import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Compositor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ACER
 */
public class CompositorDAO implements ICompositorDAO{
    private List<Compositor> listaCompositor;

    public CompositorDAO() {
        listaCompositor = new ArrayList<>();
    }

    @Override
    public void create(Compositor compositor) {
        listaCompositor.add(compositor);
    }

    @Override
    public Compositor read(int codigo) {
        for (Compositor compositor : listaCompositor) {
            if(compositor.getCodigo() == codigo){
                return compositor;
            }
        }
        return null;
    }

    @Override
    public void update(Compositor compositor) {
        for (int i = 0; i < listaCompositor.size(); i++) {
            Compositor com = listaCompositor.get(i);
            if (com.getCodigo() == compositor.getCodigo()){
                listaCompositor.set(i, compositor);
                break;
            }
        }
    }

    @Override
    public void delete(Compositor compositor) {
        Iterator<Compositor> it = listaCompositor.iterator();
        while(it.hasNext()){
            Compositor co = it.next();
            if(co.getCodigo() == compositor.getCodigo()){
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Compositor> findALL() {
        return listaCompositor;
    }
    
    
    
    
}
