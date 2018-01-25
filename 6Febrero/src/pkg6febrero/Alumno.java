package pkg6febrero;

public class Alumno {
    
    private String nombreCompleto;
    private double nota;
    
    public Alumno(String nombre){
        nombreCompleto=nombre;
    }
    
    public Alumno(String nombre, double nota){
        nombreCompleto=nombre;
        setNota(nota);
    }
    public String getNombre(){
            return nombreCompleto;
    }  
    public String toString(){
        return "" + nombreCompleto;
    }
    public double getNota(){
        return nota;
    }
    public void setNota(double nota){
        this.nota=nota;
    }
}
