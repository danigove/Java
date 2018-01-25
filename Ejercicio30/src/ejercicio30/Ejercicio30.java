package ejercicio30;

import java.util.Scanner;

public class Ejercicio30 {

    private static int fila=3;
    private static int columna=3;
    private static int[][] matriz;
            
    public static void main(String[] args) {
        inicializar();
        traspuesta();
    }
    
      public static void inicializar() {
        int[][] aux = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int fila = 0;
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                System.out.print("Introduzca el numero (" + (++contador) + "): ");
                aux[i][j] = sc.nextInt();
            }
        }
        matriz=aux;
        mostrar();
      }
      public static void mostrar(){
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
      public static void traspuesta(){
          int aux=0;
          for (int i = 0; i < matriz.length; i++) {
              for (int j = 0; j < matriz[i].length ; j++) {
                  if(j==matriz[i].length-1){
                  System.out.print(matriz[j][i]+".");
                  }else{
                      System.out.print(matriz[j][i]+", ");
                  }
              }
              System.out.println("");
          }
        

      }
}
