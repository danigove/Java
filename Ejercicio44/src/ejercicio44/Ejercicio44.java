package ejercicio44;

import java.util.Scanner;

public class Ejercicio44 {

        public static String aux1,aux2;
    
    public static void main(String[] args) {
        pedirCadenas();
        menu();
    }
    
    public static void pedirCadenas(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la primera cadena: ");
        aux1 = sc.next();
        System.out.print("Introduzca la segunda cadena: ");
        aux2 = sc.next();
        
    }
    
    public static void menu(){
        int a;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("----Menu----");
        System.out.println("1-equals.");
        System.out.println("2-compareTo.");
        System.out.println("3-valueOf.");
        System.out.println("4-toCharArray.");
        System.out.println("5-length");
        System.out.println("6-concat");
        System.out.println("7-charAt");
        System.out.println("8-substring");
        System.out.println("9-indexOf");
        System.out.println("10-lastIndexOf");
        System.out.println("11-endsWith");
        System.out.println("12-startsWith");
        System.out.println("13-replace");
        System.out.println("14-replaceAll");
        System.out.println("15-toUpperCase");
        System.out.println("16-toLowerCase");
        System.out.println("17-Split");
        System.out.println("18-SALIR");
        System.out.print("Introduzca opcion: ");
        a=sc.nextInt();
    
        switch(a){
            case 1: System.out.println(aux1.equals(aux2));
                    break;
            case 2: System.out.println(aux1.compareTo(aux2)); 
                    break;
            case 3: System.out.println(aux1.valueOf(aux2));
                    break;
            case 4: System.out.println(aux1.toCharArray());        
                    System.out.println(aux2.toCharArray());     
                    break;
            case 5: System.out.println(aux1.length());               
                    System.out.println(aux2.length());          
                    break;
            case 6: System.out.println(aux1 + aux2);
                    break;
            case 7: System.out.print("Inserte numero indice para ambas cadenas: ");
                    int z = sc.nextInt();
                    System.out.println(aux1.charAt(z) + ", " + aux2.charAt(z));
                    break;
            case 8: System.out.print("Inserte numero del principio: ");
                    int a1=sc.nextInt();
                    System.out.print("Inserte numero del final: ");
                    int a2=sc.nextInt();
                    System.out.println(aux1.substring(a1, a2));
                    System.out.println(aux2.substring(a1, a2));
                    break;
            case 9: System.out.println(aux1.indexOf(aux2));
                    break;
            case 10: System.out.println(aux1.lastIndexOf(aux2));
                    break;
            case 11: System.out.println(aux1.endsWith(aux2));    
                    break;
            case 12: System.out.println(aux1.startsWith(aux2));
                    break;
            case 13: System.out.println("No implementado...");
                    break;
            case 14: System.out.println(aux1.replaceAll(aux1, aux2)); 
                    break;
            case 15: aMayusculas(aux1); 
                     aMayusculas(aux2);
                     break;
            case 16: aMinusculas(aux1);
                     aMinusculas(aux2);
                     break;
            case 17: System.out.println(aux1.split(aux2)); 
                     break;
            case 18: System.out.println("Saliendo...");
                     break;
            default:System.out.println("No existe esa opcion.");
                    break;
        }
        
        }while(a!=18);
    
    }
    
    
    
    public static void aMayusculas(String a){
        String aux="";
        for (int i = 0; i < a.length(); i++) {
            aux+=Character.toUpperCase(a.charAt(i));
        }
        System.out.println(aux);
    }
    public static void aMinusculas(String a){
        String aux="";
        for (int i = 0; i < a.length(); i++) {
            aux+=Character.toLowerCase(a.charAt(i));
        }
        System.out.println(aux);
    }
}
