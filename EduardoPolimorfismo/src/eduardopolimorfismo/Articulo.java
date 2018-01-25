package eduardopolimorfismo;

public abstract class Articulo {
    
    private String titulo;
    private int duracion;
    
    public Articulo(String titulo, int duracion){
        setTitulo(titulo);
        setDuracion(duracion);
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public int getDuracion(){
        return duracion;
    }
    public void setDuracion(int duracion){
        this.duracion=duracion;
    }
    public String toString(){
        return getTitulo() + " " + getDuracion();
    }
    
}
