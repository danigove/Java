package ejercicioherencia25;

public class ProductoCongelado extends Producto{
    
    protected double tempCongRec;
    
    public ProductoCongelado(int numLote, String fecha, double tempCongRec){
        super(numLote,fecha);
        setTempCong(tempCongRec);
    }
    
    public double getTempRec(){
        return tempCongRec;
    }
    public void setTempCong(double temp){
        this.tempCongRec = temp;
    }
    
    public String toString(){
        return super.toString() + " ademas, el producto congelado debe estar a una temperatura recomendada de " + getTempRec() + " grados centigrados.";
    }
    
    
}
