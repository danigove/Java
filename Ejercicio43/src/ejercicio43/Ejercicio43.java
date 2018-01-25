package ejercicio43;

public class Ejercicio43 {

    
    public static void main(String[] args) {
       String s  = "En fin, Serafín, corre mas el galgo que el mastín, si el camino es corto, porque si el camino es largo, mas corre el mastín que el galgo... no obstante, los dos corren bastante";
        longitud(s);
        apartadoB(s);
        numMayus(s);
        sinEspacios(s);
        vocalesAcento(s);
        sustituirDestin(s);
        sustituirtortuga(s);
    }
    
    public static void longitud(String s){
        System.out.println("Longitud: " + s.length());
    }
    public static void apartadoB(String s){
        String aux  = s.substring(8, 14);
        System.out.println(aux);
    }
    public static void numMayus(String s){
        int contador = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                ++contador;
            }
        }
        System.out.println("Hay " + contador + " Mayusculas en la frase.");
    }
    public static void sinEspacios(String s){
        String aux = s.replaceAll(" ", "");
        System.out.println(aux);
    }
    
    public static void vocalesAcento(String s){
        int contador=0;
            for (int i = 0; i < s.length(); i++) {
                if((Character.toLowerCase(s.charAt(i))=='á') || (Character.toLowerCase(s.charAt(i))=='é') || (Character.toLowerCase(s.charAt(i))=='í') || (Character.toLowerCase(s.charAt(i))=='ó') || (Character.toLowerCase(s.charAt(i))=='ú')){
                    contador++;
             }
           }
            System.out.println("Hay "+ contador + " vocales");
    }
    
    public static void sustituirDestin(String s){
        String aux = s.replace("camino", "destino");
        System.out.println(aux);
    }
    public static void sustituirtortuga(String s){
        String aux = s.replaceAll("el galgo", "la tortuga");
        aux = aux.replaceAll("el mastín", "el zorro");
        System.out.println(aux);
    }
            
    
}
