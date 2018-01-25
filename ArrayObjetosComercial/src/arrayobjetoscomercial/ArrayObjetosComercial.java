package arrayobjetoscomercial;

public class ArrayObjetosComercial {

   
    public static void main(String[] args) {
        Comercial[] comerciales = inicializarComerciales();
        for (int i = 0; i < comerciales.length; i++) {
            comerciales[i].mostrarVentasTotales();
            comerciales[i].comisiones();
            System.out.println(comerciales[i].mejorDia());
            
        }
    }
    
    public static Comercial[] inicializarComerciales(){
        Comercial c1 = new Comercial("Pepe");
        Comercial c2 = new Comercial("Paco");
        Comercial c3 = new Comercial("Luis");
        Comercial c4 = new Comercial("Fran");
        Comercial c5 = new Comercial("Jose");
        
        Comercial[] comerciales = {c1,c2,c3,c4,c5};
        
        return comerciales;
    }
    
}
