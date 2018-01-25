package ejercicio47;

public class Ejercicio47 {

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("12837554123");
        separarMiles(a);
    }
    
    public static void separarMiles(StringBuilder a){
        boolean b = true;
        for (int i = 0; i < a.length(); i++) {
            if((Character.isDigit(a.charAt(i)))){
                b=true;
            }else{
                System.err.println("Hay un caracter que no es digito.");
                b = false;
                break;
            }
        }
        
        if(b){
            separacion(a);
        }else{
            System.out.println("No se ha podido realizar la operacion.");
        }
    }
    
    public static void separacion(StringBuilder a){
        int contador=0;
        int separador=0;
        for (int i = a.length(); i < 0; i--){
            contador++;
            separador++;
            if(contador==3){
                a.insert((a.length()-separador), ".");
                contador=0;
            }
        }
        System.out.println(a);
    }
}
