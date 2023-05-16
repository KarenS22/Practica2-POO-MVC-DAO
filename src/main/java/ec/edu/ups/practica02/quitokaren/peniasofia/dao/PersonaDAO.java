/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.quitokaren.peniasofia.dao;

import ec.edu.ups.practica02.quitokaren.peniasofia.idao.IPersonaDAO;
import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ACER
 */
public class PersonaDAO implements IPersonaDAO{
    private List<Persona> listaPersona;

    public PersonaDAO() {
        listaPersona = new ArrayList<>();
    }

    @Override
    public void create(Persona persona) {
        listaPersona.add(persona);
    }

    @Override
    public Persona read(int codigo) {
        for (Persona persona : listaPersona) {
            if (persona.getCodigo() == codigo){
                return persona;
            }
        }
        return null;
    }

    @Override
    public void update(Persona persona) {
        for (int i = 0; i < listaPersona.size(); i++) {
            Persona p = listaPersona.get(i);
            if (p.getCodigo() == persona.getCodigo()){
                listaPersona.set(i, persona);
            }
        }
    }

    @Override
    public void delete(Persona persona) {
        Iterator<Persona> it = listaPersona.iterator();
        while(it.hasNext()){
            Persona p = it.next();
            if(p.getCodigo() == persona.getCodigo()){
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Persona> findALL() {
        return listaPersona;
    }
    
    
    
    
}
