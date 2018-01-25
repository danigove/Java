package ejercicioarraylist12;

import java.util.ArrayList;

public class EjercicioArrayList12 {
            
    public static void main(String[] args) {

        Libro a = new Libro("titulo", "autor", 100);
        Libro b = new Libro("titulo2", "autor", 100);
        Libro c = new Libro("titulo1", "autor1", 100);
        
        Libreria lib = new Libreria("Paco");
        
        lib.anadirLibro(a);
        lib.anadirLibro(b);
        lib.anadirLibro(c);
        
        lib.mostrarLibr();
        lib.borrarLibros("autor");
        lib.mostrarLibr();
        
    }
    
   
    
    
}
