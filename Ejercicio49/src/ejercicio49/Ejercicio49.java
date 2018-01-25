package ejercicio49;

import java.util.StringTokenizer;

public class Ejercicio49 {

    public static void main(String[] args) {
        StringTokenizer a = new StringTokenizer("En fin, Serafín, corre más el galgo que el mastín, "
                + "si el camino es corto, porque si el camino es largo, más corre el mastín que el galgo... no obstante, los dos corren bastante.");
        /*do{
            System.out.println(a.nextToken(" "));
        }while(a.hasMoreTokens());
        */
        do{
            System.out.println(a.nextToken(","));
        }while(a.hasMoreTokens());
                
        /*do{
            System.out.println(a.nextToken("a"));
        }while(a.hasMoreTokens());
        */
    }

}
