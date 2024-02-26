import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora extends JFrame{

	public Calculadora() {
		
	//this.setVisible (true);
	this.setSize(330,365);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setTitle("Calculadora");
	//this.setMinimumSize(new Dimension(250,250));
	//this.setMaximumSize(new Dimension(750,750));
	this.setOpacity(1);
	this.setResizable(true);
	this.setLocation(200,200);
	this.setLocationRelativeTo(null);
	
	this.iniciarComponentes();

	
	}
	
	public void iniciarComponentes() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.pink);
		panel.setLayout(null);
		
		JLabel etiqueta = new JLabel();
		etiqueta.setFont(new Font("Roboto", Font.BOLD, 14));
		etiqueta.setBounds(10, 10, 295, 80);
		etiqueta.setBackground(Color.white);
		etiqueta.setForeground(Color.black);
		etiqueta.setOpaque(true);
		panel.add(etiqueta);
		
		JButton b1 = new JButton();
		b1.setBounds(10, 100, 70, 40);
		panel.add(b1);
		
		JButton b2 = new JButton();
		b2.setBounds(85, 100, 70, 40);
		panel.add(b2);
		
		JButton b3 = new JButton();
		b3.setBounds(160, 100, 70, 40);
		panel.add(b3);
		
		JButton b4 = new JButton("CE");
		b4.setBounds(235, 100, 70, 40);
		b4.setForeground(Color.white);
		b4.setBackground(Color.red);
		panel.add(b4);
		
		JButton b5 = new JButton("7");
		b5.setBounds(10, 145, 70, 40);
		panel.add(b5);
		
		JButton b6 = new JButton("8");
		b6.setBounds(85, 145, 70, 40);
		panel.add(b6);
		
		JButton b7 = new JButton("9");
		b7.setBounds(160, 145, 70, 40);
		panel.add(b7);
		
		JButton b8 = new JButton("/");
		b8.setBounds(235, 145, 70, 40);
		panel.add(b8);
		
		JButton b9 = new JButton("4");
		b9.setBounds(10, 190, 70, 40);
		panel.add(b9);
		
		JButton b10 = new JButton("5");
		b10.setBounds(85, 190, 70, 40);
		panel.add(b10);
		
		JButton b11 = new JButton("6");
		b11.setBounds(160, 190, 70, 40);
		panel.add(b11);
		
		JButton b12 = new JButton("*");
		b12.setBounds(235, 190, 70, 40);
		panel.add(b12);
		
		JButton b13 = new JButton("1");
		b13.setBounds(10, 235, 70, 40);
		panel.add(b13);
		
		JButton b14 = new JButton("2");
		b14.setBounds(85, 235, 70, 40);
		panel.add(b14);
		
		JButton b15 = new JButton("3");
		b15.setBounds(160, 235, 70, 40);
		panel.add(b15);
		
		JButton b16 = new JButton("-");
		b16.setBounds(235, 235, 70, 40);
		panel.add(b16);
		
		JButton b17 = new JButton("0");
		b17.setBounds(10, 280, 70, 40);
		panel.add(b17);
		
		JButton b18 = new JButton(".");
		b18.setBounds(85, 280, 70, 40);
		panel.add(b18);
		
		JButton b19 = new JButton("=");
		b19.setBounds(160, 280, 70, 40);
		panel.add(b19);
		
		JButton b20 = new JButton("+");
		b20.setBounds(235, 280, 70, 40);
		panel.add(b20);
		
		
		this.add(panel);
		
	}
	
}

