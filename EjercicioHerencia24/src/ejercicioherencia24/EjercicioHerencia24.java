package ejercicioherencia24;

public class EjercicioHerencia24 {

    public static void main(String[] args) {
        CuentaAhorro miCuenta = new CuentaAhorro("Daniel", 1000.0, 4);
        System.out.println(miCuenta.getInteres());
        miCuenta.reintegrar(240.0);
        System.out.println(miCuenta);
    }
    
}
