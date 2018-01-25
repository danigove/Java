package pkg13febrero;
import java.util.Scanner;

public class TemperaturaMedia {
    
    private static final String[] meses = {"Enero", "Febrero", "Marzo", "Abril" , "Mayo" , "Junio",
                              "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private static int[] temperaturas = {12,23,11,20,23,30,32,44,42,53,22,10};
    
    private TemperaturaMedia(){
        
    }
    
    public static void pedirTemps(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < meses.length; i++) {
        System.out.print("Introduzca la temperatura media que hizo en el mes de: " + meses[i]);
        temperaturas[i] = sc.nextInt();
        
        }
    }
    
    public static void representarTemps(){
        for (int i = 0; i < meses.length; i++) {
            System.out.println("Mes de " + meses[i]);
            for (int j = 0; j < temperaturas[i]; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
            
        }
    }
    
            
}
