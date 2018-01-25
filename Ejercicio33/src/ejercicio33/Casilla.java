package ejercicio33;

public class Casilla {
    
    private String contenido;
    
    public Casilla(){
        setCont(" ");
    }
    
    public String getCont(){
        return contenido;
    }
    public void setCont(String cont){
        this.contenido = cont;
    }
    
    public String toString(){
        return contenido;
    }
    
    
}
