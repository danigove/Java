package Poli2;

public class Buceador implements Bucear{
    
    private String nombre;
    
    public Buceador(String nombre){
        this.nombre=nombre;
    }
    
    public String toString(){
        return nombre;
    }

    @Override
    public void buceo() {
        System.out.println(this + " esta buceando.");
    }
            
    
}
