package ordenacionvector500;

public class OrdenacionVector500 {

     public static int[] vectorBurb = new int[500];
     public static int[] vectorSelec = new int[500];
     public static int[] vectorInserc = new int[500];
    
    public static void main(String[] args) {
        inicializarArrayBurb();
        inicializarArraySelec();
        inicializarArrayInserc();
        metodoBurbuja(vectorBurb);
        metodoSeleccion(vectorSelec);
        metodoInsercion(vectorInserc);
        metodoBurbujaMayorMenor(vectorBurb);
        metodoSeleccionMayorMenor(vectorSelec);
        metodoInsercionMayorMenor(vectorInserc);
        mostrar(vectorBurb);
        mostrar(vectorSelec);
        mostrar(vectorInserc);
    }
    
    public static void inicializarArrayBurb(){
        for (int i = 0; i < vectorBurb.length; i++) {
           vectorBurb[i]=(int)(Math.random()*1000 + 1);
        }
    }
    public static void inicializarArraySelec(){
        for (int i = 0; i < vectorBurb.length; i++) {
           vectorSelec[i]=(int)(Math.random()*1000 + 1);
        }
    }
    public static void inicializarArrayInserc(){
        for (int i = 0; i < vectorBurb.length; i++) {
           vectorInserc[i]=(int)(Math.random()*1000 + 1);
        }
    }
    public static void metodoBurbuja(int[] vector){
        int aux;
        int contador=0;
        for (int i = 0; i < vector.length-1; i++) {
            contador++;
            for (int j = 0; j < vector.length-i-1; j++) {
                contador++;
               if(vector[j+1]<vector[j]){
                   aux=vector[j+1];
                   vector[j+1]=vector[j];
                   vector[j]=aux;
               }
            }
        }
        System.out.println("(Burbuja) El numero de iteraciones es: " + contador);
    }
    public static void metodoSeleccion(int[] vector){
      int menor,pos,tmp,contador=0;
        for (int i = 0; i < vector.length-1; i++) {
            menor=vector[i];
            pos=i;
            for (int j = i+1; j < vector.length; j++) {
                if(vector[j]<menor){
                    menor=vector[j];
                    pos=j;
                }
                contador++;
            }
            if(pos!=i){
                tmp=vector[i];
                vector[i]=vector[pos];
                vector[pos]=tmp;
            }
            contador++;
        }
        System.out.println("(Seleccion) El numero de iteraciones es: " + contador);
    }
    public static void metodoInsercion(int[] vector){
    int p, j;
    int aux;
    int contador=0;
    for (p = 1; p < vector.length; p++){ // desde el segundo elemento hasta
              aux = vector[p]; // el final, guardamos el elemento y
              j = p - 1; // empezamos a comprobar con el anterior
              while ((j >= 0) && (aux > vector[j])){ // mientras queden posiciones y el
                                                 // valor de aux sea menor que los
                vector[j + 1] = vector[j];       // de la izquierda, se desplaza a
                j--;                             // la derecha
              }
              vector[j + 1] = aux; // colocamos aux en su sitio
              contador++;
    }
        System.out.println("(Insercion) El numero de iteraciones es: " + contador );
    }
    public static void metodoBurbujaMayorMenor(int[] vector){
        int aux;
        int contador=0;
        for (int i = 0; i < vector.length-1; i++) {
            for (int j = 0; j < vector.length-i-1; j++) {
               if(vector[j+1]>vector[j]){
                   aux=vector[j+1];
                   vector[j+1]=vector[j];
                   vector[j]=aux;
               }
                contador++;
            }
        }
        System.out.println("(Burbuja) El numero de iteraciones es: " + contador);
    }
    public static void metodoSeleccionMayorMenor(int[] vector){
      int menor,pos,tmp,contador=0;
        for (int i = 0; i < vector.length-1; i++) {
            menor=vector[i];
            pos=i;
            for (int j = i+1; j < vector.length; j++) {
                if(vector[j]>menor){
                    menor=vector[j];
                    pos=j;
                }
                contador++;
            }
            if(pos!=i){
                tmp=vector[i];
                vector[i]=vector[pos];
                vector[pos]=tmp;
            }
            contador++;
        }
        System.out.println("(Seleccion) El numero de iteraciones es: " + contador);
    }
    public static void metodoInsercionMayorMenor(int[] vector){
    int p, j;
    int aux;
    int contador=0;
    for (p = 1; p < vector.length; p++){ // desde el segundo elemento hasta
              aux = vector[p]; // el final, guardamos el elemento y
              j = p - 1; // empezamos a comprobar con el anterior
              while ((j >= 0) && (aux > vector[j])){ // mientras queden posiciones y el
                                                 // valor de aux sea menor que los
                vector[j + 1] = vector[j];       // de la izquierda, se desplaza a
                j--;                             // la derecha
              }
              vector[j + 1] = aux; // colocamos aux en su sitio
              contador++;
    }
        System.out.println("(Insercion) El numero de iteraciones es: " + contador );
    }
    public static void mostrar(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if(i+1==nums.length){
                System.out.print(nums[i]+".");
                System.out.println("");
            }else{
                System.out.print(nums[i] + ", ");
            }
        }
    }
}
