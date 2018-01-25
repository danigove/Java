package ejericico46;

public class Ejericico46 {
    
    private static StringBuilder a;
    
    public static void main(String[] args) {
        BuilderString();
        capacidadLongitud();
        hayCaracolas();
        hay5000Caracolas();
        enElMar();
        ultimos4();
        capacidadLongitud();
    }
    
    
    public static void BuilderString(){
        StringBuilder b = new StringBuilder("Hola caracola");
        System.out.println(b);
        a = b;
    }
    public static void capacidadLongitud(){
        System.out.println("La longitud es: " + a.length());
        System.out.println("La capacidad es: " + a.capacity());
    }
    
    public static void hayCaracolas(){
        a.delete(1, 4);
        a.insert(1, "ay");
        a.insert(a.length(), "s");
        System.out.println(a);
    }
    
    public static void hay5000Caracolas(){
        int i = 5000;
        a.insert(4, i);
        a.insert(8, " ");
        System.out.println(a);
    }
    
    public static void enElMar(){
        String aux = " en el mar";
        a.insert(a.length(), aux);
        System.out.println(a);
    }
    
    public static void ultimos4(){
        String aux = a.substring((a.length()-4),a.length());
        System.out.println(aux);
    }
    
}
