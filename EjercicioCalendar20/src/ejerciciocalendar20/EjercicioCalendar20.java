package ejerciciocalendar20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EjercicioCalendar20 {

    public static void main(String[] args) {

        Calendar c1 = new GregorianCalendar().getInstance();
        Calendar c2 = new GregorianCalendar().getInstance();
        c2.add(Calendar.DAY_OF_MONTH, 4);
        
        diferenciaFechas(c1, c2);
        
    }
    
    public static void diferenciaFechas(Calendar c1, Calendar c2){
        if(c1.compareTo(c2)==0){
            System.out.println("Son fechas identicas");
            calcularDiferenciaFechas(c1, c2);
        }else if(c1.compareTo(c2)<0){
            System.out.println("La segunda fecha es mayor que la primera");
            calcularDiferenciaFechas(c2, c1);
        }else if(c1.compareTo(c2)>0){
            System.out.println("La primera fecha es mayor que la segunda");
            calcularDiferenciaFechas(c1, c2);        }
       
    }
    
    public static void calcularDiferenciaFechas(Calendar c1, Calendar c2){
           long a = c1.getTimeInMillis() - c2.getTimeInMillis();
           
           int segundos3 = (int)(a/1000);
           a = a%1000;
           int minutos3 = (int)(segundos3/60);
           segundos3 = segundos3%60;
           int horas3 = minutos3/60;
           minutos3 = minutos3%60;
           int dias = horas3/24;
           horas3 = horas3%24;
           
           System.out.println("La diferencia es: " + dias + " dias, " + horas3 + " horas, "  + minutos3 + " minutos, " + segundos3 + " segundos y " + a + " milisengudos.");
        
    }
    
}
