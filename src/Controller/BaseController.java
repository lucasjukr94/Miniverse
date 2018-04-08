package Controller;

import javax.swing.*;

public class BaseController{
	public static void RenderFrame(){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	//Create and set up the window.
                JFrame frame = new JFrame("HelloWorldSwing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                //Add the ubiquitous "Hello World" label.
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
}
