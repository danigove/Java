package ejercicio40;

public class Ejercicio40 {

    private static String paises="EspañaSomaliaAndorraGibraltarBrexitItalia";
    
    public static void main(String[] args) {
           ejercicio40();
    }
    
    public static void ejercicio40(){
        int a=(int)(Math.random()*10+1);
        int b=a + (int)(Math.random()*10+1);
        int c=(int)(Math.random()*10+1);
        int d=c + (int)(Math.random()*10+1);
        
        String aux1 = paises.substring(a, b);
        String aux2 = paises.substring(c, d);
        System.out.println(aux1 + " compareTo " + aux2);
        System.out.println(aux1.compareTo(aux2));
                
    }
}
