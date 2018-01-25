package arrayobjetosgen;
import java.util.Scanner;
//Ejercicio24
public class Curso {
    private String nombre;
    private String[] alumnos = {"paco2","pepe","juanlu","seluz"};
    
    public Curso(String nombre, int numAlum){
        setNombre(nombre);
        //inicializarArrayAlum(numAlum);
    }
    public Curso(String nombre, String[] alum){
        setNombre(nombre);
        this.alumnos=alum;
    }
    
    private void inicializarArrayAlum(int a){
        Scanner sc = new Scanner(System.in);
        String[] aux = new String[a];
        for (int i = 0; i < aux.length; i++) {
            System.out.print("Inserte el nombre del alumno numero "  + (i+1) + ": ");
            aux[i]=sc.next();
        }
        this.alumnos=aux;
    }
    public String getNombre(){
        return nombre;
    }
    private void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void mostrarClase(){
        System.out.println("*****" + getNombre() + "*****");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]+".");
        }
    }
    public void verNombre(int i){
        System.out.println(alumnos[i]);
    }
    public void desplaza(){
        String aux;
        for (int i = 0; i < alumnos.length; i++) {
            if(i==0){
                aux=alumnos[alumnos.length-1];
                alumnos[alumnos.length-1]=alumnos[i];
                alumnos[i]=aux;

            }else if(i!=0){
                aux=alumnos[alumnos.length-1];
                alumnos[alumnos.length-1]=alumnos[i];
                alumnos[i]=aux;
           
        }
            
        
        }
    }
    public String elMasLargo(){
        String a="";
        int aux=0;
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i].length()>aux){
                aux=alumnos[i].length();
                a=alumnos[i];
            }
        }
        //System.out.println("El alumno con el nombre mas largo es: " + a);
        return a;
    }
    public String elMasCorto(){
        String a="";
        int aux=1000000;
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i].length()<aux){
                aux=alumnos[i].length();
                a=alumnos[i];
            }
        }
        //System.out.println("El alumno con el nombre mas corto es: " + a);
        return a;
    }        
}
