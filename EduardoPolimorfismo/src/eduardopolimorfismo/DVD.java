package eduardopolimorfismo;

public class DVD extends Articulo{
    
    private String director;
    private int escenas;
    
    public DVD(String titulo, int duracion, String director, int escenas){
        super(titulo,duracion);
        setDirector(director);
        setEscenas(escenas);
    }
    
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director=director;
    }
    public int getEscenas(){
        return escenas;
    }
    public void setEscenas(int escenas){
        this.escenas=escenas;
    }
    
    public String toString(){
        return super.toString() + " " + getDirector() + " " + getEscenas();
     }
}
