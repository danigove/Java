package pkg16febrero;

public class Producto {
    
    private String idProducto;
    private String nomProducto;
    private double precio;
    private int cantidadStock;
    
    public Producto(String idProducto, String nomProducto, double precio, int cantidadStock){
        this.idProducto=idProducto;
        this.nomProducto=nomProducto;
        this.precio=precio;
        setCantidadStock(cantidadStock);
    }
    
    public void setCantidadStock(int cantidadStock){
        this.cantidadStock = cantidadStock;
    }
    public String getNombre(){
        return nomProducto;
    }
    public String getId(){
        return idProducto;
    }
    public String toString(){
        return "Id: " + idProducto + ", Nombre: " + nomProducto + ", Precio: " + precio + ", Cantidad en Stock: " + cantidadStock;
    }
    
    
}
