package ejerciciohashmap16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Tesauro {
    
    private HashMap<String, String> diccionario = new HashMap<String, String>();
    
    public Tesauro(){
        
    }

    public void anadirSinonimo(String a, String b){
        if(diccionario.get(a)==null){
        diccionario.put(a, b);
        }else{
            diccionario.put(a, diccionario.get(a).concat(" " + b));
        }
    }
    
    public void borrarSinonimo(String borrar){
        Iterator it = diccionario.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry aux = (Map.Entry)it.next();
            if(aux.toString().contains(borrar)){
                aux.setValue(aux.getValue().toString().replaceAll(borrar, ""));
                System.out.println(aux);
            }
        }
    }
    
    public void mostrarSinonimos(){
        Iterator it = diccionario.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pareja = (Map.Entry)it.next();
            //pareja.setValue(pareja.toString().replaceAll("=", ""));
            System.out.println(pareja);
            }
        }
    

}
