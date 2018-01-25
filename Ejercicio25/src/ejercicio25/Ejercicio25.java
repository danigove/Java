package ejercicio25;

import java.util.Scanner;

public class Ejercicio25 {

    private static int[][] matriz = new int[5][8];
    
    public static void main(String[] args) {
        generarMatriz();
    }
    
    public static void generarMatriz(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduzca un entero para la posicion "+"["+(i+1)+"]"+"["+(j+1)+"] : ");
                matriz[i][j]=sc.nextInt();
            }
        }
        mostrar();
    }
    private static void mostrar(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(j==matriz[i].length-1){
                    System.out.print(matriz[i][j]+".");
                }else{
                    System.out.print(matriz[i][j]+", ");
                }
            }
            System.out.println("");
        }
    }
}
