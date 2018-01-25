package pkg13febrero;
import java.util.Scanner;

public class Array20 {
    
    private Array20(){
        
    }
    
    public static void inicializarBuscar(){
        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*50+1);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
            
        }
        System.out.print("\n");
        Scanner sc = new Scanner(System.in);
        int a,b=0;
        do{
        System.out.print("Introduzca el numero que quiere encontrar: ");
        a = sc.nextInt();
        if(a<1 || a>51){
            System.out.println("Error: El numero tiene que estar entre 1 y 50");
        }else{
            for (int i = 0; i < numeros.length; i++) {
               if(numeros[i]==a){
                   b++;
               }
                
            }
            System.out.println("El numero " + a + " ha sido introducido " + b + " veces.");
        }
        }while(!(a<=51 && a>=1));
        
    }
        
}
