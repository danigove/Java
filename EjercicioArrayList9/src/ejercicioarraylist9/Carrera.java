package ejercicioarraylist9;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrera {
    
    private ArrayList<Atleta> atletas;
    
    public Carrera(){
        atletas = new ArrayList<Atleta>();
        menu();
    }
 
    public void menu(){
        Scanner sc = new Scanner(System.in);
        int aux;
        do{
        System.out.println("1. Añadir un atleta. ");
        System.out.println("2. Listado de atletas con el tiempo total empleado en las 3 pruebas.");
        System.out.println("3. Borrar todos los atletas cuyo tiempo sea inferior al tiempo medio de todos.");
        System.out.println("4. Listado de atletas seleccionados ordenados por tiempo y prueba.");
        System.out.println("5. Listado de ganadores (Sumando todos los tiempos).");
        System.out.println("6. Buscar un atleta (por nombre o por dorsal)");
        System.out.println("7. Salir.");
        System.out.print("Introduzca opcion a elegir: ");
        aux = sc.nextInt();
        
        
        switch (aux){
            case 1: anadirAtleta();
                   break;
            case 2: listadoAtletasTiempoTotal();
                break;
            case 3: borrarAtletasTiempoInferior();
                break;
            case 4: listadoAtletasOrdenadoTiempoPrueba();
                break;
            case 5: listadoGanadores();
                break;
            case 6: buscarAtleta();
                break;
            case 7: System.out.println("Saliendo del menu...");
                break;
            default: System.out.println("Opcion no permitida.");    
                break;
        }   
        }while(aux!=7);
    }
    
    public void anadirAtleta(){
        atletas.add(new Atleta());
    }
    public void listadoAtletasTiempoTotal(){
        for (int i = 0; i < atletas.size(); i++) {
            System.out.printf("El atleta en nº " + (i+1) + " se llama " +
            atletas.get(i).getNombre() + " con el dorsal: " + atletas.get(i).getDorsal() + 
            " y con el tiempo total de: " + (atletas.get(i).getTiempos(0)+atletas.get(i).getTiempos(1)+atletas.get(i).getTiempos(2)));
        }
    }
    public void borrarAtletasTiempoInferior(){
        listadoAtletasTiempoTotal();
        int tiempoMedio = 0;
        for (int i = 0; i < atletas.size(); i++) {
            tiempoMedio+=(atletas.get(i).getTiempos(0)+atletas.get(i).getTiempos(1)+atletas.get(i).getTiempos(2));
        }
        tiempoMedio = tiempoMedio/atletas.size();
        
        for (int i = 0; i < atletas.size(); i++) {
           if((atletas.get(i).getTiempos(0)+atletas.get(i).getTiempos(1)+atletas.get(i).getTiempos(2)) < tiempoMedio){
               atletas.remove(i);
           }
        }
        listadoAtletasTiempoTotal();
    }
    public void listadoAtletasOrdenadoTiempoPrueba(){
        Atleta[] ganadoresNatacion = new Atleta[3];
        Atleta[] ganadoresCiclismo = new Atleta[3];
        Atleta[] ganadoresCorrer = new Atleta[3];
        
        Atleta atletaAux = null;
        int loco = 0;
        
        ArrayList<Atleta> atletasAux = atletas;
        
        for (int i = 0; i < ganadoresNatacion.length ; i++) {
            for (int j = 0; j < atletasAux.size(); j++) {
                if(atletaAux.getTiempos(0)>atletasAux.get(j).getTiempos(0)){
                    atletaAux=atletasAux.get(j);
                    loco = j;
                }
            }
            ganadoresNatacion[i]=atletaAux;
            atletasAux.remove(loco);
            atletaAux = null;
        }
        
        atletasAux = atletas;
         
        for (int i = 0; i < ganadoresCiclismo.length ; i++) {
            for (int j = 0; j < atletasAux.size(); j++) {
                if(atletaAux.getTiempos(1)>atletasAux.get(j).getTiempos(1)){
                    atletaAux=atletasAux.get(j);
                    loco = j;
                }
            }
            ganadoresNatacion[i]=atletaAux;
            atletasAux.remove(loco);
            atletaAux = null;
        }
        
        atletasAux = atletas;
        
        for (int i = 0; i < ganadoresCorrer.length ; i++) {
            for (int j = 0; j < atletasAux.size(); j++) {
                if(atletaAux.getTiempos(2)>atletasAux.get(j).getTiempos(2)){
                    atletaAux=atletasAux.get(j);
                    loco = j;
                }
            }
            ganadoresNatacion[i]=atletaAux;
            atletasAux.remove(loco);
            atletaAux = null;
        }
    }
    public void listadoGanadores(){
        int podio=3;
        int loco =0;
        Atleta[] ganadores = new Atleta[3];
        ArrayList<Atleta> arrayAuxiliar = atletas;
        Atleta aux = null;
        for (int i = 0; i < ganadores.length; i++) {
            for (int j = 0; j < arrayAuxiliar.size(); j++) {
                if(aux.getTiempos(j)<arrayAuxiliar.get(i).getTiempos(j)){
                    aux = arrayAuxiliar.get(i);
                    loco = j;
                }
            }
            ganadores[i]=aux;
            aux = null;
            arrayAuxiliar.remove(loco);
        }   
        
        for (int i = 0; i < ganadores.length; i++) {
            System.out.println(ganadores[i]);
        }
    }
    public void buscarAtleta(){
        Scanner sc = new Scanner(System.in);
        String aux = "";
        System.out.print("Introduzca el nombre o el dorsal del atleta: ");
        aux = sc.next();
        boolean comprobar = true;
        for (int i = 0; i < aux.length(); i++) {
            if(Character.isDigit(aux.charAt(i))){
                
            }else{
                comprobar = false;
                break;
            }
        }
        if(comprobar){
            convertirAInt(aux);
            buscarPorDorsal(convertirAInt(aux));
        }else{
            buscarPorNombre(aux);
        }
    }


    private int convertirAInt(String a){
        int re = Integer.parseInt(a);
        return re;
    }
    private void buscarPorDorsal(int a){
        for (int i = 0; i < atletas.size(); i++) {
            if(atletas.get(i).getDorsal()==a){
                System.out.println("Se ha encontrado al atleta con el dorsal: " + a);
                System.out.println("El atleta es " + atletas.get(i).getNombre() + " con el dorsal " + atletas.get(i).getDorsal());
                break;
            }
        }
    }
    private void buscarPorNombre(String a){
        for (int i = 0; i < atletas.size(); i++) {
           if(atletas.get(i).getNombre().equals(a)){
               System.out.println("Se ha encontrado al atleta con el nombre: " + a);
               System.out.println("El atleta es " + atletas.get(i).getNombre() + " con el dorsal " + atletas.get(i).getDorsal());
               break;
           }
        }
    }
}
