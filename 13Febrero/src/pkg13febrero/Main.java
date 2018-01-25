package pkg13febrero;

public class Main {


    public static void main(String[] args) {
       //System.out.println(Dni.obtenerLetra(49045122));
       // Array20.inicializarBuscar();
       // TemperaturaMedia.representarTemps();
       //ArrayPrimos.pedirPrimos();
       //System.out.println(ArrayPrimos.esPrimo(13));
       /*Alumno a = new Alumno();
       System.out.println("La nota mas alta es: " + a.notaMasAlta());
       System.out.println("La nota mas baja es: " + a.notaMasBaja());
       a.representarAlumno();*/
       
       Alumno[] alum = new Alumno[5];
        for (int i = 0; i < alum.length; i++) {
            alum[i] = new Alumno();
        }
        for (int i = 0; i < alum.length; i++) {
            System.out.println("La nota media del alumno " + alum[i].nombreMayus() + " es " + alum[i].notaMedia());
        }
       
    }
    
}
