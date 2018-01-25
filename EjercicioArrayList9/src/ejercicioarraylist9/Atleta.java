package ejercicioarraylist9;

import java.util.Scanner;

public class Atleta {
    
    private int dorsal;
    private String nombre;
    private int[] tiempos = new int[3];
    
    public Atleta(){
        pedirDatos();
    }
    
    public void pedirDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero del dorsal: ");
        setDorsal(sc.nextInt());
        System.out.print("Introduzca nombre del Atleta: ");
        setNombre(sc.next());
        for (int i = 0; i < tiempos.length; i++) {
            System.out.print("Introduzca el tiempo numero " + (i+1) + " en segundos: ");
            tiempos[i]=sc.nextInt();
        }
    }
    public int getDorsal(){
        return dorsal;
    }
    private void setDorsal(int dorsal){
        this.dorsal=dorsal;
    }
    public String getNombre(){
        return nombre;
    }
    private void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public int getTiempos(int a){
        return tiempos[a];
    }
    
    public int todosTiempos(){
        return (getTiempos(0)+getTiempos(1)+getTiempos(2));
    }

}
