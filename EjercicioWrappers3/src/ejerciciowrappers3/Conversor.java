package ejerciciowrappers3;

public class Conversor {
    
    private int valor;
    private String salida;
    
    public Conversor(int valor){
        this.valor = valor;
    }
    
    public void getNumero(char aux){
        switch(aux){
            case 'B': salida = Integer.toBinaryString(valor);
                      System.out.println(salida);
                      break;
            case 'H': salida = Integer.toHexString(valor);
                      System.out.println(salida);
                      break;
            case 'O': salida = Integer.toOctalString(valor);
                      System.out.println(salida);
                      break;
            default: System.err.println("Opcion no permitida.");
                      break;
        }
    }
}
