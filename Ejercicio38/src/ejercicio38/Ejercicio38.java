package ejercicio38;

public class Ejercicio38 {

    public static void main(String[] args) {
        cuantasVocales("Francisco PACHECO");
    }
    
    public static void cuantasVocales(String a){
        int contador=0;
        for (int i = 0; i < a.length(); i++) {
            if(Character.toLowerCase(a.charAt(i))=='a' || Character.toLowerCase(a.charAt(i))=='e' || Character.toLowerCase(a.charAt(i))=='i' || Character.toLowerCase(a.charAt(i))=='o' || Character.toLowerCase(a.charAt(i))=='u'){
                contador++;
            }
        }
        System.out.println("Hay "+contador+" vocales");
    }
    
}
