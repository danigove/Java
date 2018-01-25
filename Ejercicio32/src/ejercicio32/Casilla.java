package ejercicio32;

public class Casilla {
    
    private String cont;
    
    public Casilla(){
        setCont(" ");
    }
    public Casilla(String cont){
        setCont(cont);
    }
    
    public String getCont(){
        return cont;
    }
    public void setCont(String cont){
        this.cont=cont;
    }
}
