
package ec.edu.ups.practica02.quitokaren.peniasofia.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cantante extends Persona{
     //atributos de la clase Cantante
    private String nombreArtistico;
    private String generoMusical;
    private int numeroDeSencillos;
    private int numeroDeConciertos;
    private int numeroDeGiras;
    private List<Disco> discografia;
    
   // constructores
    public Cantante(int codigo, String nombre, String apellido) {
        super(codigo, nombre, apellido);
    }
    
    public Cantante(String nombreArtistico, String generoMusical, int numeroDeSencillos, int
            numeroDeConciertos, int numeroDeGiras, int codigo, String nombre, String apellido, int
                    edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeSencillos = numeroDeSencillos;
        this.numeroDeConciertos = numeroDeConciertos;
        this.numeroDeGiras = numeroDeGiras;
        this.discografia = new ArrayList();
    }
    
    /*sobreescritura del metodo abstracto calcularSalario que si se cumplen las condiciones
    este aumentara */
    @Override
    public double calcularSalario() {
        double salariob = super.getSalario();
        double salariof = salariob;
        double aumento = 0;
        if (numeroDeSencillos > 10 && numeroDeGiras > 3){
            salariof +=1000;
        } else if(numeroDeSencillos >=1 && numeroDeSencillos<=10){
            aumento +=(salariob* 0.05);
        } else if(numeroDeGiras>= 1 && numeroDeGiras <=3){
            aumento+= (salariob* 0.03);
        } else if (discografia.size()>=5 ){
            salariof+=2000;
        }
        super.setSalario(salariof + aumento);
            
        return super.getSalario();
    }
    
    /* metod agregarDisco se ingresa objeto tipo disco 
    que  sera añadido a la lista discografia */
    public void agregarDisco(Disco disco){
        discografia.add(disco);
    }
    
    
    //metod que actualiza datos de del disco
    public void actualizarDisco(Disco disco){
        if (discografia.contains(disco) ){
            int index = discografia.indexOf(disco);
            discografia.set(index, disco);
        }
    }
    //metod elimina disco
    public void eliminarDisco (Disco disco){
        if (discografia.contains(disco)){
            int index = discografia.indexOf(disco);
            discografia.remove(index);
        }
    }
    //metodo lista Disco
    public List<Disco> listaDisco(){
        return discografia;
    }
    
    public Disco buscarDisco(int id){
        return discografia.get(id);
    }
//getters and setters
    public String getNombreArtistico() {
        return nombreArtistico;
    }
    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }
    public String getGeneroMusical() {
        return generoMusical;
    }
    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }
    public int getNumeroDeSencillos() {
        return numeroDeSencillos;
    }
    public void setNumeroDeSencillos(int numeroDeSencillos) {
        this.numeroDeSencillos = numeroDeSencillos;
    }
    public int getNumeroDeConciertos() {
        return numeroDeConciertos;
    }
    public void setNumeroDeConciertos(int numeroDeConciertos) {
        this.numeroDeConciertos = numeroDeConciertos;
    }
    public int getNumeroDeGiras() {
        return numeroDeGiras;
    }
    public void setNumeroDeGiras(int numeroDeGiras) {
        this.numeroDeGiras = numeroDeGiras;
    }

//sobreescritura del metodo toString
    @Override
    public String toString() {
        return "Cantante{" + super.toString() + "nombreArtistico=" + nombreArtistico + ", "
                + "generoMusical=" + generoMusical + ", numeroDeSencillos=" + numeroDeSencillos + ", "
                + "numeroDeConciertos=" + numeroDeConciertos + ", numeroDeGiras=" + numeroDeGiras + ","
                + " discografia=" + discografia + '}';
    }
    
}
