package ejercicio37;

public class Ejercicio37 {

    public static void main(String[] args) {
        cadenaAlReves("Rafael");
    }
    
    public static void cadenaAlReves(String a){
        String aux = "";
        for (int i=a.length(); i>0; i--){
            aux+=Character.toString(a.charAt(i-1));
        }
        System.out.println(aux);
    }
}
