package ejercicioarraylist12;

import java.util.ArrayList;
import java.util.Iterator;

public class Libreria {
    
    private String nomLibr;
    private ArrayList<Libro> libreria;

    public Libreria(String nombre){
        setNomLib(nombre);
        inicializarLib();
    }
    private void setNomLib(String nombre){
        this.nomLibr=nombre;
    }
    private void inicializarLib(){
        this.libreria = new ArrayList<Libro>();
    }
    public String getNombre(){
        return nomLibr;
    }
    public int getCantidad(){
        return libreria.size();
    }
    public void anadirLibro(Libro a){
        libreria.add(a);
    }
    public Libro buscarLibroTitulo(String titu){
    
        Iterator<Libro> it = libreria.iterator(); 
        boolean a=false;
        Libro aux = null;
        while(it.hasNext()){
            aux = it.next();
            if(titu.equals(aux.getTitulo())){
                a = true;
                break;
            }else{
                
            }
        }
        
        if(a){
            return aux;
        }else{
            return null;
        }
    }
    public boolean librosAutor(String autor){
        Iterator<Libro> it = libreria.iterator();
        boolean aux = false;
        Libro lAux = null;
        
        while(it.hasNext()){
            lAux = it.next();
            if(lAux.getTitulo().equals(autor)){
                aux = true;
                break;
            }
        }
        return aux;
    }
    public void borrarLibros(String autor){
        Iterator<Libro> it = libreria.iterator();
        Libro aux = null;
        boolean a = false;
        
        while(it.hasNext()){
            aux = it.next();
            if(aux.getAutor().equals(autor)){
                if(aux.estaPrestado()){
                    System.err.println("Imposible borrar el libro ya que esta prestado.");
                }else{
                    it.remove();
                }
            }
            
        }
    }
    
    public void mostrarLibr(){
        for (int i = 0; i < libreria.size() ; i++) {
            System.out.println(libreria.get(i));            
        }
    }
}