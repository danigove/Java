package ejercicioherencia22;

public class Aula {
    
    protected String nombre;
    protected int num_pupitres;
    
    public Aula(String nombre, int num_pupitres){
        setNombre(nombre);
        setNumPupitres(num_pupitres);
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getNumPupitres(){
        return num_pupitres;
    }
    
    protected void setNombre(String nombre){
        this.nombre = nombre;
    }
    protected void setNumPupitres(int num_pupitres){
        this.num_pupitres = num_pupitres;
    }
    
    protected String mostrar(){
        String b = this.getClass().toString().replace("class ejercicioherencia22.", "");
        String a = "La clase " + b + " se llama " + getNombre() + " y cuenta con " + getNumPupitres()  + " pupitres ";
        return a;
    }
            
    
}
