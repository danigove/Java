package ejerciciolinkedlist14;

import java.util.LinkedList;
import java.util.Scanner;

public class Academia {
    
    private LinkedList<Master> masteres;
    
    public Academia(){
        masteres = new LinkedList<>();
    }
    
    public void anadirMaster(){
        Master m = new Master();
        masteres.add(m);
    }
    public void anadirMasterPrin(){
        Master m = new Master();
        masteres.add(0, m);
    }
    public void anadirMasterPos(){
        Master m = new Master();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la posicion en la que quiere introducir el master.");
        int n = sc.nextInt();
        masteres.add(n, m);
    } 
    public void borrarMaster(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el codigo del master que quiere borrar: ");
        int codigo = sc.nextInt();
  
        boolean aux = false;
        for (int i = 0; i < masteres.size(); i++) {
            if(masteres.get(i).getCodigo()==codigo){
                masteres.remove(i);
                aux=true;
                break;
            }else{
            }
        }
        if(aux){
            System.out.println("Elemento borrado correctamente.");
        }else{
            System.err.println("Error: Elemento no encontrado.");
        }
    }
    public void modificarHorasMaster(){
        boolean aux = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el codigo del master del que desea cambiar las horas: ");
        int codigo = sc.nextInt();
        int iAux=0;
        for (int i = 0; i < masteres.size(); i++) {
            if(masteres.get(i).getCodigo()==codigo){
                aux=true;
                System.out.print("Introduzca el nuevo numeros de horas que quiere que contenga el master: ");
                iAux=sc.nextInt();
            }else{
            }
        }
        if(aux){
            System.out.println("Elemento cambiado correctamente.");
        }else{
            System.out.println("Error: Codigo no encontrado en la lista de masteres.");
        }
    }
    public void mostrarMasteres(){
        for (int i = 0; i < masteres.size(); i++) {
            System.out.println(masteres.get(i));
        }
    }
    public void menu(){
        int aux = 0;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("1.- Anadir Nuevo Master al final de la lista");
        System.out.println("2.- Anadir Nuevo Master al principio de la lista");
        System.out.println("3.- Anadir Nuevo Master en cualquier posicion");
        System.out.println("4.- Borrar un Master dado su codigo");
        System.out.println("5.- Modificar el numero de horas de un master dado su codigo.");
        System.out.println("6.- Mostrar todos los masters.");
        System.out.println("7.- Salir");
        System.out.print("Introduzca la opcion que desee utilizar: ");
        aux = sc.nextInt();
        switch(aux){
            case 1: anadirMaster();
                    break;
            case 2: anadirMasterPrin();
                    break;
            case 3: anadirMasterPos();
                    break;
            case 4: borrarMaster();
                    break;
            case 5: modificarHorasMaster();
                    break;
            case 6: mostrarMasteres();
                    break;
            case 7: System.out.println("Saliendo...");
                    break;
            default:System.out.println("Opcion no permitida, por favor, introduzca una opcion valida.");   
                    break;
        }
        }while(aux !=7);
    }
}
