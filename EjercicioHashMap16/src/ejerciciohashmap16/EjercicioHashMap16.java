package ejerciciohashmap16;

public class EjercicioHashMap16 {

    public static void main(String[] args) {
        
        Tesauro t = new Tesauro();
        
        t.anadirSinonimo("Paco", "Francisco");
        t.anadirSinonimo("Paco", "Paco2");
        t.mostrarSinonimos();
        t.borrarSinonimo("Francisco");

    }
    
}
