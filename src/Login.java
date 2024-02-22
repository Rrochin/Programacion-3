import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Login extends JFrame{

	//contructor que define los atributos base
	//de mi ventana
	public Login(){

		this.setVisible(true);
		this.setSize(1000, 1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mi ventana");
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(750,750));
		this.setResizable(true);
		this.setLocation(200, 200);
		this.setLocationRelativeTo(null);

		this.iniciarComponentes();
	}

	public void iniciarComponentes() {

		//JPanel login = new JPanel();
		//login.setSize(this.getWidth(), this.getHeight());
		//login.setBackground(Color.red);

		//this.add(login);
		
		//this.login();
		//this.registro();
		
		this.admin_panel();
		
		this.repaint();
		this.revalidate();

	}



		public void admin_panel() {
			
			JPanel admin_panel = new JPanel();
			admin_panel.setSize(this.getWidth(), this.getHeight());
			admin_panel.setLocation(0,0);
			admin_panel.setBackground(Color.LIGHT_GRAY);
			admin_panel.setLayout(null);
			this.add(admin_panel);
			
			//añadir menu
			JMenuBar barra = new JMenuBar();
			JMenu menu_file = new JMenu("Archivo");
			JMenuItem open_item = new JMenuItem ("Abrir archivo...");
			JMenuItem create_item = new JMenuItem ("Abrir archivo...");
			
			
			barra.add(menu_file);
			menu_file.add(open_item);
			menu_file.add(create_item);
			
			
			JLabel user_tag = new JLabel("USUARIOS",0);
			user_tag.setSize(300,80);
			user_tag.setFont(new Font("Roboto", Font.BOLD, 40));
			user_tag.setForeground(Color.white);
			user_tag.setLocation(350, 20);
			user_tag.setOpaque(true);
			user_tag.setBackground(Color.black);
			admin_panel.add(user_tag);
			
			JLabel title_widget = new JLabel("Total de usuarios",0);
			title_widget.setFont(new Font("Roboto", Font.BOLD, 20));
			title_widget.setBounds(40,160,300,40);
			title_widget.setForeground(Color.white);
			admin_panel.add(title_widget);	
			
			JLabel content_widget = new JLabel("100",0);
			content_widget.setFont(new Font("Roboto", Font.BOLD, 20));
			content_widget.setBounds(40,120,300,40);
			content_widget.setForeground(Color.white);
			admin_panel.add(content_widget);
			
			JLabel widget = new JLabel("");
			widget.setBounds(40,120,300,80);
			widget.setOpaque(true);
			widget.setBackground(Color.black);
			admin_panel.add(widget);
			
			JButton download = new JButton("Exportar");
			download.setBounds(750, 230, 100, 40);
			admin_panel.add(download);

			JButton add_user = new JButton("Exportar");
			add_user.setBounds(860, 230, 100, 40);
			admin_panel.add(add_user);
			
			String table_title[] = {"No. Control", "Nombre","Apeliido", "Semestre","Promedio"};
			
			String table_data [][] = {
					
					{"No. Control", "Nombre","Apeliido", "Semestre","Promedio"},
					{"No. Control", "Nombre","Apeliido", "Semestre","Promedio"},
					{"No. Control", "Nombre","Apeliido", "Semestre","Promedio"},
					{"No. Control", "Nombre","Apeliido", "Semestre","Promedio"},
					{"No. Control", "Nombre","Apeliido", "Semestre","Promedio"},
					{"No. Control", "Nombre","Apeliido", "Semestre","Promedio"},
					{"No. Control", "Nombre","Apeliido", "Semestre","Promedio"}
			};
			
			JTable table_users = new JTable(table_data,table_title);
			//table_users.setBounds(40,280,920,300);
			JScrollPane table_scroll = new JScrollPane(table_users);
			table_scroll.setBounds(40, 280, 920, 300);
			admin_panel.add(table_scroll);
			
			//JLabel tabla = new JLabel("");
			//tabla.setBounds(40, 280, 920, 300);
			//tabla.setOpaque(true);
			

					
		}
		

		public void login() {
			
		
			//panel izquierdo
			JPanel Login = new JPanel();
			Login.setSize(this.getWidth()/2, this.getHeight());
			Login.setBackground(Color.pink);
			Login.setLayout(null);
			
			//boton de acceder
			JLabel login_tag = new JLabel("Acceder", 0);
			login_tag.setSize(160,30);
			login_tag.setFont(new Font("Roboto", Font.BOLD, 20));
			login_tag.setLocation(100,100);
			login_tag.setOpaque(true);
			login_tag.setBackground(Color.white);
			Login.add(login_tag);
		
	
			//usuario izq
			JLabel user_tag = new JLabel("Nombre de usuario: ");
			user_tag.setBounds(20,155,200,40);
			user_tag.setFont(new Font("Arial", Font.BOLD, 15));
			Login.add(user_tag);
			
			JTextField usr_field = new JTextField();
			usr_field.setBounds(20, 190, 300, 40);
			Login.add(usr_field);
			
			//contraseña
			JLabel pwd_tag = new JLabel("Contraseña: ");
			pwd_tag.setBounds(20,230,200,40);
			pwd_tag.setFont(new Font("Arial", Font.BOLD, 15));
			Login.add(pwd_tag);
			
			JPasswordField pwd_field = new JPasswordField();
			pwd_field.setBounds(20, 260, 300, 40);
			Login.add(pwd_field);
			
			JCheckBox remember = new JCheckBox("Recordarme");
			remember.setBounds(20, 300, 150, 40);
			remember.setOpaque(false);
			Login.add(remember);
			
			JLabel prefer_tag = new JLabel("Nombre de usuario: ");
			prefer_tag.setBounds(50,325,400,40);
			prefer_tag.setFont(new Font("Arial", Font.BOLD, 15));
			Login.add(prefer_tag);
			
			this.add(Login);
		
		}
	
		public void registro() {
			
				
			//panel derecho
			JPanel registro = new JPanel();
			registro.setSize(this.getWidth(), this.getHeight());
			registro.setLocation(100,0);
			registro.setBackground(Color.LIGHT_GRAY);
			registro.setLayout(null);
			
			//otro panel derecho
			JLabel usr_tag = new JLabel("Nombre de usuario: ");
			usr_tag.setBounds(0,0,200,40);
			usr_tag.setFont(new Font("Arial", Font.BOLD, 15));
			usr_tag.setOpaque(true);
			usr_tag.setBackground(Color.white);
			registro.add(usr_tag);
			
			
			JLabel user_field = new JLabel("kjljlk");
			user_field.setBounds(50,160,400,40);
			user_field.setHorizontalAlignment(0);
			user_field.setFont(new Font("Roboto", Font.PLAIN, 17));
			registro.add(user_field);
			
			
			JLabel bio_tag = new JLabel("BIO",0);
			bio_tag.setBounds(50,200,400,40);
			bio_tag.setFont(new Font("Roboto", Font.PLAIN, 17));
			registro.add(bio_tag);
			
			
			JTextArea bio_tex = new JTextArea("");
			bio_tex.setBounds(20,155,200,40);
			bio_tex.setFont(new Font("Roboto", Font.PLAIN, 17));
			registro.add(bio_tex);
			

			JCheckBox item_box_1 = new JCheckBox("Dulces");
			item_box_1.setBounds(50,325,80,40);
			item_box_1.setFont(new Font("Arial", Font.BOLD, 15));
			item_box_1.setOpaque(true);
			item_box_1.setBackground(Color.red);
			registro.add(item_box_1);
			
			JCheckBox item_box_2 = new JCheckBox("Salado");
			item_box_2.setBounds(50,325,80,40);
			item_box_2.setFont(new Font("Arial", Font.BOLD, 15));
			item_box_2.setOpaque(true);
			item_box_2.setBackground(Color.red);
			registro.add(item_box_2);
			
			JCheckBox item_box_3 = new JCheckBox("Saludable");
			item_box_3.setBounds(50,325,80,40);
			item_box_3.setFont(new Font("Arial", Font.BOLD, 15));
			item_box_3.setOpaque(true);
			item_box_3.setBackground(Color.red);
			item_box_3.setBorderPainted(true);
			item_box_3.setBorder(BorderFactory.createLineBorder(Color.red,2));
			registro.add(item_box_1);
			
			JLabel terms_tag = new JLabel("Terminos");
			terms_tag.setBounds(50,325,400,40);
			terms_tag.setFont(new Font("Arial", Font.BOLD, 15));
			registro.add(terms_tag);
			
			JRadioButton accept_radio = new JRadioButton("Acepto los terminos");
			accept_radio.setBounds(50,325,80,40);
			accept_radio.setFont(new Font("Roboto", Font.PLAIN, 17));
			registro.add(accept_radio);
			
			JRadioButton reject_radio = new JRadioButton("No acepto los terminos");
			reject_radio.setBounds(50,325,80,40);
			reject_radio.setFont(new Font("Roboto", Font.PLAIN, 17));
			registro.add(reject_radio);
			
			ButtonGroup terms = new ButtonGroup();
			terms.add(accept_radio);
			terms.add(reject_radio);
			
			String colonias[]= {"centro","camino real"};
			
			//JComboBox locations = new JComboBox();
		
			this.add(registro);
			
		}
		



}

	
		
		
		
	