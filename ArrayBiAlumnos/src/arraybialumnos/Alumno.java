package arraybialumnos;

public class Alumno {
   
    private String nombre;
    
    public Alumno(String nombre){
        setNombre(nombre);
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
}
