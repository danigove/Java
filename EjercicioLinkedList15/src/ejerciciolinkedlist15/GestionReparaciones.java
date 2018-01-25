package ejerciciolinkedlist15;

import java.util.Iterator;
import java.util.LinkedList;

public class GestionReparaciones {
    
    private LinkedList<FichaVehiculo> vehiculosEsperando = new LinkedList<FichaVehiculo>();
    private LinkedList<FichaVehiculo> vehiculosReparando = new LinkedList<FichaVehiculo>();
    
    public GestionReparaciones(){
        
    }
    
    public void anadeVehiculo(FichaVehiculo vehicle){
        vehiculosEsperando.add(vehicle);
    }
    
    public void aRepara(){
        Iterator<FichaVehiculo> it = vehiculosEsperando.iterator();
        while(it.hasNext()){
            FichaVehiculo aux = it.next();
            vehiculosReparando.add(aux);
            it.remove();
        }
    }
    
    public void mostrarListas(){
        mostrarEspera();
        mostrarReparando();
    }
    
    public void mostrarEspera(){
        Iterator<FichaVehiculo> it = vehiculosEsperando.iterator();
        while(it.hasNext()){
            System.out.println("En espera: "  + it.next());
        }
    }
    public void mostrarReparando(){
        Iterator<FichaVehiculo> it = vehiculosReparando.iterator();
        while(it.hasNext()){
            System.out.println("En reparacion: " + it.next());
        }
    }
    
    
    
    
}
