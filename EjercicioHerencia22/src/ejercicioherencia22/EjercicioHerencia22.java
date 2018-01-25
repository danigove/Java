package ejercicioherencia22;

public class EjercicioHerencia22 {

    public static void main(String[] args) {
        
        Aula a1 = new Aula("1DAW", 30);
        AulaTaller at1 = new AulaTaller("1DAW", 30, 25);
        System.out.println(a1.mostrar());
        System.out.println(at1.visualizar());
        

    }
    
}
