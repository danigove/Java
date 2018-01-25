package ejercocopcolecciones1;

public class EjercocopColecciones1 {

    public static void main(String[] args) {
        comparaWrappers();
    }
    
    public static void comparaWrappers(){
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        boolean aux1 = a==b;
        boolean aux2 = a.equals(b);
        
        
        System.out.println("a==b: " + aux1 );
        System.out.println("a.equals(b): " + aux2 );
    }
    
}
