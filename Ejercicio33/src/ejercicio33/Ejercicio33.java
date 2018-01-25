package ejercicio33;

import java.util.Scanner;

public class Ejercicio33 {

    private static Tablero tablero;
    private static int x,y;
    
    public static void main(String[] args) {
      tablero = new Tablero();
      jugar();
    }

    public static void jugar(){
        Scanner sc = new Scanner(System.in);
        boolean aux = true;
        do{
            do{
                boolean aj = true;
        System.out.print("Introduzca la posicion x: ");
        x = sc.nextInt();
        System.out.print("Introduzca la posicion y: ");
        y = sc.nextInt();
            if(!((x>0 && x<5)&&(y>0 && y<6))){
                System.out.println("Coordenadas no permitidas.");
            }
            }while(!((x>0 && x<5)&&(y>0 && y<6)));
        }while(finalizarJuego());
    }
    
    public static boolean finalizarJuego(){
            boolean aux = true;
            
            if(tablero.getPosicion(x-1, y-1).equals("!")){
                System.out.println("Has encontrado el tesoro!");
                aux = false;
            }
            if(tablero.getPosicion(x-1, y-1).equals("*")){
                System.out.println("Has muerto por una mina!");
                aux = false;
            }
            if(tablero.getPosicion(x-1, y-1).equals(" ")){
                System.out.println("Aqui no hay nada!");
            }
            return aux;
        }
    public static void hayMinasCerca(){
        
    }
}
