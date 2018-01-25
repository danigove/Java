package pkg13febrero;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private int[] notas;
    
    public Alumno(){
        setNombre();
        setNotas();
    }
    
    private void setNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca nombre del alumno: " );
        this.nombre = sc.next();
    }
    private void setNotas(){
        int[] notas = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduzca la nota numero " + (i+1) + ": ");
            notas[i] = sc.nextInt();
        }
        this.notas=notas;
    }
    public int notaMasAlta(){
        int aux = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if(notas[i]>aux)
                aux=notas[i];
        }
        return aux;
    }
    public int notaMasBaja(){
        int aux = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if(notas[i]<aux)
                aux=notas[i];
        }
        return aux;
    }   
    public double notaMedia(){
        double aux=0;
        for (int i = 0; i < notas.length; i++) {
            aux+=notas[i];
        }
        return aux/notas.length;
    } 
    public void representarAlumno(){
        System.out.print("Nombre: " + nombreMayus() + "\n" + "Nota Media: " + notaMedia() + "\n");
    }   
    public String nombreMayus(){
        String aux="";
        for (int i = 0; i < nombre.length(); i++) {
            aux+=Character.toUpperCase(nombre.charAt(i));
        }
        return aux;
    }
            
}
