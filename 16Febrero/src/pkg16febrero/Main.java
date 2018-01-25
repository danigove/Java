package pkg16febrero;
import java.util.Scanner;
public class Main {

    private static Producto[] productos = new Producto[15];
    
    
    public static void main(String[] args) {
        inicializarProductos();
        menu();
    }
    
    private static void inicializarProductos(){
        Producto p1 = new Producto("00001","Patatas Rufles",1.15,100);
        Producto p2 = new Producto("00002","Pipas G",1.00,60);
        Producto p3 = new Producto("00003","Sugus",0.50,500);
        Producto p4 = new Producto("00004","Monster Energy",1.50,1000);
        Producto p5 = new Producto("00005","Coca cola - Zero",0.60,100);
        Producto p6 = new Producto("00006","Fanta naranja",0.65,100);
        Producto p7 = new Producto("00007","Fanta limon DansGame",0.65,100);
        
        productos[0] = p1;
        productos[1] = p2;
        productos[2] = p3;
        productos[3] = p4;
        productos[4] = p5;
        productos[5] = p6;
        productos[6] = p7;
    }
    
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int aux;
        do{
        System.out.println("***TIENDA DE COMESTIBLES***");
        System.out.println("1 - Dar de alta un producto nuevo.");
        System.out.println("2 - Buscar un producto por id.");
        System.out.println("3 - Modificar el stock de un producto.");
        System.out.println("4 - Eliminar producto.");
        System.out.println("5 - Compras");
        System.out.println("6 - Ventas");
        System.out.println("7 - Mostrar informe de compras del dia.");
        System.out.println("8 - Mostrar informe de ventas del dia.");
        System.out.println("9 - Mostrar Stockage.");
        System.out.println("0 - Salir del programa");
            System.out.print("Introduzca la opcion que desee realizar: ");
            aux=sc.nextInt();
            switch(aux){
                    case 1: darAlta();
                            break;
                    case 2: buscarProducto();
                            break;
                    case 3: modificarStock();
                            break;
                    case 4: eliminarProducto();
                            break;
                    case 5: System.out.println("No implementado.");
                            break;
                    case 6: System.out.println("No implementado.");
                            break;
                    case 7: System.out.println("No implementado.");
                            break;
                    case 8: System.out.println("No implementado.");
                            break;
                    case 9: System.out.println("No implementado.");
                            break;
                    case 0: System.out.println("Saliendo del programa.");  
                            break;
                    default: System.out.println("Opcion no disponible...");
                            break;
             }
        }while(aux!=0);
    }
    public static void darAlta(){
        mostrarProductos();
        Scanner sc = new Scanner(System.in);
        System.out.print("Intoduza el id del producto: ");
        String auxId=sc.next();
        System.out.print("Intoduza el nombre del producto: ");
        String auxNombre=sc.next();
        System.out.print("Intoduza el precio del producto: ");
        Double auxPrecio=sc.nextDouble();
        System.out.print("Intoduza la cantidad en stock del producto: ");
        int auxStock=sc.nextInt();
        for (int i = 0; i < productos.length; i++) {
            if(productos[i]==null){
               productos[i]=new Producto(auxId,auxNombre,auxPrecio,auxStock);
               break;
            }
        }
        mostrarProductos();
        
        
    }
    public static Producto buscarProducto(){
        Scanner sc = new Scanner(System.in);
        Producto p = null;
        System.out.print("Introduzca id del producto a buscar: ");
        String meme = sc.next();
        for (int i = 0; i < productos.length; i++) {
            if(meme.equals(productos[i].getId())){
                p = productos[i];
                System.out.println(productos[i]);
                break;
                }
            }
        if(p==null){
            System.out.println("No se ha encontrado un producto con el id especificado.");
        }
        return p;
    }
    public static void modificarStock(){
        Scanner sc = new Scanner(System.in);
        Producto p=null;
        System.out.print("Introduzca id del producto a buscar: ");
        String meme = sc.next();
        for (int i = 0; i < productos.length; i++) {
            if(meme.equals(productos[i].getId())){
                System.out.println(productos[i]);
                p = productos[i];
                System.out.print("Introduzca el nuevo stock del producto: ");
                int aux  = sc.nextInt();
                productos[i].setCantidadStock(aux);
                break;
                }
            }
       if(p==null){
           System.out.println("Error: no se ha encontrado el producto especificado.");
          
       }
    }
    public static void eliminarProducto(){
        mostrarProductos();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el id del producto que necesita: ");
        String aux = sc.next();
        for (int i = 0; i < productos.length; i++) {
            if(aux.equals(productos[i].getId())){
                System.out.print("Se ha eliminado el producto: " + productos[i].getNombre() + ". \n");
                productos[i]=null;
            }
            
        }
        mostrarProductos();
    }
    public static void mostrarProductos(){
        for (int i = 0; i < productos.length; i++) {
            if(productos[i]==null){
                // No muestra.
            }else if(i==productos.length-1){
                System.out.println(productos[i].getNombre()+".");
            }else{
                System.out.print(productos[i].getNombre() + ", ");
            }
        }
        System.out.println("");
    }
    
}
