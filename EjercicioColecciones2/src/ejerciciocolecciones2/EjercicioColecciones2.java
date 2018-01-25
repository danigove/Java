package ejerciciocolecciones2;

public class EjercicioColecciones2 {

    public static void main(String[] args) {
        System.out.println(esCapicua(100));
    }
    
    public static boolean esCapicua(int valor){
        String aux = Integer.toString(valor);
        String a = "";
        for (int i = aux.length(); i > 0 ; i--) {
            a+=Character.toString(aux.charAt(i-1));
        }
        return a.equals(aux);
    } 
    
}
