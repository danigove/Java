package clase18mayo;

public class Clase18Mayo {
   
    public static void main(String[] args) {
        
        try{
            throwException();
        }catch(Exception e){
            System.err.println("Cogiendo exception.");
        }finally{
            
        }

    }

    private static void throwException() throws Exception{
        throw new Exception("Hola a todos...");
    }
    
}
