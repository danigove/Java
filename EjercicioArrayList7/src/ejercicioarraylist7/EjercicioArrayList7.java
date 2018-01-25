package ejercicioarraylist7;

import java.util.Scanner;
import java.util.ArrayList;

public class EjercicioArrayList7 {

    private static ArrayList<Integer> numeros  =  new ArrayList<>();

    public static void main(String[] args) {
        
        insertarNumeros();
    }

    public static void insertarNumeros() {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.print("Inserte numero " + (numeros.size()+1) + " : ");
            a = sc.nextInt();
            if (a == 0) {
                System.out.println("Numero establecido para fin del programa. Mostrando resultados...");
                mostrarArray();
                sumaTotalArray();
                mediaArray();
            } else {
                numeros.add(a);
            }
        } while (a != 0);
    }
    public static void mediaArray(){
        int total = 0;
        for (int i = 0; i < numeros.size(); i++) {
           total+=numeros.get(i);
        }
        if(numeros.size()==0){
            System.out.println("No se puede realizar la media si el tamaño del ArrayList es 0.");
        }else{
        System.out.println("Media: " + total/(numeros.size()));
        }
    }
    public static void mostrarArray(){
        for (int i = 0; i < numeros.size(); i++) {
           if(i==numeros.size()-1){
               System.out.println(numeros.get(i) + ".");
           }else{
               System.out.print(numeros.get(i) + ",");
           }
        }
    }
    public static void sumaTotalArray(){
        int total = 0;
        for (int i = 0; i < numeros.size(); i++) {
            total+=numeros.get(i);
        }
        System.out.println("El sumatorio del arraylist es: " + total);
    }
}
