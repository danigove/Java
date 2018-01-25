package gui18mayo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI18Mayo {

    public static void main(String[] args) {

        JFrame jf1 = new JFrame("Ventana Prueba");
        JPanel jp1 = (JPanel) jf1.getContentPane();
        JButton jb1 = new JButton("Prueba Centro");
        JButton jb2 = new JButton("Prueba Norte");
        JButton jb3 = new JButton("Prueba Sur");
        JButton jb4 = new JButton("Prueba Este");
        JButton jb5 = new JButton("Prueba Oeste");
        JLabel jl1 = new JLabel();
        
        jb2.setVisible(true);
        jb2.setBackground(Color.blue);
        jp1.setPreferredSize(new Dimension(480,360));
        
        jf1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jp1.setOpaque(true);
        
        jl1.setOpaque(true);
        jl1.setBackground(Color.red);
        //jp1.add(jl1, BorderLayout.EAST);
        jp1.add(jl1, BorderLayout.CENTER);
        jp1.add(jb2, BorderLayout.NORTH);
        jp1.add(jb3, BorderLayout.SOUTH);
        jp1.add(jb4, BorderLayout.EAST);
        jp1.add(jb5, BorderLayout.WEST);
         
        
        //jf1.setContentPane(releaseContentPane());
        jf1.setVisible(true);
        jf1.pack();
    }
    
    
    public static JPanel releaseContentPane(){
        JPanel j1 = new JPanel();
        j1.setPreferredSize(new Dimension(200,200));
        JButton jb = new JButton("Boton 1");
        j1.add(jb, BorderLayout.CENTER);
        
        return j1;
    }
    
}
