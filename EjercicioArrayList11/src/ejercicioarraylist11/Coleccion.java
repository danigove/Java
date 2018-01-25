
package ejercicioarraylist11;

import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    
    private static ArrayList<Pelicula> coleccion;
    
    public Coleccion(){
        coleccion = new ArrayList<Pelicula>();
    }
    
    public static void anadirPelicula(){
        coleccion.add(new Pelicula());
    }
    public static void buscarDirector(){
        Scanner sc = new Scanner(System.in);
        boolean a = false;
        ArrayList<Pelicula> aux = new ArrayList<Pelicula>();
        System.out.print("Introduzca nombre del director: ");
        String entry = sc.next();
                
        for (int i = 0; i < coleccion.size() ; i++) {
            if(coleccion.get(i).getDirector().equals(entry)){
                aux.add(coleccion.get(i));
                a = true;
            }
        }
        
        if(a){
            System.out.println("Peliculas del director: " + entry);
            for (int i = 0; i < aux.size(); i++) {
                System.out.println(aux.get(i));
            }
        }
    }
    public static void tituloMasLargo(){
        Pelicula aux = coleccion.get(0);
        for (int i = 1; i < coleccion.size(); i++) {
            if(coleccion.get(i).getTitulo().length() > aux.getTitulo().length()){
                aux = coleccion.get(i);
            }
        }
        System.out.println("La pelicula con el titulo mas largo es: " + aux.getTitulo());
    }
    public static void novedades(){
        for (int i = 0; i < coleccion.size(); i++) {
            if(coleccion.get(i).getAnioEstreno() == 2016){
                System.out.println(coleccion.get(i));
            }
        }
    }
}
