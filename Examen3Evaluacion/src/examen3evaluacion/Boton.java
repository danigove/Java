package examen3evaluacion;

import javax.swing.JButton;

public class Boton extends JButton implements Comparable{
    
    
    public Boton(String nombre){
        super(nombre);
    }

    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if(o instanceof Boton){
            Boton aux = (Boton) o;
            return -(aux.getText().compareTo(this.getText()));
        }else{
            return -1;
        }
    }
    
    @Override
    public String toString(){
        return getText();
    }
}
