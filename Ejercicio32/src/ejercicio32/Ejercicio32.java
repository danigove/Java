package ejercicio32;
import java.util.Scanner;

public class Ejercicio32 {

    private static Jugador[] jugadores = new Jugador[2];
    private static int turno=0;
    private static Tablero tablero;
   
    public static void main(String[] args) {
        inicializarJugadores();
        inicializarTablero();
        jugar();

    }
    public static void inicializarJugadores(){
        jugadores[0]=new Jugador("Daniel","X");
        jugadores[1]=new Jugador("Loring","O");
    }
    public static void inicializarTablero(){
        tablero = new Tablero();
    }
    public static void cambiarTurno(){
        turno = ++turno%2;
    }
    public static void turnoActual(){
        System.out.println("Es el turno del jugador " + (turno+1) + "(" + jugadores[turno] + ")");
    }
    public static void jugar(){
        do{
            
            turnoActual();
            pedirPosicion();
            tablero.representarTablero();
                cambiarTurno();
            
        }while(!comprobarVictoria());
    }
    public static void pedirPosicion(){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        do{
        System.out.print("Introduzca la posicion x que desea: ");
            x = sc.nextInt();
        System.out.print("Introduzca la posicion y que desea: ");
            y = sc.nextInt();
            if(comprobarPosicion(x,y)){
                if(tablero.getContCasilla(x, y)){
                tablero.cambiarContCasilla(x, y, jugadores[turno].getJuega());
                }
            }else{
                    System.out.println("Posicion x o y mal insertadas");
                    pedirPosicion();
                }
       
        }while(comprobarPosicion(x, y));
    }
    public static boolean comprobarPosicion(int x, int y){
        return ((x<4 && x>0) && (y<4 && y > 0) && (tablero.getContCasilla(x, y)));
        
    }
    public static boolean comprobarVictoria(){
        boolean aux = false;
        if(tablero.getStringCasilla(0,0).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(0,1).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(0,2).equals(jugadores[turno].getJuega())){
            System.out.println("Ha ganado " + jugadores[turno].getNombre());
            aux = true;
        } 
        if(tablero.getStringCasilla(1,0).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(1,1).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(1,2).equals(jugadores[turno].getJuega())){
            System.out.println("Ha ganado " + jugadores[turno].getNombre());
            aux = true;
        } 
       
        if(tablero.getStringCasilla(2,0).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(2,1).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(2,2).equals(jugadores[turno].getJuega())){
            System.out.println("Ha ganado " + jugadores[turno].getNombre());
            aux = true;
        } 
        
        if(tablero.getStringCasilla(0,0).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(1,1).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(2,2).equals(jugadores[turno].getJuega())){
            System.out.println("Ha ganado " + jugadores[turno].getNombre());
            aux = true;
        } 
       
        if(tablero.getStringCasilla(0,0).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(1,0).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(2,0).equals(jugadores[turno].getJuega())){
            System.out.println("Ha ganado " + jugadores[turno].getNombre());
            aux = true;
        } 
       
        if(tablero.getStringCasilla(0,1).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(1,1).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(2,1).equals(jugadores[turno].getJuega())){
            System.out.println("Ha ganado " + jugadores[turno].getNombre());
            aux = true;
        } 
        
        if(tablero.getStringCasilla(0,2).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(1,2).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(2,2).equals(jugadores[turno].getJuega())){
            System.out.println("Ha ganado " + jugadores[turno].getNombre());
            aux = true;
        } 
        if(tablero.getStringCasilla(0,2).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(1,1).equals(jugadores[turno].getJuega()) && tablero.getStringCasilla(0,2).equals(jugadores[turno].getJuega())){
            System.out.println("Ha ganado " + jugadores[turno].getNombre());
            aux = true;
        }
       
        return aux;
                
    }
}
