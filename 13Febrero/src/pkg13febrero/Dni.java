package pkg13febrero;

public class Dni {
    private static final String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
    
    private Dni(){
        
    }
    public static char obtenerLetra(int numDni){
        return letrasDni.charAt(numDni%23);
    }
}
