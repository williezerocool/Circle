/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author kendrabooker
 */
public class Circle extends Canvas{

    public void paint( Graphics g )
    {   
        g.setColor(Color.red);
        g.fillOval(50, 100, 100, 100);
    }
    
    
    public static void main(String[] args) {
        
        
        JFrame win = new JFrame("Circles");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Circle canvas = new Circle();
        win.add( canvas );
        win.setVisible(true);

    }
    
}
