import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaLogin extends JFrame {

	public VentanaLogin() {
		
		this.setVisible (true);
		this.setSize(800,800);
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
		this.botones();
		
		
		}
	
	public void iniciarComponentes() {
		


		JPanel login = new JPanel();
		login.setBackground(Color.pink);
		login.setLayout(null);
	
		JLabel login_tag = new JLabel("Acceder", 0);
		login_tag.setSize(200,30);
		login_tag.setFont(new Font("Roboto", Font.BOLD, 20));
		login_tag.setLocation(150,310);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.white);
		login.add(login_tag);
		
		JLabel user_tag3 = new JLabel("Mi cuenta");
		user_tag3.setBounds(180,20,400,40);
		user_tag3.setFont(new Font("Roboto", Font.BOLD, 30));
		user_tag3.setForeground(Color.white);
		login.add(user_tag3);
		
		JLabel user_tag2 = new JLabel("Inicio de sesión");
		user_tag2.setBounds(150,80,400,40);
		user_tag2.setFont(new Font("Roboto", Font.BOLD, 25));
		user_tag2.setForeground(Color.black);
		login.add(user_tag2);
		
	
		JLabel user_tag = new JLabel("Nombre de usuario: ");
		user_tag.setBounds(100,120,200,40);
		user_tag.setFont(new Font("Arial", Font.BOLD, 15));
		login.add(user_tag);
		
		JTextField usr_field = new JTextField();
		usr_field.setBounds(100, 155, 300, 40);
		login.add(usr_field);
		
		//contraseña
		JLabel pwd_tag = new JLabel("Contraseña: ");
		pwd_tag.setBounds(100,195,200,40);
		pwd_tag.setFont(new Font("Arial", Font.BOLD, 15));
		login.add(pwd_tag);
		
		JPasswordField pwd_field = new JPasswordField();
		pwd_field.setBounds(100, 225, 300, 40);
		login.add(pwd_field);
		
		JCheckBox remember = new JCheckBox("Recordarme");
		remember.setBounds(100, 265, 150, 40);
		remember.setOpaque(false);
		login.add(remember);
		
		JLabel cuenta = new JLabel("No tienes cuenta?");
		cuenta.setBounds(180,350,300,40);
		cuenta.setFont(new Font("Arial", Font.BOLD, 15));
		login.add(cuenta);
		
		JLabel registro = new JLabel("Registrate", 0);
		registro.setSize(200,30);
		registro.setFont(new Font("Roboto", Font.BOLD, 20));
		registro.setLocation(150,385);
		registro.setOpaque(true);
		registro.setBackground(Color.white);
		login.add(registro);
		
		//imagenes
		JLabel logo = new JLabel();
		logo.setIcon(new ImageIcon(getClass().getResource("candado1.png")));
		logo.setBounds(65,195,100,100);
		login.add(logo);
		
		JLabel logo2 = new JLabel();
		logo2.setIcon(new ImageIcon(getClass().getResource("user.png")));
		logo2.setBounds(60,120,100,100);
		login.add(logo2);
		
		//panel trasero
		JPanel login2 = new JPanel();
		login2.setBackground(Color.LIGHT_GRAY);
		login2.setBounds(60, 75, 380, 280);
		login2.setLayout(null);
		login.add(login2);	
		
		//this.add(login);

	}
	
public void interes() {
		
		this.setSize(500,500);
		
		JPanel panel1 = new JPanel();
		panel1.setSize(WIDTH, HEIGHT);
		panel1.setBackground(Color.decode("#E16D8D"));
		panel1.setLayout(null);
		
		JLabel login_tag = new JLabel("Interés", 0);
		login_tag.setFont(new Font("Roboto", Font.BOLD, 20));
		login_tag.setBounds(0, 0, 80, 30);
		login_tag.setBackground(Color.white);
		panel1.add(login_tag);
		
		JLabel calcular = new JLabel("Calcular interés", 0);
		calcular.setSize(200,30);
		calcular.setFont(new Font("Roboto", Font.BOLD, 15));
		calcular.setBounds(30,10,150,60);
		panel1.add(calcular);
		
		JLabel capital = new JLabel("Capital:", 0);
		capital.setFont(new Font("Roboto", Font.BOLD, 15));
		capital.setBounds(50,50,150,60);
		panel1.add(capital);
		
		JLabel capital_tag = new JLabel("", 0);
		capital_tag.setFont(new Font("Roboto", Font.BOLD, 15));
		capital_tag.setBounds(200,70,190,25);
		capital_tag.setBackground(Color.white);
		capital_tag.setOpaque(true);
		panel1.add(capital_tag);
		
		JLabel tiempo = new JLabel("Tiempo:", 0);
		tiempo.setFont(new Font("Roboto", Font.BOLD, 15));
		tiempo.setBounds(50,100,150,60);
		panel1.add(tiempo);
		
		JLabel tiempo_tag = new JLabel("", 0);
		tiempo_tag.setFont(new Font("Roboto", Font.BOLD, 15));
		tiempo_tag.setBounds(200,120,190,25);
		tiempo_tag.setBackground(Color.white);
		tiempo_tag.setOpaque(true);
		panel1.add(tiempo_tag);
		
		JLabel tasa = new JLabel("Tasa interés:", 0);
		tasa.setFont(new Font("Roboto", Font.BOLD, 15));
		tasa.setBounds(50,150,150,60);
		panel1.add(tasa);
		
		JLabel tasa_tag = new JLabel("", 0);
		tasa_tag.setFont(new Font("Roboto", Font.BOLD, 15));
		tasa_tag.setBounds(200,170,190,25);
		tasa_tag.setBackground(Color.white);
		tasa_tag.setOpaque(true);
		panel1.add(tasa_tag);

		
		JLabel calcular_btn = new JLabel("Calcular", 0);
		calcular_btn.setFont(new Font("Roboto", Font.BOLD, 15));
		calcular_btn.setBounds(100,220,100,25);
		calcular_btn.setForeground(Color.white);
		calcular_btn.setBackground(Color.black);
		calcular_btn.setOpaque(true);
		panel1.add(calcular_btn);
		
		JLabel cancelar_btn = new JLabel("Cancelar", 0);
		cancelar_btn.setFont(new Font("Roboto", Font.BOLD, 15));
		cancelar_btn.setBounds(280,220,100,25);
		cancelar_btn.setForeground(Color.white);
		cancelar_btn.setBackground(Color.black);
		cancelar_btn.setOpaque(true);
		panel1.add(cancelar_btn);
		
		JLabel interes = new JLabel("Interés:", 0);
		interes.setFont(new Font("Roboto", Font.BOLD, 15));
		interes.setBounds(50,310,150,60);
		panel1.add(interes);
		
		JLabel interes_tag = new JLabel("", 0);
		interes_tag.setFont(new Font("Roboto", Font.BOLD, 15));
		interes_tag.setBounds(200,330,190,25);
		interes_tag.setBackground(Color.white);
		interes_tag.setOpaque(true);
		panel1.add(interes_tag);
		
		JLabel monto = new JLabel("Monto:", 0);
		monto.setFont(new Font("Roboto", Font.BOLD, 15));
		monto.setBounds(50,350,150,60);
		panel1.add(monto);
		
		JLabel monto_tag = new JLabel("", 0);
		monto_tag.setFont(new Font("Roboto", Font.BOLD, 15));
		monto_tag.setBounds(200,370,190,25);
		monto_tag.setBackground(Color.white);
		monto_tag.setOpaque(true);
		panel1.add(monto_tag);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(40, 30, 400, 250);
		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.setLayout(null);
		panel1.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(40, 300, 400, 130);
		panel3.setBackground(Color.gray);
		panel3.setLayout(null);
		panel1.add(panel3);
		
		this.add(panel1);
		
	}

public void botones() {

	this.setSize(500,500);

	JPanel btn_panel = new JPanel();
	btn_panel.setLocation(0,0);
	btn_panel.setBackground(Color.white);
	btn_panel.setLayout(null);

	JButton super_boton = new JButton("Click me!");
	super_boton.setBounds(160,300,150,100);
	super_boton.setFont(new Font("Roboto", Font.BOLD, 20));
	btn_panel.add(super_boton);
	
	
		super_boton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				

			

			// Resto del código para generar un nuevo botón aleatorio
			int x = (int) Math.floor(Math.random() * 450 + 1);
			int y = (int) Math.floor(Math.random() * 650 + 1);
			int w = (int) Math.floor(Math.random() * 120 + 1);
			int h = (int) Math.floor(Math.random() * 120 + 1);
			
			Random rand = new Random();
			float r = rand.nextFloat();
			float g = rand.nextFloat();
			float b = rand.nextFloat();
			
			JButton otro_boton = new JButton("boton_color");
			otro_boton.setBounds(x, y, w, h);
			otro_boton.setOpaque(true);
			otro_boton.setBackground(new Color(r, g, b));
			otro_boton.addActionListener(this);
			btn_panel.add(otro_boton);
			
			otro_boton.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
			
			
			JButton sourceButton = (JButton) e.getSource(); 
			Color boton_color = sourceButton.getBackground();
			
    
			JOptionPane.showMessageDialog(null, boton_color); 
			
			
				}
			});	
			
			
			getContentPane().repaint();
			getContentPane().revalidate();
				
				
			}		
			
		});
	this.add(btn_panel);
}

//public void paint(Graphics g) {
	//super.paint(g);

	//Graphics2D g2d = (Graphics2D) g;

	//pared
	//g2d.setColor(Color.decode("#D5BA98"));

	//g2d.fillRect(210, 250, 350, 350);

	//ESCALON
	//g2d.setColor(Color.GRAY);

	//g2d.fillRect(160, 580, 450, 20);
	
	//PASTO
	//g2d.setColor(Color.decode("#283E06"));

	//g2d.fillRect(0, 600, 800, 20);
	
	//PASTO ABAJO
	//g2d.setColor(Color.decode("#778C43"));

	//g2d.fillRect(0, 620, 800, 40);
	
	//PASTO ABAJO
	//g2d.setColor(Color.decode("#F7D547"));

	//g2d.fillRect(0, 660, 800, 40);
	
	//TIERRA
	//g2d.setColor(Color.decode("#834F23"));

	//g2d.fillRect(0, 700, 800, 100);
	
	//MARCO DE LA PUERTA
	//g2d.setColor(Color.decode("#834F23"));

	//g2d.fillRect(260, 370, 120, 210);
	
	//PUERTA
	//g2d.setColor(Color.decode("#A06C3F"));

	//g2d.fillRect(270, 380, 100, 200);
	
	//MARCO DE LA VENTANA
	//g2d.setColor(Color.decode("#834F23"));

	//g2d.fillRect(440, 300, 90, 90);
	
	//VENTANA
	//g2d.setColor(Color.decode("#F7D547"));

	//g2d.fillRect(450, 310, 70, 70);
	
	//BARROTES
	//g2d.setColor(Color.decode("#834F23"));

	//g2d.fillRect(483, 300, 5, 90);
	
	//g2d.setColor(Color.decode("#834F23"));

	//g2d.fillRect(450, 343, 80, 5);
	
	//DESCANSA VENTANA
	//g2d.setColor(Color.GRAY);

	//g2d.fillRect(430, 390, 110, 10);
	
	
	//PERILLA
	//g2d.setColor(Color.decode("#834F23"));
	//g2d.fillArc(340, 460, 20, 20, 0, 380);

	//g2d.drawLine(170, 250, 600, 250);

	//g2d.drawOval(400, 400, 50, 80);
	//g2d.fillOval(350, 400, 50, 80);


	//int xPoints[]= {500,250,500};
	//int yPoints[]= {500,50,300};
	//g2d.drawPolyline(xPoints, yPoints, 3);

	//g2d.setColor(Color.red);

	//g2d.fillPolygon(xPoints, yPoints, 3);

	//g2d.setFont(new Font("Roboto", Font.BOLD, 40));;

	//g2d.drawString("hola", 250, 100);

	//g2d.setStroke(new BasicStroke(10));

	//g2d.drawRoundRect(420, 150, 200, 150, 10, 10);

	//try {

		//BufferedImage image = ImageIO.read(new File("src/equis1.png"));

		//g2d.drawImage(image, 10, 100, null);



	//}catch(IOException e) {

		//e.printStackTrace();

	//}	

//}

}
