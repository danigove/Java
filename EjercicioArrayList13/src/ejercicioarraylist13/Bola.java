package ejercicioarraylist13;

public class Bola {
    
    private Color color;
    
    public Bola(){
        inicializarColor();
    }
    
    private void inicializarColor(){
        int a = (int) (Math.random()*2 +1);
        if(a == 1){
            color = Color.BLANCO;
        }else if(a == 2){
            color = Color.NEGRO;
        }else{
            System.out.println("Hay algo mal");
        }
        
    }
    
    public Color getColor(){
        return color;
    }
    public String getColorString(){
        return color.toString();
    }
    public String toString(){
        return "La bola es " + color;
    }
    public boolean esBlanca(){
        return color.equals(Color.BLANCO);
    }
    public boolean esNegro(){
        return color.equals(Color.NEGRO);
    }
    
}
