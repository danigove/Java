package ejercicio26;

public class Ejercicio26 {

    public static int[][] numes = new int[10][10];
    
    public static void main(String[] args) {
        inicializar();
    }
    
    public static void inicializar(){
        int contador =0 ;
        int[][] nums = new int[10][10];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = ++contador;
            }
        }
        numes=nums;
        mostrar();
    }
    
    public static void mostrar(){
        for (int i = 0; i < numes.length; i++) {
            for (int j = 0; j < numes[i].length; j++) {
                if(j==numes[i].length-1){
                    System.out.print(numes[i][j] + ".");
                }else{
                    System.out.print(numes[i][j] + ", ");
                }
            }
            System.out.println("");
        }
    }
}
