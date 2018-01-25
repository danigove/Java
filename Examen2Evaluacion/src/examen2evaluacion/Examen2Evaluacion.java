package examen2evaluacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Examen2Evaluacion {
    
    private static ArrayList<Producto> tienda = new ArrayList<Producto>();
    private static ArrayList<String> compras = new ArrayList<String>();
    private static ArrayList<String> ventas = new ArrayList<String>();

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        String a = "";
        do{
        System.out.println("1.-Compras.");
        System.out.println("2.-Ventas.");
        System.out.println("3.-Consultar un producto.");
        System.out.println("4.-Modificar el producto.");
        System.out.println("5.-Informe de compras.");
        System.out.println("6.-Informe de ventas.");
        System.out.println("7.-Salir.");
        System.out.print("Introduzca la opcion que desea: ");
        a = sc.next();
        if(comprobarOpcion(a)){
            switch(Integer.parseInt(a)){
                case 1: compras();
                        break;
                case 2: ventas();
                        break;
                case 3: consultaProducto();
                        break;
                case 4: modificarProducto();
                        break;
                case 5: informeCompras();
                        break;
                case 6: informeVentas();
                        break;
                case 7: System.out.println("Saliendo...");
                        break;
                default:System.out.println("Opcion no valida."); 
                        break;
                }
            }
          }while(!(a.equals("7")));
        }
    
    private static boolean comprobarOpcion(String a){
        boolean aux = true;
        for (int i = 0; i < a.length(); i++) {
            if(Character.isDigit(a.charAt(i))){
                
            }else{
                System.out.println("La opcion introducida no es un numero.");
                aux=false;
            }
            
        }
        return aux;
    }
    
    public static void compras(){
        boolean esta = false;
        int estaEn=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca id del producto: ");
        int idAux = sc.nextInt();
        System.out.print("Introduzca nombre del producto: ");
        String nombreAux = sc.next();
        System.out.print("Introduzca precio del producto: ");
        double precioAux = sc.nextDouble();
        System.out.print("Introduzca cantidad del producto: ");
        int stockAux = sc.nextInt();
        
        for (int i = 0; i < tienda.size(); i++) {
            if((tienda.get(i).getNombre().equals(nombreAux)) && (tienda.get(i).getId()==idAux)){
                esta = true;
                estaEn = i;
                break;
            }
        }
        
        if(esta){
            System.out.println("El producto que quiere comprar ya se encuetra en la tienda.");
            System.out.println("Sumando stock.");
            tienda.get(estaEn).setStock(stockAux);
        }else{
            System.out.println("Anadiendo nuevo producto en la tienda...");
            tienda.add(new Producto(idAux, nombreAux, precioAux, stockAux));
            compras.add("Se ha añadido " + stockAux + " unidades del elemento " + idAux + " con el precio " + precioAux);
        }
    }
    public static void ventas(){
        boolean esta = false;
        int estaEn = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca clave de lo que quiere: ");
        int idVenta = sc.nextInt();
        for (int i = 0; i < tienda.size() ; i++) {
            if(tienda.get(i).getId()==idVenta){
                esta = true;
                estaEn = i;
                if(tienda.get(i).getStock()<5){
                    System.out.println("Quedan menos de 5 unidades.");
                }
                break;
            }
        }
        if(esta){
            System.out.print("Introduzca cantidad deseada: ");
            int compraAux = sc.nextInt();
            if(tienda.get(estaEn).getStock() - compraAux > 0){
                tienda.get(estaEn).restarStock(compraAux);
                ventas.add("Se ha comprado " + compraAux + " elementos de id " + idVenta);
            }else{
                System.out.println("No se puede realizar la operacion. Ha pedido mas de lo que hay.");
            }
        }else{
            System.out.println("No existe el producto especificado.");
        }
    }
    public static void consultaProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Buscar por id");
        System.out.println("2-Buscar por nombre");
        System.out.println("3-Mostrar todos");
        System.out.print("Introduzca opcion deseada: ");
        int aux  = sc.nextInt();
        switch(aux){
            case 1: System.out.println("");
                    System.out.print("Introduzca id: ");
                    int idAux = sc.nextInt();
                    for (int i = 0; i < tienda.size(); i++) {
                        if(tienda.get(i).getId()==idAux){
                            System.out.println(tienda.get(i));
                        }
                    }
                    break;
            case 2: System.out.println("");
                    System.out.print("Introduzca nombre: ");
                    String nombreAux = sc.next();
                    for (int i = 0; i < tienda.size(); i++) {
                        if(tienda.get(i).getNombre().equals(nombreAux)){
                            System.out.println(tienda.get(i));
                        }
                    }
                    break;   
            case 3: mostrarTodo();
                    break;
            default: System.out.println("Opcion no valida.");
                     break;
        }
    }
    public static void modificarProducto(){
        Scanner sc = new Scanner(System.in);
        String aux = "";
        do{
        System.out.println("Introduzca si lo que quiere cambiar es el precio o la cantidad del producto: ");
        aux = sc.next();
        if(aux.equals("precio")){
            System.out.print("Introduzca el id del producto a cambiar: ");    
            int idAux = sc.nextInt();
            for (int i = 0; i < tienda.size(); i++){
                if(tienda.get(i).getId()==idAux){
                    System.out.print("Introduzca nuevo precio: ");
                    double a = sc.nextDouble();
                    tienda.get(i).setPrecio(a);
                }
            }
        }else if(aux.equals("cantidad")){
            System.out.print("Introduzca el id del producto a cambiar: ");    
            int idAux = sc.nextInt();
            for (int i = 0; i < tienda.size(); i++){
                if(tienda.get(i).getId()==idAux){
                    System.out.print("Introduzca nuevo stock: ");
                    int a = sc.nextInt();
                    tienda.get(i).newStock(a);
                }
            }
        }else{
            System.out.println("Opcion no valida.");
        }
        }while(aux.equals("precio") && aux.equals("cantidad"));
    }
    public static void informeCompras(){
        for (int i = 0; i < compras.size(); i++) {
            System.out.println(compras.get(i));
        }
    }
    public static void informeVentas(){
        for (int i = 0; i < ventas.size(); i++) {
            System.out.println(ventas.get(i));
        }    
    }
    private static void mostrarTodo(){
        for (int i = 0; i < tienda.size(); i++) {
            System.out.println(tienda.get(i));
        }
    }
}

