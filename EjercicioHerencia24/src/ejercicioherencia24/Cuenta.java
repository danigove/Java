package ejercicioherencia24;

public class Cuenta {
    
    protected String nombreCliente;
    protected double importe=0;
    
    public Cuenta(String nombre, double importe){
        setNombreCliente(nombre);
        ingresar(importe);
    }
    
    public String getNombreCliente(){
        return nombreCliente;
    }
    public void setNombreCliente(String nombre){
        this.nombreCliente=nombre;
    }
    public double getImporte(){
        return importe;
    }
    public void ingresar(double importe){
        this.importe += importe;
    }
    public void reintegrar(double reint){
        if(importe-reint<0){
            System.err.println("Error: No hay suficientes fondos para reintegrar.");
        }else{
            importe-=reint;
        }
    }
    
    public String toString(){
        return "La cuenta pertenece al cliente " + getNombreCliente() + " y contiene un importe total de: " + getImporte();
    }
            
}
