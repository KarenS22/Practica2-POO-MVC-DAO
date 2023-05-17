
package ec.edu.ups.practica02.quitokaren.peniasofia.idao;

import ec.edu.ups.practica02.quitokaren.peniasofia.modelo.Compositor;
import java.util.List;


public interface ICompositorDAO {
    //metodos abstractos que seran modificafos 
    public abstract void create(Compositor compositor);
    public abstract Compositor read(int codigo);
    public abstract void update(Compositor compositor);
    public abstract void delete(Compositor compositor);
    public List<Compositor> findALL();
    public abstract Compositor buscarPorTituloDeCancion(String valor);
}
