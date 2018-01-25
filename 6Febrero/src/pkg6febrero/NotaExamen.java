package pkg6febrero;
import java.util.Scanner;

public class NotaExamen {
    private static Alumno[] Alumnos  = new Alumno[10];
    
    
    public NotaExamen(){
        
    }
    
    public void inicializarAlumnos(){
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < Alumnos.length ; i++) {
            System.out.print("Introduzca el nombre del alumno " + (i+1) + ": ");
            Alumnos[i] = new Alumno(sc.next(), Math.rint((Math.random()*10+1)*10)/10);
        }
        Main.mostrar(Alumnos);
    }
    public void preguntarNota(){
        Scanner s = new Scanner(System.in);
        int aux = 0;
        for (int i = 0; i < Alumnos.length; i++) {
            System.out.print("Asignele la nota al alumno: " + Alumnos[i]);
            Alumnos[i].setNota(s.nextDouble());
            
        }
        Main.mostrar(Alumnos);
    }
    public void mostrarNotas(){
        System.out.println("---ALUMNOS SUSPENSOS---");
        for (int i = 0; i < Alumnos.length; i++) {
            if(Alumnos[i].getNota()<5){
                System.out.print(Alumnos[i]+", ");
                System.out.println(Alumnos[i].getNota());
            
        }
             
        }
        System.out.println("---ALUMNOS APROBADOS---");
        for (int i = 0; i < Alumnos.length; i++) {
              if(Alumnos[i].getNota()>=5){
                  System.out.print(Alumnos[i]+", ");
                  System.out.println(Alumnos[i].getNota());

          }
            
        }
    }
}
