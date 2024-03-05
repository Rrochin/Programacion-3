
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
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

public class Ventana extends JFrame {

	public Ventana() {
		
		this.setVisible (true);
		this.setSize(800,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Ventana");
		//this.setMinimumSize(new Dimension(250,250));
		//this.setMaximumSize(new Dimension(750,750));
		this.setOpacity(1);
		this.setResizable(true);
		this.setLocation(200,200);
		this.setLocationRelativeTo(null);
		
		//this.iniciarComponentes();
		//this.calculadora();
		//this.interes();
		
		
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
		//JLabel logo = new JLabel();
		//logo.setIcon(new ImageIcon(getClass().getResource("candado1.png")));
		//logo.setBounds(20,50,100,100);
		//login.add(logo);
		
		JLabel logo2 = new JLabel();
		logo2.setIcon(new ImageIcon(getClass().getResource("user2.png")));
		logo2.setBounds(20,50,100,100);
		login.add(logo2);
		
		//panel delantero
		JPanel login2 = new JPanel();
		login2.setBackground(Color.LIGHT_GRAY);
		login2.setBounds(80, 75, 340, 280);
		login2.setLayout(null);
		login.add(login2);	
		
		//this.add(login);

	}
	
	public void calculadora(){
		
		this.setSize(480,650);
		
		JPanel panel = new JPanel();
		panel.setSize(WIDTH, HEIGHT);
		panel.setBackground(Color.decode("#E16D8D"));
		panel.setLayout(new BorderLayout());
		
		JLabel text = new JLabel("100.00",4);
		text.setOpaque(true);
		text.setBackground(Color.white);
		text.setFont(new Font("Roboto", Font.BOLD, 40));
		panel.add(text, BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.decode("#E16DD8"));
		centro.setLayout(new GridLayout(4,3,5,5));
		panel.add(centro, BorderLayout.CENTER);
		
		
		String btns[] = {"7","8","9","6","5","4","3","2","1","0",".","-"};
		for(int i = 0; i < 12; i++) {
			
			JButton boton = new JButton(btns[i]);
			centro.add(boton);
			
		}
		
		JPanel east = new JPanel();
		east.setBackground(Color.decode("#B7E16D"));
		east.setLayout(new GridLayout(3,1,5,5));
		panel.add(east,BorderLayout.EAST);
		
		String btns2[] = {"+","-","="};
		for(int i = 0; i < 3; i++) {
			
			JButton boton = new JButton(btns2[i]);
			east.add(boton);
			
		}
		
		JPanel west = new JPanel();
		west.setBackground(Color.DARK_GRAY);
		west.setLayout(new BoxLayout(west,BoxLayout.Y_AXIS));
		panel.add(west, BorderLayout.LINE_START);
		
		String btns3[] = {"MC","M+","*"};
		for(int i = 0; i < 3; i++) {
			
			JButton boton = new JButton(btns3[i]);
			west.add(boton);
			
		}
		
		this.add(panel);

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
		calcular.setFont(new Font("Roboto", Font.BOLD, 15));
		calcular.setBounds(30,20,150,60);
		panel1.add(calcular);
		
		JLabel capital = new JLabel("Capital:", 0);
		capital.setFont(new Font("Roboto", Font.BOLD, 15));
		capital.setBounds(50,60,150,60);
		panel1.add(capital);
		
		JLabel capital_tag = new JLabel("", 0);
		capital_tag.setFont(new Font("Roboto", Font.BOLD, 15));
		capital_tag.setBounds(200,80,190,25);
		capital_tag.setBackground(Color.white);
		capital_tag.setOpaque(true);
		panel1.add(capital_tag);
		
		JLabel tiempo = new JLabel("Tiempo:", 0);
		tiempo.setFont(new Font("Roboto", Font.BOLD, 15));
		tiempo.setBounds(50,110,150,60);
		panel1.add(tiempo);
		
		JLabel tiempo_tag = new JLabel("", 0);
		tiempo_tag.setFont(new Font("Roboto", Font.BOLD, 15));
		tiempo_tag.setBounds(200,130,190,25);
		tiempo_tag.setBackground(Color.white);
		tiempo_tag.setOpaque(true);
		panel1.add(tiempo_tag);
		
		JLabel tasa = new JLabel("Tasa interés:", 0);
		tasa.setFont(new Font("Roboto", Font.BOLD, 15));
		tasa.setBounds(50,160,150,60);
		panel1.add(tasa);
		
		JLabel tasa_tag = new JLabel("", 0);
		tasa_tag.setFont(new Font("Roboto", Font.BOLD, 15));
		tasa_tag.setBounds(200,180,190,25);
		tasa_tag.setBackground(Color.white);
		tasa_tag.setOpaque(true);
		panel1.add(tasa_tag);

		
		JLabel calcular_btn = new JLabel("Calcular", 0);
		calcular_btn.setFont(new Font("Roboto", Font.BOLD, 15));
		calcular_btn.setBounds(100,230,100,25);
		calcular_btn.setForeground(Color.white);
		calcular_btn.setBackground(Color.black);
		calcular_btn.setOpaque(true);
		panel1.add(calcular_btn);
		
		JLabel cancelar_btn = new JLabel("Cancelar", 0);
		cancelar_btn.setFont(new Font("Roboto", Font.BOLD, 15));
		cancelar_btn.setBounds(280,230,100,25);
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
		panel2.setBounds(40, 40, 400, 250);
		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.setLayout(null);
		panel1.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(40, 300, 400, 130);
		panel3.setBackground(Color.gray);
		panel3.setLayout(null);
		panel1.add(panel3);
		
		//this.add(panel1);
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		//color
		g2d.setColor(Color.black);

		g2d.fillRect(50, 50, 200, 100);
		
		g2d.clearRect(100, 100, 100, 100);
		
		g2d.drawArc(300, 300, 100, 100, 0, 380);
		g2d.fillArc(200, 300, 100, 100, 0, 300);
		
		g2d.drawLine(0, 0, 500, 500);
		
		g2d.drawOval(400, 400, 50, 80);
		g2d.fillOval(350, 400, 50, 80);
		
		
		int xPoints[]= {100,250,300};
		int yPoints[]= {100,200,300};
		g2d.drawPolyline(xPoints, yPoints, 3);
		
		g2d.setColor(Color.red);
		
		g2d.fillPolygon(xPoints, yPoints, 3);
		
		g2d.setFont(new Font("Roboto", Font.BOLD, 40));;
		
		g2d.drawString("hola", 250, 100);
		
		g2d.setStroke(new BasicStroke(10));
		
		g2d.drawRoundRect(420, 150, 200, 150, 10, 10);
		
		try {

			BufferedImage image = ImageIO.read(new File("src/equis1.png"));
			
			g2d.drawImage(image, 10, 100, null);
			
			
			
		}catch(IOException e) {
			
			e.printStackTrace();

		}	
		
	}

	
	}
	

