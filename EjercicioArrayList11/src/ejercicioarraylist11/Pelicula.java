package ejercicioarraylist11;

import java.util.Scanner;

public class Pelicula {
    
    private String titulo;
    private String director;
    private int anoEstreno;
    
    public Pelicula(){
        pedirPelicula();
    }
    
    private void pedirPelicula(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduzca titulo de la pelicula: ");
        String tit = sc.next();
        System.out.print("Introduzca director de la pelicula: ");
        String dir = sc.next();
        System.out.print("Introduzca anio de estreno de la pelicula: ");
        int anio = sc.nextInt();
        
        this.titulo = tit;
        this.director = dir;
        this.anoEstreno = anio;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public String getDirector(){
        return director;
    }
    public int getAnioEstreno(){
        return anoEstreno;
    }
    public String toString(){
        return getTitulo() + " dirigida por " + getDirector() + " y estrenada en el anio " + getClass().getCanonicalName();
    }
}
