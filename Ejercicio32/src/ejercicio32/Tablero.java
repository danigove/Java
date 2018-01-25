package ejercicio32;

public class Tablero {

    private Casilla[][] casillas = new Casilla[3][3];

    public Tablero() {
        inicializarTablero();
    }

    public void inicializarTablero() {
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = new Casilla();
            }

        }
    }
    public void representarTablero() {
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                if(j==casillas[i].length-1){
                System.out.print("|" + casillas[i][j].getCont()+ "| \n");
                }else{
                    System.out.print("|" + casillas[i][j].getCont() );
                }
            }
            System.out.println("-------");
        }
    }
    public void cambiarContCasilla(int x, int y, String cad){
        casillas[x-1][y-1].setCont(cad);
    }
    public boolean getContCasilla(int x, int y){
        return (casillas[x-1][y-1].getCont().equals(" "));
    }
    public String getStringCasilla(int x, int y){
        return (casillas[x][y].getCont());
    }
}
