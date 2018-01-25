package ejercicioherencia24;

public class CuentaAhorro extends Cuenta{ 
    
    protected double interes;
    
    public CuentaAhorro(String nombreCliente, double importe, double interes ){
        super(nombreCliente, importe);
        aplicarInteres(interes);
    }
    
    public double getInteres(){
        return interes;
    }
    public void aplicarInteres(double interes){
        this.interes = interes;
    }
    
}
