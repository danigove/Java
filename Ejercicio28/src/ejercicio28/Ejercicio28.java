package ejercicio28;

import java.util.Scanner;

public class Ejercicio28 {

    public static int[][] matriz;
    
    public static void main(String[] args) {
        rellenarMatrizPares();
        System.out.println(pedirPosicion());
    }
    
    public static void rellenarMatrizPares(){
        int[][] rafa = new int[5][5];
        int paco = 1;
        for (int i = 0; i < rafa.length; i++) {
            for (int j = 0; j < rafa[i].length; j++) {
                do{
                    paco=(int)(Math.random()*10+1);
                    rafa[i][j]=paco;
                }while(paco%2!=0);
            }
        }
        matriz = rafa;
        mostrarMatriz();
    }
    
    public static void mostrarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + ", ");
            }
            System.out.println("");
        }
    }
    public static int pedirPosicion(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca posicion x: ");
        int x = sc.nextInt();
        System.out.print("Introduzca posicion y: ");
        int y = sc.nextInt();
        
        return matriz[x-1][y-1];
    }
}
