import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MarioB extends JFrame {

	
	public MarioB() {
		
		this.setVisible (true);
		this.setSize(1100,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Ventana");
		//this.setMinimumSize(new Dimension(250,250));
		//this.setMaximumSize(new Dimension(750,750));
		this.setOpacity(1);
		this.setResizable(true);
		//this.setLocation(200,200);
		this.setLocationRelativeTo(null);
		
		//this.iniciarComponentes();
		//this.interes();
	
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		//FONDO
		g2d.setColor(Color.decode("#B6FFFF"));
		g2d.fillRect(0, 0, 1100,900);
		
		//PISO
		g2d.setColor(Color.decode("#6D3C11"));
		g2d.fillRect(0, 700, 1100,100);
		
		g2d.setColor(Color.decode("#B88B5C"));
		g2d.fillRect(0, 680, 1100,30);
		
		
		//ARBUSTO
		g2d.setColor(Color.decode("#005200"));
		g2d.fillArc(30, 580, 100, 100, 0, 380);
		g2d.fillArc(50, 535, 80, 80, 0, 380);
		g2d.fillArc(90, 570, 110, 110, 0, 380);

		//MURO AZUL
		g2d.setColor(Color.black);
		g2d.fillRect(365, 440, 210 ,240);
		g2d.setColor(Color.black);
		g2d.fillRect(345, 395, 200 ,285);		
		g2d.setColor(Color.decode("#7CDAF9"));
		g2d.fillRect(350, 400, 190 ,280);
		g2d.setColor(Color.BLACK);
		g2d.fillArc(358, 408, 25, 25, 0, 380);
		g2d.setColor(Color.gray);
		g2d.fillArc(360, 410, 20, 20, 0, 380);
		g2d.setColor(Color.BLACK);
		g2d.fillArc(510, 408, 25, 25, 0, 380);
		g2d.setColor(Color.gray);
		g2d.fillArc(512, 410, 20, 20, 0, 380);
		g2d.setColor(Color.BLACK);
		g2d.fillArc(510,650, 25, 25, 0, 380);
		g2d.setColor(Color.gray);
		g2d.fillArc(512, 652, 20, 20, 0, 380);
		
		//MURO ROSA
		g2d.setColor(Color.black);
		g2d.fillRect(275, 510, 210 ,170);		
		g2d.setColor(Color.black);
		g2d.fillRect(245, 475, 210 ,205);		
		g2d.setColor(Color.decode("#FFCCBD"));
		g2d.fillRect(250, 480, 200 ,200);
		g2d.setColor(Color.BLACK);
		g2d.fillArc(255, 485, 25, 25, 0, 380);
		g2d.setColor(Color.gray);
		g2d.fillArc(257, 487, 20, 20, 0, 380);
		g2d.setColor(Color.BLACK);
		g2d.fillArc(420, 485, 25, 25, 0, 380);
		g2d.setColor(Color.gray);
		g2d.fillArc(422, 487, 20, 20, 0, 380);
		g2d.setColor(Color.BLACK);
		g2d.fillArc(420,650, 25, 25, 0, 380);
		g2d.setColor(Color.gray);
		g2d.fillArc(422, 652, 20, 20, 0, 380);
		g2d.setColor(Color.BLACK);
		g2d.fillArc(255,650, 25, 25, 0, 380);
		g2d.setColor(Color.gray);
		g2d.fillArc(257, 652, 20, 20, 0, 380);
		
		//MURO VERDE		
		g2d.setColor(Color.black);
		g2d.fillRect(910, 475, 210 ,205);		
		g2d.setColor(Color.decode("#66CC67"));
		g2d.fillRect(915, 480, 200 ,200);
		g2d.setColor(Color.BLACK);
		g2d.fillArc(920, 485, 25, 25, 0, 380);
		g2d.setColor(Color.gray);
		g2d.fillArc(922, 487, 20, 20, 0, 380);
		g2d.fillArc(422, 487, 20, 20, 0, 380);
		g2d.setColor(Color.BLACK);
		g2d.fillArc(920,650, 25, 25, 0, 380);
		g2d.setColor(Color.gray);
		g2d.fillArc(922, 652, 20, 20, 0, 380);
		
		//TUBERIA
		g2d.setColor(Color.black);
		g2d.fillRect(690, 555, 115 ,125);	
		g2d.setColor(Color.decode("#F005200"));
		g2d.fillRect(695, 560, 105 ,120);	
		g2d.setColor(Color.decode("#40571A"));
		g2d.fillRect(705, 560, 20 ,120);
		g2d.setColor(Color.decode("#3C4E1D"));
		g2d.fillRect(725, 560, 10 ,120);
		g2d.setColor(Color.decode("#40571A"));
		g2d.fillRect(735, 560, 20 ,120);
		g2d.setColor(Color.decode("#3C4E1D"));
		g2d.fillRect(755, 560, 10 ,120);
		g2d.setColor(Color.decode("#40571A"));
		g2d.fillRect(770, 560, 20 ,120);
		g2d.setColor(Color.decode("#3C4E1D"));
		g2d.fillRect(785, 560, 10 ,120);
		g2d.setColor(Color.black);
		g2d.fillRect(680, 515, 135 ,50);
		g2d.setColor(Color.decode("#F005200"));
		g2d.fillRect(685, 520, 125 ,40);
		g2d.setColor(Color.decode("#40571A"));
		g2d.fillRect(695, 520, 20 ,40);
		g2d.setColor(Color.decode("#3C4E1D"));
		g2d.fillRect(715, 520, 20 ,40);
		g2d.setColor(Color.decode("#40571A"));
		g2d.fillRect(740, 520, 20 ,40);
		g2d.setColor(Color.decode("#3C4E1D"));
		g2d.fillRect(765, 520, 20 ,40);
		
		//CUBOS
		g2d.setColor(Color.black);
		g2d.fillRect(100, 350, 75 ,75);		
		g2d.setColor(Color.decode("#A96A43"));
		g2d.fillRect(105, 355, 65 ,65);
		g2d.setColor(Color.black);
		g2d.fillArc(110, 360, 8, 8, 0, 380);
		g2d.setColor(Color.black);
		g2d.fillArc(158, 360, 8, 8, 0, 380);
		g2d.setColor(Color.black);
		g2d.fillArc(110, 408, 8, 8, 0, 380);
		g2d.setColor(Color.black);
		g2d.fillArc(158, 408, 8, 8, 0, 380);

		g2d.setColor(Color.black);
		g2d.fillRect(380, 150, 145 ,75);		
		g2d.setColor(Color.decode("#A96A43"));
		g2d.fillRect(385, 155, 65 ,65);
		g2d.setColor(Color.decode("#A96A43"));
		g2d.fillRect(455, 155, 65 ,65);
		g2d.setColor(Color.black);
		g2d.fillArc(390, 160, 8, 8, 0, 380);
		g2d.setColor(Color.black);
		g2d.fillArc(390, 208, 8, 8, 0, 380);
		g2d.setColor(Color.black);
		g2d.fillArc(438, 160, 8, 8, 0, 380);
		g2d.setColor(Color.black);
		g2d.fillArc(438, 208, 8, 8, 0, 380);
		
		g2d.setColor(Color.black);
		g2d.fillArc(460, 160, 8, 8, 0, 380);
		g2d.setColor(Color.black);
		g2d.fillArc(460, 208, 8, 8, 0, 380);
		g2d.setColor(Color.black);
		g2d.fillArc(508, 160, 8, 8, 0, 380);
		g2d.setColor(Color.black);
		g2d.fillArc(508, 208, 8, 8, 0, 380);
		

		
		//int xPoints[]= {100,250,300};
		//int yPoints[]= {100,200,300};
	//	g2d.drawPolyline(xPoints, yPoints, 3);
		
		//g2d.setColor(Color.red);
		
		//g2d.fillPolygon(xPoints, yPoints, 3);
		
		//g2d.setFont(new Font("Roboto", Font.BOLD, 40));;
		
		//g2d.drawString("hola", 250, 100);
		
		//g2d.setStroke(new BasicStroke(10));
		
		//g2d.drawRoundRect(420, 150, 200, 150, 10, 10);
		
		try {

			BufferedImage image = ImageIO.read(new File("src/mario (1).png"));
			
			g2d.drawImage(image, 555, 534, null);
								
			BufferedImage image1 = ImageIO.read(new File("src/planta.png"));
					
			g2d.drawImage(image1, 680, 386, null);
			
			}	catch(IOException e) {
			
				e.printStackTrace();

				
			}
	}
}