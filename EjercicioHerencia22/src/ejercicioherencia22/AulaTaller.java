package ejercicioherencia22;

public class AulaTaller extends Aula{
    
    protected int num_ord;
    
    public AulaTaller(String nombre, int num_pupitres, int num_ord){
        super(nombre, num_pupitres);
        setNumOrd(num_ord);
    }
    
    public int getNumOrd(){
        return num_ord;
    }
    protected void setNumOrd(int num_ord){
        this.num_ord = num_ord;
    }
    
    public String visualizar(){
        return super.mostrar() + " añadiendo tambien " + getNumOrd() + "ordenadores.";
    }
    
    
}
