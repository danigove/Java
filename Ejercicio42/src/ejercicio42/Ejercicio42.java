package ejercicio42;

import java.util.Scanner;

public class Ejercicio42 {

   
    public static void main(String[] args) {
        mostrarIntroducido();
    }
    
    public static void mostrarIntroducido(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca palabra: ");
        String aux = sc.next();
        if(aux.length()<5){
            System.out.print("Lo introducido tiene menos de 5 caracteres ");
        }else if(aux.length()>15){
            System.out.print("Lo introducido tiene mas de 15 caracteres ");
        }else{
            System.out.print("Lo introducido tiene entre 5 y 15 caracteres ");
        }
        if(aux.substring(0, 1).equals("a") ||aux.substring(0, 1).equals("A")){
            System.out.print("y empieza por la letra a. \n");
        }else{
            System.out.print("y no empieza por la letra a. \n");
        }
    }
}
