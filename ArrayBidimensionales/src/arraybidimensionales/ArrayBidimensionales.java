package arraybidimensionales;

import java.util.Scanner;

public class ArrayBidimensionales {

    private static int[][] numeros;
    
    public static void main(String[] args) {
        inicializarArrayBi29();
        mostrar();
        posicionMax();
        posicionMin();
    }
    
    //Ejercicio28
    public static void inicializarArrayBi(){
        int[][] aux = new int[5][5];
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                aux[i][j]=numeroPar();
            }
        }
        numeros=aux;
    }
    private static int numeroPar(){
        int a =(int)(Math.random()*50+1);
        if(a%2==0){
            return a;
        }else
            return numeroPar();
            }
    public static void mostrar(){
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if(j==numeros[i].length-1){
                System.out.print(numeros[i][j] + ".");
                }else{
                    System.out.print(numeros[i][j] + ", ");
                }
            }
            System.out.println("");
        }
    }
    public static void pedirPosicion(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca posicion X: "); 
        a=sc.nextInt();
        System.out.println("");
        System.out.print("Introduzca posicion Y: "); 
        b=sc.nextInt();
        System.out.println("");
        
        System.out.println(numeros[a-1][b-1]);
    }
    //Hasta aqui el ejercicio 28
    //Ejercicio 29
    public static void inicializarArrayBi29(){
        int[][] aux = new int[6][10];
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                aux[i][j]=(int)(Math.random()*1001);
            }
        }
        numeros=aux;
    }
    public static void posicionMax(){
        int aux=0,x=0,y=0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if(numeros[i][j]>aux){
                    aux=numeros[i][j];
                    x=i;
                    y=j;
                }
            }
        }
    System.out.println("La posicion en la que se encuentra el numero mayor es: " + (x+1) + ", " + (y+1));

    }
    public static void posicionMin(){
        int aux=1000000,x=0,y=0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if(numeros[i][j]<aux){
                    aux=numeros[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println("La posicion en la que se encuentra el numero mas pequeño es: " + (x+1) + ", " + (y+1));
    }
    //Hasta aqui el ejercicio 29
}
