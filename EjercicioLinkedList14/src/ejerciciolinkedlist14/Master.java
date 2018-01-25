package ejerciciolinkedlist14;

import java.util.Scanner;

public class Master {

    private int codigo;
    private String descripcion;
    private double numHoras;

    public Master() {
        
        int codAux;
        String desAux;
        double horAux = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el codigo del master: ");
        codAux = sc.nextInt();
        System.out.print("Introduzca la descripcion del master: ");
        sc.nextLine();
        desAux = sc.nextLine();
        System.out.print("Introduzca el numero de horas del master: ");
        horAux = sc.nextDouble();
        setCodigo(codAux);
        setDescripcion(desAux);
        setHoras(horAux);

    }
    public Master(int codigo, String descripcion, double numHoras){
        setCodigo(codigo);
        setDescripcion(descripcion);
        setHoras(numHoras);
    }
            
    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setDescripcion(String des) {
        this.descripcion = des;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setHoras(double horas) {
        this.numHoras = horas;
    }
    public double getHoras() {
        return numHoras;
    }
    public String toString(){
        return "Master con codigo " + getCodigo() + " con la descripcion " + getDescripcion() + " y con un numero de " + numHoras + " horas.";
    } 

}
