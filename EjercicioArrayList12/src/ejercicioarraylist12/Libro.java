package ejercicioarraylist12;

public class Libro {

   private String titulo;
   private String autor;
   private int numPags;
   private TipoEstado estado;
   
   public Libro(String titulo, String autor, int numPags){
       setTitulo(titulo);
       setAutor(autor);
       setNumPags(numPags);
       estado = TipoEstado.NO_PRESTADO;
   }
   
   public void setTitulo(String titulo){
       this.titulo=titulo;
   }
   public String getTitulo(){
       return titulo;
   }
   public void setAutor(String autor){
       this.autor=autor;
   }
   public String getAutor(){
       return autor;
   }
   public void setNumPags(int numPags){
       this.numPags=numPags;
   }
   public int getNumPags(){
       return numPags;
   }
   public void prestar(){
       if(estado==TipoEstado.PRESTADO){
           System.err.println("Error: El libro actualmente esta prestado, no se puede volver a prestar.");
       }else{
           this.estado=TipoEstado.PRESTADO;
           System.out.println("Se ha devuelto sin problemas");
       }
   }
   public void devolver(){
       if(estado==TipoEstado.NO_PRESTADO){
           System.err.println("Error: El libro actualmente esta devuelto, no se puede volver a devolver.");
       }else{
           this.estado=TipoEstado.NO_PRESTADO;
           System.out.println("Se ha entregado sin problemas");
       } 
   }
   public TipoEstado getEstado(){
       return estado;
   }
   public boolean estaPrestado(){
       return estado==TipoEstado.PRESTADO;
   }
   
  public String toString(){
      return "Titulo: " + titulo + " Autor: " + autor + " numero de paginas " + numPags + " estado: " + estado;
  }
    
        
}
