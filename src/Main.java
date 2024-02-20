
import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
			
		
JFrame Login = new JFrame();

Login.setVisible (true);

Login.setSize(200,200);
		
Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

Login.setTitle("Mi ventana");

Login.setMinimumSize(new Dimension(250,250));
Login.setMaximumSize(new Dimension(750,750));
Login.setResizable(true);

//Ubicar en la pantalla
Login.setLocation(200,200);

//centrar
Login.setLocationRelativeTo(null);
}
}
