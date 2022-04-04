package protoripo;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Registro extends JFrame {
	
	JButton Btnreg;
	JTextField Txtnom, Txtciudad, Txtcalle, TxtUsu, TxtCel, Txtcol, Txtnum, Txtcon;

	public static void main(String[] args) {
		Login log = new Login();
		log.GUI();
		log.setSize(150, 200);
		log.setVisible(true);
		log.setResizable(false);
	}

	protected void GUI() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Login");
		Container frame = this.getContentPane();
		
		frame.setLayout(new FlowLayout());
		
		JLabel Lblnom = new JLabel("Nombre: ");
		JLabel Lblciudad = new JLabel("Ciudad: ");
		JLabel Lblcalle = new JLabel("Calle: ");
		JLabel Lblusu = new JLabel("Usuario: ");
		JLabel Lblcel = new JLabel("Celular: ");
		JLabel Lblcol = new JLabel("Colonia: ");
		JLabel Lblnum = new JLabel("Numero: ");
		JLabel Lblcon = new JLabel("Contraseña: ");
		
		Txtnom = new JTextField(10);
		Txtciudad = new JTextField(10);
		Txtcalle= new JTextField(10);
		TxtUsu = new JTextField(10);
		TxtCel= new JTextField(10);
		Txtcol = new JTextField(10);
		Txtnum = new JTextField(10);
		Txtcon = new JTextField(10);
		
		Btnreg = new JButton("Registrarz");
		
		frame.add(Lblusu);
		frame.add(Txtusu);
		frame.add(Lblcon);
		frame.add(Txtcon);
		frame.add(Btnini);
		frame.add(Lblreg);
	}
}