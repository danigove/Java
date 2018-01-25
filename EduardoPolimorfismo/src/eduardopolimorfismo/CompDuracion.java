
package eduardopolimorfismo;

import java.util.Comparator;

public class CompDuracion implements Comparator<Articulo>{

    public int compare(Articulo art1,Articulo art2) {
        return art1.getDuracion() - art2.getDuracion();
    }


    
}
