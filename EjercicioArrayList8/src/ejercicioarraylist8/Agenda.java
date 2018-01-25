package ejercicioarraylist8;

import java.util.ArrayList;

public class Agenda {
    
    private ArrayList<Persona> agenda;
    
    public Agenda(){
        this.agenda = new ArrayList<Persona>();
    }
    
    public void añadePersona(Persona p){
        boolean comp = true;
        for (int i = 0; i < agenda.size(); i++) {
            if(p.getDni().equals(agenda.get(i).getDni())){
                System.out.println("Hay un elemento de la clase persona en la agenda, no se pudo introducir.");
                comp=false;
                break;
            }
        }
        if(comp){
           agenda.add(p);
            System.out.println("Persona " +p.getNombre()+ " añadida con exito.");
        }else{
            System.out.println("No se pudo añadir.");
        }
    }
    public boolean borraPersona(String dni){
        boolean a = false;
        for (int i = 0; i < agenda.size(); i++) {
            if(agenda.get(i).getDni().equals(dni)){
                System.out.println("Persona encontrada, se procederá a eliminar");
                a=true;
                agenda.remove(agenda.get(i));
            }
        }
        if(a){
            System.out.println("Persona removida con exito");
        }else{
            System.out.println("Persona no encontrada.");
        }
        return a;
    }
    public boolean buscaPersona(String dni){
        boolean a = false;
        for (int i = 0; i < agenda.size(); i++) {
            if(agenda.get(i).getDni().equals(dni)){
                System.out.println("Persona encontrada, mostrando: ");
                System.out.println(agenda.get(i));
                a=true;
                break;
            }
        }
        if(a){
            
        }else{
            System.out.println("Persona con DNI " + dni + " no encontrada.");
        }
        return a;
    }
    public void muestraListaPersona(){
        for (int i = 0; i < agenda.size(); i++) {
                System.out.println((i+1) + ": " + agenda.get(i));
        }
    }
    
}
