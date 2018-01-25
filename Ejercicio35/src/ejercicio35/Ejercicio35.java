package ejercicio35;

public class Ejercicio35 {

    private static String s1 = "HOLA";
    private static String s2 = "HOLA";

    public static void main(String[] args) {
        comparar();
    }
    public static void comparar(){
        System.out.println("s1 == s2 = "+ (s1==s2));
        System.out.println("Verdadera, porque referencian lo mismo.");
        System.out.println("s1.equal(s2) = "+ s1.equals(s2));
        System.out.println("Verdadera, porque representan el mismo objeto de clase String");
        
        String s3 = new String("HOLA");
        String s4 = new String("HOLA");
        System.out.println("s3 == s4 = "+ (s3==s4));
        System.out.println("False por que son objetos que aunque tengan lo mismo, representan referencias a objetos string distintos.");
        System.out.println("s3.equals(s4) "+ s3.equals(s4));

    }
}
