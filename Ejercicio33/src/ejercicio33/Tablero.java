package ejercicio33;

public class Tablero {
    
    private Casilla[][] casillas = new Casilla[4][5];
    
    public Tablero(){
        inicializarTablero();
        //mostrarTablero();
    }
    
    public int getFilas(){
        return casillas.length;
    }
    public int getColumnas(){
        return casillas[casillas.length].length;
    }
    public void inicializarTablero(){
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = new Casilla();
            }
        }
        setTesoro();
        setMinas();
    }
    public void setTesoro(){
        int x,y;
        x = (int)(Math.random()*4);
        y = (int)(Math.random()*5);
        casillas[x][y].setCont("!");
    }
    public void setMinas(){
        int contador=0;
        int x,y;
        do{
            x=(int)(Math.random()*4);
            y=(int)(Math.random()*5);
            if(casillas[x][y].getCont().equals(" ")){
                contador++;
                casillas[x][y].setCont("*");
            }
        }while(contador<7);
    }
    public String getPosicion(int x,int y){
        return casillas[x][y].getCont();
    }
    public void mostrarTablero(){
        for (int i = 0; i < casillas.length; i++){
            for (int j = 0; j < casillas[i].length; j++) {
                if(j!=casillas[i].length-1){
                    System.out.print("|" + casillas[i][j] );
                }else{
                    System.out.print("|" + casillas[i][j] + "|");
                }
            }
            
            System.out.println(" \n ");
    }
    
    }
}
