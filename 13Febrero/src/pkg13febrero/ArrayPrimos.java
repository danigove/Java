package pkg13febrero;
import java.util.Scanner;

public class ArrayPrimos {
    
    private ArrayPrimos(){
        
    }
    
    public static void pedirPrimos(){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Intoduzca el numero " + (i+1) + ": "); 
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + i + "] " + numeros[i] + ", "); 
        }
        System.out.print("\n");

        int aux;
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(esPrimo(numeros[i])){
                aux = numeros[contador];
                numeros[contador] = numeros[i];
                numeros[i]=aux;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + i + "] " + numeros[i] + ", " ); 

        }
        //return numeros;
    }
    
    public static boolean esPrimo(int a){
        boolean bo = true;
        for (int i = 2; i < a; i++) {
            if(a%i==0){
                bo=false;
                break;
            }
        }
            return bo;
    }
}
