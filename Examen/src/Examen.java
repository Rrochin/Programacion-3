import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Examen extends JFrame {

	public Examen() {
		
		this.setVisible (true);
		this.setSize(560,650);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Ventana");
		this.setOpacity(1);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		
		this.examen();
		
		}
	
	public void examen() {
		
		JPanel panel1 = new JPanel();
		panel1.setSize(WIDTH, HEIGHT);
		panel1.setBackground(Color.decode("#437EBB"));
		panel1.setLayout(null);
		
		JLabel login_tag = new JLabel("Factura en Java - NetBeans - ArrayList y POO", 0);
		login_tag.setFont(new Font("Arial", Font.BOLD, 15));
		login_tag.setForeground(Color.white);
		login_tag.setBounds(10, 10, 362, 30);
		panel1.add(login_tag);
		
		JLabel tag2 = new JLabel("[Sin base de datos]", 0);
		tag2.setFont(new Font("Arial", Font.BOLD, 12));
		tag2.setForeground(Color.white);
		tag2.setBounds(20,15,120,60);
		panel1.add(tag2);
		

		//datos cliente
		JLabel datos = new JLabel("Datos del cliente", 0);
		datos.setFont(new Font("Arial", Font.PLAIN, 12));
		datos.setBounds(15,50,100,60);
		panel1.add(datos);

		JLabel doc = new JLabel("Documento:", 0);
		doc.setFont(new Font("Arial", Font.PLAIN, 12));
		doc.setBounds(35,80,90,60);
		panel1.add(doc);
				
		JTextArea doc_tex = new JTextArea();
		doc_tex.setBounds(125,102,95,16);
		doc_tex.setFont(new Font("Roboto", Font.PLAIN, 12));
		doc_tex.setBackground(Color.white);
		doc_tex.setOpaque(true);
		panel1.add(doc_tex);
		
		JLabel fondo = new JLabel("", 0);
		fondo.setBounds(123,100,100,20);
		fondo.setBackground(Color.LIGHT_GRAY);
		fondo.setOpaque(true);
		panel1.add(fondo);
		
		JLabel dir = new JLabel("Dirección:", 0);
		dir.setFont(new Font("Arial", Font.PLAIN, 12));
		dir.setBounds(30,110,90,60);
		panel1.add(dir);
		
		JTextArea dir_tex = new JTextArea();
		dir_tex.setBounds(125,132,95,16);
		dir_tex.setFont(new Font("Roboto", Font.PLAIN, 12));
		dir_tex.setBackground(Color.white);
		dir_tex.setOpaque(true);
		panel1.add(dir_tex);
		
		JLabel fondo2 = new JLabel("", 0);
		fondo2.setBounds(123,130,100,20);
		fondo2.setBackground(Color.LIGHT_GRAY);
		fondo2.setOpaque(true);
		panel1.add(fondo2);
		
		JLabel nombres = new JLabel("Nombres:", 0);
		nombres.setFont(new Font("Arial", Font.PLAIN, 12));
		nombres.setBounds(230,80,90,60);
		panel1.add(nombres);
		
		JTextArea nom1 = new JTextArea();
		nom1.setBounds(315,102,95,16);
		nom1.setFont(new Font("Roboto", Font.PLAIN, 12));
		nom1.setBackground(Color.white);
		nom1.setOpaque(true);
		panel1.add(nom1);
		
		JLabel fondo3 = new JLabel("", 0);
		fondo3.setBounds(312,100,100,20);
		fondo3.setBackground(Color.LIGHT_GRAY);
		fondo3.setOpaque(true);
		panel1.add(fondo3);
		
		JLabel telefono = new JLabel("Teléfono:", 0);
		telefono.setFont(new Font("Arial", Font.PLAIN, 12));
		telefono.setBounds(230,110,90,60);
		panel1.add(telefono);
		
		JTextArea tel1 = new JTextArea();
		tel1.setBounds(315,132,95,16);
		tel1.setFont(new Font("Roboto", Font.PLAIN, 12));
		tel1.setBackground(Color.white);
		tel1.setOpaque(true);
		panel1.add(tel1);
		
		JLabel fondo4 = new JLabel("", 0);
		fondo4.setBounds(312,130,100,20);
		fondo4.setBackground(Color.LIGHT_GRAY);
		fondo4.setOpaque(true);
		panel1.add(fondo4);
		
		//datos factura
		JLabel datosf = new JLabel("Datos de factura", 0);
		datosf.setFont(new Font("Arial", Font.PLAIN, 12));
		datosf.setBounds(15,140,100,60);
		panel1.add(datosf);
		
		JLabel num_f = new JLabel("N° Factura:", 0);
		num_f.setFont(new Font("Arial", Font.PLAIN, 12));
		num_f.setBounds(2,165,100,60);
		panel1.add(num_f);
		
		JLabel num1 = new JLabel("1", 0);
		num1.setFont(new Font("Arial", Font.BOLD, 12));
		num1.setBounds(70,165,100,60);
		panel1.add(num1);
		
		JLabel fecha1 = new JLabel("31/03/2024", 0);
		fecha1.setFont(new Font("Arial", Font.BOLD, 12));
		fecha1.setBounds(340,165,100,60);
		panel1.add(fecha1);
		
		JLabel fecha = new JLabel("Fecha:", 0);
		fecha.setFont(new Font("Arial", Font.PLAIN, 12));
		fecha.setBounds(260,165,100,60);
		panel1.add(fecha);
		
		JLabel ver = new JLabel("Ver listado de facturas", 0);
		ver.setFont(new Font("Arial", Font.PLAIN, 12));
		ver.setBounds(65,220,120,60);
		panel1.add(ver);
		
		JLabel añadir = new JLabel("Añadir", 0);
		añadir.setFont(new Font("Arial", Font.PLAIN, 12));
		añadir.setBounds(300,220,120,60);
		panel1.add(añadir);
		
		JLabel eliminar = new JLabel("Eliminar", 0);
		eliminar.setFont(new Font("Arial", Font.PLAIN, 12));
		eliminar.setBounds(400,220,120,60);
		panel1.add(eliminar);
		
	
		//totales
		JLabel subtotal = new JLabel("Subtotal:", 0);
		subtotal.setFont(new Font("Arial", Font.PLAIN, 12));
		subtotal.setBounds(15,390,100,60);
		panel1.add(subtotal);
		
		JLabel sub1 = new JLabel("6600.0", 0);
		sub1.setFont(new Font("Arial", Font.BOLD, 12));
		sub1.setBounds(110,390,100,60);
		panel1.add(sub1);
		
		JLabel IVA = new JLabel("IVA 19%:", 0);
		IVA.setFont(new Font("Arial", Font.PLAIN, 12));
		IVA.setBounds(15,430,100,60);
		panel1.add(IVA);
		
		JLabel iva1 = new JLabel("1254.0", 0);
		iva1.setFont(new Font("Arial", Font.BOLD, 12));
		iva1.setBounds(110,430,100,60);
		panel1.add(iva1);
		
		JLabel total = new JLabel("Total Factura:", 0);
		total.setFont(new Font("Arial", Font.PLAIN, 12));
		total.setBounds(25,450,100,60);
		panel1.add(total);
		
		JLabel total1 = new JLabel("7524.0", 0);
		total1.setFont(new Font("Arial", Font.BOLD, 12));
		total1.setBounds(110,450,100,60);
		panel1.add(total1);
		
		JLabel descuento = new JLabel("% Descuento:", 0);
		descuento.setFont(new Font("Arial", Font.PLAIN, 12));
		descuento.setBounds(25,410,100,60);
		panel1.add(descuento);
		
		JTextArea desc1 = new JTextArea();
		desc1.setBounds(146,432,26,16);
		desc1.setFont(new Font("Roboto", Font.PLAIN, 12));
		desc1.setBackground(Color.white);
		desc1.setOpaque(true);
		panel1.add(desc1);
		
		JLabel fondo5 = new JLabel("", 0);
		fondo5.setBounds(144,430,30,20);
		fondo5.setBackground(Color.LIGHT_GRAY);
		fondo5.setOpaque(true);
		panel1.add(fondo5);
		
		JCheckBox check = new JCheckBox();
		check.setBounds(185,415,50,50);
		panel1.add(check);
		
		JLabel valor = new JLabel("Valor descontado:", 0);
		valor.setFont(new Font("Arial", Font.PLAIN, 12));
		valor.setBounds(240,410,100,60);
		panel1.add(valor);
		
		JLabel valor1 = new JLabel("330.0", 0);
		valor1.setFont(new Font("Arial", Font.BOLD, 12));
		valor1.setBounds(320,410,100,60);
		panel1.add(valor1);
		
		//imagenes
		JLabel logo = new JLabel();
		logo.setIcon(new ImageIcon(getClass().getResource("anadir.png")));
		logo.setBounds(305,200,100,100);
		panel1.add(logo);
		
		JLabel logo2 = new JLabel();
		logo2.setIcon(new ImageIcon(getClass().getResource("eliminar.png")));
		logo2.setBounds(400,200,100,100);
		panel1.add(logo2);
		
		JLabel logo3 = new JLabel();
		logo3.setIcon(new ImageIcon(getClass().getResource("lista.png")));
		logo3.setBounds(30,200,100,100);
		panel1.add(logo3);
		
		
		//botones
		JButton fin = new JButton("Finalizar Factura");
		fin.setFont(new Font("Arial", Font.BOLD, 12));
		fin.setBounds(300,520,130,20);
		panel1.add(fin);
		
		JButton limpiar = new JButton("Limpiar");
		limpiar.setFont(new Font("Arial", Font.BOLD, 12));
		limpiar.setBounds(435,520,100,20);
		panel1.add(limpiar);
		
		String table_title[] = {"Producto", "Cantidad","Valor", "Subtotal"};

		String table_data [][] = {

				{"Agua", "2","500", "1000.0"},
				{"Cereal", "5","1000", "5000.0"},
				{"Leche", "2","300", "600.0"}
		};

		JTable table_users = new JTable(table_data,table_title);
		JScrollPane table_scroll = new JScrollPane(table_users);
		table_scroll.setBounds(20, 280, 500, 120);
		panel1.add(table_scroll);

		
		JPanel panel2 = new JPanel();
		panel2.setBounds(0, 60, 570, 500);
		panel2.setBackground(Color.white);
		panel2.setLayout(null);
		panel1.add(panel2);
		

		
		this.add(panel1);
		
		
	}
}
