package examen3evaluacion;

public class Animal {
    
    private String nombre;
    
    public Animal(String nombre){
        setNombre(nombre);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    private void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String toString(){
        return nombre;
    }
            
    
}
