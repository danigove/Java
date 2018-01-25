package ejercicioarraylist10;

public class Entrada {
    
    private int codigo;
    private String tipo;
    private String NIF;
    private int numeroEntrada;
    
    private static int numeroEntradaActual = 0;
    
    public Entrada(int codigo, String nif){
        setCodigo(codigo);
        setTipo();
        setNIF(nif);
        setNumeroEntrada();
    }
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        if(codigo==01 || codigo==02 || codigo==03 || codigo==04){
            this.codigo=codigo;
        }else{
            System.err.println("Codigo no valido, introduciendo 00");
            this.codigo=00;
        }
    }
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(){
        switch (codigo){
            case 01: this.tipo="VIP";
                     break;
            case 02: this.tipo="PALCO";
                     break;
            case 03: this.tipo="RESERVADAS";
                     break;
            case 04: this.tipo="GALLINERO";
                     break;
            default: this.tipo="Non-valid ticket";
                     break;
        }
    }
    
    public static boolean comprobarNIF(String NIF){
        boolean com = true;
        if(NIF.length()==9){
             for (int i = 0; i < NIF.length()-1 ; i++) {
                 if(Character.isDigit(NIF.charAt(i))){
                 }else{
                     System.out.println("La posicion " + i + " no esta rellenada por un numero.");
                     com=false;
                     break;
                 }
           }
             if(Character.isAlphabetic(NIF.charAt(NIF.length()-1))){
             }else{
                 System.out.println("El ultimo elemento del NIF no es una letra.");
                 com = false;
             }
        }else{
                com=false;
                System.out.println("NIF no valido, no tiene longitud exacta 9");
            }
            return com;
        }
    
    public String getNIF(){
        return NIF;
    }
    public void setNIF(String NIF){
        if(comprobarNIF(NIF)){
            this.NIF=NIF;
        }else{
            System.err.println("Error: NIF no valido.");
        }
    }
    
    public int getNumeroEntrada(){
        return numeroEntrada;
    }
    public void setNumeroEntrada(){
        this.numeroEntrada=numeroEntradaActual++;
    }
    public static int getNumeroEntradaActual(){
        return numeroEntradaActual;
    }
            
    public String toString(){
        return "Entrada nº " + getNumeroEntrada() + " de tipo " + getTipo() + " a nombre de: " + getNIF();
    }
            
}
