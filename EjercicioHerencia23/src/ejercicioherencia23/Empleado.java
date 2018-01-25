package ejercicioherencia23;

public class Empleado {
    
    protected double sueldo;
    
    public Empleado(double sueldo){
        if(this.getClass().toString().replace("class ejercicioherencia23.", "").equals("Encargado")){
        this.sueldo = sueldo + sueldo*0.1;
        }else{
            this.sueldo = sueldo;
        }
    }    
    
    public String mostrar(){
        return "El " +this.getClass().toString().replace("class ejercicioherencia23.", "") + "cobra " + this.sueldo;
    }
}
