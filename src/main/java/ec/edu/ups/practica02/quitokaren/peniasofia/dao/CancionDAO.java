/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.dao;

import ec.edu.ups.practica02.quitokaren.peniasofia.idao.ICancionDAO;
import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Cancion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ACER
 */
public class CancionDAO implements ICancionDAO{
    private List<Cancion> listaCanciones;
    
    public CancionDAO(){
        listaCanciones = new ArrayList<>();
    }

    @Override
    public void create(Cancion cancion) {
        listaCanciones.add(cancion);
    }

    @Override
    public Cancion read(int codigo) {
        for (Cancion cancion : listaCanciones){
            if (cancion.getCodigo() == codigo){
                return cancion;
            }
        }
        return null;
    }

    @Override
    public void update(Cancion cancion) {
        for (int i = 0; i < listaCanciones.size() ; i++) {
            Cancion can = listaCanciones.get(i);
            if (can.getCodigo() == cancion.getCodigo()){
                listaCanciones.set(i, cancion);
            }
        }
    }

    @Override
    public void delete(Cancion cancion) {
        Iterator<Cancion> it = listaCanciones.iterator();
        while (it.hasNext()){
            Cancion ca = it.next();
            if (ca.getCodigo() == cancion.getCodigo()){
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Cancion> findALL() {
        return listaCanciones;
    }
    
}
