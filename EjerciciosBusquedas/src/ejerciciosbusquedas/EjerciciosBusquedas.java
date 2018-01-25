package ejerciciosbusquedas;

import java.util.Arrays;

public class EjerciciosBusquedas {

    private static int[] valores = {2,5,1,6,3,4,8,32};
    private static int[] valores2 = {2,5,1,6,3,4,8,32,21,62,23,73,21,46,28,98,423,49,23,71,51,422,638};
    private static int[] valores3 = {57,53,21,37,17,36,22,3,44,97,89,26,31,47,8,17,4};
    
    public static void main(String[] args) {
        ordenarArrays();
        busquedaLineal(valores, 4);
        busquedaDicotomica(valores, 4);
        busquedaLineal(valores2, 4);
        busquedaDicotomica(valores2, 4);
        busquedaLineal(valores3, 4);
        busquedaDicotomica(valores3, 4);
    }
    
    public static void ordenarArrays(){
        Arrays.sort(valores);
        Arrays.sort(valores2);
        Arrays.sort(valores3);
    }
    
    
    
    public static void busquedaLineal(int[] valores, int kkk){
        for (int i = 0; i < valores.length; i++) {
            if(valores[i]==kkk){
                System.out.print("(Lineal) Numero de iteraciones: " + i + " ");
                System.out.println(valores[i]);
            }
        }
    }
   
    public static void busquedaDicotomica(int[] valores, int kkk){
        boolean found = false;
        int izq = 0;
        int derecha = valores.length-1;
        int mitad=0;
        int contador=0;
        
        while(izq<=derecha && !found){
            mitad=(izq+derecha)/2;
            if(valores[mitad]==kkk){
                System.out.println("(Dicotomica) Numero de iteraciones: " + contador);
                found=true;
            }else if(valores[mitad]>kkk){
                    derecha=mitad-1;
                    contador++;
            }else{
                    izq = mitad + 1;
                    contador++;
            }
        }
    }
    
}
