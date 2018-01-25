package arraybialumnos;

public class Curso {
    private static int MAXESTUDIANTES = 5;
    private static int MAXASIGNATURAS = 3;
    
    private Alumno[] alumnos;
    public int[][] notas;
    
    public Curso(){
        inicializarAlumnos();
        inicializarNotas();
    }
    public void inicializarAlumnos(){
        Alumno[] alms = new Alumno[5];
        alms[0]=new Alumno("Paco");
        alms[1]=new Alumno("Pepe");
        alms[2]=new Alumno("Luis");
        alms[3]=new Alumno("Jose");
        alms[4]=new Alumno("Dani");
        
        this.alumnos = alms;
    }
    public void inicializarNotas(){
        int[][] notas = new int[MAXESTUDIANTES][MAXASIGNATURAS];
        
        for (int i = 0; i < MAXESTUDIANTES ; i++) {
            for (int j = 0; j < MAXASIGNATURAS ; j++) {
                notas[i][j] =(int)(Math.random()*10+1);
            }
            
        }
        this.notas=notas;
    }
    public void mostrarNotas(){
           for (int i = 0; i < notas.length; i++) {
            System.out.print(alumnos[i].getNombre()+": ");

                for (int j = 0; j < notas[i].length; j++) {
                    if(j==notas[i].length-1){
                        System.out.print(notas[i][j] + ".");
                    }else{
                    System.out.print(notas[i][j] + ", ");
                    }
                }
                System.out.println("");
            }
        
    }
    public void mostrarSuspensos(){
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if(notas[i][j]<5){
                    System.out.print(alumnos[i].getNombre()+", ");
                    break;
                }
                
            }
            
        }
    }
}
