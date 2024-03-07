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

public class MarioB2 extends JFrame {

	
	public MarioB2() {
		
		this.setVisible (true);
		this.setSize(870,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Ventana");
		//this.setMinimumSize(new Dimension(250,250));
		//this.setMaximumSize(new Dimension(750,750));
		this.setOpacity(1);
		this.setResizable(true);
		//this.setLocation(200,200);
		this.setLocationRelativeTo(null);
		
		//this.iniciarComponentes();

	
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		//FONDO
		g2d.setColor(Color.decode("#345CFA"));
		g2d.fillRect(0, 0, 1100,900);
		
		//NUBES
		
		//S
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillRect(290, 545, 130, 40);
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillArc(245 ,545, 90, 40, 90, 180);
		//N
		g2d.setColor(Color.white);
		g2d.fillRect(290, 540, 130, 40);
		g2d.setColor(Color.white);
		g2d.fillArc(245 ,540, 90, 40, 90, 180);	
		
		//S
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillRect(80, 595, 180, 40);
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillArc(215,595, 90, 40, -90, 180);
		//N
		g2d.setColor(Color.white);
		g2d.fillRect(80, 590, 180, 40);
		g2d.setColor(Color.white);
		g2d.fillArc(215,590, 90, 40, -90, 180);
		
		//S
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillRect(290, 640, 130, 40);
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillArc(245 ,640, 90, 40, 90, 180);	
		//N
		g2d.setColor(Color.white);
		g2d.fillRect(290, 635, 130, 40);
		g2d.setColor(Color.white);
		g2d.fillArc(245 ,635, 90, 40, 90, 180);	
		
		//PISO
		g2d.setColor(Color.decode("#9E8006"));
		g2d.fillRect(0, 700, 1100,100);
				
		g2d.setColor(Color.decode("#7EA847"));
		g2d.fillRect(0, 680, 1100,15);
		g2d.setColor(Color.decode("#6C5703"));
		g2d.fillRect(0, 695, 1100,5);
		
		
		//MONTAÑAS
		
		//s
		g2d.setColor(Color.decode("#9CB8D2"));
		g2d.fillRect(28, 380, 155, 300);
		g2d.setColor(Color.decode("#9CB8D2"));
		g2d.fillArc(28,303, 155, 155, 0, 180);
		//m
		g2d.setColor(Color.decode("#B7D9F9"));
		g2d.fillRect(18, 380, 155, 300);
		g2d.setColor(Color.decode("#B7D9F9"));
		g2d.fillArc(18,303, 155, 155, 0, 180);
		
		//s
		g2d.setColor(Color.decode("#9CB8D2"));
		g2d.fillRect(515, 280, 155, 400);
		g2d.setColor(Color.decode("#9CB8D2"));
		g2d.fillArc(515,203, 155, 155, 0, 180);
		//m		
		g2d.setColor(Color.decode("#B7D9F9"));
		g2d.fillRect(505, 280, 155, 400);
		g2d.setColor(Color.decode("#B7D9F9"));
		g2d.fillArc(505,203, 155, 155, 0, 180);
		
		//s
		g2d.setColor(Color.decode("#9CB8D2"));
		g2d.fillRect(360, 380, 155, 300);
		g2d.setColor(Color.decode("#9CB8D2"));
		g2d.fillArc(360,303, 155, 155, 0, 180);
		//m
		g2d.setColor(Color.decode("#B7D9F9"));
		g2d.fillRect(350, 380, 155, 300);
		g2d.setColor(Color.decode("#B7D9F9"));
		g2d.fillArc(350,303, 155, 155, 0, 180);
		
		//MANCHAS MONTAÑAS
		g2d.setColor(Color.white);
		g2d.fillOval(130, 355, 25, 40);
		g2d.setColor(Color.white);
		g2d.fillOval(130, 440, 25, 40);
		g2d.setColor(Color.white);
		g2d.fillOval(50, 500, 25, 40);
		
		g2d.setColor(Color.white);
		g2d.fillOval(450, 345, 25, 40);
		g2d.setColor(Color.white);
		g2d.fillOval(370, 400, 25, 40);
		g2d.setColor(Color.white);
		g2d.fillOval(370, 510, 25, 40);

		g2d.setColor(Color.white);
		g2d.fillOval(620, 260, 25, 40);
		g2d.setColor(Color.white);
		g2d.fillOval(530, 345, 25, 40);

		
		//NUBES1
		
		//S
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillRect(500, 485, 130, 40);
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillArc(465 ,485, 90, 40, 90, 180);	
		//N
		g2d.setColor(Color.white);
		g2d.fillRect(500, 480, 130, 40);
		g2d.setColor(Color.white);
		g2d.fillArc(455 ,480, 90, 40, 90, 180);	
		
		//S
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillRect(650, 455, 180, 40);
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillArc(770,455, 90, 40, -90, 180);
		//N
		g2d.setColor(Color.white);
		g2d.fillRect(650, 450, 180, 40);
		g2d.setColor(Color.white);
		g2d.fillArc(770,450, 90, 40, -90, 180);
		
		
		//PIEDRAS
		
		//s
		g2d.setColor(Color.decode("#2E4550"));
		g2d.fillRect(-30, 630, 155, 50);
		g2d.setColor(Color.decode("#2E4550"));
		g2d.fillArc(-30,560, 155, 155, 0, 180);	
		//p
		g2d.setColor(Color.decode("#639ACC"));
		g2d.fillRect(-40, 630, 155, 50);
		g2d.setColor(Color.decode("#639ACC"));
		g2d.fillArc(-40,560, 155, 155, 0, 180);
		
		//s
		g2d.setColor(Color.decode("#2E4550"));
		g2d.fillRect(570, 480, 200, 200);
		g2d.setColor(Color.decode("#2E4550"));
		g2d.fillArc(570,390, 200, 180, 0, 180);
		//p
		g2d.setColor(Color.decode("#639ACC"));
		g2d.fillRect(560, 480, 200, 200);
		g2d.setColor(Color.decode("#639ACC"));
		g2d.fillArc(560,390, 200, 180, 0, 180);
		
		//s
		g2d.setColor(Color.decode("#2E4550"));
		g2d.fillRect(370, 630, 200, 50);
		g2d.setColor(Color.decode("#2E4550"));
		g2d.fillArc(370,540, 200, 200, 0, 180);
		//p
		g2d.setColor(Color.decode("#639ACC"));
		g2d.fillRect(360, 630, 200, 50);
		g2d.setColor(Color.decode("#639ACC"));
		g2d.fillArc(360,540, 200, 200, 0, 180);
		

		
		//TUBERIA
		g2d.setColor(Color.black);
		g2d.fillRect(440, 575, 90 ,105);	
		g2d.setColor(Color.decode("#522DA8"));
		g2d.fillRect(445, 575, 80 ,100);
		g2d.setColor(Color.white);
		g2d.fillRect(475, 575, 10 ,100);	
		
		g2d.setColor(Color.black);
		g2d.fillRect(430, 535, 110 ,50);
		g2d.setColor(Color.decode("#522DA8"));
		g2d.fillRect(435, 540, 100 ,40);
		g2d.setColor(Color.white);
		g2d.fillRect(465, 540, 10 ,40);

	
		//NUBES
		
		//S
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillRect(-90, 405, 180, 40);
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillArc(40,405, 90, 40, -90, 180);
		//N
		g2d.setColor(Color.white);
		g2d.fillRect(-90, 400, 180, 40);
		g2d.setColor(Color.white);
		g2d.fillArc(40,400, 90, 40, -90, 180);
		
		//S
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillRect(220, 465, 130, 40);
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillArc(180,465, 90, 40, 90, 180);
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillArc(300,465, 90, 40, -90, 180);
		//N
		g2d.setColor(Color.white);
		g2d.fillRect(220, 460, 130, 40);
		g2d.setColor(Color.white);
		g2d.fillArc(180,460, 90, 40, 90, 180);
		g2d.setColor(Color.white);
		g2d.fillArc(300,460, 90, 40, -90, 180);
		
		//S
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillRect(790, 405, 15, 40);
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillArc(745,405, 90, 40, 90, 180);
		g2d.setColor(Color.decode("#C2D3E3"));
		g2d.fillArc(760,405, 90, 40, -90, 180);
		//N
		g2d.setColor(Color.white);
		g2d.fillRect(790, 400, 15, 40);
		g2d.setColor(Color.white);
		g2d.fillArc(745,400, 90, 40, 90, 180);
		g2d.setColor(Color.white);
		g2d.fillArc(760,400, 90, 40, -90, 180);
		
		//BLOQUES AMARILLOS	
		g2d.setColor(Color.BLACK);
		g2d.fillRect(740, 515, 200 ,45);		
		g2d.setColor(Color.decode("#F3FF1B"));
		g2d.fillRect(785, 520, 35 ,35);
		
		g2d.setColor(Color.decode("#F3FF1B"));
		g2d.fillRect(825, 520, 35 ,35);
		
		//BLOQUES	
		g2d.setColor(Color.black);
		g2d.fillRect(740, 515, 45 ,165);		
		g2d.setColor(Color.gray);
		g2d.fillRect(745, 600, 35 ,35);
			
		g2d.setColor(Color.gray);
		g2d.fillRect(745, 640, 35 ,35);
			
		g2d.setColor(Color.gray);
		g2d.fillRect(745, 560, 35 ,35);
			
		g2d.setColor(Color.gray);
		g2d.fillRect(745, 520, 35 ,35);
		
		//TUBERIA CHIQUITA
		g2d.setColor(Color.black);
		g2d.fillRect(810, 610, 60 ,70);	
		g2d.setColor(Color.decode("#522DA8"));
		g2d.fillRect(815, 615, 60 ,60);	
		g2d.setColor(Color.white);
		g2d.fillRect(840, 615, 10 ,60);	

		g2d.setColor(Color.black);
		g2d.fillRect(800, 575, 110 ,50);
		g2d.setColor(Color.decode("#522DA8"));
		g2d.fillRect(805, 580, 105 ,40);		
		g2d.setColor(Color.white);
		g2d.fillRect(835, 580, 10 ,40);	


	}
}