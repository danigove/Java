package ejercicioarraylist13;

public class EjercicioArrayList13 {

    private static Urna urna = new Urna();

    public static void main(String[] args) {

        cuantasBolas(10);

        System.out.println(urna.toString());
        System.out.println("-----------");
        urna.borrarBlancas();
        System.out.println(urna.toString());
    }
    
    public static void cuantasBolas(int bolas){
        for (int i = 0; i < bolas ; i++) {
            urna.meterBola(new Bola());
        }
    }
}
