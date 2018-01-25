package arrayobjetosgen;
import java.util.Scanner;

public class ArrayObjetosGen {

    
    public static String[] daw1 = {"dani", "loring", "catalan", "eduardito"};
    public static String[] daw2 = {"fede", "pemari", "elenemigo", "aaron"};
    public static String[] smr1 = {"huevo", "edy", "paco", "fran"};
    public static String[] smr2 = {"salvi", "dafne", "meme2", "meme45"};
    public static Curso[] cursos = new Curso[4];
    
    public static void main(String[] args) {
        Curso dawUno = new Curso("DAW1", daw1);
        Curso dawDos = new Curso("DAW2", daw2);
        Curso smrUno = new Curso("SMR1", smr1);
        Curso smrDos = new Curso("SMR2", smr2);
        cursos[0]=dawUno;
        cursos[1]=dawDos;
        cursos[2]=smrUno;
        cursos[3]=smrDos;
        menu();
    }
    
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int aux;
        do{
            System.out.println("Menu:");
            System.out.println("1-Resumen del curso");
            System.out.println("2-Mostrar el alumno con el nombre mas largo y en que curso esta");
            System.out.println("3-Mostrar que clase tiene el alumno con el nombre mas corto");
            System.out.println("4-Salir");
            System.out.print("Introduzca opcion deseada: ");
            aux = sc.nextInt();
            
            switch(aux){
                case 1:pedirCurso();
                       break;
                case 2:largestName();
                       break;
                case 3:shortestName();
                       break;
                case 4:System.out.println("Saliendo...");
                       break;
                default:System.out.println("Opcion no permitida:");
                        break;
            }
        }while(aux!=4);
    }
    public static void pedirCurso(){
        Scanner sc = new Scanner(System.in);
        String aux;
        boolean a=false;
        System.out.print("Introduzca nombre del curso: ");
        aux = sc.next();
        for (int i = 0; i < cursos.length; i++) {
            if(aux.equals(cursos[i].getNombre())){
                cursos[i].mostrarClase();
                a=true;
            }
        }
        if(a==false){
            System.out.println("Clase no encontrada...");
        }
        
    }
    public static void largestName(){
        int aux=0;
        String a="";
        String clase ="";
        a = cursos[0].elMasLargo();
        aux = a.length();
        clase = cursos[0].getNombre();
        for (int i = 0; i < cursos.length; i++) {
            if(cursos[i].elMasLargo().length()>aux){
                a=cursos[i].elMasLargo();
                aux=a.length();
                clase = cursos[i].getNombre();
            }
        }
        System.out.println("El nombre mas largo es: " + a + " y esta en la clase "+ clase);
    }
    public static void shortestName(){
        int aux = 100000;
        String clase = "";
        String a="";
        a = cursos[0].elMasCorto();
        aux = a.length();
        clase = cursos[0].getNombre();
        for (int i = 0; i < cursos.length; i++) {
            if(cursos[i].elMasCorto().length()<aux){
                a=cursos[i].elMasCorto();
                aux=a.length();
                clase = cursos[i].getNombre();

            }
        }
        System.out.println("La clase con el nombre mas corto es: " + clase + "(" + a + ")");
    }
}
