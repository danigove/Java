package eduardopolimorfismo;

import java.util.ArrayList;
import java.util.Collections;

public class EduardoPolimorfismo {

    public static void main(String[] args) {

        ArrayList<Articulo> articulos = new ArrayList<>();
        CD cd1 = new CD("Cuando Zarpa el Amor", 120,"Camela", 15);
        CD cd2 = new CD("Con cuernos y a lo loco", 112,"Mojinos escozios", 18);
        DVD dvd1 = new DVD("Señor de los anillos", 180, "Obama", 24);
        DVD dvd2 = new DVD("Widow", 140, "Obama Jr", 25);
        
        articulos.add(cd1);
        articulos.add(cd2);
        articulos.add(dvd1);
        articulos.add(dvd2);
        EduardoPolimorfismo.mostrar(articulos);
        Collections.shuffle(articulos);
        System.out.println("------------------");
        EduardoPolimorfismo.mostrar(articulos);
        System.out.println("----------        -------------");
        Collections.sort(articulos, new CompDuracion());
        mostrar(articulos);
        //
        //Collections.sort(articulos);
    }
    
    public static void mostrar(ArrayList<Articulo> elem){
        for (int i = 0; i < elem.size() ; i++) {
            System.out.println(elem.get(i));
        }
    }
    
}
