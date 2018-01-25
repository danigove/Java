package pkg6febrero;

public class Main {

   private static int[] numeros = {4,12,34,51,2,4,9,33,12,10};
   private static int[] numeros2 = {5,4,45,234,6,3,2,6,9,11};
   
   private static final int MAXIMO = 10;
    
    public static void main(String[] args) {
        //media(numeros);
        //invertir(numeros);
        //milAleatorios();
        //mostrar(numeros);
        //rotarDerecha(numeros);
        //mostrar(frecuencias(5));
        NotaExamen ne = new NotaExamen();
        ne.inicializarAlumnos();
        //ne.preguntarNota();
        ne.mostrarNotas();
        //ordenarArrays(numeros, numeros2);
    }
    
    public static void mostrar(int[] numeros){
        mostrar(numeros,",");
    }
    public static void mostrar(Alumno[] Alumno){
        for (int i = 0; i < Alumno.length; i++) {
            System.out.println(Alumno[i] + ", " + Alumno[i].getNota());
            
        }
    }
    public static void mostrar(int[] numeros, char separador){
        mostrar(numeros,Character.toString(separador));        
    }
    public static void mostrar(int[] numeros, String separador){
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + separador + " ");
            
        }
        System.out.println("\n");
    }
    public static void invertir(int[] numeros){
        if(numeros.length==0 || numeros==null){
            return;
        }
        int[] aux = new int[numeros.length];
        
        for (int i = 0 ; i<= numeros.length-1 ; i++) {
            aux[i] = numeros[numeros.length-1-i];
            
        }
        mostrar(aux);
    }
    public static void media(double[] numeros){
        double aux=0;
        for (int i = 0; i < numeros.length; i++) {
            aux+=numeros[i];
        }
        System.out.println("total = " + aux + " entre " + (numeros.length ));
        
        aux =  aux/numeros.length;
        System.out.println(aux);
        
    }
    public static void milAleatorios(){
        int[] maximos = new int[10];
        int[] todos = inicializarMil();
        int aux=0;
        for (int i = 0; i < maximos.length; i++) {
            for (int j = 0; j < todos.length; i++) {
                if(aux<todos[j]){
                    aux = todos[j];
                }
            }
            maximos[i]=aux;
            mostrar(maximos);
        }
    }
    public static int[] inicializarMil(){
        int[] todos = new int[100];
        for (int i = 0; i < todos.length; i++) {
            todos[i] = (int)(Math.random()*100+1);
        }
        System.out.println("Elementos: " + todos.length);
        return todos;
    } 
    public static void elementosPares(int[] numeros){
        int contador=0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
            contador++;
            }
        }
        int[] pares = new int[contador];
        contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
                pares[contador]=numeros[i];
                contador++;
        }
            mostrar(numeros);
            mostrar(pares);
        }
    }
    public static void rotarDerecha(int[] numeros){
        int aux = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(i==0){
                aux = numeros[i];
            }else{
                numeros[i-1] = numeros[i];
            }
            
            if(i==numeros.length-1){
                numeros[i]=aux;
            }
        }
        mostrar(numeros);
    }
    public static int[] generarPares(){
        int[] pares = new int[MAXIMO];
        for (int i = 0; i < pares.length; i++) {
               pares[i] = siemprePar();   
        }
        return pares;
        
    } 
    private static int siemprePar(){
        int aux=0;
        do{
            aux = (int)(Math.random()*50+1);
        }while(aux%2!=0);
        return aux;
    }
    //Guarda los resultados del 1 al 5 en vez del 0 al 4                                                                                                                                                                        
    public static int[] frecuencias(int n){
        int[] aux = new int[100];
        for (int i = 0; i < aux.length; i++) {
            aux[i]=numAle(n);
        }
        int[] result = new int[n + 1];
        int contador=0;
        for (int i = 0; i <  result.length; i++) {
            for (int j = 0; j < aux.length; j++) {
                if(aux[j]==i){
                    contador++;
                }
            }
            result[i]=contador;
            contador=0;
        }
        return result;
    }
    private static int numAle(int n){
        return (int)(Math.random()*n+1);
    }
    
    private static void ordenarArrays(int[] a, int[] b){
        System.out.println(a.length + b.length);
        int[] c = new int[a.length + b.length ];
        System.out.println(c.length);
        int aux=0;
        for (int i = 0; i < c.length ; i++) {
               for (int j = 0; j < b.length  ; j++,aux++) {
                c[aux] = b[j];
            }
               aux=0;
              for (int j = 0; j < a.length ; j++,aux++) {
                c[aux] = a[j];
            }
        }
        mostrar(c);
    }
    
    public static void ordenar(int[] numeros){
    }
}
