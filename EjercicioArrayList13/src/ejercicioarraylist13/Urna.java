package ejercicioarraylist13;

import java.util.ArrayList;
import java.util.Iterator;

public class Urna {
   
    private ArrayList<Bola> urna;
    
    public Urna(){
        inicializarUrna();
    }
    
    public void inicializarUrna(){
        urna = new ArrayList<Bola>();
    }
    public void meterBola(Bola a){
        urna.add(a);
    }
    public Bola sacarBola(){
        Bola aux = null;
        int a = aleatoria(urna.size());
        aux = urna.get(a);
        urna.remove(urna.get(a));

        return aux;
    }
    private int aleatoria(int hasta){
        int a = (int)(Math.random()*hasta);
        return a;
    }
    public int blancas(){
        int contador = 0;
        
        for(Bola e: urna){
            if(e.esBlanca()){
                contador++;
            }
        }
        return contador;
    }
    public int negras(){
        int contador = 0;
        for(Bola e: urna){
            if(e.esNegro()){
                contador++;
            }
        }
        return contador;
    }
    public String toString(){
        Iterator<Bola> it = urna.iterator();
        String toStringUrna = "";
        while(it.hasNext()){
            Bola a = it.next();
            toStringUrna += a.toString()+ "\n";
        }
        return toStringUrna;
    }
    public void borrarBlancas(){
        Iterator<Bola> it = urna.iterator();
        Bola aux = null;
        while(it.hasNext()){
            aux = it.next();
            if(aux.esBlanca()){
                it.remove();
            }
        }
    }
    
}
