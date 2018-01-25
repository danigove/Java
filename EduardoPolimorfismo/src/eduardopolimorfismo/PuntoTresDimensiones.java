package eduardopolimorfismo;

public class PuntoTresDimensiones extends Punto{
    
    private int z;
    
    public PuntoTresDimensiones(int x, int y, int z){
        super(x,y);
        setZ(z);
    }
    
    public int getZ(){
        return z;
    }
    public void setZ(int z){
        this.z=z;
    }
    
    @Override
    public String toString(){
        return super.toString() + " ademas, este punto dispone de una tercera posicion que es: " + getZ();
    }
    
}
