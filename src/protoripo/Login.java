package protoripo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame {
	
	JButton Btnini;
	JTextField Txtusu, Txtcon;
	JPanel log;

	public static void main(String[] args) {
		Login log = new Login();
		log.GUI();
		log.setSize(300, 300);
		log.setVisible(true);
		log.setResizable(false);
	}

	protected void GUI() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Login");
		Container frame = this.getContentPane();
		log = new JPanel();
		
		frame.setLayout(new FlowLayout());
		log.setLayout(new GridLayout(2,2));
		
		JLabel Lblusu = new JLabel("Usuario: ");
		JLabel Lblcon = new JLabel("Contraseña: ");
		JLabel Lblreg = new JLabel("Registrarse aqui");
		
		JTextField Txtusu = new JTextField(10);
		JTextField Txtcon = new JTextField(10);
		
		JButton Btnini = new JButton("Iniciar");
		
		log.add(Lblusu);
		log.add(Txtusu);
		log.add(Lblcon);
		log.add(Txtcon);
		frame.add(log, BorderLayout.CENTER);
		frame.add(Btnini, BorderLayout.SOUTH);
	}
}
