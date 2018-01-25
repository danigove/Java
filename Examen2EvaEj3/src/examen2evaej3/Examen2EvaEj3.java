package examen2evaej3;

public class Examen2EvaEj3 {

    private static StringBuilder a = new StringBuilder("HELLO WORLD");
    private static StringBuilder b = new StringBuilder("HELLO LAZY LIMBO WORLD");
    private static String str = new String("HELLO WORLD");
    private static String str2 = new String("HELLO LAZY LIMBO WORLD");
    
    private static String x = "";
    
    public static void main(String[] args) {
        
        cambiarStringBuilder(a);
        a.reverse();
        System.out.println(a);
                
        cambiarStringBuilder(b);
        b.reverse();
        System.out.println(b);
        
        cambiarString(str);
        cambiarString(str2);

    }
    
    public static void cambiarStringBuilder(StringBuilder a){

        for (int i = 0; i < a.length(); i++) {
           if(a.charAt(i)=='L'){
               a.replace(i, i+1, aumentarX());
           }
        }
        x="";
        System.out.println(a);
    }
    public static void cambiarString(String a){
        String aux = "";
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='L'){
                aux+=aumentarX();
            }else{
                aux+=a.charAt(i);
            }
        }
        x="";
        System.out.println(aux);
    }
    
    public static String aumentarX(){
        x = x+"X";
        return x;
    }
    
}
