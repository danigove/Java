package examen3evaluacion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class Examen3Evaluacion {
    
    private static List<Animal> listaAni;
    private static ArrayList<Boton> listaBot;
    private static TextArea texto;
    
    public static void main(String[] args) {
        inicializarAnimales();
//        mostrarAnimales();
        inicializarBotones();
        Collections.sort(listaBot);
//        mostrarBotones();
        
        //GUI 
        JFrame frame = new JFrame("Examen tercera Evaluacion");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //frame.setPreferredSize(new Dimension(600,400));
        frame.setVisible(true);
        
        
        JPanel botoneraAni = new JPanel(new FlowLayout());
      //  botoneraAni.setPreferredSize(new Dimension(100,400));
        botoneraAni.setVisible(true);
        
        texto = new TextArea();
        JScrollBar barra = new JScrollBar();
        texto.setSize(new Dimension(400,400));
        JPanel panelPri = new JPanel(new BorderLayout());
        panelPri.setVisible(true);
        panelPri.setPreferredSize(new Dimension(600,400));
        panelPri.add(botoneraAni,BorderLayout.SOUTH);
        panelPri.add(texto);
        
        
        
        //Pone botones en botoneraAni
        for (int i = 0; i < listaBot.size(); i++) {
            botoneraAni.add(listaBot.get(i));
        }
        listaBot.get(0).addMouseListener(new MiRatonReceptor());
        listaBot.get(1).addMouseListener(new MiRatonReceptor());
        listaBot.get(2).addMouseListener(new MiRatonReceptor());
        listaBot.get(3).addMouseListener(new MiRatonReceptor());
        listaBot.get(4).addMouseListener(new MiRatonReceptor());
        listaBot.get(5).addMouseListener(new MiRatonReceptor());

        frame.setContentPane(panelPri);
        frame.pack();
        
        
        
//        No se donde colocar el try catch para que me pille la excepcion lanzada desde un evento de raton.        
//        try{
//            //No se como clicar un boton desde la maquina ahora mismo.
//        }catch(IllegalStateException e){
//            System.out.println("No se puede clicar en el perro");
//        }
        
        
    }
 
    // Clase Interna para eventos del raton.
    public static class MiRatonReceptor extends MouseAdapter{
        
        @Override
        public void mouseClicked(MouseEvent e){
            if(e.getButton()==1){
                texto.append(e.getSource().toString() + " ---> IZQUIERDA \n");
            }else if(e.getButton()==3){
                texto.append(e.getSource().toString() + " ---> DERECHA \n");
            }else if(e.getButton()==2){
                if(e.getSource().toString().equals("Perro")){
                    throw new IllegalStateException("No se puede clicar con el central en el perro");
                }else{
                texto.append(e.getSource().toString() + " ---> CENTRAL \n");
                }
            }
        }
        
        @Override
        public void mouseEntered(MouseEvent e){
            if(e.getSource().toString().equals("Perro")){
                texto.append("Un perro se acerca \n");
            }
        }
        @Override
        public void mouseExited(MouseEvent e){
            if(e.getSource().toString().equals("Perro")){
                texto.append("Un perro se aleja \n");
            }
        }
    }
   
    // Inicializa objetos animales
    public static void inicializarAnimales(){
        listaAni = new LinkedList<>();
        listaAni.add(new Animal("Gato"));
        listaAni.add(new Animal("Perro"));
        listaAni.add(new Animal("Raton"));
        listaAni.add(new Animal("Leon"));
        listaAni.add(new Animal("Conejo"));
        listaAni.add(new Animal("Ornitorrinco"));
      
    }
    
    // Inicializa los botones
    public static void inicializarBotones(){
        listaBot = new ArrayList<>();
        for (int i = 0; i < listaAni.size(); i++) {
           listaBot.add(new Boton(listaAni.get(i).getNombre()));
        }
    }
    
    // Metodo auxiliar creado para comprobar si los animales estaban bien creados
    public static void mostrarAnimales(){
        for (int i = 0; i < listaAni.size(); i++) {
            System.out.println(listaAni.get(i));
        }
    }
    
    //Metodo auxiliar creado para comprobar si la ordenacion de los botones esta bien hecha
    public static void mostrarBotones(){
        System.out.println("-----");
        for (int i = 0; i < listaBot.size(); i++) {
            System.out.println(listaBot.get(i).toString());
        }
    }
            
    
}
