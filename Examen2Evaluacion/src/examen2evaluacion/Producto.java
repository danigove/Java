package examen2evaluacion;

public class Producto {
    
    private int id;
    private String nombre;
    private double precio;
    private static int stock;
            
    public Producto(int id, String nombre, double precio, int stock){
        setId(id);
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock+=stock;
    }
    public void restarStock(int a){
        this.stock = stock - a;
    }
    public void newStock(int a){
        this.stock=a;
    }
    
    public String toString(){
        return "Id: " + getId() + " nombre: " + getNombre() + " precio: " + getPrecio() + " cantidad en stock " + getStock();
    }
}
