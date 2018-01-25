package arrayobjetostemp;

public class Temperatura {
    
    private int mes;
    private double tempMediaCent;
    private double tempMediaFahre;
    
    public Temperatura(int mes, double gradosCent){
        setMes(mes);
        setTemp(gradosCent);
        setTempFahre();
    }
    public int getMes(){
        return mes;
    }
    public double getTempC(){
        return tempMediaCent;
    }
    public double getTempF(){
        return tempMediaFahre;
    }
    public void setMes(int mes){
        if(mes>=12 || mes<1){
            System.err.println("Error: El mes debe estar entre 1 y 12");
        }else{
            this.mes=mes;
        }
    }
    public void setTemp(double temp){
        this.tempMediaCent=temp;
    }
    public void setTempFahre(){
        this.tempMediaFahre=tempMediaCent*1.8 + 32;
    }
}
