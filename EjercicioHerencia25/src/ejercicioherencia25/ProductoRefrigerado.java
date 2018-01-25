package ejercicioherencia25;

public class ProductoRefrigerado extends Producto{
    
    protected double tempRecomendada;
    
    public ProductoRefrigerado(int numeroLote, String fecha, double tempRecomendada){
        super(numeroLote,fecha);
        setTempRecomendada(tempRecomendada);
    }
    public double getTempRecomendada(){
        return tempRecomendada;
    }
    public void setTempRecomendada(double tempRecomendada){
        this.tempRecomendada=tempRecomendada;
    }
    public String toString(){
        return super.toString() + " y su temperatura recomendada es de " + getTempRecomendada() + " grados Celsius";
    }
    
}
