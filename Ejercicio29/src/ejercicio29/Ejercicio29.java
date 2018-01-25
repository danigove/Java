package ejercicio29;

public class Ejercicio29 {
    
    private static int[][] matriz;
    
    public static void main(String[] args) {
        inicializarMatriz();
        mostrarMatriz();
        mostrarAltoyBajo();
    }
    
    public static void inicializarMatriz(){
        int[][] aux = new int[6][10];
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                aux[i][j]=(int)(Math.random()*1001);
            }
        }
        matriz=aux;
    }
    public static void mostrarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ ", ");
            }
            System.out.println("");
        }
    }
    public static void mostrarAltoyBajo(){
        int masAlto=0;
        int masAltoX=0;
        int masAltoY=0;
        int masBajo=1000;
        int masBajoX=0;
        int masBajoY=0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]<masBajo){
                    masBajo=matriz[i][j];
                    masBajoX=i;
                    masBajoY=j;
                }
                if(matriz[i][j]>masAlto){
                    masAlto=matriz[i][j];
                    masAltoX=i;
                    masAltoY=j;
                }
            }
        }
        System.out.println("El mas alto es " + masAlto + " y esta en la posicion" + "[" + masAltoX + "][" + masAltoY+"]");
        System.out.println("El mas bajo es " + masBajo + " y esta en la posicion" + "[" + masBajoX + "][" + masBajoY+"]");
    }
}
