package ejercicio32;

public class Jugador {
    
    private String nombre;
    private String juega;
    
    public Jugador(String jugador, String juega){
        setNombre(jugador);
        setJuega(juega);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getJuega(){
        return juega;
    }
    public void setJuega(String juega){
        this.juega=juega;
    }
    public String toString(){
        return "El jugador " + getNombre();
    }
}
