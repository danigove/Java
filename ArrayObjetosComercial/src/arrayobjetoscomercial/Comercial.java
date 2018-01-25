package arrayobjetoscomercial;
import java.util.Scanner;

public class Comercial {
    
    private String nombre;
    private double[] ventas;
    
    public Comercial(String nombre){
        setNombre(nombre);
        setVentas();
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setVentas(){
        System.out.println("Comercial: "+ getNombre());
        Scanner sc = new Scanner(System.in);
        double[] ventas = new double[6];
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Introduzca las ventas del dia " + (i+1) +" : ");
            ventas[i]=sc.nextDouble();
        }
        this.ventas=ventas;
        mostrarVentas();
    }
    public void mostrarVentasTotales(){
    System.out.print("Las ventas totales de " + this.nombre + ": ");
    double aux=0;
        for (int i = 0; i < ventas.length; i++) {
            aux+=ventas[i];
        }
        System.out.println(aux);
    }
    public void mostrarVentas(){
        for (int i = 0; i < ventas.length; i++) {
            System.out.print(ventas[i] + ", ");
        }
    }
    public double comisiones(){
        double dollars=0;
        for (int i = 0; i < ventas.length; i++) {
            if(i%2==0){
                dollars+=ventas[i]*0.1;
            }else{
                dollars+=ventas[i]*0.15;
            }
        }
        System.out.println("El comercial " + this.nombre + " se lleva " + dollars + " de comision");
        return dollars;
    }
    public String mejorDia(){
        int mejorDia=0;
        double cuantiaMax=ventas[0];
        for (int i = 1; i < ventas.length; i++) {
            if(ventas[i]>cuantiaMax){
                cuantiaMax=ventas[i];
                mejorDia=i;
            }
        }
        switch(mejorDia){
            case 0: return "El mejor dia ha sido el Lunes";
            case 1: return "El mejor dia ha sido el Martes";
            case 2: return "El mejor dia ha sido el Miercoles";
            case 3: return "El mejor dia ha sido el Jueves";
            case 4: return "El mejor dia ha sido el Viernes";
            case 5: return "El mejor dia ha sido el Sabado";
            default: return "Dia no valido";
        }
    }
    
}
