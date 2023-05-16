/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.dao;

import ec.edu.ups.practica02.quitokaren.peniasofia.idao.ICantanteDAO;
import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Cantante;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ACER
 */
public class CantanteDAO implements ICantanteDAO {
    private List<Cantante> listaCantante;
    
    public CantanteDAO (){
        listaCantante = new ArrayList<>();
    }

    @Override
    public void create(Cantante cantante) {
        listaCantante.add(cantante);
    }

    @Override
    public Cantante read(int codigo) {
        for (Cantante cantante : listaCantante) {
            if (cantante.getCodigo() == codigo){
                return cantante;
            }
        }
        return null;
    }

    @Override
    public void update(Cantante cantante) {
        for (int i = 0; i < listaCantante.size(); i++) {
            Cantante cantan = listaCantante.get(i);
            if (cantan.getCodigo() == cantante.getCodigo()){
                listaCantante.set(i, cantante);
                break;
            }
        }
    }

    @Override
    public void delete(Cantante cantante) {
        Iterator<Cantante> it = listaCantante.iterator();
        while(it.hasNext()){
            Cantante c = it.next();
            if(c.getCodigo() == cantante.getCodigo()){
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Cantante> findALL() {
        return listaCantante;
    }
    
    
    
}
