package ejerciciowrappers4;

import java.util.Scanner;

public class EjercicioWrappers4 {

    public static void main(String[] args) {
        //binarioSinWrapper(60);
        conversionCompleta();
    }
    
    public static void tranformarEntero(int valor){
        if(!(valor < 0)){
            System.err.println("El numero introducido tiene que ser mayor o igual que 0");
        }else{
            binarioConWrapper(valor);
            binarioSinWrapper(valor);
        }
    }
    
    public static void binarioConWrapper(int valor){
        System.out.println("(Con wrapper) El numero introducido a binario es: " + Integer.toBinaryString(valor));
    }
    public static void binarioSinWrapper(int valor){
        int contador=1;
        int aux;
        for (int i = 0; i < valor; i++) {
            if(Math.pow(2,contador)>=valor){
                break;
            }else{
                contador++;
            }
        }
        int[] restos = new int[contador];
        int dividendo = valor;
        int resto = 0;
        int cociente = valor;
        for (int i = 0; i < restos.length; i++) {
            if(i==0){
            cociente = dividendo/2;
            restos[restos.length-1]=dividendo%2;
            }else if(i==restos.length-1){
                restos[restos.length-1-i]=1;
                cociente = cociente/2;
            }else{
                restos[restos.length-i-1]=cociente%2;
                cociente = cociente/2;
            }
        }
        System.out.println("(BinariString) "  + Integer.toBinaryString(valor));
        System.out.println("Para el valor " + valor + " el numero binario es: " + mostrarBin(restos));
    }
    private static String mostrarBin(int[] valores){
        String aux = "";
        for (int i = 0; i < valores.length; i++) {
            aux+=Integer.toString(valores[i]);
        }
        return aux;
    }
    private static void conversionCompleta(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero binario a convertir: ");
        String aux = sc.next();
        int lol = Integer.valueOf(aux, 2);
        int contador = 0;

        System.out.println("El numero en decimal es " + lol);
        System.out.println("El numero en hexadecimal es " + Integer.toHexString(lol));
        System.out.println("El numero en octadecimal es " + Integer.toOctalString(lol));
    }
}
