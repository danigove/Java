package ejercicioarraylist8;

public class Persona {
    
    private String dni;
    private String nombre;
    
    public Persona(String dni, String nombre){
        setNombre(nombre);
        setDNI(dni);
    }
    
   public String getDni(){
       return dni;
   }
   public String getNombre(){
       return nombre;
   }
   public void setDNI(String dni){
       this.dni = dni;
   }
   public void setNombre(String nombre){
       this.nombre=nombre;
   }
   public String toString(){    
       return "Nombre: " + getNombre() + " DNI: " + getDni();
   }
    
}
