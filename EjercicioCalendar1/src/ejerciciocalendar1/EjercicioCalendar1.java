package ejerciciocalendar1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class EjercicioCalendar1 {

    public static void main(String[] args) {
        
        Calendar c1 = GregorianCalendar.getInstance();
        System.out.println("Fecha actual: " + c1.getTime().toLocaleString());
        
        c1.set(2000,Calendar.AUGUST,31);
        System.out.println("Fecha 31 agosto: " + c1.getTime().toLocaleString());
        
        c1.set(Calendar.MONTH,13);
        System.out.println("Fecha 13 meses mas: " + c1.getTime().toLocaleString());
        
        //Añadir 13 meses
        c1.set(2000, Calendar.AUGUST, 31);
        c1.add(Calendar.MONTH, 13);
        System.out.println("Fecha 13 meses mas " + c1.getTime().toGMTString());
        
        //Uso de Roll
        c1.roll(Calendar.HOUR, 25); //Añadir 25 horas
        System.out.println("Fecha 25 horas mas: " + c1.getTime().toLocaleString());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss");
        
        System.out.println("Fecha formateada: " + sdf.format(c1.getTime()));
        
    }
    
}
