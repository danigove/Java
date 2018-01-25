package ejerciciolinkedlist15;

public class FichaVehiculo {
    
    private String modelo;
    private String matricula;
    private String instanteEntrada;
    
    
    public FichaVehiculo(String modelo, String matricula, String instanteEntrada){
        setModelo(modelo);
        setMatricula(matricula);
        setInstanteEntrada(instanteEntrada);
    }
    
    public String getModelo(){
        return modelo;
    }
    private void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getMatricula(){
        return matricula;
    }
    private void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public String getInstanteEntrada(){
        return instanteEntrada;
    }
    private void setInstanteEntrada(String instante){
        this.instanteEntrada=instante;
    }
    
    public String toString(){
        return "Coche modelo: " + getModelo() + " con matricula " + getMatricula() + " y entro el: " + getInstanteEntrada();
    }
}
