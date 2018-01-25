package ejercicioherencia25;

public class Producto {
    
    protected int numeroLote;
    protected String fechaCaducidad;
    
    protected Producto(int numeroLote, String fechaCaducidad){
        setNumeroLote(numeroLote);
        setFechaCaducidad(fechaCaducidad);
    }
    
    public int getNumLote(){
        return numeroLote;
    }
    public void setNumeroLote(int numeroLote){
        this.numeroLote=numeroLote;
    }
    public String getFechaCaducidad(){
        return fechaCaducidad;
    }
    public void setFechaCaducidad(String fecha){
        this.fechaCaducidad = fecha;
    }
    public String toString(){
        return "El producto es del lote " + numeroLote + " y caduca el " + fechaCaducidad + " " ;
    }        
}
