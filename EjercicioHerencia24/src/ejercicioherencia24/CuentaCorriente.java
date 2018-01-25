package ejercicioherencia24;

public class CuentaCorriente extends Cuenta{
    
    protected double importeMinimo;
    
    public CuentaCorriente(String nombre, double importe, double recargo, double importeMinimo){
        super(nombre, importe);
        //setRecargo(recargo);
        setImporteMinimo(importeMinimo);
    }
    
    public double getRecargo(){
        if(importe >= importeMinimo){
            return 0;
        }else{
            return 1;
        }
    }
    /*public void setRecargo(double recargo){
            this.recargo=recargo;
    }*/
    public double getImporteMinimo(){
        return importeMinimo;
    }
    public void setImporteMinimo(double importeMinimo){
        this.importeMinimo=importeMinimo;
    }
    
}
