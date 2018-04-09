package Controller;

import java.awt.Graphics;

import javax.swing.*;

public class BaseController extends JPanel{
	public static void RenderFrame(){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	//Create and set up the window.
                JFrame frame = new JFrame("HelloWorldSwing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                JLabel label = new JLabel("Hello World");
                frame.getContentPane().add(label);
            	
                //Display the window.
                frame.pack();
                frame.setVisible(true);
                
                frame.setSize(1200, 800);
                frame.setLocation(0, 0);
            }
        });
	}
	
	public void paint(Graphics g){
		
	}
}
