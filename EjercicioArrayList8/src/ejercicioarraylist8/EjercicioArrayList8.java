package ejercicioarraylist8;

public class EjercicioArrayList8 {

    public static void main(String[] args) {
        gestionaAgenda();
    }
    
    public static void gestionaAgenda(){
        Persona p1 = new Persona("49045122Z", "Daniel"); 
        Persona p3 = new Persona("49045122Z", "Paco"); 
        Persona p2 = new Persona("42434459T", "Loring"); 
    
        Agenda ag = new Agenda();
        
        ag.añadePersona(p1);
        ag.añadePersona(p2);
        ag.borraPersona("49045122Z");
        ag.borraPersona("49045122Z");
        ag.borraPersona("29045122Z");
        ag.añadePersona(p1);
        ag.buscaPersona("49045122Z");
        ag.buscaPersona("49045132Z");
        ag.muestraListaPersona(); 
    }
}
