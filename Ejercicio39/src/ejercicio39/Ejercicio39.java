package ejercicio39;

public class Ejercicio39 {

    public static void main(String[] args) {
        cuantasMayus("FAStaSrTT hytrYY");
    }
    public static void cuantasMayus(String a){
        int contador=0;
        for (int i = 0; i < a.length(); i++) {
            if(Character.isUpperCase(a.charAt(i))){
                contador++;
            }
        }
        System.out.println("Hay " + contador + " mayusculas.");
    }
}
