package arrayobjetostemp;

public class ArrayObjetosTemp {
    
    

    public static void main(String[] args) {
        Temperatura[] temps = inicializarArrayTemp();
        mostrarTemp(temps);
        System.out.println(mostrarTempMedia(temps));
    }
    
    private static Temperatura[] inicializarArrayTemp(){
        
        Temperatura t1 = new Temperatura(1,18);
        Temperatura t2 = new Temperatura(2,20);
        Temperatura t3 = new Temperatura(3,28);
        Temperatura t4 = new Temperatura(4,38);
        Temperatura t5 = new Temperatura(5,38);
        Temperatura t6 = new Temperatura(6,42);
        Temperatura t7 = new Temperatura(7,46);
        Temperatura t8 = new Temperatura(8,36);
        Temperatura t9 = new Temperatura(9,38);
        Temperatura t10 = new Temperatura(10,11);
        Temperatura t11 = new Temperatura(11,18);
        Temperatura t12 = new Temperatura(12,19);
    
        Temperatura[] temperaturasAnua = {t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12};
        return temperaturasAnua;
    }
    
    public static void mostrarTemp(Temperatura[] temps){
        for (int i = 0; i < temps.length; i++) {
            System.out.println("La temperatura media del mes " + temps[i].getMes() + " es: " + temps[i].getTempC()+ " º C y " + temps[i].getTempF() + "º F");
        }
    }
    public static double mostrarTempMedia(Temperatura[] temps){
        double media=0;
        for (int i = 0; i < temps.length; i++) {
           media+=temps[i].getTempC();
        }
        media=media/temps.length;
        return media;
    }
}
