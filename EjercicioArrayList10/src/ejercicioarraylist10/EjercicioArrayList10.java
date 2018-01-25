package ejercicioarraylist10;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrayList10 {

    private static ArrayList<Entrada> entradasVIP = new ArrayList<>();
    private static ArrayList<Entrada> entradasPALCO = new ArrayList<>();
    private static ArrayList<Entrada> entradasRESERVADAS = new ArrayList<>();
    private static ArrayList<Entrada> entradasGALLINERO = new ArrayList<>();
    
    private static ArrayList<ArrayList<Entrada>> coleccionEntradas = new ArrayList<>();
    
    
    private static int contadorVIP = 0;
    private static int contadorPALCO = 0;
    private static int contadorRESERVADAS = 0;
    private static int contadorGALLINERO = 0;
    
    public static void main(String[] args) {
        coleccionEntradas.add(entradasVIP);
        coleccionEntradas.add(entradasPALCO);
        coleccionEntradas.add(entradasRESERVADAS);
        coleccionEntradas.add(entradasGALLINERO);
        
        menu();
        
    }
    
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        String i = "";
        do{
            System.out.println("1.- Vender entrada.");
            System.out.println("2.- Anular entrada.");
            System.out.println("3.- Mostrar todas las entradas que ha comprado una misma persona.");
            System.out.println("4.- Mostrar cuantas entradas quedan.");
            System.out.println("5.- Salir.");
            System.out.print("Introduzca opcion: ");
            i = sc.next();
            
            if(comprobarNum(i)){
                int a = Integer.parseInt(i);
                switch (a){
                    case 1: venderEntrada();
                            break;
                    case 2: anularEntrada();
                            break;
                    case 3: mostrarEntradas();
                            break;
                    case 4: cuantasQuedan();
                            break;
                    case 5: System.out.println("Saliendo del menu...");        
                            break;
                    default:System.out.println("Accion no permitida.");  
                            break;
                }
            }
            
        }while(!(i.equals("5")));
        
    }
    
    public static boolean comprobarNum(String a){
        boolean ag = true;
        for (int i = 0; i < a.length(); i++) {
            if(Character.isDigit(a.charAt(i))){
                
            }else{
                ag = false;
            }
        }
        return ag;
    }
    
    public static void venderEntrada(){
        Scanner sc = new Scanner(System.in);
        int intAux=0;
        String strAux="";
        System.out.print("Introduzca el nif del comprador: ");
        strAux=sc.next();
        System.out.print("Introduzca el codigo de la entrada que desee: ");
        intAux=sc.nextInt();
        
        if(comprobarTicket(strAux, intAux)){
            Entrada a = new Entrada(intAux, strAux);
            switch (intAux){
                case 01:entradasVIP.add(a);
                        contadorVIP++;
                        break;
                case 02:entradasPALCO.add(a);
                        contadorPALCO++;
                        break;
                case 03:entradasRESERVADAS.add(a);
                        contadorRESERVADAS++;
                        break;
                case 04:entradasGALLINERO.add(a);
                        contadorGALLINERO++;
                        break;
                default:System.out.println("Error: la comprobacion del comprobarTicket() falla");        
                        break;
            }
        }
        
    }
    public static void anularEntrada(){
        Scanner sc = new Scanner(System.in);
        boolean ag = false;
        System.out.print("Introduzca el numero de la entrada que quiere anular");
        int a = sc.nextInt();
        int c = 0;
        int d = 0;
        for (int i = 0; i < coleccionEntradas.size(); i++) {
            for (int j = 0; j < coleccionEntradas.get(i).size(); j++) {
                if(coleccionEntradas.get(i).get(j).getNumeroEntrada()==a){
                    System.out.println(a);
                    ag=true;
                    c=i;
                    d=j;
                    break;
                }
            }
        }
        if(ag){
            coleccionEntradas.remove(coleccionEntradas.get(c).get(d));
            System.out.println("Entrada eliminada.");
        }else{
            System.out.println("Entrada no encontrada.");
        }

    }
    public static void mostrarEntradas(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca NIF: ");
        String aux = sc.next();
        System.out.println("Entradas pertenecientes a: " + aux);
        if(Entrada.comprobarNIF(aux)){
            for (int i = 0; i < coleccionEntradas.size(); i++) {
                for (int j = 0; j < coleccionEntradas.get(i).size(); j++) {
                    if(aux.equals(coleccionEntradas.get(i).get(j).getNIF())){
                        System.out.println(coleccionEntradas.get(i).get(j));
                    }
                }
            }
        }else{
            System.err.println("DNI incorrecto.");
        }
    }
    public static void cuantasQuedan(){
        System.out.println("De VIP quedan " + (20 - contadorVIP));
        System.out.println("De PALCO quedan " + (40 - contadorPALCO));
        System.out.println("De RESERVAS quedan " + (10 - contadorRESERVADAS));
    }
    
    public static boolean comprobarTicket(String a, int b){
        switch (b){
            case 01: return (contadorVIP+1)<=20;
            case 02: return (contadorPALCO+1)<=40;
            case 03: return (contadorRESERVADAS+1)<=10;
            case 04: return true;
            default: return false;
        }
    }
    
}
