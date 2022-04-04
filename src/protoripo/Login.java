package protoripo;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame {
	
	JButton Btnini;
	JTextField Txtusu, Txtcon;

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
		
		JLabel Lblusu = new JLabel("Usuario: ");
		JLabel Lblcon = new JLabel("Contraseña: ");
		JLabel Lblreg = new JLabel("Registrarse aqui");
		
		JTextField Txtusu = new JTextField(10);
		JTextField Txtcon = new JTextField(10);
		
		JButton Btnini = new JButton("Iniciar");
		
		frame.add(Lblusu);
		frame.add(Txtusu);
		frame.add(Lblcon);
		frame.add(Txtcon);
		frame.add(Btnini);
		frame.add(Lblreg);
	}
}
