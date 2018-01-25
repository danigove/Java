package eduardopolimorfismo;

public class CD extends Articulo{
    
    private String artista;
    private int numPistas;
    
    public CD(String titulo, int duracion, String artista, int numPistas){
        super(titulo, duracion);
        setArtista(artista);
        setNumPistas(numPistas);
    }
    
    public String getArtista(){
        return artista;
    }
    public void setArtista(String artista){
        this.artista=artista;
    }
    public int getNumPistas(){
        return numPistas;
    }
    public void setNumPistas(int numPistas){
        this.numPistas=numPistas;
    }
    
    public String toString(){
        return  super.toString() + " " + getArtista() + " " + getNumPistas();
    }
    
    
}
