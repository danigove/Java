package ejerciciolinkedlist15;

public class EjercicioLinkedList15 {

    public static void main(String[] args) {
        
        GestionReparaciones gr = new GestionReparaciones();
        FichaVehiculo fv1 = new FichaVehiculo("Citroen saxo", "00001CA", "2 Mayo");
        FichaVehiculo fv2 = new FichaVehiculo("Seat Panda", "00002CA", "3 Mayo");
        FichaVehiculo fv3 = new FichaVehiculo("Volswagen Polo", "000004CA", "4 Mayo");
        
        gr.anadeVehiculo(fv1);
        gr.anadeVehiculo(fv2);
        gr.anadeVehiculo(fv3);
        gr.mostrarListas();
        gr.aRepara();
        gr.mostrarListas();
    }
    
}
