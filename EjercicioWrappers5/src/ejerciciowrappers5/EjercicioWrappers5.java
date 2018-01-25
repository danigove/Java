package ejerciciowrappers5;

public class EjercicioWrappers5 {
    float f = 10;
    String aux="";
    Float g = new Float(50.5);
    

    public static void main(String[] args) {
    
    
    }
    
    public static void toString(Float f, String aux){
        aux = f.toString();
    }
    public static void floatValue(Float f, float t){
        t = f.floatValue();
    }
    public static void valueOf(String aux, Float f){
        aux = String.valueOf(f);
    }
    public static void valueOf(float f, Float t){
        t = Float.valueOf(f);
    }
    public static void toString(float f, String aux){
        aux=Float.toString(f);
    }
    public static void parseFloat(String aux, float t){
        t=Float.parseFloat(aux);
    }
}

